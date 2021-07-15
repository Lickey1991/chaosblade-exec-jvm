/*
 * Copyright 1999-2019 Alibaba Group Holding Ltd.
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

package com.alibaba.chaosblade.exec.plugin.lickey;

import com.alibaba.chaosblade.exec.common.aop.EnhancerModel;
import com.alibaba.chaosblade.exec.common.exception.InterruptProcessException;
import com.alibaba.chaosblade.exec.common.model.action.ActionExecutor;
import com.alibaba.chaosblade.exec.common.model.action.returnv.BaseReturnValueExecutor;
import com.alibaba.chaosblade.exec.common.model.action.returnv.ValueFlagSpec;
import com.alibaba.chaosblade.exec.common.model.action.returnv.compiler.Calculator;
import com.alibaba.chaosblade.exec.common.model.action.returnv.compiler.CompilerException;
import com.alibaba.chaosblade.exec.common.model.action.returnv.compiler.Constant;
import com.alibaba.chaosblade.exec.common.model.action.returnv.compiler.Syntactic;
import com.alibaba.chaosblade.exec.common.util.StringUtil;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static com.alibaba.chaosblade.exec.common.model.action.returnv.compiler.ConstantType.*;
import static com.alibaba.chaosblade.exec.common.model.action.returnv.compiler.ConstantType.NULL;

/**
 * @author Changjun Xiao
 */
public class LickeyExecutor implements ActionExecutor {

    public static final String NULL = "null";

    public LickeyExecutor() {

    }


    @Override
    public void run(EnhancerModel enhancerModel) throws Exception {
        // get return value from model action
//        Method method = enhancerModel.getMethod();
//
//        if (method == null) {
//            return;
//        }
//
//        final Map<String, Object> variates = new HashMap<String, Object>();
//        if (enhancerModel.getMethodArguments() != null) {
//            for (int i = 0; i < enhancerModel.getMethodArguments().length; i++) {
//                variates.put(String.format("p%d", i), enhancerModel.getMethodArguments()[i]);
//            }
//        }
//        if (enhancerModel.getReturnValue() != null) {
//            variates.put("r", enhancerModel.getReturnValue());
//        }
//
//        final Calculator calculator = new Calculator() {
//            @Override
//            public Constant getValue(String name) throws CompilerException {
//                if (name==null || name.equals("null")) {
//                    return Constant.build(NULL, null);
//                } else if (!variates.containsKey(name)) {
//                    return Constant.build(STRING, name);
//                } else if (variates.get(name) instanceof Number) {
//                    return Constant.build(NUMERIC, ((Number) variates.get(name)).doubleValue());
//                } else if (variates.get(name) instanceof String) {
//                    return Constant.build(STRING, variates.get(name).toString());
//                } else if (variates.get(name) instanceof Boolean) {
//                    return Constant.build(BOOLEAN, Boolean.parseBoolean(variates.get(name).toString()));
//                }
//                return Constant.build(NULL, null);
//            }
//
//            @Override
//            public boolean isVariate(String name) {
//                return variates.containsKey(name);
//            }
//        };
//
//        final Syntactic syntactic = new Syntactic(calculator);

        Object returnValue = "test";
        InterruptProcessException.throwReturnImmediately(returnValue);
    }
}
