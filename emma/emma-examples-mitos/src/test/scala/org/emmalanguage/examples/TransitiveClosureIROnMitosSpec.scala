/*
 * Copyright © 2014 TU Berlin (emma@dima.tu-berlin.de)
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
package org.emmalanguage.examples

import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment

class TransitiveClosureIROnMitosSpec extends BaseIntegrationSpec {


  override def run(): Unit = {
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Boolean](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Boolean]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Boolean]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Int](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Int]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Int]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Long](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Long]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Long]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Nothing](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Nothing]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Nothing]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.java.lang.String](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.java.lang.String]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.java.lang.String]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Unit](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Unit]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Unit]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Boolean]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Boolean]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Boolean]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.util.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.util.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.util.Unit]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long], _root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long], _root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long], _root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Boolean, _root_.org.emmalanguage.mitos.util.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Boolean, _root_.org.emmalanguage.mitos.util.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Boolean, _root_.org.emmalanguage.mitos.util.Unit]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Boolean]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Boolean]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Boolean]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Unit]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long], _root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long], _root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long], _root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Boolean]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Boolean]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Boolean]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.util.Unit](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.util.Unit]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.util.Unit]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);

    implicit val flink = StreamExecutionEnvironment.getExecutionEnvironment
    val registerCustomSerializer$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.registerCustomSerializer();
    val terminalBbId$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.setTerminalBbid(2);
    val kickOffSource$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.setKickoffSource(0, 1);


    val fun$m6 = (() => {
      val tmp$m1 = 0L;
      tmp$m1
    });
    val fromNothing$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.fromNothing[_root_.scala.Long](fun$m6);
    val partitioner$m1 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing](1);
    val typeInfo$m1 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
    val elementOrEventTypeInfo$m1 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m1);
    val labyNode$m1 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Long]("fromNothing", fromNothing$m1, 0, partitioner$m1, null, elementOrEventTypeInfo$m1);
    val setPrllzm$m1 = labyNode$m1.setParallelism(1);


    val fun$m7 = (() => {
      val tmp$m2 = 15L;
      tmp$m2
    });
    val fromNothing$m2 = _root_.org.emmalanguage.mitos.operators.ScalaOps.fromNothing[_root_.scala.Long](fun$m7);
    val partitioner$m2 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing](1);
    val typeInfo$m2 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
    val elementOrEventTypeInfo$m2 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m2);
    val labyNode$m2 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Long]("fromNothing", fromNothing$m2, 0, partitioner$m2, null, elementOrEventTypeInfo$m2);
    val setPrllzm$m2 = labyNode$m2.setParallelism(1);


    val fun$m8 = (() => {
      val tmp$m3 = "/Users/kishanthan/Work/internship/projects/mitos/emma/emma-examples-mitos/src/test/scala/org/emmalanguage/examples/edges.tsv".+(1);
      tmp$m3
    });
    val fromNothing$m3 = _root_.org.emmalanguage.mitos.operators.ScalaOps.fromNothing[_root_.java.lang.String](fun$m8);
    val partitioner$m3 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing](1);
    val typeInfo$m3 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.java.lang.String];
    val elementOrEventTypeInfo$m3 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String](typeInfo$m3);
    val labyNode$m3 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]("fromNothing", fromNothing$m3, 0, partitioner$m3, null, elementOrEventTypeInfo$m3);
    val setPrllzm$m3 = labyNode$m3.setParallelism(1);


    val inputSplits$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.textSource;
    val partitioner$m4 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String](1);
    val typeInfo$m4 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]];
    val elementOrEventTypeInfo$m4 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]](typeInfo$m4);
    val labyNode$m4 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]("inputSplits", inputSplits$m1, 0, partitioner$m4, null, elementOrEventTypeInfo$m4);
    val addInput$m1 = labyNode$m4.addInput(setPrllzm$m3, true, false);
    val setPrllzm$m4 = addInput$m1.setParallelism(1);


    val readSplits$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.textReader;
    val partitioner$m5 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]](1);
    val typeInfo$m5 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.java.lang.String];
    val elementOrEventTypeInfo$m5 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String](typeInfo$m5);
    val labyNode$m5 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]("readSplits", readSplits$m1, 0, partitioner$m5, null, elementOrEventTypeInfo$m5);
    val addInput$m2 = labyNode$m5.addInput(setPrllzm$m4, true, false);
    val setPrllzm$m5 = addInput$m2.setParallelism(1);


    val f$m1 = ((s: _root_.java.lang.String) => {
      val splits = s.split("\t");
      val anf$m4 = splits.apply(0);
      val anf$m5 = _root_.java.lang.Integer.parseInt(anf$m4);
      val anf$m6 = anf$m5.toLong;
      val anf$m7 = splits.apply(1);
      val anf$m8 = _root_.java.lang.Integer.parseInt(anf$m7);
      val anf$m9 = anf$m8.toLong;
      val anf$m10 = _root_.org.emmalanguage.examples.graphs.model.Edge.apply[_root_.scala.Long](anf$m6, anf$m9);
      anf$m10
    });
    val mapOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](f$m1);
    val partitioner$m6 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String](1);
    val typeInfo$m6 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val elementOrEventTypeInfo$m6 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m6);
    val labyNode$m6 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("map", mapOp$m1, 0, partitioner$m6, null, elementOrEventTypeInfo$m6);
    val addInput$m3 = labyNode$m6.addInput(setPrllzm$m5, true, false);
    val setPrllzm$m6 = addInput$m3.setParallelism(1);


    val partitioner$m7 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
    val typeInfo$m7 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
    val elementOrEventTypeInfo$m7 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m7);
    val phiNode$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.phi[_root_.scala.Long]("arg$m1Phi", 1, partitioner$m7, null, elementOrEventTypeInfo$m7);


    val partitioner$m8 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
    val typeInfo$m8 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
    val elementOrEventTypeInfo$m8 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m8);
    val phiNode$m2 = _root_.org.emmalanguage.mitos.operators.LabyStatics.phi[_root_.scala.Long]("arg$m2Phi", 1, partitioner$m8, null, elementOrEventTypeInfo$m8);


    val partitioner$m9 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
    val typeInfo$m9 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val elementOrEventTypeInfo$m9 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m9);
    val phiNode$m3 = _root_.org.emmalanguage.mitos.operators.LabyStatics.phi[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("paths$p$m1Phi", 1, partitioner$m9, null, elementOrEventTypeInfo$m9);


    val kx$m1 = ((e1: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
      val anf$m12 = e1.dst;
      anf$m12
    });
    val ky$m1 = ((e2: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
      val anf$m13 = e2.src;
      anf$m13
    });
    val toLeft$m1 = ((t$m4: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
      val lambda$m4 = _root_.scala.util.Left.apply[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Nothing](t$m4);
      lambda$m4
    });
    val mapToLeftOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](toLeft$m1);
    val partitioner$m10 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
    val typeInfo$m10 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]];
    val elementOrEventTypeInfo$m10 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](typeInfo$m10);
    val labyNode$m7 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]("map", mapToLeftOp$m1, 1, partitioner$m10, null, elementOrEventTypeInfo$m10);
    val addInput$m4 = labyNode$m7.addInput(phiNode$m3, true, false);
    val setPrllzm$m7 = addInput$m4.setParallelism(1);


    val toRight$m1 = ((t$m5: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
      val lambda$m5 = _root_.scala.util.Right.apply[_root_.scala.Nothing, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](t$m5);
      lambda$m5
    });
    val mapToRightOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](toRight$m1);
    val partitioner$m11 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
    val typeInfo$m11 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]];
    val elementOrEventTypeInfo$m11 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](typeInfo$m11);
    val labyNode$m8 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]("map", mapToRightOp$m1, 1, partitioner$m11, null, elementOrEventTypeInfo$m11);
    val addInput$m5 = labyNode$m8.addInput(phiNode$m3, true, false);
    val setPrllzm$m8 = addInput$m5.setParallelism(1);


    val joinOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.joinScala[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](kx$m1, ky$m1);
    val partitioner$m12 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](1);
    val typeInfo$m12 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]];
    val elementOrEventTypeInfo$m12 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](typeInfo$m12);
    val labyNode$m9 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]("join", joinOp$m1, 1, partitioner$m12, null, elementOrEventTypeInfo$m12);
    val addInput$m6 = labyNode$m9.addInput(setPrllzm$m7, true, false);
    val addInput$m7 = addInput$m6.addInput(setPrllzm$m8, true, false);
    val setPrllzm$m9 = addInput$m7.setParallelism(1);


    val f$m2 = ((xy$m1: _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]) => {
      val e1 = xy$m1._1;
      val e2 = xy$m1._2;
      val anf$m16 = e1.src;
      val anf$m17 = e2.dst;
      val anf$m18 = _root_.org.emmalanguage.examples.graphs.model.Edge.apply[_root_.scala.Long](anf$m16, anf$m17);
      anf$m18
    });
    val mapOp$m2 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](f$m2);
    val partitioner$m13 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](1);
    val typeInfo$m13 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val elementOrEventTypeInfo$m13 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m13);
    val labyNode$m10 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("map", mapOp$m2, 1, partitioner$m13, null, elementOrEventTypeInfo$m13);
    val addInput$m8 = labyNode$m10.addInput(setPrllzm$m9, true, false);
    val setPrllzm$m10 = addInput$m8.setParallelism(1);


    val unionOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.union[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val partitioner$m14 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
    val typeInfo$m14 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val elementOrEventTypeInfo$m14 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m14);
    val labyNode$m11 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("union", unionOp$m1, 1, partitioner$m14, null, elementOrEventTypeInfo$m14);
    val addInput$m9 = labyNode$m11.addInput(phiNode$m3, true, false);
    val addInput$m10 = addInput$m9.addInput(setPrllzm$m10, true, false);
    val setPrllzm$m11 = addInput$m10.setParallelism(1);


    val distinctOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.distinct[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val partitioner$m141 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
    val typeInfo$m141 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val elementOrEventTypeInfo$m141 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m141);
    val labyNode$m141 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("distinct1", distinctOp$m1, 1, partitioner$m141, null, elementOrEventTypeInfo$m141);
    val addInput$m141 = labyNode$m141.addInput(setPrllzm$m11, true, false);
    val setPrllzm$m141 = addInput$m141.setParallelism(1);


    val fun$Map$m1 = ((e: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
      e
    });
    val alg$Map$m1 = _root_.org.emmalanguage.api.alg.Map.apply[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](fun$Map$m1, _root_.org.emmalanguage.api.alg.Size);
    val fold1Op$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.foldAlgHelper[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](alg$Map$m1);
    val partitioner$m15 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
    val typeInfo$m15 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
    val elementOrEventTypeInfo$m15 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m15);
    val labyNode$m12 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]("fold1", fold1Op$m1, 1, partitioner$m15, null, elementOrEventTypeInfo$m15);
    val addInput$m11 = labyNode$m12.addInput(setPrllzm$m141, true, false);
    val setPrllzm$m12 = addInput$m11.setParallelism(1);


    val toLeft$m2 = ((t$m6: _root_.scala.Long) => {
      val lambda$m6 = _root_.scala.util.Left.apply[_root_.scala.Long, _root_.scala.Nothing](t$m6);
      lambda$m6
    });
    val mapToLeftOp$m2 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]](toLeft$m2);
    val partitioner$m16 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
    val typeInfo$m16 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]];
    val elementOrEventTypeInfo$m16 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]](typeInfo$m16);
    val labyNode$m13 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]("map", mapToLeftOp$m2, 1, partitioner$m16, null, elementOrEventTypeInfo$m16);
    val addInput$m12 = labyNode$m13.addInput(setPrllzm$m12, true, false);
    val setPrllzm$m13 = addInput$m12.setParallelism(1);


    val toRight$m2 = ((t$m7: _root_.scala.Long) => {
      val lambda$m7 = _root_.scala.util.Right.apply[_root_.scala.Nothing, _root_.scala.Long](t$m7);
      lambda$m7
    });
    val mapToRightOp$m2 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]](toRight$m2);
    val partitioner$m17 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
    val typeInfo$m17 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]];
    val elementOrEventTypeInfo$m17 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]](typeInfo$m17);
    val labyNode$m14 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]("map", mapToRightOp$m2, 1, partitioner$m17, null, elementOrEventTypeInfo$m17);
    val addInput$m13 = labyNode$m14.addInput(phiNode$m2, true, false);
    val setPrllzm$m14 = addInput$m13.setParallelism(1);


    val crossOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.cross[_root_.scala.Long, _root_.scala.Long];
    val partitioner$m18 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]](1);
    val typeInfo$m18 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]];
    val elementOrEventTypeInfo$m18 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]](typeInfo$m18);
    val labyNode$m15 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long], _root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]("cross", crossOp$m1, 1, partitioner$m18, null, elementOrEventTypeInfo$m18);
    val addInput$m14 = labyNode$m15.addInput(setPrllzm$m13, true, false);
    val addInput$m15 = addInput$m14.addInput(setPrllzm$m14, true, false);
    val setPrllzm$m15 = addInput$m15.setParallelism(1);


    val lambda$m1 = ((t$m1: _root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]) => {
      val t1$m1 = t$m1._1;
      val t2$m1 = t$m1._2;
      val lbdaRhs$m1 = t1$m1.-(t2$m1);
      lbdaRhs$m1
    });
    val mapOp$m3 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long], _root_.scala.Long](lambda$m1);
    val partitioner$m19 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]](1);
    val typeInfo$m19 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
    val elementOrEventTypeInfo$m19 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m19);
    val labyNode$m16 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long], _root_.scala.Long]("map", mapOp$m3, 1, partitioner$m19, null, elementOrEventTypeInfo$m19);
    val addInput$m16 = labyNode$m16.addInput(setPrllzm$m15, true, false);
    val setPrllzm$m16 = addInput$m16.setParallelism(1);


    val lambda$m2 = ((t$m2: _root_.scala.Long) => {
      val lbdaRhs$m2 = t$m2.>(0);
      lbdaRhs$m2
    });
    val mapOp$m4 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Long, _root_.scala.Boolean](lambda$m2);
    val partitioner$m20 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
    val typeInfo$m20 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Boolean];
    val elementOrEventTypeInfo$m20 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Boolean](typeInfo$m20);
    val labyNode$m17 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Boolean]("map", mapOp$m4, 1, partitioner$m20, null, elementOrEventTypeInfo$m20);
    val addInput$m17 = labyNode$m17.addInput(setPrllzm$m16, true, false);
    val setPrllzm$m17 = addInput$m17.setParallelism(1);


    val lambda$m3 = ((t$m3: _root_.scala.Long) => {
      val lbdaRhs$m3 = _root_.scala.Predef.print(t$m3);
      lbdaRhs$m3
    });
    val mapOp$m5 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Long, _root_.scala.Unit](lambda$m3);
    val partitioner$m21 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
    val typeInfo$m21 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Unit];
    val elementOrEventTypeInfo$m21 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit](typeInfo$m21);
    val labyNode$m18 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Unit]("map", mapOp$m5, 2, partitioner$m21, null, elementOrEventTypeInfo$m21);
    val addInput$m18 = labyNode$m18.addInput(setPrllzm$m12, false, true);
    val setPrllzm$m18 = addInput$m18.setParallelism(1);


    val seq$m1 = _root_.scala.collection.Seq.apply[_root_.scala.Int](1);
    val seq$m2 = _root_.scala.collection.Seq.apply[_root_.scala.Int](2);
    val condOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.condNode(seq$m1, seq$m2);
    val partitioner$m22 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Boolean](1);
    val typeInfo$m22 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.mitos.util.Unit];
    val elementOrEventTypeInfo$m22 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.util.Unit](typeInfo$m22);
    val labyNode$m19 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Boolean, _root_.org.emmalanguage.mitos.util.Unit]("condNode", condOp$m1, 1, partitioner$m22, null, elementOrEventTypeInfo$m22);
    val addInput$m19 = labyNode$m19.addInput(setPrllzm$m17, true, false);
    val setPrllzm$m19 = addInput$m19.setParallelism(1);


    val addInput$m20 = phiNode$m1.addInput(setPrllzm$m16, false, true);
    val addInput$m21 = phiNode$m2.addInput(setPrllzm$m12, false, true);
    val addInput$m22 = phiNode$m3.addInput(setPrllzm$m141, false, true);
    val addInput$m23 = phiNode$m1.addInput(setPrllzm$m1, false, true);
    val addInput$m24 = phiNode$m2.addInput(setPrllzm$m2, false, true);
    val addInput$m25 = phiNode$m3.addInput(setPrllzm$m6, false, true);


    val implEnv$m1 = _root_.scala.Predef.implicitly[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment];
    val translateAll$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.translateAll;
    val `env.executeWithCatch$m1` = _root_.org.emmalanguage.mitos.operators.LabyStatics.executeWithCatch(implEnv$m1);
    `env.executeWithCatch$m1`
  }

  //  override def run(): Unit = {
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Boolean](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Boolean]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Boolean]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Int](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Int]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Int]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Long](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Long]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Long]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Nothing](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Nothing]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Nothing]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.java.lang.String](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.java.lang.String]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.java.lang.String]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Unit](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Unit]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Unit]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Boolean]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Boolean]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Boolean]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.util.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.util.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.util.Unit]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long], _root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long], _root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long], _root_.scala.Long]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Boolean, _root_.org.emmalanguage.mitos.util.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Boolean, _root_.org.emmalanguage.mitos.util.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Boolean, _root_.org.emmalanguage.mitos.util.Unit]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Boolean]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Boolean]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Boolean]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Unit]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Long]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long], _root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long], _root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long], _root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Boolean]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Boolean]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Boolean]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.util.Unit](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.util.Unit]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.util.Unit]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]);
  //    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
  //
  //    implicit val flink = StreamExecutionEnvironment.getExecutionEnvironment
  //
  //    val registerCustomSerializer$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.registerCustomSerializer();
  //    val terminalBbId$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.setTerminalBbid(2);
  //    val kickOffSource$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.setKickoffSource(0, 1);
  //
  //
  //    val fun$m7 = (() => {
  //      val tmp$m1 = 0L;
  //      tmp$m1
  //    });
  //    val fromNothing$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.fromNothing[_root_.scala.Long](fun$m7);
  //    val partitioner$m1 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing](1);
  //    val typeInfo$m1 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
  //    val elementOrEventTypeInfo$m1 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m1);
  //    val labyNode$m1 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Long]("fromNothing", fromNothing$m1, 0, partitioner$m1, null, elementOrEventTypeInfo$m1);
  //    val setPrllzm$m1 = labyNode$m1.setParallelism(1);
  //
  //
  //    val fun$m8 = (() => {
  //      val tmp$m2 = "/Users/kishanthan/Work/internship/projects/mitos/emma/emma-examples-mitos/src/test/scala/org/emmalanguage/examples/edges.tsv".+(1);
  //      tmp$m2
  //    });
  //    val fromNothing$m2 = _root_.org.emmalanguage.mitos.operators.ScalaOps.fromNothing[_root_.java.lang.String](fun$m8);
  //    val partitioner$m2 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing](1);
  //    val typeInfo$m2 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.java.lang.String];
  //    val elementOrEventTypeInfo$m2 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String](typeInfo$m2);
  //    val labyNode$m2 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]("fromNothing", fromNothing$m2, 0, partitioner$m2, null, elementOrEventTypeInfo$m2);
  //    val setPrllzm$m2 = labyNode$m2.setParallelism(1);
  //
  //
  //    val inputSplits$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.textSource;
  //    val partitioner$m3 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String](1);
  //    val typeInfo$m3 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]];
  //    val elementOrEventTypeInfo$m3 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]](typeInfo$m3);
  //    val labyNode$m3 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]("inputSplits", inputSplits$m1, 0, partitioner$m3, null, elementOrEventTypeInfo$m3);
  //    val addInput$m1 = labyNode$m3.addInput(setPrllzm$m2, true, false);
  //    val setPrllzm$m3 = addInput$m1.setParallelism(1);
  //
  //
  //    val readSplits$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.textReader;
  //    val partitioner$m4 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]](1);
  //    val typeInfo$m4 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.java.lang.String];
  //    val elementOrEventTypeInfo$m4 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String](typeInfo$m4);
  //    val labyNode$m4 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]("readSplits", readSplits$m1, 0, partitioner$m4, null, elementOrEventTypeInfo$m4);
  //    val addInput$m2 = labyNode$m4.addInput(setPrllzm$m3, true, false);
  //    val setPrllzm$m4 = addInput$m2.setParallelism(1);
  //
  //
  //    val f$m1 = ((s: _root_.java.lang.String) => {
  //      val splits = s.split("\t");
  //      val anf$m4 = splits.apply(0);
  //      val anf$m5 = _root_.java.lang.Integer.parseInt(anf$m4);
  //      val anf$m6 = anf$m5.toLong;
  //      val anf$m7 = splits.apply(1);
  //      val anf$m8 = _root_.java.lang.Integer.parseInt(anf$m7);
  //      val anf$m9 = anf$m8.toLong;
  //      val anf$m10 = _root_.org.emmalanguage.examples.graphs.model.Edge.apply[_root_.scala.Long](anf$m6, anf$m9);
  //      anf$m10
  //    });
  //    val mapOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](f$m1);
  //    val partitioner$m5 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String](1);
  //    val typeInfo$m5 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
  //    val elementOrEventTypeInfo$m5 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m5);
  //    val labyNode$m5 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("map", mapOp$m1, 0, partitioner$m5, null, elementOrEventTypeInfo$m5);
  //    val addInput$m3 = labyNode$m5.addInput(setPrllzm$m4, true, false);
  //    val setPrllzm$m5 = addInput$m3.setParallelism(1);
  //
  //
  //    val fun$Map$m2 = ((e$m1: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
  //      e$m1
  //    });
  //    val alg$Map$m2 = _root_.org.emmalanguage.api.alg.Map.apply[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](fun$Map$m2, _root_.org.emmalanguage.api.alg.Size);
  //    val fold1Op$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.foldAlgHelper[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](alg$Map$m2);
  //    val partitioner$m6 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
  //    val typeInfo$m6 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
  //    val elementOrEventTypeInfo$m6 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m6);
  //    val labyNode$m6 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]("fold1", fold1Op$m1, 0, partitioner$m6, null, elementOrEventTypeInfo$m6);
  //    val addInput$m4 = labyNode$m6.addInput(setPrllzm$m5, true, false);
  //    val setPrllzm$m6 = addInput$m4.setParallelism(1);
  //
  //
  //    val partitioner$m7 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
  //    val typeInfo$m7 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
  //    val elementOrEventTypeInfo$m7 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m7);
  //    val phiNode$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.phi[_root_.scala.Long]("arg$m1Phi", 1, partitioner$m7, null, elementOrEventTypeInfo$m7);
  //
  //
  //    val partitioner$m8 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
  //    val typeInfo$m8 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
  //    val elementOrEventTypeInfo$m8 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m8);
  //    val phiNode$m2 = _root_.org.emmalanguage.mitos.operators.LabyStatics.phi[_root_.scala.Long]("arg$m2Phi", 1, partitioner$m8, null, elementOrEventTypeInfo$m8);
  //
  //
  //    val partitioner$m9 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
  //    val typeInfo$m9 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
  //    val elementOrEventTypeInfo$m9 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m9);
  //    val phiNode$m3 = _root_.org.emmalanguage.mitos.operators.LabyStatics.phi[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("paths$p$m1Phi", 1, partitioner$m9, null, elementOrEventTypeInfo$m9);
  //
  //
  //    val kx$m1 = ((e1: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
  //      val anf$m14 = e1.dst;
  //      anf$m14
  //    });
  //    val ky$m1 = ((e2$m1: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
  //      val anf$m15 = e2$m1.src;
  //      anf$m15
  //    });
  //    val toLeft$m1 = ((t$m4: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
  //      val lambda$m4 = _root_.scala.util.Left.apply[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Nothing](t$m4);
  //      lambda$m4
  //    });
  //    val mapToLeftOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](toLeft$m1);
  //    val partitioner$m10 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
  //    val typeInfo$m10 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]];
  //    val elementOrEventTypeInfo$m10 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](typeInfo$m10);
  //    val labyNode$m7 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]("map", mapToLeftOp$m1, 1, partitioner$m10, null, elementOrEventTypeInfo$m10);
  //    val addInput$m5 = labyNode$m7.addInput(phiNode$m3, true, false);
  //    val setPrllzm$m7 = addInput$m5.setParallelism(1);
  //
  //
  //    val toRight$m1 = ((t$m5: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
  //      val lambda$m5 = _root_.scala.util.Right.apply[_root_.scala.Nothing, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](t$m5);
  //      lambda$m5
  //    });
  //    val mapToRightOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](toRight$m1);
  //    val partitioner$m11 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
  //    val typeInfo$m11 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]];
  //    val elementOrEventTypeInfo$m11 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](typeInfo$m11);
  //    val labyNode$m8 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]("map", mapToRightOp$m1, 1, partitioner$m11, null, elementOrEventTypeInfo$m11);
  //    val addInput$m6 = labyNode$m8.addInput(phiNode$m3, true, false);
  //    val setPrllzm$m8 = addInput$m6.setParallelism(1);
  //
  //
  //    val joinOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.joinScala[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](kx$m1, ky$m1);
  //    val partitioner$m12 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](1);
  //    val typeInfo$m12 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]];
  //    val elementOrEventTypeInfo$m12 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](typeInfo$m12);
  //    val labyNode$m9 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]("join", joinOp$m1, 1, partitioner$m12, null, elementOrEventTypeInfo$m12);
  //    val addInput$m7 = labyNode$m9.addInput(setPrllzm$m7, true, false);
  //    val addInput$m8 = addInput$m7.addInput(setPrllzm$m8, true, false);
  //    val setPrllzm$m9 = addInput$m8.setParallelism(1);
  //
  //
  //    val f$m2 = ((xy$m1: _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]) => {
  //      val e1 = xy$m1._1;
  //      val e2$m1 = xy$m1._2;
  //      val anf$m18 = e1.src;
  //      val anf$m19 = e2$m1.dst;
  //      val anf$m20 = _root_.org.emmalanguage.examples.graphs.model.Edge.apply[_root_.scala.Long](anf$m18, anf$m19);
  //      anf$m20
  //    });
  //    val mapOp$m2 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](f$m2);
  //    val partitioner$m13 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](1);
  //    val typeInfo$m13 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
  //    val elementOrEventTypeInfo$m13 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m13);
  //    val labyNode$m10 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("map", mapOp$m2, 1, partitioner$m13, null, elementOrEventTypeInfo$m13);
  //    val addInput$m9 = labyNode$m10.addInput(setPrllzm$m9, true, false);
  //    val setPrllzm$m10 = addInput$m9.setParallelism(1);
  //
  //
  //    val fun$Map$m1 = ((e: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
  //      e
  //    });
  //    val alg$Map$m1 = _root_.org.emmalanguage.api.alg.Map.apply[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](fun$Map$m1, _root_.org.emmalanguage.api.alg.Size);
  //    val unionOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.union[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
  //    val partitioner$m14 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
  //    val typeInfo$m14 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
  //    val elementOrEventTypeInfo$m14 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m14);
  //    val labyNode$m11 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("union", unionOp$m1, 1, partitioner$m14, null, elementOrEventTypeInfo$m14);
  //    val addInput$m10 = labyNode$m11.addInput(phiNode$m3, true, false);
  //    val addInput$m11 = addInput$m10.addInput(setPrllzm$m10, true, false);
  //    val setPrllzm$m11 = addInput$m11.setParallelism(1);
  //
  //
  //    val distinctOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.distinct[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
  //    val partitioner$m141 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
  //    val typeInfo$m141 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
  //    val elementOrEventTypeInfo$m141 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m141);
  //    val labyNode$m141 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("distinct1", distinctOp$m1, 1, partitioner$m141, null, elementOrEventTypeInfo$m141);
  //    val addInput$m141 = labyNode$m141.addInput(setPrllzm$m11, true, false);
  //    val setPrllzm$m141 = addInput$m141.setParallelism(1);
  //
  //
  //    val fold1Op$m2 = _root_.org.emmalanguage.mitos.operators.ScalaOps.foldAlgHelper[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](alg$Map$m1);
  //    val partitioner$m15 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
  //    val typeInfo$m15 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
  //    val elementOrEventTypeInfo$m15 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m15);
  //    val labyNode$m12 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]("fold1", fold1Op$m2, 1, partitioner$m15, null, elementOrEventTypeInfo$m15);
  //    val addInput$m12 = labyNode$m12.addInput(setPrllzm$m141, true, false);
  //    val setPrllzm$m12 = addInput$m12.setParallelism(1);
  //
  //
  //    val toLeft$m2 = ((t$m6: _root_.scala.Long) => {
  //      val lambda$m6 = _root_.scala.util.Left.apply[_root_.scala.Long, _root_.scala.Nothing](t$m6);
  //      lambda$m6
  //    });
  //    val mapToLeftOp$m2 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]](toLeft$m2);
  //    val partitioner$m16 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
  //    val typeInfo$m16 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]];
  //    val elementOrEventTypeInfo$m16 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]](typeInfo$m16);
  //    val labyNode$m13 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]("map", mapToLeftOp$m2, 1, partitioner$m16, null, elementOrEventTypeInfo$m16);
  //    val addInput$m13 = labyNode$m13.addInput(setPrllzm$m12, true, false);
  //    val setPrllzm$m13 = addInput$m13.setParallelism(1);
  //
  //
  //    val toRight$m2 = ((t$m7: _root_.scala.Long) => {
  //      val lambda$m7 = _root_.scala.util.Right.apply[_root_.scala.Nothing, _root_.scala.Long](t$m7);
  //      lambda$m7
  //    });
  //    val mapToRightOp$m2 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]](toRight$m2);
  //    val partitioner$m17 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
  //    val typeInfo$m17 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]];
  //    val elementOrEventTypeInfo$m17 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]](typeInfo$m17);
  //    val labyNode$m14 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]]("map", mapToRightOp$m2, 1, partitioner$m17, null, elementOrEventTypeInfo$m17);
  //    val addInput$m14 = labyNode$m14.addInput(phiNode$m2, true, false);
  //    val setPrllzm$m14 = addInput$m14.setParallelism(1);
  //
  //
  //    val crossOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.cross[_root_.scala.Long, _root_.scala.Long];
  //    val partitioner$m18 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long]](1);
  //    val typeInfo$m18 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]];
  //    val elementOrEventTypeInfo$m18 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]](typeInfo$m18);
  //    val labyNode$m15 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.scala.Long, _root_.scala.Long], _root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]("cross", crossOp$m1, 1, partitioner$m18, null, elementOrEventTypeInfo$m18);
  //    val addInput$m15 = labyNode$m15.addInput(setPrllzm$m13, true, false);
  //    val addInput$m16 = addInput$m15.addInput(setPrllzm$m14, true, false);
  //    val setPrllzm$m15 = addInput$m16.setParallelism(1);
  //
  //
  //    val lambda$m1 = ((t$m1: _root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]) => {
  //      val t1$m1 = t$m1._1;
  //      val t2$m1 = t$m1._2;
  //      val lbdaRhs$m1 = t1$m1.-(t2$m1);
  //      lbdaRhs$m1
  //    });
  //    val mapOp$m3 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long], _root_.scala.Long](lambda$m1);
  //    val partitioner$m19 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]](1);
  //    val typeInfo$m19 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
  //    val elementOrEventTypeInfo$m19 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m19);
  //    val labyNode$m16 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long], _root_.scala.Long]("map", mapOp$m3, 1, partitioner$m19, null, elementOrEventTypeInfo$m19);
  //    val addInput$m17 = labyNode$m16.addInput(setPrllzm$m15, true, false);
  //    val setPrllzm$m16 = addInput$m17.setParallelism(1);
  //
  //
  //    val lambda$m2 = ((t$m2: _root_.scala.Long) => {
  //      val lbdaRhs$m2 = t$m2.>(0);
  //      lbdaRhs$m2
  //    });
  //    val mapOp$m4 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Long, _root_.scala.Boolean](lambda$m2);
  //    val partitioner$m20 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
  //    val typeInfo$m20 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Boolean];
  //    val elementOrEventTypeInfo$m20 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Boolean](typeInfo$m20);
  //    val labyNode$m17 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Boolean]("map", mapOp$m4, 1, partitioner$m20, null, elementOrEventTypeInfo$m20);
  //    val addInput$m18 = labyNode$m17.addInput(setPrllzm$m16, true, false);
  //    val setPrllzm$m17 = addInput$m18.setParallelism(1);
  //
  //    val lambda$m3 = ((t$m3: _root_.scala.Long) => {
  //      val lbdaRhs$m3 = _root_.scala.Predef.print(t$m3);
  //      lbdaRhs$m3
  //    });
  //    val mapOp$m5 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Long, _root_.scala.Unit](lambda$m3);
  //    val partitioner$m21 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
  //    val typeInfo$m21 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Unit];
  //    val elementOrEventTypeInfo$m21 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit](typeInfo$m21);
  //    val labyNode$m18 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.scala.Unit]("map", mapOp$m5, 2, partitioner$m21, null, elementOrEventTypeInfo$m21);
  //    val addInput$m19 = labyNode$m18.addInput(setPrllzm$m12, false, true);
  //    val setPrllzm$m18 = addInput$m19.setParallelism(1);
  //
  //
  //    val seq$m1 = _root_.scala.collection.Seq.apply[_root_.scala.Int](1);
  //    val seq$m2 = _root_.scala.collection.Seq.apply[_root_.scala.Int](2);
  //    val condOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.condNode(seq$m1, seq$m2);
  //    val partitioner$m22 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Boolean](1);
  //    val typeInfo$m22 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.mitos.util.Unit];
  //    val elementOrEventTypeInfo$m22 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.util.Unit](typeInfo$m22);
  //    val labyNode$m19 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Boolean, _root_.org.emmalanguage.mitos.util.Unit]("condNode", condOp$m1, 1, partitioner$m22, null, elementOrEventTypeInfo$m22);
  //    val addInput$m20 = labyNode$m19.addInput(setPrllzm$m17, true, false);
  //    val setPrllzm$m19 = addInput$m20.setParallelism(1);
  //
  //
  //    val addInput$m21 = phiNode$m1.addInput(setPrllzm$m16, false, true);
  //    val addInput$m22 = phiNode$m2.addInput(setPrllzm$m12, false, true);
  //    val addInput$m23 = phiNode$m3.addInput(setPrllzm$m141, false, true);
  //    val addInput$m24 = phiNode$m1.addInput(setPrllzm$m1, false, true);
  //    val addInput$m25 = phiNode$m2.addInput(setPrllzm$m6, false, true);
  //    val addInput$m26 = phiNode$m3.addInput(setPrllzm$m5, false, true);
  //    val implEnv$m1 = _root_.scala.Predef.implicitly[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment];
  //    val translateAll$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.translateAll;
  //    val `env.executeWithCatch$m1` = _root_.org.emmalanguage.mitos.operators.LabyStatics.executeWithCatch(implEnv$m1);
  //    `env.executeWithCatch$m1`
  //  }
}