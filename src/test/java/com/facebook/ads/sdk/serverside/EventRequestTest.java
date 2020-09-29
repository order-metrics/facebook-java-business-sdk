/**
 * Copyright (c) 2015-present, Facebook, Inc. All rights reserved.
 *
 * <p>You are hereby granted a non-exclusive, worldwide, royalty-free license to use, copy, modify,
 * and distribute this software in source code or binary form for use in connection with the web
 * services and APIs provided by Facebook.
 *
 * <p>As with any software that integrates with the Facebook platform, your use of this software is
 * subject to the Facebook Developer Principles and Policies [http://developers.facebook.com/policy/].
 * This copyright notice shall be included in all copies or substantial portions of the software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.facebook.ads.sdk.serverside;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventRequestTest {
  @Test
  public void BuildersAndGettersTest() {
    EventRequest eventRequest = new EventRequest("pixelid", null);
    eventRequest.namespaceId("11")
        .uploadId("222")
        .uploadTag("upload-tag-3")
        .uploadSource("upload-source-4")
        .testEventCode("test-event-code-5")
        .partnerAgent("partner-agent-6");

    assertEquals(eventRequest.getNamespaceId(), "11");
    assertEquals(eventRequest.getUploadId(), "222");
    assertEquals(eventRequest.getUploadTag(), "upload-tag-3");
    assertEquals(eventRequest.getUploadSource(), "upload-source-4");
    assertEquals(eventRequest.getTestEventCode(), "test-event-code-5");
    assertEquals(eventRequest.getPartnerAgent(), "partner-agent-6");
  }
}
