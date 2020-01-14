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

package org.hipparchus.random;

import org.hipparchus.random.ISAACRandom;
import org.hipparchus.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;

public final class ISAACTest extends RandomGeneratorAbstractTest {

    @Override
    protected RandomGenerator makeGenerator() {
        return new ISAACRandom(500);
    }

    private static final int[] SEED_1 = {
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000, 0x00000000
    };

    private static final int[] SEED_2 = {
            0x61b12894, 0x4a43da95, 0x03e4d8c5, 0xd92e174f, 0xe8998d71, 0x0ecaaa89, 0xaba8a61d, 0xcfd457fc,
            0xbf25f0a7, 0xe05b20a9, 0xdc744513, 0x9a3eb193, 0x1b69542b, 0xedb0890d, 0xca6b233d, 0xfcabf357,
            0x297e95f0, 0x1a6c456f, 0x0e3738b0, 0x1c0517f2, 0xcfd105bd, 0x3b7c39eb, 0x141804e9, 0x8a13a0d1,
            0x3e57cf5c, 0x35471206, 0x00115ef6, 0x3424ec23, 0x2a6a63a7, 0x4cecb3e8, 0xecb4d341, 0x63d25ac1,
            0x8b68eafd, 0x0eca65b4, 0xd8354668, 0xb37b1ff8, 0x82e80ce3, 0x4c212f9c, 0x58d82d5f, 0x47f36348,
            0x5bd88987, 0xf77ac66e, 0x75ff93ee, 0xef763453, 0x9705f8b6, 0x64e44649, 0x84f03338, 0x902120e9,
            0x5350212e, 0x34f466f8, 0x97f96d0e, 0x7f1db8f0, 0x15879833, 0xefee14b4, 0xda25520a, 0x81c0dd7c,
            0xa20bb729, 0x2fd76844, 0x1b522548, 0xf394565d, 0xabff5f1b, 0x38eaf2e7, 0x364a6ccf, 0x8ed5e169,
            0xe76aae18, 0x0e4c0b62, 0x68356792, 0x8bc4aa83, 0x31546e69, 0xa6d04441, 0x2abef1df, 0xa40a164e,
            0x8a8d00ba, 0x32b38dba, 0x6f66a7c6, 0x493b0c84, 0xd86846f0, 0x50d50178, 0x26a7e67c, 0x97802153,
            0xf35f4ad3, 0x4b54b54e, 0x35bcaef1, 0xc3ed09d6, 0xc127bc55, 0xb2e34ea4, 0x8d674133, 0xed82f03d,
            0xa8443b28, 0x30bf4bd9, 0x6748419c, 0x155eb313, 0xb17c85da, 0xcd0d8014, 0xf1e95740, 0x5e769ed2,
            0xf8fa5819, 0x3bd0d93a, 0xa46eaf3f, 0x90f5ae2c, 0x912aa83d, 0x66995d3d, 0x8359b2a9, 0x64534b93,
            0x1fa38094, 0x89fde50c, 0xef925ef5, 0x4edf2287, 0xc6e82b2b, 0x99812c32, 0x53f6fe01, 0xf104263f,
            0xbc5d8b8e, 0x6f23f102, 0xb6cc174d, 0xb47b2421, 0xdb083f26, 0xd67a1f25, 0x4f4b0c50, 0x86fca924,
            0x442036ba, 0x0d7dba08, 0xf6d89c1e, 0x65c9e28e, 0xd689fafc, 0x47f7ae9b, 0x3cb86674, 0x798dc4ce,
            0x62a2d235, 0x73912420, 0x276ef9b4, 0x50deb689, 0x40b6b744, 0x84d79856, 0x86e5f0c6, 0x835a552b,
            0xeb73ff95, 0xe428e392, 0x1d60bf15, 0x9ad09e35, 0x783e60ae, 0xb42feb61, 0x028a0343, 0x90febcfc,
            0xdffb01c8, 0x1087ab1e, 0x84d8a8f9, 0xe5433763, 0x897548cc, 0xb4075ece, 0xd0a5a727, 0x0a84da19,
            0x0f33964b, 0x5634a097, 0xb7cbac77, 0xe50340eb, 0x93f0ce63, 0x0c743ed4, 0xf6f6f015, 0x30f74cca,
            0xbb0306a7, 0x3d037943, 0x22f2979e, 0x3591b2c3, 0x9a772e24, 0x5c5812fa, 0x9e733c8a, 0xaae1c943,
            0xd0b7d924, 0x56b9c463, 0xfaedb557, 0x139b7aa5, 0xe173f123, 0x2d0686a2, 0x03cd0bef, 0x4f47c01e,
            0x4cf9fb83, 0xba9d433e, 0x95a620d5, 0x62b67429, 0xe836067d, 0x606bc5f7, 0x36af81e2, 0xae0b8b30,
            0x38ffe5fa, 0xb548228b, 0xc2a25bcb, 0x4ba139ee, 0xab214ad7, 0x66ef4f50, 0x5f8787fa, 0xcb5982b1,
            0xdbb48ff8, 0x14eaa914, 0xe0874168, 0x3e578246, 0x488c1c11, 0x982039a2, 0xde096b35, 0xa420fb41,
            0x197a1b67, 0x16eabc59, 0x0e689585, 0x24db72b7, 0xf89878c3, 0x04a5e854, 0x3346da02, 0xb4bb6a04,
            0x278a0dd4, 0x7bb6e224, 0x92e219c3, 0x595f8a33, 0xedd87ae6, 0xa313cc9f, 0x385c1d3a, 0x0a8b1db5,
            0xb192379d, 0x3a0be0eb, 0xb8ba269b, 0x1f0c62a5, 0x56307342, 0x8fc9ac94, 0xec91a232, 0xa7b8d3db,
            0xfbf43a60, 0xa773463e, 0x72d5a4d1, 0x8ddf1755, 0x27da39bb, 0xa8d4668a, 0xd2f3bbfc, 0xa188d6af,
            0x82ed668e, 0xb45f0032, 0xcdfd4ca0, 0x14e5a80d, 0x456594bc, 0x68efcdd5, 0x7dbf1f9d, 0x74599699,
            0xfc8639e8, 0x4139e791, 0x9c06921a, 0xc5121d36, 0xd15b9425, 0x0670dca7, 0xbc60c353, 0xaa49e487,
            0xa7cb5854, 0xd06ddbdb, 0xcb4be0d2, 0x8391ab98, 0xc750d7bf, 0x365340b1, 0x264677c7, 0xb76075a4
    };

    /**
     * The output sequence generated by reference ISAAC algorithm in C language.
     * For initial seeding is used SEED_1 data array.
     * 1024 signed 32-bit integers in hexadecimal representation.
     */
    private static final int[] EXPECTED_SEQUENCE_1 = {
            0x182600f3, 0x300b4a8d, 0x301b6622, 0xb08acd21, 0x296fd679, 0x995206e9, 0xb3ffa8b5, 0x0fc99c24,
            0x5f071faf, 0x52251def, 0x894f41c2, 0xcc4c9afb, 0x96c33f74, 0x347cb71d, 0xc90f8fbd, 0xa658f57a,
            0xc5c29e18, 0x6249fa29, 0xbae16ffa, 0x25c871bd, 0xf4c75e24, 0x5ab3eab9, 0xac450b8f, 0x1629cfa4,
            0x0016e86f, 0xf27c4d0d, 0x67648b17, 0x05c04fce, 0x44d3ff79, 0xc6acd20f, 0x472fd994, 0x842131c4,
            0xead4a900, 0xc01eda0d, 0x9e604c7b, 0xfb8a0e99, 0x02e17b6f, 0xe8b4f627, 0xc7041eae, 0x42d19cd7,
            0xa358eb94, 0x19ca2158, 0x6be6ce81, 0x4b90a4de, 0x26f0774d, 0x4e83930a, 0x2492d476, 0xb97ffabe,
            0x675cc8ae, 0x4cfdd254, 0x5d3c00ea, 0x7bba5ead, 0x6f461810, 0xbef63eea, 0x72eb767b, 0xed6e963b,
            0xb026016d, 0x17cb7ebf, 0xa7dc6e56, 0xf460bdf1, 0x1ffe0e04, 0x902b347d, 0x02c0d8ab, 0x98cb3f8b,
            0x6f359a39, 0x9521825f, 0x9026d97e, 0xde342516, 0x890a740c, 0x0f2969e4, 0x2e7ea9ed, 0x394b8a4f,
            0x1bdf1fd0, 0x15d565b4, 0xbaf0406d, 0x4dac20db, 0x03359832, 0xe34802d5, 0xcc5fff02, 0x0935ad6e,
            0x7c53c9b2, 0xb10b5d29, 0x4fbb94be, 0xd7e48546, 0xb7cfa23c, 0x7f081c9a, 0xe099baf1, 0x9c7dc323,
            0xb831ad14, 0x5b563101, 0xfa55319b, 0x060ded54, 0xc5418124, 0x765f0dba, 0x1ad3d9d5, 0x3f07ec49,
            0xdd5e06c6, 0xc230e2ac, 0xc6ba1971, 0x9cc17bcc, 0x10b22a22, 0x7dfc8c7f, 0xb3310333, 0x205530ee,
            0xdbf38a8f, 0x003a02f5, 0x007e96a3, 0x36658201, 0x08dfd64f, 0x6275acf3, 0x3d29669b, 0x6b2f4538,
            0xb0cc336b, 0x1d3043eb, 0x1ad1d764, 0x4c655b84, 0x7a725bb2, 0xb3fc5c66, 0x80b4b915, 0xb2cbd9e4,
            0x2992dfc6, 0xdf8be548, 0xb310d06e, 0x436385c6, 0x44d6e893, 0x44c4d79d, 0xe3bb2064, 0xe41ea465,
            0x3ff4cc70, 0x9d21ac42, 0x672c3725, 0xa43a1d02, 0xfd84b19b, 0x5b6fb132, 0x4af40896, 0xe15000a6,
            0x7cab12f6, 0x8b8e753c, 0xfb253454, 0x359ac366, 0x67822b45, 0x290a1140, 0xade6e428, 0x6095efcb,
            0x99d8d9e6, 0xa5b5981d, 0x332c95d6, 0xaf5cfcab, 0x161f5ca6, 0x1844cee2, 0xffb8ab5c, 0x82fccaeb,
            0x49ecf97a, 0x7a60fabd, 0xf9585a3a, 0x4eb6bd32, 0x3b347002, 0xf4930dba, 0x5d21d51e, 0x64e8e3f4,
            0x52801fa8, 0x71ce907c, 0x872783a4, 0x0761dc80, 0x5c509848, 0x41ba2adc, 0x7e2f5520, 0x85c5eec2,
            0x368d3d00, 0x5fc7c5f3, 0xb849d785, 0xd95f25b3, 0x79801fd5, 0xbf2443d6, 0x360d41cd, 0x651b11c0,
            0x801a89ca, 0x8b9e6b94, 0xfde283c4, 0xcc5e6974, 0x2b2f4c09, 0x8b2160a8, 0xdbf57f01, 0x76aa1c4e,
            0x11f0831a, 0x54713d17, 0xc99a2639, 0x4c373e7a, 0x09e6e57f, 0x71f63b07, 0x7be3f02e, 0x2c907ade,
            0xe5f489f6, 0x0b0cd6da, 0xb566e14c, 0x0f955969, 0xa0e5710b, 0x80d8c2de, 0x9971e496, 0xc7efbc2f,
            0x97a48e53, 0x2d845c0d, 0xe1194b0e, 0xad2ba480, 0xd5253552, 0xca890b31, 0x60060afb, 0x89dae927,
            0x565e2229, 0x43abc21c, 0x03dd14a5, 0xbbadd184, 0x9e979702, 0x2f659883, 0xf313adec, 0x621bd7ca,
            0xb6470834, 0x4c3901c6, 0x32028bb8, 0x9ded8244, 0x66907654, 0x0a06b272, 0x4a8ec630, 0x4207d36f,
            0x3e7a8b49, 0x13871be7, 0xbf7af48e, 0x3de0df39, 0x0e864542, 0x8c090a23, 0xaf90e49e, 0x97661c5e,
            0x365aa66c, 0x0073e342, 0x9c8ac447, 0x6f57e7ce, 0xd5be7ffa, 0x89651d84, 0x53f78eaa, 0x8173dc04,
            0xd70b1e10, 0x43c1a57b, 0x10c8a5ab, 0xed6abd62, 0x2f840e43, 0x4873d91e, 0x49f413fc, 0x5d89a1c1,
            0xd3a388fc, 0x96c59cf4, 0x456f1edd, 0x3dd20023, 0xa264e933, 0xd32956e5, 0xd91aa738, 0xe76dd339,
            0x7a68710f, 0x6554abda, 0x90c10757, 0x0b5e435f, 0xaf7d1fb8, 0x01913fd3, 0x6a158d10, 0xb8f6fd4a,
            0xc2b9aa36, 0x96da2655, 0xfe1e42d5, 0x56e6cd21, 0xd5b2d750, 0x7229ea81, 0x5de87abb, 0xb6b9d766,
            0x1e16614c, 0x3b708f99, 0x5cf824cd, 0xa4ca0cf1, 0x62d31911, 0x7cdd662f, 0xcb9e1563, 0x79ae4c10,
            0x080c79ec, 0x18080c8e, 0x4a0a283c, 0x3dde9f39, 0x09c36f90, 0xad567643, 0x08294766, 0xb4415f7d,
            0x5597ec0f, 0x78ffa568, 0x8bace62e, 0x4188bfcd, 0xc87c8006, 0xafa92a6d, 0x50fc8194, 0xcae8deba,
            0x33f6d7b1, 0x53245b79, 0x61119a5a, 0x7e315aeb, 0xe75b41c9, 0xd2a93b51, 0xec46b0b6, 0x1ed3ff4e,
            0x5d023e65, 0xadf6bc23, 0xf7f58f7b, 0xe4f3a26a, 0x0c571a7d, 0xed35e5ee, 0xeadebeac, 0x30bcc764,
            0x66f1e0ab, 0x826dfa89, 0x0d9c7e7e, 0xe7e26581, 0xd5990dfb, 0x02c9b944, 0x4112d96c, 0x3ff1e524,
            0xc35e4580, 0xfdfef62d, 0xb83f957a, 0xbfc7f7cc, 0xb510ce0e, 0xcd7411a7, 0x04db4e13, 0x76904b6d,
            0x08607f04, 0x3718d597, 0x46c0a6f5, 0x8406b137, 0x309bfb78, 0xf7d3f39f, 0x8c2f0d55, 0xc613f157,
            0x127dd430, 0x72c9137d, 0x68a39358, 0x07c28cd1, 0x848f520a, 0xdd2dc1d5, 0x9388b13b, 0x28e7cb78,
            0x03fb88f4, 0xb0b84e7b, 0x14c8009b, 0x884d6825, 0x21c171ec, 0x0809e494, 0x6a107589, 0x12595a19,
            0x0bb3263f, 0x4d8fae82, 0x2a98121a, 0xb00960ba, 0x6708a2bc, 0x35a124b5, 0xbccaaeed, 0x294d37e5,
            0xd405ded8, 0x9f39e2d9, 0x21835c4d, 0xe89b1a3b, 0x7364944b, 0xbd2e5024, 0x6a123f57, 0x34105a8c,
            0x5ad0d3b0, 0xcc033ce3, 0xd51f093d, 0x56a001e3, 0x01a9bd70, 0x8891b3db, 0x13add922, 0x3d77d9a2,
            0x0e7e0e67, 0xd73f72d4, 0x917bdec2, 0xa37f63ff, 0x23d74f4e, 0x3a6ce389, 0x0606cf9f, 0xde11ed34,
            0x70cc94ae, 0xcb0eee4a, 0x13edc0cb, 0xfe29661c, 0xdb6dbe96, 0xb388d96c, 0x33bc405d, 0xa6d12101,
            0x2f36fa86, 0x7ded386f, 0xe6344451, 0xcd57c7f7, 0x1b0dcdc1, 0xcd49ebdb, 0x9e8a51da, 0x12a0594b,
            0x60d4d5f8, 0x91c8d925, 0xe43d0fbb, 0x5d2a542f, 0x451e7ec8, 0x2b36505c, 0x37c0ed05, 0x2364a1aa,
            0x814bc24c, 0xe3a662d9, 0xf2b5cc05, 0xb8b0ccfc, 0xb058bafb, 0x3aea3dec, 0x0d028684, 0x64af0fef,
            0x210f3925, 0xb67ec13a, 0x97166d14, 0xf7e1cdd0, 0x5adb60e7, 0xd5295ebc, 0x28833522, 0x60eda8da,
            0x7bc76811, 0xac9fe69d, 0x30ab93ec, 0x03696614, 0x15e3a5b9, 0xecc5dc91, 0x1d3b8e97, 0x7275e277,
            0x538e1f4e, 0x6cb167db, 0xa7a2f402, 0x2db35dfe, 0xa8bcc22d, 0xd8c58a6a, 0x6a529b0b, 0x0fd43963,
            0xafc17a97, 0x943c3c74, 0x95138769, 0x6f4e0772, 0xb143b688, 0x3b18e752, 0x69d2e4ae, 0x8107c9ff,
            0xcdbc62e2, 0x5781414f, 0x8b87437e, 0xa70e1101, 0x91dabc65, 0x4e232cd0, 0x229749b5, 0xd7386806,
            0xb3c3f24b, 0x60dc5207, 0x0bdb9c30, 0x1a70e7e9, 0xf37c71d5, 0x44b89b08, 0xb4d2f976, 0xb40e27bc,
            0xffdf8a80, 0x9c411a2a, 0xd0f7b37d, 0xef53cec4, 0xeca4d58a, 0x0b923200, 0xcf22e064, 0x8ebfa303,
            0xf7cf814c, 0x32ae2a2b, 0xb5e13dae, 0xc998f9ff, 0x349947b0, 0x29cf72ce, 0x17e38f85, 0xf3b26129,
            0xd45d6d81, 0x09b3ce98, 0x860536b8, 0xe5792e1b, 0x12ad6419, 0xf5f71c69, 0xcbc8b7c2, 0x8f651659,
            0xa0cc74f3, 0xd78cb99e, 0x51c08d83, 0x29f55449, 0x002ed713, 0x38a824f3, 0x57161df6, 0x7452e319,
            0x25890e2e, 0xc7442433, 0x4a5f6355, 0x6a83e1e0, 0x823cedb6, 0xf1d444eb, 0x88381097, 0x5de3743e,
            0x46ca4f9a, 0xd8370487, 0xedec154a, 0x433f1afb, 0xf5fad54f, 0x98db2fb4, 0xe448e96d, 0xf650e4c8,
            0x4bb5af29, 0x9d855e89, 0xc54cd95b, 0x46d95ca5, 0xef73fbf0, 0xf943f672, 0x86ba527f, 0x9d8d1908,
            0xf3310c92, 0x05340e15, 0x07cffad9, 0x21e2547e, 0x8c17eff0, 0xd32be060, 0x8aba3ffb, 0x94d40125,
            0xc5a87748, 0x824c2009, 0x73c0e762, 0xcdfec2af, 0x0e6c51b3, 0xa86f875e, 0xbc6172c7, 0xf7f395f1,
            0x3f7579b3, 0x7aa114ed, 0x165b1015, 0xd531161a, 0xe36ef5bb, 0xdc153e5f, 0x1d0cb81b, 0xceffc147,
            0x6079e4ce, 0xc3142d8f, 0xa617a083, 0xb54fed6f, 0xc3c7be2c, 0x02614abf, 0x6fb5ce56, 0xd21e796c,
            0x2d0985de, 0xe9f84163, 0xc1a71e3c, 0x2887d96f, 0x57c4c925, 0x05efe294, 0x88157153, 0x9a30c4e8,
            0x8854a0a1, 0x02503f7d, 0x0cd6ef81, 0x1da4f25a, 0xe8fa3860, 0x32e39273, 0x4c8652d6, 0x9ab3a42f,
            0x9ead7f70, 0x836d8003, 0x6cbe7935, 0x721502dd, 0x5a48755c, 0x07497cae, 0xde462f4d, 0x92f57ea7,
            0x1fe26ce0, 0x27c82282, 0xd6ec2f2b, 0x80c6e402, 0xce86fdfc, 0x52649d6c, 0xc798f047, 0x45bae606,
            0x891aec49, 0x66c97340, 0x9ca45e1c, 0x4286619c, 0xf5f9cc3b, 0x4e823ad3, 0xc0d5d42a, 0xaee19096,
            0x3d469303, 0xfe4cb380, 0xc9cd808c, 0x37a97df6, 0x308f751f, 0x276df0b4, 0xe5fbb9c7, 0x97ca2070,
            0x88412761, 0x2ce5d3d5, 0xd7b43abe, 0xa30519ad, 0x26414ff3, 0xc5bde908, 0x275ead3a, 0x26ceb003,
            0xbf1bd691, 0x037464c0, 0xe24124c0, 0x81d4cc5f, 0x484525e4, 0x1c3a4524, 0x9e7e4f04, 0xe1279bff,
            0x6dd1943a, 0x403dae08, 0x82846526, 0xd5683858, 0x29322d0d, 0xa949bea2, 0x74096ae7, 0x85a13f85,
            0x68235b9d, 0x8ef4bce6, 0x142a6e85, 0xdad1b22a, 0xb7546681, 0x959e234e, 0xfd8650d8, 0x3e730fa8,
            0x56f55a71, 0xd20adf03, 0x7cdc78a2, 0x19047c79, 0x253b1d7a, 0x4389a84a, 0x0aeb8165, 0x9c15db3b,
            0xaafef5a7, 0xbe8b06b2, 0xb5fe87c0, 0xe2a4ef71, 0xd9d711f9, 0xecfcf20b, 0x80fac4c2, 0xbbb8abc4,
            0x239e3b0a, 0x858129a6, 0xd97cd348, 0x8a30738a, 0xc5b71937, 0xd649a428, 0x18c1ef9a, 0x75c08a36,
            0xc921f94e, 0xdf9afa29, 0x040f7074, 0x72f5972f, 0x84ef01da, 0x2cb7b77f, 0x867027d7, 0x9ce0199d,
            0x71865c4c, 0x7a36af93, 0x6c48ddd8, 0x19b48fd0, 0x75f4e9e2, 0x0084cfe5, 0x63bfd4d8, 0x9783cdee,
            0x64f2632c, 0xf1b20eaf, 0xcc8bfa2d, 0x39ddf25a, 0x740e0066, 0x9ddb477f, 0x12b2cfb6, 0xd067fce5,
            0x1a4b6a53, 0x001cdb95, 0x12c06908, 0x531ac6bf, 0x513c1764, 0xf7476978, 0x1be79937, 0x8a8dfaa3,
            0x70a1660e, 0xfb737b1a, 0x3f28ee63, 0xc1a51375, 0x84bd6dd6, 0xe4a51d21, 0xeafed133, 0x22ae0582,
            0x4d678f26, 0xf854b522, 0x31907d62, 0x4b55dd99, 0x04d3658a, 0x19c1e69c, 0xc6112fdd, 0xc66699fd,
            0xa0eabe6b, 0x3724d4dc, 0x0d28fe52, 0x46819e2e, 0x96f703ac, 0x21182ca3, 0x2e7b022f, 0x31860f13,
            0x1956b1e5, 0xe1322228, 0x08063a85, 0x1d964589, 0x94d90481, 0x53c078f3, 0x5afb43ae, 0x1e3437f7,
            0x877eb7b4, 0x5d67133c, 0xa385cb2c, 0xb82f2703, 0xef05ee06, 0x931dd7e2, 0x10d210aa, 0xe21339cc,
            0x479c3a22, 0x613b67b2, 0x33c5321c, 0xa5f48ac4, 0xba5590c8, 0xeb244925, 0xd0ef3cc9, 0xd8c423fb,
            0x15cfcc5c, 0x1feb2e4f, 0x36ec0ea3, 0xdbef7d9f, 0xd5ec6bf4, 0x3d3dff8a, 0x1e04a7f7, 0x8766bb54,
            0x9a1d7745, 0xc79a1749, 0xb8d2486d, 0x582e3014, 0xa82427f5, 0x65dfa427, 0xbc5654c1, 0xbd086f26,
            0x0451516d, 0xff4cfc35, 0x81f2864d, 0x31860f05, 0xd0638e1a, 0xb059261d, 0x3d1e9150, 0x21e2a51c,
            0x82d53d12, 0x1010b275, 0x786b2908, 0x4d3cfbda, 0x94a302f4, 0x95c85eaa, 0xd7e1c7be, 0x82ac484f,
            0xd24daa9a, 0x70055204, 0xbf27ef0d, 0x740ebb34, 0x47a1ff2f, 0x037e5e95, 0x3362d8d3, 0xb08c9e58,
            0x7036b9a5, 0x3354197a, 0x326c9f12, 0xab99166e, 0x6c5d388b, 0xb222a768, 0x1bf121c5, 0x2ef76080,
            0xb0658121, 0x8331bdd3, 0x64b5cd35, 0xc3c7fbe4, 0x576e7d5e, 0x1cbdc1b2, 0x5c54b675, 0xbffd76e3,
            0x2ad7b53f, 0xe596de29, 0xc2d972db, 0xf1c92f34, 0x6af3ded6, 0xec317d66, 0x6a17bed5, 0x27750e9e,
            0x8d950cb3, 0xb07688cc, 0x17a6ddd8, 0x5bf140e0, 0xed8713e0, 0x05890caa, 0xf66e4d73, 0x5ea0347f,
            0xf535f2f5, 0x240c70f3, 0x5e922192, 0x8e59f944, 0x3185f7a7, 0x852dd342, 0x58c8e53b, 0x760071c5,
            0xadb76f78, 0x185ab80c, 0x9d84df28, 0x4d2056da, 0x69bebccc, 0xa9fcb5f8, 0xb9d3ac81, 0xcc374aac,
            0xc04e1ee9, 0x72634634, 0xb3bbf485, 0x1eb91de5, 0x5e8de602, 0x211cd561, 0xb03404e6, 0x051f3a53,
            0xb263569c, 0x96cbc54f, 0x9eaf58e6, 0x32e9f0f2, 0x370f1cd9, 0x15bf840d, 0x1dbd5d06, 0xb04d214d,
            0x6d1697ee, 0xc4b6fce1, 0x1b95f82d, 0x46979ca6, 0x0354cfc8, 0xd5950d3d, 0x10db605d, 0x18af3572,
            0x990ec7a8, 0x2a0fe87f, 0x7937dbb8, 0xee376c86, 0xcc9f9070, 0xc953caa8, 0xd5c7c2ed, 0xee4f752e,
            0x84f302f7, 0x1e08a48e, 0x44a5da35, 0x0fab83e2, 0xbb7cb9df, 0x2590afe1, 0xfef026aa, 0x83dbd643,
            0xbe916d11, 0x27f7fba9, 0x82135d43, 0x6c5fa2a4, 0xe1e1370e, 0x51534581, 0x4cd9def3, 0xd94b4990,
            0x74772379, 0x59264a1d, 0xc1dcdd8e, 0xed4ef1e9, 0xf29d901a, 0x68ecd0ad, 0x9ac31f92, 0x839a285e,
            0x46447122, 0xc0e56c6e, 0xb09a4b83, 0xa9500b90, 0xda83c4e5, 0x4175b2f8, 0xeb4ddb4a, 0x236c6f2e,
            0xeeb57a32, 0x2626e708, 0xa9d35265, 0x6ab3e9ab, 0xf12fcc1f, 0x1c317c43, 0x66c34fb3, 0xe17e58a0,
            0x0295d4a1, 0x40cd40f9, 0x72700bb0, 0xd591e61e, 0x3e96b29b, 0xb50d5db3, 0xa3715dcc, 0x3405bcb4,
            0x0e034d65, 0x210a4a2b, 0x7c302f2c, 0x24e8bef6, 0xa5135147, 0x0607ef80, 0x01f86c8f, 0x2c792c8a,
            0x6ab73133, 0x6f436006, 0x09bf22a6, 0x1fde4622, 0x9841bd1c, 0xb23a7ad7, 0xdad579a4, 0x431229e9,
            0xfa5dcb2d, 0x7da4f790, 0xa9b2c914, 0xcd191ced, 0x7a05e4aa, 0x73af1889, 0x192667b3, 0x538d4540,
            0xacdbca81, 0x6b9d9e90, 0xc0462bba, 0xfcf5a7b9, 0x7b5c2904, 0x41a83c83, 0x7e69828f, 0x328a3bab,
            0xdcd0f182, 0x1d113bcd, 0x1fb5c81c, 0x2d52afa0, 0x2d0c6111, 0x2a02ce14, 0x3fcd2c15, 0x54d574f9,
            0xde57e605, 0x85dbb53d, 0xfc7cc003, 0x769c74d9, 0x6f834a4f, 0x79b3b87e, 0xe3d7c853, 0xa83e14b2,
            0x3b1fc1ad, 0xb7dc2988, 0xb60ed652, 0xda3e3d1a, 0x5f2f680c, 0xb46e08da, 0x589b77da, 0xcef68535,
            0x1c05d7a6, 0x24572da1, 0x939b02a5, 0xccd08d13, 0xdfa22970, 0xdff7581b, 0x2d5fade6, 0x5cfd3389,
            0xce26cbb1, 0x376d7fd0, 0x02811e2e, 0xcc8030ab, 0xa7a4c9dc, 0x81db0ca7, 0x15a1bcef, 0x2045c6b5,
            0x52c2f563, 0x6c829737, 0xb4f3384f, 0xb14d2f2b, 0xe102e00a, 0xba359973, 0x6045dd8b, 0xd0a5e531,
            0xd679300f, 0xaabec63e, 0x526ad900, 0x95224f33, 0x723d6d44, 0x83584ad4, 0xa14ed869, 0x727bb03a,
            0xdde37025, 0xb29d6587, 0xc3f3971d, 0x725933c2, 0x68f3eda4, 0xf73e9fdc, 0x944afd04, 0xa4c5e05f,
            0x477f70ae, 0xffebfc90, 0xc21cff70, 0x84c68e32, 0xe82a3d6b, 0xba243867, 0x511c142f, 0x2062b8ac,
            0x274a119f, 0x772afba2, 0x88a3974d, 0x205cf0de, 0xe45d5a2a, 0x1745056b, 0x2c8138f5, 0x982938a7,
            0xfb265af9, 0x700c2cdf, 0x93e549b4, 0xb8abd353, 0xd74073e8, 0x289caf2a, 0x63e802e9, 0xc2f9adb7
    };

    /**
     * The output sequence generated by reference ISAAC algorithm in C language.
     * For initial seeding is used SEED_2 data array.
     * 1024 signed 32-bit integers in hexadecimal representation.
     */
    private static final int[] EXPECTED_SEQUENCE_2 = {
            0x67ae8a37, 0xa78322ea, 0xb9394933, 0x61f6e3c5, 0xbea576f1, 0xbb958f18, 0x12ce6479, 0xc593d5de,
            0xdef281a0, 0x8435bb62, 0xf20b44db, 0x8a98479a, 0xbf2b8b66, 0x1080265e, 0xf0f8f12f, 0x021fa7f3,
            0x81d2ed59, 0xb224a5f8, 0x0c1ff346, 0x92007ea8, 0x8fd1ce43, 0xeced69f5, 0x651fe09a, 0x45cf2c3e,
            0x449b2b1e, 0x4f136be5, 0x8240cc97, 0xca979afa, 0x33b6a857, 0x7300f4f3, 0x79755d71, 0xcf11dd62,
            0x916b7e04, 0x02076c0e, 0x9b4e3e68, 0x04836ed5, 0xf1b492c6, 0x887ef90c, 0x091b68f6, 0xaf7f0d3b,
            0x89d7e5c1, 0x2b28fff7, 0xe6280e4f, 0x6681a805, 0xcb270bbb, 0x8e037463, 0x31a125f7, 0x0ba3c135,
            0x7c2e8b3e, 0x6e21e06e, 0xc8b336ba, 0x08d677c3, 0x469fd05c, 0x71528649, 0x2024c602, 0x000e4f99,
            0xb03395b1, 0x0a12d960, 0x68b15274, 0x7c415c07, 0x047c739b, 0x46658905, 0x45512a3c, 0x7f4cd2ff,
            0x3d4d4ef6, 0xd7016dad, 0x6074bbf0, 0xbeaa55eb, 0xc519d326, 0x3ad349fd, 0x2fec4649, 0x14fa40ae,
            0x96b51341, 0x2bf08ef1, 0xd1d374e4, 0x44168b14, 0xb01bee9b, 0x0b3f4332, 0xc799b9da, 0x76fc7dbd,
            0x8c368a57, 0xe4cd2cad, 0xeeb0318a, 0xc2152908, 0x2b707a0e, 0x73457464, 0xc08e92a0, 0xfcdfca5b,
            0x1320ed43, 0x333b77b9, 0x2e70948a, 0xa77d94f7, 0xbc1fb9fa, 0xa8ad15a1, 0x3c47b0f4, 0x867c4a8f,
            0xb85784e0, 0x8a854e80, 0x456c8700, 0xc28f3a01, 0x415da6aa, 0x1315c6d8, 0x70a4ca70, 0xfdea940e,
            0x686fbdc9, 0xda649eba, 0x661196f7, 0x795b5d27, 0xe10c78fa, 0x2fd89cf3, 0x61e850da, 0x00c49764,
            0xee51d841, 0x00c18025, 0xdea163b3, 0x8b1b2080, 0x6abdd683, 0xe560c731, 0xc661b3e0, 0x23a3ff08,
            0xa7579919, 0xfa443cba, 0x480bd220, 0x0a11740b, 0xb4b327c7, 0x831a0840, 0xb7c50ff3, 0x4266dff1,
            0x835d0665, 0x52593038, 0x3917fb8e, 0x88c3b400, 0x05fb8823, 0xc9eaa89f, 0x6957fd17, 0x8dbcb8fe,
            0xdec10c3c, 0x918d5fd8, 0x6af8619a, 0x8f472255, 0xc2f757b7, 0x9d62e804, 0x45e0e276, 0x482597d3,
            0x06190214, 0x172b8501, 0xe91d7b8c, 0x4ee985fc, 0x3ecbf47a, 0xbbae5d98, 0x1f0bbdeb, 0x0d38208e,
            0x6d4cb3e3, 0xa70050c4, 0xf0db408e, 0xddb6f1a7, 0x4bc4bc61, 0x90e1c1db, 0x203770dc, 0x39959247,
            0xe2e0376a, 0xf70a8521, 0x81c759b2, 0x24d9915b, 0x09cc2ec3, 0x0fd0bff9, 0x58875636, 0xee78837e,
            0x025a7eee, 0x4226859f, 0x85e21806, 0x9c1328bd, 0x0522fda0, 0x585441aa, 0x366f9ea0, 0xeb70934f,
            0x0e394c41, 0xfa801419, 0x2b6d4c3e, 0xb09775fe, 0x3f0184ae, 0x3ace3518, 0xf80bf893, 0x9754753b,
            0x78c46b93, 0x281e1918, 0x0dfcc5ee, 0xc0401601, 0xf8b11ce9, 0x9f799306, 0xb65c4232, 0x12ee4f73,
            0xade72a42, 0x0ce54d71, 0xa6780e69, 0xe73bd8f9, 0xc245228f, 0x5fa2ed1a, 0x11627d1d, 0x2617ea2f,
            0xd7404db6, 0x228fb877, 0xc5379535, 0xfe00008d, 0xc5f1491e, 0x1a3bdb0e, 0x9a90cc98, 0xa0abe3f5,
            0xac7a0d18, 0x87bb3538, 0xa224baf7, 0xf2496ca4, 0x6a5b9bd6, 0x9a7da8d8, 0x72419677, 0xa36aec4d,
            0x2a08ac0d, 0xfc4d7b21, 0x25f2aad0, 0x4f7146d4, 0xb4a603bd, 0x194e9792, 0x8f60cf1c, 0xed8ae037,
            0xa47f90b1, 0x5eec55a3, 0x326c33d4, 0x6f79168f, 0xbcfc27fa, 0xd9e76d04, 0x79430e33, 0xd0c3b727,
            0xd4bb06af, 0x8805066b, 0xaaef1130, 0x04958fef, 0x2e3270f4, 0xf5a8ffe8, 0x2a089c72, 0xff411bfc,
            0xd6ed9552, 0x6253f5ef, 0x0c836c2f, 0xb79471b0, 0x127d177c, 0xf901cefa, 0xff75dc46, 0xde79ec4f,
            0xe9f1f182, 0x9d28d8cd, 0xfcc98a94, 0x227670c2, 0x46b7c48c, 0x8fd77dcb, 0x60bc6d66, 0xe775322d,
            0x0def2251, 0xf3dd14cb, 0x6c3f3468, 0x87696244, 0x10cca0be, 0x1d7fa716, 0x955b963b, 0xe53b6074,
            0x77af9ec4, 0xfc856100, 0x91a06dc7, 0x8d55e3f1, 0xf8c805a3, 0xf3a1cb7a, 0xbcd51c6d, 0x301fdcdf,
            0xdbcbcc54, 0x8b85fe57, 0x946d707e, 0x388a2ed4, 0xc4b93a5b, 0xd48631d2, 0xae2b4f28, 0x5b731392,
            0xdf6e621e, 0xc4590c30, 0xa3a23cd5, 0xbfce9899, 0x4620cff9, 0x966c8c3f, 0x7a302556, 0x3fe549fa,
            0x67533e77, 0x80250302, 0xcd899fe7, 0x694e77ea, 0x0879525d, 0xab6675e4, 0x763f8b35, 0x7684e6a1,
            0x8fa35070, 0xe9fccaf1, 0x2d7195b7, 0x85b45186, 0xab799317, 0x2c84bd2c, 0xf8354c09, 0x02d96875,
            0x8fdcc390, 0xf6af5aec, 0x2a584739, 0x8a1ba7e9, 0xea46f9b2, 0x98acd24f, 0xfc8a3a24, 0xa496eff9,
            0x625c30ea, 0xc6ea0535, 0x3ed3b5d6, 0xffcd675d, 0x0b1719f6, 0x1b1c4e7b, 0x3206a672, 0x62fc1851,
            0xa6a4c781, 0x78bbdbbe, 0x06c1c8ce, 0x5747c340, 0xfff7ab9c, 0xebaf9370, 0xf7b185a8, 0xf8309f84,
            0xfa1601de, 0xf9fc8780, 0x59c2f8bd, 0xe74fcd5b, 0xf115f57f, 0xddda3332, 0x2ee56568, 0xa2243659,
            0x9d6d578f, 0xbb507574, 0x95d44e0e, 0xdbdf2bc3, 0x0dc1b750, 0xc6a24241, 0x207d7115, 0xc337d024,
            0x3817ef9a, 0xe9f12ccf, 0x4d67fc7d, 0x3da57a2b, 0x000e09a5, 0xe739c5a2, 0x7b7e1613, 0x23d576fe,
            0x6941a210, 0x57521190, 0xdc4359c0, 0xd8eed2f8, 0x7862904f, 0xfc179a41, 0xeee2716e, 0x362cf76a,
            0x0a087072, 0x3e6e2fa9, 0xaf2a0efb, 0x221d513f, 0xf054d856, 0xc3297367, 0x1c0998c8, 0xa664172f,
            0xe2637c8e, 0xc17ac7d4, 0x0e041f43, 0x0d9c0ae4, 0x9346dacf, 0x7fb2a015, 0xe92276c2, 0x21478bfe,
            0x119e2d0c, 0x5f76aeaf, 0xbe21aaec, 0x63174d5f, 0x13b796c3, 0x0fa0eba1, 0xe2f7277a, 0x3f555b42,
            0x0215c7e4, 0x96266efa, 0x2953a4d1, 0xadfc171a, 0x396234a7, 0x560c0279, 0xefa6d2c6, 0xf48d9b5a,
            0x4131c7b1, 0x9e302f70, 0x637c9f23, 0x22637330, 0x09927e76, 0x0898d1d6, 0x1b797274, 0x9ad491a2,
            0xa2df3627, 0x012c3ed0, 0xc19c09d7, 0xa2fdaf56, 0x5b91f8fd, 0x3b7c49c9, 0x25694d29, 0xd7b42e9c,
            0xa7be0053, 0xa91f1761, 0xd89e8b2a, 0x67846097, 0x76bd4006, 0xb8eb0712, 0x859bf877, 0xca42d70c,
            0x24e80a69, 0xd92bc598, 0x55498c1e, 0x86deba8b, 0xf7c340b7, 0xa36caa12, 0x0631ddec, 0xc0146fe8,
            0x2f959ef3, 0xf8400f0c, 0x58f676a0, 0x4ae4fe13, 0x9c4af056, 0x9e6f19d6, 0x12a9eb69, 0x1aeed54e,
            0x34c91114, 0x97128045, 0x920d1f59, 0xffe7fbaa, 0x2db4a671, 0x6e6ff7aa, 0xd40d46bd, 0x1578f939,
            0x15c5cbc6, 0xff356fd0, 0xd5d1680c, 0x5b11d14d, 0xe75541c0, 0x0fe2e2ba, 0x3ad55308, 0x8f036a69,
            0xa9bfc3cd, 0x87685338, 0x510092b4, 0x1f66622a, 0x996337b2, 0xc531891f, 0x98371a93, 0xd9630100,
            0x513ff133, 0xcf8381da, 0xed12e8e9, 0xe3ce7c7b, 0x8f731ab5, 0x511ba7c2, 0x9d754e87, 0x244603ac,
            0xfd9985e1, 0xc1581765, 0x84e50a12, 0xa0ab0034, 0x63ee60c2, 0xdf5ab248, 0x09b42202, 0xca87f896,
            0xca6ae5f0, 0xa569d829, 0x977cf29b, 0xd56a2a2f, 0x85ad1532, 0xfa2a131a, 0x00784081, 0x81f0e466,
            0xebd340d3, 0xc37ad0e4, 0xd0aa6d7a, 0x36d2551f, 0xd6ff8448, 0xc7b89445, 0xa43421ad, 0x3be75400,
            0x557a61ef, 0x0f519b14, 0x56503579, 0x1c8d164d, 0x0dcef35b, 0x3d9f1f2a, 0x56d056f2, 0x5d8fd4ec,
            0xa481a350, 0x7cadd9c0, 0x70375ce2, 0x83263d2a, 0x5826ea3b, 0xfa523ce7, 0x50c9438b, 0x74fca95d,
            0x62967ef5, 0x11fd6429, 0xcbb8e28c, 0x67fb9e81, 0xdc9e1147, 0xa29672f7, 0x1cf310f7, 0xb1e1d8e6,
            0x3f862ff3, 0x6ade0327, 0xa92f3686, 0xed79f165, 0x359e1620, 0x36c68936, 0xe46fe521, 0x0c5e36b0,
            0x6d9d9cdb, 0xc095eecd, 0x566dd305, 0x6d96cd36, 0x5d115a80, 0x2a9489a8, 0xdd067488, 0x73acf831,
            0x7392c0f0, 0x30707838, 0x92826042, 0x67c54548, 0xf830434d, 0xebe67854, 0xaefc9a41, 0xcabf703f,
            0x5242c77f, 0x1f3867a9, 0x48174739, 0x8657c39e, 0xa11247e2, 0xb4e6624d, 0xc7ffe78a, 0x1e11a841,
            0x6690244b, 0x8dcc9292, 0x5ce4dcc4, 0xebcba02d, 0x2ef6503d, 0x4fb880bc, 0xb949a759, 0x7bb18a1e,
            0x5973d2e8, 0x577ad8a6, 0xa9d4992e, 0x1a248a0c, 0xcc4450ed, 0x7e0178d3, 0xe98a8f3f, 0x209fb330,
            0xf7bf40fc, 0x632231b3, 0x7055fdaf, 0x7719e655, 0xf8d49413, 0xc200aa04, 0x8a41183a, 0xdfa217c1,
            0xcd0c165d, 0x08fec61c, 0xef608048, 0xe19fae2c, 0xedc6f3ea, 0x859a69f9, 0x5f96c76d, 0x571aec69,
            0x9cfe7fa4, 0x692baf70, 0xbb143cb4, 0xe8968678, 0xfcb77411, 0x02d3268d, 0xcdc3daa3, 0x514e78e9,
            0xa231a480, 0x8ac10400, 0xe19a2ca1, 0xfa790fe1, 0x808fec9c, 0xe4760960, 0x62e9d051, 0x5c4b006b,
            0x22eb9703, 0x426b5907, 0xfa1cd338, 0xa3b4811a, 0xad6185c1, 0x349efbc0, 0xeee28d42, 0x02531fc5,
            0xd11b2c4d, 0x5b3bf865, 0xf4823687, 0x4f92b6b7, 0xfb641c60, 0x0c526fa9, 0x42438de8, 0xd5cbf7a0,
            0x54ad0d1f, 0xb4e63f09, 0x666285eb, 0xe7ec0275, 0x57e7225a, 0xafe6b0e3, 0x17431cd7, 0x33bc9204,
            0x8a9cbdde, 0x94d8fe7d, 0xc943f36c, 0x1348c3c6, 0x43cf9b8c, 0x5a84ae20, 0x6d372dea, 0xdb0b3c92,
            0xf0f2a72d, 0x473a1fe7, 0x062416df, 0x0a12c61c, 0x3680c102, 0x8d0189db, 0x0824325f, 0xffb97ead,
            0x0d8d353f, 0x4a4e6ec2, 0x76243bb7, 0xdabfbeee, 0xcd8410d7, 0xa30f17c3, 0x2b59ceef, 0xda27f7c0,
            0x791d813b, 0xc0516741, 0xb363e4ff, 0x31ddbfb7, 0x49db1590, 0xd843513c, 0x8d317a75, 0xb24387df,
            0x63fd4066, 0xa0fce498, 0x7b42de97, 0x30eddc0c, 0x071ad222, 0x3a9054c4, 0x5ce35298, 0x375be64b,
            0x10af32c8, 0xa999ade1, 0xfa9f4d31, 0xfbe24a2a, 0x4c92714b, 0xcce3056a, 0xa81d616a, 0x3bb49213,
            0x72fd2b0e, 0x1b46d17e, 0x92159bc7, 0x7462e172, 0x4fdc3e05, 0xf309c063, 0x9133532c, 0xe62d9341,
            0x681a4871, 0xb1598525, 0x498ca388, 0x96a7ea81, 0x791c8a85, 0x2a33a1e2, 0x1e6abc87, 0xb21a4878,
            0x65fac53b, 0x59162ae1, 0x22858a30, 0x40f4e569, 0xe5cb0023, 0x626cd2a0, 0xfe6d8fc8, 0xbb7ed7c3,
            0x9a557393, 0xd0ff5e60, 0x2a20ed9b, 0x4eaafb5a, 0xbe9425bd, 0x63620ce1, 0x31ea24ed, 0x082e426a,
            0x7ff35a73, 0xa67fbaa9, 0xd2e3c5b9, 0x1a90e96a, 0x71f19184, 0xb836b88b, 0xe51fa187, 0x42576438,
            0x58d28776, 0x47bd92a3, 0x09816862, 0x295138ef, 0x23ab2bb1, 0xd7c584e0, 0x1793062f, 0xcc47e852,
            0xc2eb9703, 0xe6812d93, 0xa4aa4d2e, 0x7f635b79, 0xa7407b29, 0x9724c087, 0x406e08ce, 0x6bf1d8b7,
            0x9ef5b815, 0xf2c6f094, 0x86269ca2, 0x17fdaa4f, 0x9b645b61, 0x701bbbeb, 0x8de7bcb7, 0xd468266a,
            0x48df44ae, 0x570b08ca, 0x7a5ba43b, 0xfc927312, 0x3461a3dd, 0x0ffe5943, 0x87060375, 0x8d8afed7,
            0x83d20387, 0x77eabb51, 0xf86d045b, 0x71a47537, 0xa4485ea8, 0xfd2b6ac3, 0xb4ba1fcf, 0x31dcee82,
            0x8b41cdf6, 0xeacde42b, 0x02de5fbb, 0xb6311aa8, 0x1596ee5d, 0x355cc39d, 0xbe1a87c1, 0x01e1df07,
            0xfe413d46, 0x5e5e13ab, 0x30233fd6, 0x99449292, 0x34955dcc, 0x1f37d394, 0xd43639bd, 0x65c98eee,
            0x67b85593, 0x1660b2a1, 0xfd86e9a0, 0x33bb6e5a, 0xdd5892fb, 0xa6832091, 0xd077d216, 0x353bfe9a,
            0xb4a10726, 0xca1a536e, 0xed8af6c1, 0x41d167d1, 0x5f554941, 0x93f4032a, 0x83d83ae5, 0xc8866a05,
            0xc36d1e1f, 0x95a082c5, 0xd85e6cad, 0x302bc384, 0x41fb8717, 0x61221cc8, 0xce9a44cd, 0x2884ec21,
            0x9712152d, 0x419e4939, 0x32367b47, 0x238ee432, 0xd27f0b8e, 0xa3eaed24, 0x1eefd0a9, 0xf38a2400,
            0x72c0d4b2, 0x8bdbdec1, 0x563a2b59, 0x0d50177b, 0xb01576ef, 0x7dd9f33e, 0x7905c120, 0x461712d6,
            0x78265e93, 0x54a91f0b, 0xb88eb9c0, 0x9d8997af, 0xcb1d1296, 0xfa0a3a77, 0x5bb26dd9, 0xf6da78df,
            0x53b8e80c, 0xc55cdaf6, 0x871a3971, 0x0bd8d322, 0xfa9e0a9c, 0x95949e0e, 0xe94f0edb, 0x15e06b25,
            0x8b3e34cc, 0x980261a9, 0x3a8fe440, 0xc72330aa, 0xbff5c8b6, 0x486a08e6, 0x6b3f0668, 0x53c90761,
            0x1dc2374b, 0xba623bb6, 0x720d9fff, 0x8454fada, 0x29f09563, 0x6512330e, 0x84370042, 0xda55c14b,
            0xe6397b27, 0xdb03bcc7, 0xd6e27986, 0x483ad4f2, 0xe0e2c39a, 0x459e6792, 0x03c120ec, 0x13df7847,
            0xc3ee77e1, 0xbcee7cd4, 0xdb3734ec, 0x0e19ebb2, 0x1501517a, 0x815190f7, 0xea30ba2c, 0xed58523c,
            0x9dc64c08, 0x58d8753f, 0x1fa771c5, 0x7721fb09, 0xc64d1f60, 0xf407dc18, 0x6fdb1e33, 0x89abccb8,
            0x2fab8715, 0xd8ee352e, 0x41bfa764, 0xda0267ee, 0x65794080, 0xe3095d65, 0x08e2148b, 0x173103b5,
            0x55673978, 0x8d76b213, 0x6ed42e4b, 0xbe589395, 0xcf4c4d8a, 0xd331b237, 0x0af2f4cb, 0x202be7fa,
            0x2e87bc27, 0x140a95df, 0xa0d1ef7e, 0x1031da30, 0x630f3ea6, 0x0e3b0991, 0xba7c0462, 0xca8a192c,
            0x668417e2, 0x2c6e8ec5, 0x3f2e4372, 0x310927e9, 0xa87b5f4e, 0x21e3f285, 0x66aab4be, 0x96804f73,
            0x097c363b, 0x76445811, 0xaf92fb77, 0x660010b7, 0x3ff5abbb, 0xdaa505d0, 0x17dc3488, 0x45dac66a,
            0xa834d6eb, 0xacf0641f, 0x05576174, 0x28bf1858, 0x08829e92, 0xd3c5d530, 0x6acd00b2, 0xf36c0645,
            0x4385cae7, 0x93b11f88, 0x3dfe1da7, 0x2d5df9d8, 0xd51d498f, 0x1d122b84, 0x2ca7619f, 0x670fba3a,
            0xa59f3019, 0xd25ade01, 0x43ef2f88, 0x05cf6af4, 0x6fc3b5e0, 0x305a309e, 0xb7bce57b, 0x49c55693,
            0xd59bd6d0, 0xdf13274c, 0xa5640917, 0xb8e88520, 0xf81fb865, 0x245967cf, 0x64420112, 0x97720fd0,
            0x0ef913f8, 0x9fcf14f4, 0x99a86a60, 0x150ae075, 0x1b4be51e, 0x12fe7368, 0x23781feb, 0x3657b0c3,
            0x90f84f92, 0x082f626d, 0xf057cef1, 0xf04fc2c1, 0x8767f311, 0x240ab838, 0x160564c0, 0x96f4460d,
            0x2c7e5c83, 0xb44e6da1, 0x43f86ae1, 0xe3afdf03, 0x34173462, 0x197d8030, 0xb02d6ae7, 0x0cec076c,
            0x0fb9d05e, 0x1fa74d99, 0x03f9636e, 0x03afa44d, 0x79ceb46c, 0x8b9e3158, 0xad87d846, 0xaf794612,
            0xdd00ae31, 0xde8d63de, 0x229c5e66, 0x2df46e14, 0x3cbb35d1, 0x9832a55b, 0xaff3c01c, 0xaf4cc2be,
            0x05095c2b, 0xee6be44f, 0x7b9bd378, 0x09a5f11f, 0xfddc340a, 0x010da0fa, 0x60874e63, 0x9f03a38b,
            0xddfe1c05, 0x8dadcc16, 0x6df97114, 0xe0779adc, 0x8de82987, 0x83cca69c, 0x38b19e7c, 0xebc30d07,
            0xb36f46cc, 0xee4d1453, 0x7522c310, 0x3a43d376, 0xab400f15, 0x4fedfa99, 0x02e7323e, 0x4c57f680,
            0xe4190ae5, 0x6a5bba49, 0xd3c223d8, 0x1b87ab96, 0xaef4795f, 0xf457cd2d, 0x2bae8689, 0xa229c48f,
            0x41bd5e74, 0x25cb3da8, 0xfd47e4d0, 0x0a241ffc, 0x16c0dba7, 0x6f1469fd, 0x810c16da, 0x66a7b33c,
            0xe6c9e001, 0x9ccefde6, 0xd24f7adc, 0x1bcc8980, 0x37084252, 0xb779d5cd, 0x52e456d0, 0x313ba4de,
            0xffb09943, 0x0e9d4e1f, 0x5a3c51ac, 0x6f055f04, 0xb2ac9a26, 0xb7fac64f, 0x27cc0c8d, 0x342bbac3
    };

    @Test
    public void testReference() {
        ISAACRandom isaacRandom = new ISAACRandom(SEED_1);

        int[] actualSequence = getActualSequence(isaacRandom);
        Assert.assertArrayEquals(EXPECTED_SEQUENCE_1, actualSequence);

        isaacRandom.setSeed(SEED_2);
        actualSequence = getActualSequence(isaacRandom);
        Assert.assertArrayEquals(EXPECTED_SEQUENCE_2, actualSequence);

    }

    private int[] getActualSequence(ISAACRandom isaacRandom) {
        int[] actualSequence = new int[1024];
        for (int i = 0; i < actualSequence.length; i++) {
            actualSequence[i] = isaacRandom.nextInt();
        }
        return actualSequence;
    }

}
