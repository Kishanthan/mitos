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

import org.apache.flink.api.scala.ExecutionEnvironment


class SimpleCFIROnEmmaSpec extends BaseIntegrationSpec {

  override def run(): Unit = {

    org.emmalanguage.api.FlinkDataSet.memoizeTypeInfo[_root_.scala.Long](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Long]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Long]);
    org.emmalanguage.api.FlinkDataSet.memoizeTypeInfo[_root_.scala.Predef.String](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Predef.String]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Predef.String]);
    org.emmalanguage.api.FlinkDataSet.memoizeTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]);
    org.emmalanguage.api.FlinkDataSet.memoizeTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]);

    implicit val flink = ExecutionEnvironment.getExecutionEnvironment

    val anf$m1 = "/Users/kishanthan/Work/internship/projects/mitos/emma/emma-examples-mitos/src/test/scala/org/emmalanguage/examples/edges.tsv".+(1);
    val anf$m2 = _root_.org.emmalanguage.api.FlinkDataSet.readText(anf$m1);
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
    val anf$m11 = anf$m2.map[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](f$m1);
    val anf$m27 = _root_.org.emmalanguage.api.flink.FlinkOps.cache[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](anf$m11);
    var paths$p$m2 = anf$m27;
    var size$p$m2 = 0L;
    do
    {
      val kx$m1 = ((e1: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
        val anf$m12 = e1.dst;
        anf$m12
      });
      val ky$m1 = ((e2$m1: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
        val anf$m13 = e2$m1.src;
        anf$m13
      });
      val joined$m1 = _root_.org.emmalanguage.api.flink.FlinkOps.equiJoin[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](kx$m1, ky$m1)(paths$p$m2, paths$p$m2);
      val f$m2 = ((xy$m1: _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]) => {
        val e1 = xy$m1._1;
        val e2$m1 = xy$m1._2;
        val anf$m16 = e1.src;
        val anf$m17 = e2$m1.dst;
        val anf$m18 = _root_.org.emmalanguage.examples.graphs.model.Edge.apply[_root_.scala.Long](anf$m16, anf$m17);
        anf$m18
      });
      val delta = joined$m1.map[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](f$m2);
      val fun$Map$m1 = ((e: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
        e
      });
      val alg$Map$m1 = _root_.org.emmalanguage.api.alg.Map.apply[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](fun$Map$m1, _root_.org.emmalanguage.api.alg.Size);
      val anf$m21 = paths$p$m2.union(delta);
      val anf$m22 = anf$m21.distinct;
      val anf$m28 = _root_.org.emmalanguage.api.flink.FlinkOps.cache[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](anf$m22);
      val anf$m24 = anf$m28.fold[_root_.scala.Long](alg$Map$m1);
      paths$p$m2 = anf$m28;
      size$p$m2 = anf$m24;
      ()
    }
    while ({
      val anf$m25 = size$p$m2.<(5);
      anf$m25
    }) ;
    val anf$m26 = _root_.scala.Predef.print(3);
    anf$m26
  }
}