/* 
 * Copyright (C) 2013 The Rythm Engine project
 * Gelin Luo <greenlaw110(at)gmail.com>
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package org.rythmengine.extension;

import org.rythmengine.template.ITag;
import org.rythmengine.template.ITemplate;
import org.rythmengine.template.TemplateBase;

/**
 * Listen to rythm event
 */
public interface IRythmListener {

    void onRender(ITemplate template);
    void rendered(ITemplate template);
    
    void enterInvokeTemplate(TemplateBase caller);
    void exitInvokeTemplate(TemplateBase caller);

    void onInvoke(ITag tag);
    void invoked(ITag tag);
    
    public static class ListenerAdaptor implements IRythmListener{
        @Override
        public void onRender(ITemplate template) {
        }

        @Override
        public void rendered(ITemplate template) {
        }

        @Override
        public void onInvoke(ITag tag) {
        }

        @Override
        public void invoked(ITag tag) {
        }

        @Override
        public void enterInvokeTemplate(TemplateBase caller) {
        }

        @Override
        public void exitInvokeTemplate(TemplateBase caller) {
        }
    }
}
