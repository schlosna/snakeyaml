/*
 * See LICENSE file in distribution for copyright and licensing information.
 */
package org.yaml.snakeyaml.tokens;

import junit.framework.TestCase;

import org.yaml.snakeyaml.error.Mark;

public class StreamStartTokenTest extends TestCase {

    public void testGetTokenId() {
        Mark mark = new Mark("test1", 0, 0, 0, "*The first line.\nThe last line.", 0);
        StreamStartToken token = new StreamStartToken(mark, mark);
        assertEquals("<stream start>", token.getTokenId());
    }
}