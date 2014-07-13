/*
 * Copyright 2014 Matthew Collins
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.co.thinkofdeath.command;

import java.util.List;

public class Util {

    public static <T> void same(List<T> a, List<T> b) {
        if (a.size() != b.size()) {
            throw new AssertionError("a != b");
        }
        for (T el : a) {
            if (!b.contains(el)) {
                throw new AssertionError("Couldn't find " + el);
            }
        }
    }
}
