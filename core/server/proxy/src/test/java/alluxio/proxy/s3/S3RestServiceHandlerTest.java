/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.proxy.s3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class S3RestServiceHandlerTest {

  @Test
  public void userFromAuthorization() throws Exception {
    assertEquals(null, S3RestServiceHandler.getUserFromAuthorization("AWS :randomtext"));
    assertEquals("test", S3RestServiceHandler.getUserFromAuthorization("AWS test:"));
    assertEquals(null, S3RestServiceHandler.getUserFromAuthorization(""));
  }
}
