// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.webauthn.gaedemo.objects;

/**
 *
 */
public enum AuthenticatorAttachment {
  PLATFORM("plat"), CROSS_PLATFORM("xplat");

  private String name;

  /**
   * @param name
   */
  private AuthenticatorAttachment(String name) {
    this.name = name;
  }

  /**
   * @param s
   * @return AuthenticatorAttachment corresponding to the input string
   */
  public static AuthenticatorAttachment decode(String s) {
    for (AuthenticatorAttachment a : AuthenticatorAttachment.values()) {
      if (a.name.equals(s)) {
        return a;
      }
    }
    throw new IllegalArgumentException(s + " not a valid AuthenticatorAttachment");
  }

  @Override
  public String toString() {
    return name;
  }
}
