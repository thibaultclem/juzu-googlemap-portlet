/*
 * Copyright 2013 eXo Platform SAS
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

@juzu.Application
@Portlet
@WebJars(@WebJar("jquery"))
@Scripts({
        @Script(
                id = "google-api.js",
                value = "https://maps.googleapis.com/maps/api/js?v=3.exp",
                location = AssetLocation.URL),
        @Script(id = "jquery.js", value = "jquery/2.1.4/jquery.js"),
        @Script(
                id = "google-map.js",
                value = "javascripts/google-map.js",
                depends = {"jquery.js", "google-api.js"})
})
@Stylesheets({@Stylesheet(id = "google-map.css", value = "css/google-map.css")})
@Assets({"*"})
package com.thibaultclement.juzu.googlemap;

import juzu.asset.AssetLocation;
import juzu.plugin.asset.*;
import juzu.plugin.portlet.Portlet;
import juzu.plugin.webjars.WebJar;
import juzu.plugin.webjars.WebJars;
