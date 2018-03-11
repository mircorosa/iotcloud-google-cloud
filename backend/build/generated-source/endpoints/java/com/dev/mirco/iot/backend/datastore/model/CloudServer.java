/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2018-02-26 17:53:51 UTC)
 * on 2018-03-11 at 15:49:47 UTC 
 * Modify at your own risk.
 */

package com.dev.mirco.iot.backend.datastore.model;

/**
 * Model definition for CloudServer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the datastore. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudServer extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CloudResource> resources;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * @param address address or {@code null} for none
   */
  public CloudServer setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public CloudServer setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * @param port port or {@code null} for none
   */
  public CloudServer setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<CloudResource> getResources() {
    return resources;
  }

  /**
   * @param resources resources or {@code null} for none
   */
  public CloudServer setResources(java.util.List<CloudResource> resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public CloudServer set(String fieldName, Object value) {
    return (CloudServer) super.set(fieldName, value);
  }

  @Override
  public CloudServer clone() {
    return (CloudServer) super.clone();
  }

}