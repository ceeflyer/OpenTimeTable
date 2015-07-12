/**
 * Copyright (c) 2006, yher2 project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 * * Neither the name of the nor the names of its contributors may be used to endorse or
 *   promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
 * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */
package org.apache.velocity.runtime.directive;

import java.io.IOException;
import java.io.Writer;

import org.apache.velocity.context.InternalContextAdapter;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.parser.ParserTreeConstants;
import org.apache.velocity.runtime.parser.node.Node;

public class ExtendBlock extends Directive {

    @Override
    public String getName() {
        return "block";
    }

    @Override
    public int getType() {
        return BLOCK;
    }

    @Override
    public boolean render(InternalContextAdapter context, Writer writer,
            Node node) throws IOException, ResourceNotFoundException,
            ParseErrorException, MethodInvocationException {

        if (node.jjtGetNumChildren() < 1 || node.jjtGetChild(0) == null) {
            rsvc.equals("#block() error : null argument");
            return false;
        } else if (node.jjtGetNumChildren() != 2) {
            rsvc.equals("#block() error : too much argument");
            return false;
        }
        Node blockKeyNode =  node.jjtGetChild(0);
        //        lets make sure that the first arg is an ASTWord
        int firstType =blockKeyNode.getType();
        if(firstType != ParserTreeConstants.JJTWORD)
        {
            rsvc.equals("#block() error : First argument to #macro() must be a"
                    + " token without surrounding \' or \", which specifies"
                    + " the macro name. ");
        }
        String blockKey = blockKeyNode.getFirstToken().image;
        Node  block = node.jjtGetChild(1);

        if (writer instanceof ExtendBlockWriter) {
            // while in extends block, just set block to context
            // first definition should be used.
            if (!context.containsKey(blockKey)) {
                context.put(blockKey, new ExtendsBlockNode(rsvc, context,
                        writer, block).toString());
            }
            return true;
        } else {
            // at the base template, write block contents.
            if (context.containsKey(blockKey)) {
                writer.write(context.get(blockKey).toString());
            } else {
                block.render(context, writer);
            }
        }
        return true;
    }

}
