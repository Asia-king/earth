/**
 * Copyright (c) 2015, 玛雅牛［李飞］ (lifei@wellbole.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jfinal.plugin.zbus.sender;

import org.zbus.mq.Protocol.MqMode;

/**
 * @ClassName: MqSender
 * @Description: Mq泛型发送器
 * @author 李飞 (lifei@wellbole.com)
 * @date 2015年8月2日 下午6:46:51
 * @since V1.0.0
 */
public class MqSender<T> extends AbstractSender<T>{
	
	/**
	 * <p>
	 * Title: Sender
	 * </p>
	 * <p>
	 * Description: 构建一个MQ发送器
	 * </p>
	 * 
	 * @param mq
	 *            MQ队列名
	 * @since V1.0.0
	 */
	public MqSender(String mq) {
		super(mq, MqMode.MQ);
	}
}
