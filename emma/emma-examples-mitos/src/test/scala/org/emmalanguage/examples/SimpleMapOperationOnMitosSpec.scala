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

import org.emmalanguage.api.{DataBag, emma}
import org.emmalanguage.examples.graphs.model.Edge
import org.emmalanguage.mitosAware


class SimpleMapOperationOnMitosSpec extends BaseIntegrationSpec with mitosAware {

  override def run(): Unit = {
    withDefaultFlinkStreamEnv(implicit flink => emma.onmitos {
      for {
        path <- DataBag.readText("/Users/kishanthan/Work/internship/projects/mitos/" +
          "emma/emma-examples-mitos/src/test/scala/org/emmalanguage/examples/edges.tsv" + 1)
          .map(s => {
            val splits = s.split("\t")
            Edge(Integer.parseInt(splits(0)).toLong, Integer.parseInt(splits(1)).toLong)
          })
      } yield {
        print(path.src, path.dst)
      }
    })
  }
}