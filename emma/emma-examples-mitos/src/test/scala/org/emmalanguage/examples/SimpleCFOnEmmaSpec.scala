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

import org.emmalanguage.api.emma
import org.emmalanguage.FlinkAware


class SimpleCFOnEmmaSpec extends BaseIntegrationSpec with FlinkAware {

  override def run(): Unit = {
    withDefaultFlinkEnv(implicit flink => emma.onFlink {


            // BB 0
            var i = 0
            do {
              // BB 1
              i = i + 1
            } while (i < 5)
            // BB 2
            print(i)

//      // BB 0
//      var paths = DataBag.readText("/Users/kishanthan/Work/internship/projects/mitos/" +
//        "emma/emma-examples-mitos/src/test/scala/org/emmalanguage/examples/edges.tsv" + 1)
//        .map(s => {
//          val splits = s.split("\t")
//          Edge(Integer.parseInt(splits(0)).toLong, Integer.parseInt(splits(1)).toLong)
//        })
//      var size = 0L
//      do {
//        // BB 1
//        val delta = for {
//          e1 <- paths
//          e2 <- paths
//          if e1.dst == e2.src
//        } yield Edge(e1.src, e2.dst)
//
//        paths = (paths union delta).distinct
//
//        size = paths.map(e => e).size
//
//      } while (size < 5)
//      // BB 2
//      print(3)
    })
  }
}