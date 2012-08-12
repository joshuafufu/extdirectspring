/**
 * Copyright 2010-2012 Ralph Schaer <ralphschaer@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.ralscha.extdirectspring_itest;

import org.springframework.stereotype.Service;

import ch.ralscha.extdirectspring.annotation.ExtDirectMethod;
import ch.ralscha.extdirectspring.annotation.ExtDirectMethodType;
import ch.ralscha.extdirectspring.bean.ExtDirectFormPostResponse;

@Service
public class InfoService {

	@ExtDirectMethod(value = ExtDirectMethodType.FORM_POST, group = "itest_info_service", streamResponse = true)
	public ExtDirectFormPostResponse updateInfo(Info info) {
		ExtDirectFormPostResponse resp = new ExtDirectFormPostResponse(true);
		resp.addResultProperty("user-name-lower-case", info.getUserName().toLowerCase());
		return resp;
	}
}
