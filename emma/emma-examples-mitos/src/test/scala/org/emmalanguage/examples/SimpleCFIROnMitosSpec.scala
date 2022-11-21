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


//noinspection ScalaStyle
class SimpleCFIROnMitosSpec extends BaseIntegrationSpec {

  override def run(): Unit = {

//          // BB 0
//          i1 = 0
//          do {
//            // BB 1
//            i2 = Φ(i1, i3)
//            i3 = i2 + 1
//            exitCond = i3 < 100
//          } while (exitCond)
//          // BB 2
//          print(i3)

    {
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Boolean](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Boolean]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Boolean]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Int](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Int]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Int]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.scala.Unit](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Unit]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Unit]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Boolean]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Boolean]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Boolean]]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Int]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Int]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Int]]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit]]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.util.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.util.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.util.Unit]]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Boolean, _root_.org.emmalanguage.mitos.util.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Boolean, _root_.org.emmalanguage.mitos.util.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Boolean, _root_.org.emmalanguage.mitos.util.Unit]]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Int, _root_.scala.Boolean]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Int, _root_.scala.Boolean]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Int, _root_.scala.Boolean]]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Int, _root_.scala.Int]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Int, _root_.scala.Int]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Int, _root_.scala.Int]]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Int, _root_.scala.Unit]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Int, _root_.scala.Unit]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Int, _root_.scala.Unit]]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Int]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Int]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Int]]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Boolean]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Boolean]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Boolean]]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Int]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Int]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Int]]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing]]);
      org.emmalanguage.compiler.Memo.memoizeTypeInfo[_root_.org.emmalanguage.mitos.util.Unit](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.mitos.util.Unit]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.mitos.util.Unit]);
    }
    implicit val flink = StreamExecutionEnvironment.getExecutionEnvironment
    val registerCustomSerializer$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.registerCustomSerializer();
    val terminalBbId$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.setTerminalBbid(2);
    val kickOffSource$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.setKickoffSource(0, 1);

    val fun$m1 = (() => {
      val tmp$m1 = 1;
      tmp$m1
    });
    val fromNothing$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.fromNothing[_root_.scala.Int](fun$m1);
    val partitioner$m1 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.org.emmalanguage.mitos.util.Nothing](1);
    val typeInfo$m1 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Int];
    val elementOrEventTypeInfo$m1 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Int](typeInfo$m1);
    val labyNode$m1 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.org.emmalanguage.mitos.util.Nothing, _root_.scala.Int](
      "fromNothing", fromNothing$m1, 0, partitioner$m1, null, elementOrEventTypeInfo$m1)
      .setParallelism(1)

    val partitioner$m2 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Int](1);
    val typeInfo$m2 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Int];
    val elementOrEventTypeInfo$m2 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Int](typeInfo$m2);
    val phiNode$m1 = _root_.org.emmalanguage.mitos.operators.LabyStatics.phi[_root_.scala.Int](
      "arg$m1Phi", 1, partitioner$m2, null, elementOrEventTypeInfo$m2)
      .addInput(labyNode$m1, false, true)

    val lambda$m1 = ((t$m1: _root_.scala.Int) => {
      val lbdaRhs$m1 = t$m1.+(1);
      lbdaRhs$m1
    });
    val mapOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Int, _root_.scala.Int](lambda$m1);
    val partitioner$m3 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Int](1);
    val typeInfo$m3 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Int];
    val elementOrEventTypeInfo$m3 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Int](typeInfo$m3);
    val labyNode$m2 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Int, _root_.scala.Int](
      "map", mapOp$m1, 1, partitioner$m3, null, elementOrEventTypeInfo$m3)
      .addInput(phiNode$m1, true, false)
      .setParallelism(1)

    phiNode$m1.addInput(labyNode$m2, false, true)

    val lambda$m2 = ((t$m2: _root_.scala.Int) => {
      val lbdaRhs$m2 = t$m2.<(4);
      lbdaRhs$m2
    });
    val mapOp$m2 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Int, _root_.scala.Boolean](lambda$m2);
    val partitioner$m4 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Int](1);
    val typeInfo$m4 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Boolean];
    val elementOrEventTypeInfo$m4 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Boolean](typeInfo$m4);
    val labyNode$m3 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Int, _root_.scala.Boolean](
      "map", mapOp$m2, 1, partitioner$m4, null, elementOrEventTypeInfo$m4)
      .addInput(labyNode$m2, true, false)
      .setParallelism(1)

    val seq$m1 = _root_.scala.collection.Seq.apply[_root_.scala.Int](1);
    val seq$m2 = _root_.scala.collection.Seq.apply[_root_.scala.Int](2);
    val condOp$m1 = _root_.org.emmalanguage.mitos.operators.ScalaOps.condNode(seq$m1, seq$m2);
    val partitioner$m6 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Boolean](1);
    val typeInfo$m6 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.org.emmalanguage.mitos.util.Unit];
    val elementOrEventTypeInfo$m6 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.org.emmalanguage.mitos.util.Unit](typeInfo$m6);
    val labyNode$m5 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Boolean, _root_.org.emmalanguage.mitos.util.Unit](
      "condNode", condOp$m1, 1, partitioner$m6, null, elementOrEventTypeInfo$m6)
      .addInput(labyNode$m3, true, false)
      .setParallelism(1)

    val lambda$m3 = ((t$m3: _root_.scala.Int) => {
      val lbdaRhs$m3 = _root_.scala.Predef.print(t$m3);
      lbdaRhs$m3
    });
    val mapOp$m3 = _root_.org.emmalanguage.mitos.operators.ScalaOps.map[_root_.scala.Int, _root_.scala.Unit](lambda$m3);
    val partitioner$m5 = new _root_.org.emmalanguage.mitos.partitioners.Always0[_root_.scala.Int](1);
    val typeInfo$m5 = _root_.org.emmalanguage.compiler.Memo.typeInfoForType[_root_.scala.Unit];
    val elementOrEventTypeInfo$m5 = new _root_.org.emmalanguage.mitos.ElementOrEventTypeInfo[_root_.scala.Unit](typeInfo$m5);
    val labyNode$m4 = new _root_.org.emmalanguage.mitos.LabyNode[_root_.scala.Int, _root_.scala.Unit](
      "map", mapOp$m3, 2, partitioner$m5, null, elementOrEventTypeInfo$m5)
      .addInput(labyNode$m2, false, true)
      .setParallelism(1)


    val implEnv$m1 = _root_.scala.Predef.implicitly[_root_.org.apache.flink.streaming.api.scala.StreamExecutionEnvironment];
    _root_.org.emmalanguage.mitos.operators.LabyStatics.translateAll;
    _root_.org.emmalanguage.mitos.operators.LabyStatics.executeWithCatch(implEnv$m1);
  }
}