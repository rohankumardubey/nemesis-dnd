/**
 * Copyright 2014-2018 the original author or authors
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.gnube.dice.notation.operation;

import org.gnube.dice.notation.DiceExpression;

/**
 * Multiplication operation.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 */
public final class Multiplication extends AbstractBinaryOperation {

    public Multiplication(final DiceExpression left,
                          final DiceExpression right) {
        super(left, right, (a, b) -> a * b);
    }

    @Override
    public final String getExpression() {
        final String left;  // Left side operand as a string
        final String right; // Right side operand as a string

        left = getLeft().getExpression();
        right = getRight().getExpression();

        return String.format("%s*%s", left, right);
    }

}
