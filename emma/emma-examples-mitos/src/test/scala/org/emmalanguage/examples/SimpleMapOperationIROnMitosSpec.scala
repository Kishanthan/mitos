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


class SimpleMapOperationIROnMitosSpec extends BaseIntegrationSpec {

  override def run(): Unit = {
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Long](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Long]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Long]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.java.lang.String](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.java.lang.String]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.java.lang.String]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Unit](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Unit]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Unit]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.scala.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.scala.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.scala.Unit]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit], _root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.operators.InputFormatWithInputSplit[_root_.java.lang.String, _root_.org.apache.flink.core.fs.FileInputSplit]]]);
    org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]]);

    implicit val flink = StreamExecutionEnvironment.getExecutionEnvironment
    val registerCustomSerializer$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.registerCustomSerializer();
    val terminalBbId$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.setTerminalBbid(0);
    val kickOffSource$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.setKickoffSource(0);


    val fun$m3 = (() => {
      val tmp$m1 = "/Users/kishanthan/Work/internship/projects/mitos/emma/emma-examples-mitos/src/test/scala/org/emmalanguage/examples/edges.tsv".+(1);
      tmp$m1
    });
    val fromNothing$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.fromNothing[_root_.java.lang.String](fun$m3);
    val partitioner$m1 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing](1);
    val typeInfo$m1 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.java.lang.String];
    val elementOrEventTypeInfo$m1 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.java.lang.String](typeInfo$m1);
    val labyNode$m1 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.java.lang.String]("fromNothing", fromNothing$m1, 0, partitioner$m1, null, elementOrEventTypeInfo$m1);
    val setPrllzm$m1 = labyNode$m1.setParallelism(1);


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
      val anf$m12 = anf$m10.src;
      val anf$m13 = anf$m10.dst;
      val anf$m14 = _root_.scala.Tuple2.apply[_root_.scala.Long, _root_.scala.Long](anf$m12, anf$m13);
      val anf$m15 = _root_.scala.Predef.print(anf$m14);
      anf$m15
    });
    val mapOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.java.lang.String, _root_.scala.Unit](f$m1);
    val partitioner$m4 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.java.lang.String](1);
    val typeInfo$m4 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Unit];
    val elementOrEventTypeInfo$m4 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit](typeInfo$m4);
    val labyNode$m4 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.java.lang.String, _root_.scala.Unit]("map", mapOp$m1, 0, partitioner$m4, null, elementOrEventTypeInfo$m4);
    val addInput$m3 = labyNode$m4.addInput(setPrllzm$m3, true, false);
    val setPrllzm$m4 = addInput$m3.setParallelism(1);


    val implEnv$m1 = _root_.scala.Predef.implicitly[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment];
    val socColl$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.collectToClient[_root_.scala.Unit](implEnv$m1, setPrllzm$m4, 0);
    val translateAll$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.translateAll;
    val `env.executeAndGetCollectedBag$m1` = _root_.org.emmalanguage.mitos.operators.LabyStatics.executeAndGetCollectedBag(implEnv$m1, socColl$m1);
  }
}