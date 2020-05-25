/*
 * NaRPC: An NIO-based RPC library
 *
 * Author: Adrian Schuepbach <dri@zurich.ibm.com>
 *
 * Copyright (C) 2016-2020, IBM Corporation
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
 *
 */

package org.apache.crail.namenode.rpc.tcp;

import com.ibm.narpc.NaRPCContext;
import org.apache.crail.rpc.RpcNameNodeContext;

public class TcpNameNodeContext extends RpcNameNodeContext implements NaRPCContext {
  Object[] contextArray;

  public TcpNameNodeContext() {
    contextArray = new Object[10];
  }

  public void allocateNrContextFields(int nr) {
    contextArray = new Object[nr];
  }
  public void setContext(int nr, Object contextField) {
    contextArray[nr] = contextField;
  }
  public Object getContext(int nr) {
    return(contextArray[nr]);
  }
}

