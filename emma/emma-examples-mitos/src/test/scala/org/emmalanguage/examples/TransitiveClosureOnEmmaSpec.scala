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

import org.emmalanguage.FlinkAware
import org.emmalanguage.api._
import org.emmalanguage.examples.graphs._
import org.emmalanguage.examples.graphs.model._

class TransitiveClosureOnEmmaSpec extends BaseTransitiveClosureIntegrationSpec with FlinkAware {

  override def run(path: String): Unit =
    withDefaultFlinkEnv(implicit flink => emma.onFlink {
      var paths = DataBag.readText(path + 1).map(s => {
        val splits = s.split("\t")
        Edge(Integer.parseInt(splits(0)).toLong, Integer.parseInt(splits(1)).toLong)
      })
      var count = paths.size
      var added = 0L

      do {
        val delta = for {
          e1 <- paths
          e2 <- paths
          if e1.dst == e2.src
        } yield Edge(e1.src, e2.dst)

        paths = (paths union delta).distinct

        val size = paths.size
        added = size - count
        count = size
      } while (added > 0)

//      paths
    })

  //
  //        val seq_paths = paths.collect()
  //        paths = for {
  //          e <- paths
  //          if !seq_paths.contains(e)
  //        } yield e

  //        paths = for {
  //          e1 <- paths.zipWithIndex()
  //          e2 <- paths.zipWithIndex()
  //          if e1._2 != e2._2 && !(e1._1.src == e2._1.src && e1._1.dst == e2._1.dst)
  //        } yield e2._1
  //
//          paths = for {
//            e1 <- paths
//            e2 <- paths
//            if !(e1.src == e2.src && e1.dst == e2.dst)
//          } yield e1



  //  val fun$r4 = (() => {
//    val tmp$r1 = 0L;
//    tmp$r1
//  });
//  val fromNothing$r1 = ScalaOps.fromNothing[Long](fun$r4);
//  val labyNode$r1 = new LabyNode[Nothing,Long]("fromNothing", fromNothing$r1, 0)
//
//  val emptyOp$r1 = ScalaOps.empty[Edge[Long]];
//  val labyNode$r2 = new LabyNode[Nothing,Edge[Long]]("empty", emptyOp$r1, 0);
//
//  val fun$r5 = (() => {
//    val tmp$r2 = edges.size;
//    tmp$r2
//  });
//  val fromNothing$r2 = ScalaOps.fromNothing[Long](fun$r5);
//  val labyNode$r3 = new LabyNode[Nothing,Long]("fromNothing", fromNothing$r2, 0);
//
//
//
//  val phiNode$r1 = LabyStatics.phi[Long]("arg$r1Phi", 1);
//
//  val phiNode$r2 = LabyStatics.phi[Long]("arg$r2Phi", 1);
//
//  val phiNode$r3 = LabyStatics.phi[Edge[Long]]("paths$p$r1Phi", 1);
//
//  val fun$r3 = ((e1: Edge[Long]) => {
//    val fun$r1 = ((e2: Edge[Long]) => {
//      val anf$r3 = e1.dst;
//      val anf$r4 = e2.src;
//      val anf$r5 = anf$r3.==(anf$r4);
//      anf$r5
//    });
//    val anf$r6 = paths$p$r1.withFilter(fun$r1);
//    val fun$r2 = ((e2$r1: Edge[Long]) => {
//      val anf$r7 = e1.src;
//      val anf$r8 = e2$r1.dst;
//      val anf$r9 = Edge.apply[Long](anf$r7, anf$r8);
//      anf$r9
//    });
//    val anf$r10 = anf$r6.map[Edge[Long]](fun$r2);
//    anf$r10
//  });
//  val flatMapOp$r1 = ScalaOps.flatMapDataBagHelper[Edge[Long], Edge[Long]](fun$r3);
//  val labyNode$r4 = new LabyNode[Edge[Long],Edge[Long]]("flatMap", flatMapOp$r1, 1);
//  val addInput$r1 = labyNode$r4.addInput(phiNode$r3, true, false);
//
//  val unionOp$r1 = ScalaOps.union[Edge[Long]];
//  val labyNode$r5 = new LabyNode[Edge[Long],Edge[Long]]("union", unionOp$r1, 1);
//  val addInput$r2 = labyNode$r5.addInput(phiNode$r3);
//  val addInput$r3 = addInput$r2.addInput(addInput$r1);
//
//  val fun$r6 = (() => {
//    val tmp$r3 = anf$r12.size;
//    tmp$r3
//  });
//  val fromNothing$r3 = ScalaOps.fromNothing[Long](fun$r6);
//  val labyNode$r6 = new LabyNode[Nothing,Long]("fromNothing", fromNothing$r3, 1);
//
//  val toLeft$r1 = ((t$r3: Long) => {
//    val lambda$r3 = _root_.scala.util.Left.apply[Long, Nothing](t$r3);
//    lambda$r3
//  });
//  val mapToLeftOp$r1 = ScalaOps.map[Long, Either[Long,Long]](toLeft$r1);
//  val labyNode$r7 = new LabyNode[Long,Either[Long,Long]]("map", mapToLeftOp$r1, 1);
//  val addInput$r4 = labyNode$r7.addInput(setPrllzm$r6);
//
//  val toRight$r1 = ((t$r4: Long) => {
//    val lambda$r4 = Right.apply[Nothing, Long](t$r4);
//    lambda$r4
//  });
//  val mapToRightOp$r1 = ScalaOps.map[Long, Either[Long,Long]](toRight$r1);
//  val labyNode$r8 = new LabyNode[Either[Long,Long]]("map", mapToRightOp$r1, 1);
//  val addInput$r5 = labyNode$r8.addInput(phiNode$r2);
//
//
//  val crossOp$r1 = ScalaOps.cross[Long, Long];
//  val partitioner$r12 = new Always0[Either[Long,Long]](1);
//  val labyNode$r9 = new LabyNode[Either[Long,Long],(Long, Long)]("cross", crossOp$r1, 1);
//  val addInput$r6 = labyNode$r9.addInput(addInput$r4);
//  val addInput$r7 = addInput$r6.addInput(addInput$r5);
//
//
//  val lambda$r1 = ((t$r1: (Long, Long)) => {
//    val t1$r1 = t$r1._1;
//    val t2$r1 = t$r1._2;
//    val lbdaRhs$r1 = t1$r1.-(t2$r1);
//    lbdaRhs$r1
//  });
//  val mapOp$r1 = ScalaOps.map[(Long, Long), Long](lambda$r1);
//  val labyNode$r10 = new LabyNode[(Long, Long),Long]("map", mapOp$r1, 1);
//  val addInput$r8 = labyNode$r10.addInput(addInput$r7);
//
//  val fun$r7 = (() => {
//    val tmp$r4 = anf$r12.size;
//    tmp$r4
//  });
//  val fromNothing$r4 = ScalaOps.fromNothing[Long](fun$r7);
//  val labyNode$r11 = new LabyNode[Nothing,Long]("fromNothing", fromNothing$r4, 1);
//
//
//  val lambda$r2 = ((t$r2: Long) => {
//    val lbdaRhs$r2 = t$r2.>(0);
//    lbdaRhs$r2
//  });
//  val mapOp$r2 = ScalaOps.map[Long, Boolean](lambda$r2);
//  val labyNode$r12 = new LabyNode[Long,Boolean]("map", mapOp$r2, 1);
//  val addInput$r9 = labyNode$r12.addInput(addInput$r8);
//
//  val addInput$r11 = phiNode$r1.addInput(setPrllzm$r10, false, true);
//  val addInput$r12 = phiNode$r2.addInput(setPrllzm$r11, false, true);
//  val addInput$r13 = phiNode$r3.addInput(setPrllzm$r5, false, true);
//  val addInput$r14 = phiNode$r1.addInput(setPrllzm$r1, false, true);
//  val addInput$r15 = phiNode$r2.addInput(setPrllzm$r3, false, true);
//  val addInput$r16 = phiNode$r3.addInput(setPrllzm$r2, false, true);

  //      val edges: DataBag[Edge[Long]] = DataBag.readText(path + 1).map(s => {
  //        val splits = s.split("\t")
  //        Edge(Integer.parseInt(splits(0)).toLong, Integer.parseInt(splits(1)).toLong)
  //      })
  //
  //      var paths = edges
  //      var count = edges.map(e => e).size
  //      var added = 0L
  //
  //      do {
  //        val delta = for {
  //          e1 <- paths
  //          e2 <- paths
  //          if e1.dst == e2.src
  //        } yield Edge(e1.src, e2.dst)
  //
  //        paths = (paths union delta)
  ////        val paths_d2 = paths_d1
  //////        paths = paths_d
  ////
  //        paths = for {
  //          p1 <- paths
  //          p2 <- paths
  //          if p1.src != p2.src && p1.dst != p2.dst
  //        } yield p1
  //
  //        val current_size = paths.map(e => e).size
  //
  //        added = current_size - count
  //        count = current_size
  //      } while (added > 0)
  //
  //      paths

  //  override def run(path: String): DataBag[Edge[Long]] = {
  //    org.emmalanguage.api.FlinkDataSet.memoizeTypeInfo[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]]);
  //    org.emmalanguage.api.FlinkDataSet.memoizeTypeInfo[_root_.scala.Long](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Long]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Long]);
  //    org.emmalanguage.api.FlinkDataSet.memoizeTypeInfo[_root_.scala.Predef.String](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.scala.Predef.String]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.scala.Predef.String]);
  //    org.emmalanguage.api.FlinkDataSet.memoizeTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]);
  //    org.emmalanguage.api.FlinkDataSet.memoizeTypeInfo[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](implicitly[scala.reflect.runtime.universe.TypeTag[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]], org.apache.flink.api.scala.`package`.createTypeInformation[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]);
  //    implicit val flink = ExecutionEnvironment.getExecutionEnvironment
  //    val anf$m1 = _root_.org.emmalanguage.api.FlinkDataSet.readText(path);
  //    val f$m1 = ((s: _root_.java.lang.String) => {
  //      val splits = s.split("\t");
  //      val anf$m3 = splits.apply(0);
  //      val anf$m4 = _root_.java.lang.Integer.parseInt(anf$m3);
  //      val anf$m5 = anf$m4.toLong;
  //      val anf$m6 = splits.apply(1);
  //      val anf$m7 = _root_.java.lang.Integer.parseInt(anf$m6);
  //      val anf$m8 = anf$m7.toLong;
  //      val anf$m9 = _root_.org.emmalanguage.examples.graphs.model.Edge.apply[_root_.scala.Long](anf$m5, anf$m8);
  //      anf$m9
  //    });
  //    val edges = anf$m1.map[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](f$m1);
  //    val anf$m11 = edges.distinct;
  //    val anf$m28 = _root_.org.emmalanguage.api.flink.FlinkOps.cache[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](anf$m11);
  //    val anf$m12 = anf$m28.fold[_root_.scala.Long](_root_.org.emmalanguage.api.alg.Size);
  //    var added$p$m2 = 0L;
  //    var count$p$m2 = anf$m12;
  //    var paths$p$m2 = anf$m28;
  //    do
  //      {
  //        val alg$Alg2$m1 = _root_.org.emmalanguage.api.alg.Alg2.apply[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long, _root_.scala.Long](_root_.org.emmalanguage.api.alg.Size, _root_.org.emmalanguage.api.alg.Size);
  //        val kx$m1 = ((e1: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
  //          val anf$m13 = e1.dst;
  //          anf$m13
  //        });
  //        val ky$m1 = ((e2: _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]) => {
  //          val anf$m14 = e2.src;
  //          anf$m14
  //        });
  //        val joined$m1 = _root_.org.emmalanguage.api.flink.FlinkOps.equiJoin[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.scala.Long](kx$m1, ky$m1)(paths$p$m2, paths$p$m2);
  //        val f$m2 = ((xy$m1: _root_.scala.Tuple2[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long], _root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]]) => {
  //          val e1 = xy$m1._1;
  //          val e2 = xy$m1._2;
  //          val anf$m17 = e1.src;
  //          val anf$m18 = e2.dst;
  //          val anf$m19 = _root_.org.emmalanguage.examples.graphs.model.Edge.apply[_root_.scala.Long](anf$m17, anf$m18);
  //          anf$m19
  //        });
  //        val delta = joined$m1.map[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](f$m2);
  //        val anf$m22 = paths$p$m2.union(delta);
  //        val anf$m23 = anf$m22.distinct;
  //        val anf$m29 = _root_.org.emmalanguage.api.flink.FlinkOps.cache[_root_.org.emmalanguage.examples.graphs.model.Edge[_root_.scala.Long]](anf$m23);
  //        val app$Alg2$m1 = anf$m29.fold[_root_.scala.Tuple2[_root_.scala.Long, _root_.scala.Long]](alg$Alg2$m1);
  //        val anf$m24 = app$Alg2$m1._1;
  //        val anf$m26 = app$Alg2$m1._2;
  //        val anf$m25 = anf$m24.-(count$p$m2);
  //        added$p$m2 = anf$m25;
  //        count$p$m2 = anf$m26;
  //        paths$p$m2 = anf$m29;
  //        ()
  //      }
  //     while ({
  //      val anf$m27 = added$p$m2.>(0);
  //      anf$m27
  //    }) ;
  //    paths$p$m2
  //  }
}
