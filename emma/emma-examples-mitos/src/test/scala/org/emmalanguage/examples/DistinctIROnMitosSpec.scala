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


class DistinctIROnMitosSpec extends BaseIntegrationSpec {

  override def run(): Unit = {
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Long](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Long]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Long]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Nothing](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Nothing]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Nothing]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.java.lang.String](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.java.lang.String]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.java.lang.String]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Unit](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Unit]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Unit]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.scala.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.scala.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.scala.Unit]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]);


    implicit val flink = StreamExecutionEnvironment.getExecutionEnvironment

    val registerCustomSerializer$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.registerCustomSerializer();
    val terminalBbId$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.setTerminalBbid(0);
    val kickOffSource$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.setKickoffSource(0);
    val fun$m7 = (() => {
      val tmp$m1 = "/Users/kishanthan/Work/internship/projects/mitos/emma/emma-examples-mitos/src/test/scala/org/emmalanguage/examples/edges.tsv".+(1);
      tmp$m1
    });
    val fromNothing$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.fromNothing[_root_.java.lang.String](fun$m7);
    val partitioner$m1 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing](1);
    val typeInfo$m1 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.java.lang.String];
    val elementOrEventTypeInfo$m1 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String](typeInfo$m1);
    val labyNode$m1 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]("fromNothing", fromNothing$m1, 0, partitioner$m1, null, elementOrEventTypeInfo$m1);
    val setPrllzm$m1 = labyNode$m1.setParallelism(1);
    val fun$m5 = ((x$1: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
      1L
    });
    val fun$m6 = ((x$2: _root_.scala.Long, x$3: _root_.scala.Long) => {
      val anf$m22 = x$2.+(x$3);
      anf$m22
    });
    val alg$fold$m1 = _root_.org.emmalanguage.api.alg.Fold.apply[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](0L, fun$m5, fun$m6);
    val inputSplits$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.textSource;
    val partitioner$m2 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String](1);
    val typeInfo$m2 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]];
    val elementOrEventTypeInfo$m2 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]](typeInfo$m2);
    val labyNode$m2 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]("inputSplits", inputSplits$m1, 0, partitioner$m2, null, elementOrEventTypeInfo$m2);
    val addInput$m1 = labyNode$m2.addInput(setPrllzm$m1, true, false);
    val setPrllzm$m2 = addInput$m1.setParallelism(1);
    val readSplits$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.textReader;
    val partitioner$m3 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]](1);
    val typeInfo$m3 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.java.lang.String];
    val elementOrEventTypeInfo$m3 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String](typeInfo$m3);
    val labyNode$m3 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]("readSplits", readSplits$m1, 0, partitioner$m3, null, elementOrEventTypeInfo$m3);
    val addInput$m2 = labyNode$m3.addInput(setPrllzm$m2, true, false);
    val setPrllzm$m3 = addInput$m2.setParallelism(1);
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
    val partitioner$m4 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String](1);
    val typeInfo$m4 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val elementOrEventTypeInfo$m4 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m4);
    val labyNode$m4 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("map", mapOp$m1, 0, partitioner$m4, null, elementOrEventTypeInfo$m4);
    val addInput$m3 = labyNode$m4.addInput(setPrllzm$m3, true, false);
    val setPrllzm$m4 = addInput$m3.setParallelism(1);
    val kx$m1 = ((e1: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
      val anf$m12 = e1.dst;
      anf$m12
    });
    val ky$m1 = ((e2$m1: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
      val anf$m13 = e2$m1.src;
      anf$m13
    });
    val toLeft$m1 = ((t$m3: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
      val lambda$m3 = _root_.scala.util.Left.apply[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Nothing](t$m3);
      lambda$m3
    });
    val mapToLeftOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](toLeft$m1);
    val partitioner$m5 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
    val typeInfo$m5 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]];
    val elementOrEventTypeInfo$m5 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](typeInfo$m5);
    val labyNode$m5 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]("map", mapToLeftOp$m1, 0, partitioner$m5, null, elementOrEventTypeInfo$m5);
    val addInput$m4 = labyNode$m5.addInput(setPrllzm$m4, true, false);
    val setPrllzm$m5 = addInput$m4.setParallelism(1);
    val toRight$m1 = ((t$m4: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
      val lambda$m4 = _root_.scala.util.Right.apply[_root_.scala.Nothing, _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](t$m4);
      lambda$m4
    });
    val mapToRightOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](toRight$m1);
    val partitioner$m6 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
    val typeInfo$m6 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]];
    val elementOrEventTypeInfo$m6 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](typeInfo$m6);
    val labyNode$m6 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]("map", mapToRightOp$m1, 0, partitioner$m6, null, elementOrEventTypeInfo$m6);
    val addInput$m5 = labyNode$m6.addInput(setPrllzm$m4, true, false);
    val setPrllzm$m6 = addInput$m5.setParallelism(1);
    val joinOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.joinScala[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](kx$m1, ky$m1);
    val partitioner$m7 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](1);
    val typeInfo$m7 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]];
    val elementOrEventTypeInfo$m7 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](typeInfo$m7);
    val labyNode$m7 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.util.Either[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]]("join", joinOp$m1, 0, partitioner$m7, null, elementOrEventTypeInfo$m7);
    val addInput$m6 = labyNode$m7.addInput(setPrllzm$m5, true, false);
    val addInput$m7 = addInput$m6.addInput(setPrllzm$m6, true, false);
    val setPrllzm$m7 = addInput$m7.setParallelism(1);
    val f$m2 = ((xy$m1: _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]) => {
      val e1 = xy$m1._1;
      val e2$m1 = xy$m1._2;
      val anf$m16 = e1.src;
      val anf$m17 = e2$m1.dst;
      val anf$m18 = _root_.org.emmalanguage.examples.graphs.model.Edge.apply[_root_.scala.Long](anf$m16, anf$m17);
      anf$m18
    });
    val mapOp$m2 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](f$m2);
    val partitioner$m8 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]](1);
    val typeInfo$m8 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val elementOrEventTypeInfo$m8 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m8);
    val labyNode$m8 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("map", mapOp$m2, 0, partitioner$m8, null, elementOrEventTypeInfo$m8);
    val addInput$m8 = labyNode$m8.addInput(setPrllzm$m7, true, false);
    val setPrllzm$m8 = addInput$m8.setParallelism(1);

    val unionOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.union[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val partitioner$m9 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
    val typeInfo$m9 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val elementOrEventTypeInfo$m9 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m9);
    val labyNode$m9 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("union", unionOp$m1, 0, partitioner$m9, null, elementOrEventTypeInfo$m9);
    val addInput$m9 = labyNode$m9.addInput(setPrllzm$m4, true, false);
    val addInput$m10 = addInput$m9.addInput(setPrllzm$m8, true, false);
    val setPrllzm$m9 = addInput$m10.setParallelism(1);

    val distinctOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.distinct[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val partitioner$m13 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
    val typeInfo$m13 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
    val elementOrEventTypeInfo$m13 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m13);
    val labyNode$m13 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("distinct", distinctOp$m1, 0, partitioner$m13, null, elementOrEventTypeInfo$m13);
    val addInput$m14 = labyNode$m13.addInput(setPrllzm$m9, true, false);
    val setPrllzm$m13 = addInput$m14.setParallelism(1);

    val fold1Op$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.foldAlgHelper[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](alg$fold$m1);
    val partitioner$m10 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
    val typeInfo$m10 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Long];
    val elementOrEventTypeInfo$m10 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Long](typeInfo$m10);
    val labyNode$m10 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long]("fold1", fold1Op$m1, 0, partitioner$m10, null, elementOrEventTypeInfo$m10);
    val addInput$m11 = labyNode$m10.addInput(setPrllzm$m13, true, false);
    val setPrllzm$m10 = addInput$m11.setParallelism(1);
    val lambda$m1 = ((t$m1: _root_.scala.Long) => {
      val lbdaRhs$m1 = "### Size".+(t$m1);
      lbdaRhs$m1
    });
    val mapOp$m3 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Long, _root_.java.lang.String](lambda$m1);
    val partitioner$m11 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Long](1);
    val typeInfo$m11 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.java.lang.String];
    val elementOrEventTypeInfo$m11 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String](typeInfo$m11);
    val labyNode$m11 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Long, _root_.java.lang.String]("map", mapOp$m3, 0, partitioner$m11, null, elementOrEventTypeInfo$m11);
    val addInput$m12 = labyNode$m11.addInput(setPrllzm$m10, true, false);
    val setPrllzm$m11 = addInput$m12.setParallelism(1);
    val lambda$m2 = ((t$m2: _root_.java.lang.String) => {
      val lbdaRhs$m2 = _root_.scala.Predef.print(t$m2);
      lbdaRhs$m2
    });
    val mapOp$m4 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.java.lang.String, _root_.scala.Unit](lambda$m2);
    val partitioner$m12 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String](1);
    val typeInfo$m12 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Unit];
    val elementOrEventTypeInfo$m12 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit](typeInfo$m12);
    val labyNode$m12 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.scala.Unit]("map", mapOp$m4, 0, partitioner$m12, null, elementOrEventTypeInfo$m12);
    val addInput$m13 = labyNode$m12.addInput(setPrllzm$m11, true, false);
    val setPrllzm$m12 = addInput$m13.setParallelism(1);


//    val distinctOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.distinct[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
//    val partitioner$m13 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](1);
//    val typeInfo$m13 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]];
//    val elementOrEventTypeInfo$m13 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](typeInfo$m13);
//    val labyNode$m13 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]("distinct", distinctOp$m1, 0, partitioner$m13, null, elementOrEventTypeInfo$m13);
//    val addInput$m14 = labyNode$m13.addInput(setPrllzm$m9, true, false);
//    val setPrllzm$m13 = addInput$m14.setParallelism(1);


    val implEnv$m1 = _root_.scala.Predef.implicitly[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment];
    val socColl$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.collectToClient[_root_.scala.Unit](implEnv$m1, setPrllzm$m12, 0);
    val translateAll$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.translateAll;
    val `env.executeAndGetCollectedBag$m1` = _root_.org.emmalanguage.mitos.operators.LabyStatics.executeAndGetCollectedNonBag(implEnv$m1, socColl$m1);
    `env.executeAndGetCollectedBag$m1`
  }
}