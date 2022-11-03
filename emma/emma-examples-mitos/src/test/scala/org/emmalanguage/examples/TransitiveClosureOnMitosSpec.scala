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
package org.emmalanguage
package examples

import org.emmalanguage.api.{DataBag, _}
import org.emmalanguage.examples.graphs._
import org.emmalanguage.examples.graphs.model._

class TransitiveClosureOnMitosSpec extends BaseTransitiveClosureIntegrationSpec with mitosAware {

  override def run(path: String): Unit = {
    withDefaultFlinkStreamEnv(implicit flink => emma.onmitos {
      var paths = DataBag.readText(path + 1).map(s => {
        val splits = s.split("\t")
        Edge(Integer.parseInt(splits(0)).toLong, Integer.parseInt(splits(1)).toLong)
      })
      var count = paths.map(e => e).size
      var added = 0L

      do {
        val delta = for {
          e1 <- paths
          e2 <- paths
          if e1.dst == e2.src
        } yield Edge(e1.src, e2.dst)



//        paths = for {
//          e1 <- paths.zipWithIndex()
//          e2 <- paths.zipWithIndex()
//          if e1._2 != e2._2 && e1._1.src != e2._1.src && e1._1.dst != e2._1.dst
//        } yield e1._1

        val size = paths.map(e => e).size

        added = size - count
        count = size
      } while (added > 0)

    })
  }


//  def tc() {
//    val fun$r4 = (() => {
//      val tmp$r1 = 0L;
//      tmp$r1
//    });
//    val fromNothing$r1 = ScalaOps.fromNothing[Long](fun$r4);
//    val labyNode$r1 = new LabyNode[Nothing,Long]("fromNothing", fromNothing$r1, 0);
//    val setPrllzm$r1 = labyNode$r1.setParallelism(1);
//
//    val emptyOp$r1 = ScalaOps.empty[Edge[Long]];
//    val labyNode$r2 = new LabyNode[Nothing,Edge[Long]]("empty", emptyOp$r1, 0);
//    val setPrllzm$r2 = labyNode$r2.setParallelism(1);
//
//    val fun$r5 = (() => {
//      val tmp$r2 = anf$r1.size;
//      tmp$r2
//    });
//    val fromNothing$r2 = ScalaOps.fromNothing[Long](fun$r5);
//    val labyNode$r3 = new LabyNode[Nothing,Long]("fromNothing", fromNothing$r2, 0);
//    val setPrllzm$r3 = labyNode$r3.setParallelism(1);
//
//    val phiNode$r1 = LabyStatics.phi[Long]("arg$r1Phi", 1);
//
//    val phiNode$r2 = LabyStatics.phi[Long]("arg$r2Phi", 1);
//
//    val phiNode$r3 = LabyStatics.phi[Edge[Long]]("paths$p$r1Phi", 1);
//
//    val fun$r3 = ((e1: Edge[Long]) => {
//      val fun$r1 = ((e2: Edge[Long]) => {
//        val anf$r3 = e1.dst;
//        val anf$r4 = e2.src;
//        val anf$r5 = anf$r3.==(anf$r4);
//        anf$r5
//      });
//      val anf$r6 = paths$p$r1.withFilter(fun$r1);
//      val fun$r2 = ((e2$r1: Edge[Long]) => {
//        val anf$r7 = e1.src;
//        val anf$r8 = e2$r1.dst;
//        val anf$r9 = Edge.apply[Long](anf$r7, anf$r8);
//        anf$r9
//      });
//      val anf$r10 = anf$r6.map[Edge[Long]](fun$r2);
//      anf$r10
//    });
//    val flatMapOp$r1 = ScalaOps.flatMapDataBagHelper[Edge[Long], Edge[Long]](fun$r3);
//    val labyNode$r4 = new LabyNode[Edge[Long],Edge[Long]]("flatMap", flatMapOp$r1, 1);
//    val addInput$r1 = labyNode$r4.addInput(phiNode$r3, true, false);
//    val setPrllzm$r4 = addInput$r1.setParallelism(1);
//
//    val unionOp$r1 = ScalaOps.union[Edge[Long]];
//    val labyNode$r5 = new LabyNode[Edge[Long],Edge[Long]]("union", unionOp$r1, 1);
//    val addInput$r2 = labyNode$r5.addInput(phiNode$r3, true, false);
//    val addInput$r3 = addInput$r2.addInput(setPrllzm$r4, true, false);
//    val setPrllzm$r5 = addInput$r3.setParallelism(1);
//
//    val fun$r6 = (() => {
//      val tmp$r3 = anf$r12.size;
//      tmp$r3
//    });
//    val fromNothing$r3 = ScalaOps.fromNothing[Long](fun$r6);
//    val labyNode$r6 = new LabyNode[Nothing,Long]("fromNothing", fromNothing$r3, 1);
//    val setPrllzm$r6 = labyNode$r6.setParallelism(1);
//
//    val toLeft$r1 = ((t$r3: Long) => {
//      val lambda$r3 = _root_.scala.util.Left.apply[Long, Nothing](t$r3);
//      lambda$r3
//    });
//    val mapToLeftOp$r1 = ScalaOps.map[Long, Either[Long,Long]](toLeft$r1);
//    val labyNode$r7 = new LabyNode[Long,Either[Long,Long]]("map", mapToLeftOp$r1, 1);
//    val addInput$r4 = labyNode$r7.addInput(setPrllzm$r6, true, false);
//    val setPrllzm$r7 = addInput$r4.setParallelism(1);
//
//    val toRight$r1 = ((t$r4: Long) => {
//      val lambda$r4 = Right.apply[Nothing, Long](t$r4);
//      lambda$r4
//    });
//    val mapToRightOp$r1 = ScalaOps.map[Long, Either[Long,Long]](toRight$r1);
//    val labyNode$r8 = new LabyNode[Long,Either[Long,Long]]("map", mapToRightOp$r1, 1);
//    val addInput$r5 = labyNode$r8.addInput(phiNode$r2, true, false);
//    val setPrllzm$r8 = addInput$r5.setParallelism(1);
//
//    val crossOp$r1 = ScalaOps.cross[Long, Long];
//    val labyNode$r9 = new LabyNode[Either[Long,Long],(Long, Long)]("cross", crossOp$r1, 1);
//    val addInput$r6 = labyNode$r9.addInput(setPrllzm$r7, true, false);
//    val addInput$r7 = addInput$r6.addInput(setPrllzm$r8, true, false);
//    val setPrllzm$r9 = addInput$r7.setParallelism(1);
//
//    val lambda$r1 = ((t$r1: (Long, Long)) => {
//      val t1$r1 = t$r1._1;
//      val t2$r1 = t$r1._2;
//      val lbdaRhs$r1 = t1$r1.-(t2$r1);
//      lbdaRhs$r1
//    });
//    val mapOp$r1 = ScalaOps.map[(Long, Long), Long](lambda$r1);
//    val labyNode$r10 = new LabyNode[(Long, Long),Long]("map", mapOp$r1, 1);
//    val addInput$r8 = labyNode$r10.addInput(setPrllzm$r9, true, false);
//
//    val setPrllzm$r10 = addInput$r8.setParallelism(1);
//    val lambda$r2 = ((t$r2: Long) => {
//      val lbdaRhs$r2 = t$r2.>(0);
//      lbdaRhs$r2
//    });
//    val mapOp$r2 = ScalaOps.map[Long, Boolean](lambda$r2);
//    val labyNode$r11 = new LabyNode[Long,Boolean]("map", mapOp$r2, 1);
//    val addInput$r9 = labyNode$r11.addInput(setPrllzm$r10, true, false);
//    val setPrllzm$r11 = addInput$r9.setParallelism(1);
//
//    val fun$r7 = (() => {
//      val tmp$r4 = _root_.scala.Predef.print(anf$r12);
//      tmp$r4
//    });
//    val fromNothing$r4 = ScalaOps.fromNothing[Unit](fun$r7);
//    val labyNode$r12 = new LabyNode[Nothing,Unit]("fromNothing", fromNothing$r4, 2);
//    val setPrllzm$r12 = labyNode$r12.setParallelism(1);
//
//    val seq$r1 = Seq.apply[Int](1);
//    val seq$r2 = Seq.apply[Int](2);
//    val condOp$r1 = ScalaOps.condNode(seq$r1, seq$r2);
//    val labyNode$r13 = new LabyNode[Boolean,Unit]("condNode", condOp$r1, 1);
//    val addInput$r10 = labyNode$r13.addInput(setPrllzm$r11, true, false);
//    val setPrllzm$r13 = addInput$r10.setParallelism(1);
//
//    val addInput$r11 = phiNode$r1.addInput(setPrllzm$r10, false, true);
//    val addInput$r12 = phiNode$r2.addInput(setPrllzm$r6, false, true);
//    val addInput$r13 = phiNode$r3.addInput(setPrllzm$r5, false, true);
//    val addInput$r14 = phiNode$r1.addInput(setPrllzm$r1, false, true);
//    val addInput$r15 = phiNode$r2.addInput(setPrllzm$r3, false, true);
//    val addInput$r16 = phiNode$r3.addInput(setPrllzm$r2, false, true);
//    val implEnv$r1 = implicitly[org.apache.flink.streaming.api.scala.StreamExecutionEnvironment];
//    val translateAll$r1 = LabyStatics.translateAll;
//    val env.executeWithCatch$r1 = LabyStatics.executeWithCatch(implEnv$r1);
//    env.executeWithCatch$r1
//  }
}