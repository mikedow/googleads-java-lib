// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.selectorfields.v201506.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code AdGroupFeed}.
 */
public enum AdGroupFeedField implements EntityField {

  // Fields constants definitions

  /**
   * Id of the AdGroup associated with the AdGroupFeed.
   */
  @Filterable
  AdGroupId(true),

  /**
   * Id of the Feed associated with the AdGroupFeed.
   */
  @Filterable
  FeedId(true),

  /**
   * Matching function associated with the AdGroupFeed.
   * The matching function will return true/false indicating which feed items may serve.
   */
  MatchingFunction(false),

  /**
   * Indicates which placeholder types the feed may populate under the connected AdGroup.
   */
  @Filterable
  PlaceholderTypes(true),

  /**
   * Status of the AdGroupFeed.
   */
  @Filterable
  Status(true),

  ;

  private final boolean isFilterable;

  private AdGroupFeedField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  public boolean isFilterable() {
    return this.isFilterable;
  }

}
