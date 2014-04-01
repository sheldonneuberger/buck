/*
 * Copyright 2012-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.rules;

import com.google.common.base.Preconditions;

public class Label implements Comparable<Label> {
  private final String labelString;

  public Label(String labelString) {
    this.labelString = Preconditions.checkNotNull(labelString);
  }

  @Override
  public int compareTo(Label that) {
    if (that == this) {
      return 0;
    }
    return labelString.compareTo(that.labelString);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Label)) {
      return false;
    }
    return labelString.equals(((Label) obj).labelString);
  }

  @Override
  public int hashCode() {
    return labelString.hashCode();
  }

  @Override
  public String toString() {
    return labelString;
  }
}
