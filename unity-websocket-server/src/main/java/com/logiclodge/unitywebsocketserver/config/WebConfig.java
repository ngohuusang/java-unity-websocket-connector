/*
 * Copyright 2017 L0G1C (David B) - logiclodge.com
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

package com.logiclodge.unitywebsocketserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.logiclodge.unitywebsocketserver.unitysocket.UnitySocketWebSocketHandler;

/**
 * @author L0G1C (David B) <a
 *         href=https://github.com/Binary-L0G1C/java-unity-websocket-connector>
 *         https://github.com/Binary-L0G1C/java-unity-websocket-connector </a>
 */
@Configuration
@EnableWebSocket
public class WebConfig implements WebSocketConfigurer {

	@Autowired
	UnitySocketWebSocketHandler unitySocketWebSocketHandler;

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(unitySocketWebSocketHandler, "/unitysocket").setAllowedOrigins("*");
	}
}
