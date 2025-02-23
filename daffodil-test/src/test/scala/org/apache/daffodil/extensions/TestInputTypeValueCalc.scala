/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.daffodil.extensions

import org.apache.daffodil.tdml.Runner

import org.junit.AfterClass
import org.junit.Test

object TestInputTypeValueCalc {
  val testDir = "/org/apache/daffodil/extensions/type_calc/"

  val runner = Runner(testDir, "inputTypeCalc.tdml", validateTDMLFile = false)
  val exprRunner = Runner(testDir, "inputTypeCalcExpression.tdml", validateTDMLFile = false)
  val fnRunner = Runner(testDir, "typeCalcFunctions.tdml", validateTDMLFile = false)
  val fnErrRunner = Runner(testDir, "typeCalcFunctionErrors.tdml", validateTDMLFile = false)

  @AfterClass def shutDown(): Unit = {
    runner.reset
    exprRunner.reset
    fnRunner.reset
    fnErrRunner.reset
  }

}

class TestInputTypeValueCalc {
  import TestInputTypeValueCalc._
  @Test def test_InputTypeCalc_keysetValue_00(): Unit = {
    runner.runOneTest("InputTypeCalc_keysetValue_00")
  }
  @Test def test_InputTypeCalc_keysetValue_01(): Unit = {
    runner.runOneTest("InputTypeCalc_keysetValue_01")
  }
  @Test def test_InputTypeCalc_keysetValue_02(): Unit = {
    runner.runOneTest("InputTypeCalc_keysetValue_02")
  }

  @Test def test_InputTypeCalc_unparse_keysetValue_00(): Unit = {
    runner.runOneTest("InputTypeCalc_unparse_keysetValue_00")
  }
  @Test def test_InputTypeCalc_unparse_keysetValue_01(): Unit = {
    runner.runOneTest("InputTypeCalc_unparse_keysetValue_01")
  }
  @Test def test_InputTypeCalc_unparse_keysetValue_02(): Unit = {
    runner.runOneTest("InputTypeCalc_unparse_keysetValue_02")
  }

  @Test def test_InputTypeCalc_unionOfKeysetValueCalcs_01(): Unit = {
    runner.runOneTest("InputTypeCalc_unionOfKeysetValueCalcs_01")
  }
  @Test def test_InputTypeCalc_unparse_unionOfKeysetValueCalcs_01(): Unit = {
    runner.runOneTest("InputTypeCalc_unparse_unionOfKeysetValueCalcs_01")
  }

  @Test def test_inherited_LengthKind(): Unit = { runner.runOneTest("inherited_LengthKind") }

  @Test def test_valueNotFound_1(): Unit = { runner.runOneTest("valueNotFound_1") }
  @Test def test_unparseValueNotFound_1(): Unit = {
    runner.runOneTest("unparseValueNotFound_1")
  }
  @Test def test_valueNotFound_2(): Unit = { runner.runOneTest("valueNotFound_2") }
  @Test def test_unparseValueNotFound_2(): Unit = {
    runner.runOneTest("unparseValueNotFound_2")
  }

  @Test def test_InputTypeCalc_expression_01(): Unit = {
    exprRunner.runOneTest("InputTypeCalc_expression_01")
  }
  @Test def test_OutputTypeCalc_expression_01(): Unit = {
    exprRunner.runOneTest("OutputTypeCalc_expression_01")
  }
  @Test def test_InputTypeCalc_expression_02(): Unit = {
    exprRunner.runOneTest("InputTypeCalc_expression_02")
  }
  @Test def test_OutputTypeCalc_expression_02(): Unit = {
    exprRunner.runOneTest("OutputTypeCalc_expression_02")
  }

  @Test def test_inputTypeCalcInt_01(): Unit = { fnRunner.runOneTest("inputTypeCalcInt_01") }
  @Test def test_inputTypeCalcString_01(): Unit = {
    fnRunner.runOneTest("inputTypeCalcString_01")
  }
  @Test def test_outputTypeCalcInt_01(): Unit = { fnRunner.runOneTest("outputTypeCalcInt_01") }
  @Test def test_outputTypeCalcString_01(): Unit = {
    fnRunner.runOneTest("outputTypeCalcString_01")
  }

  @Test def test_abstractIntToStringByKeyset_01(): Unit = {
    fnRunner.runOneTest("abstractIntToStringByKeyset_01")
  }
  @Test def test_sparse_enum_01(): Unit = { fnRunner.runOneTest("sparse_enum_01") }

  @Test def test_nonexistant_reptype_01(): Unit = {
    fnErrRunner.runOneTest("nonexistant_reptype_01")
  }
  @Test def test_nonexistantOutputTypeCalc_01(): Unit = {
    fnErrRunner.runOneTest("nonexistantOutputTypeCalc_01")
  }
  @Test def test_nonexistantInputTypeCalc_01(): Unit = {
    fnErrRunner.runOneTest("nonexistantInputTypeCalc_01")
  }
  @Test def test_nonexistantTypeCalcType_01(): Unit = {
    fnErrRunner.runOneTest("nonexistantTypeCalcType_01")
  }
  @Test def test_nonexistantTypeCalcType_02(): Unit = {
    fnErrRunner.runOneTest("nonexistantTypeCalcType_02")
  }

}
