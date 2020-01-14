/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This is not the original file distributed by the Apache Software Foundation
 * It has been modified by the Hipparchus project
 */
package org.hipparchus.clustering.distance;

import org.hipparchus.exception.MathIllegalArgumentException;
import org.hipparchus.util.FastMath;
import org.hipparchus.util.MathArrays;

/**
 * Calculates the Earh Mover's distance (also known as Wasserstein metric) between two distributions.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Earth_mover's_distance">Earth Mover's distance (Wikipedia)</a>
 *
 */
public class EarthMoversDistance implements DistanceMeasure {

    /** Serializable version identifier. */
    private static final long serialVersionUID = -5406732779747414922L;

    /** {@inheritDoc} */
    @Override
    public double compute(double[] a, double[] b)
    throws MathIllegalArgumentException {
        MathArrays.checkEqualLength(a, b);
        double lastDistance = 0;
        double totalDistance = 0;
        for (int i = 0; i < a.length; i++) {
            final double currentDistance = (a[i] + lastDistance) - b[i];
            totalDistance += FastMath.abs(currentDistance);
            lastDistance = currentDistance;
        }
        return totalDistance;
    }
}