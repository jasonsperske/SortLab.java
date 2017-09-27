package sortlab.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import sortlab.models.Record;

public final class DataGenerator {
  //Data in a presorted order with duplicate values to test stability
  public static Record[] alreadySorted() {
    Record[] data = new Record[26*3];

    data[ 0] = new Record( 1,  10, "Aa");
    data[ 1] = new Record( 2,  10, "Ab");
    data[ 2] = new Record( 3,  10, "Ac");
    data[ 3] = new Record( 4,  20, "Ba");
    data[ 4] = new Record( 5,  20, "Bb");
    data[ 5] = new Record( 6,  20, "Bc");
    data[ 6] = new Record( 7,  30, "Ca");
    data[ 7] = new Record( 8,  30, "Cb");
    data[ 8] = new Record( 9,  30, "Cc");
    data[ 9] = new Record(10,  40, "Da");
    data[10] = new Record(11,  40, "Db");
    data[11] = new Record(12,  40, "Dc");
    data[12] = new Record(13,  50, "Ea");
    data[13] = new Record(14,  50, "Eb");
    data[14] = new Record(15,  50, "Ec");
    data[15] = new Record(16,  60, "Fa");
    data[16] = new Record(17,  60, "Fb");
    data[17] = new Record(18,  60, "Fc");
    data[18] = new Record(19,  70, "Ga");
    data[19] = new Record(20,  70, "Gb");
    data[20] = new Record(21,  70, "Gc");
    data[21] = new Record(22,  80, "Ha");
    data[22] = new Record(23,  80, "Hb");
    data[23] = new Record(24,  80, "Hc");
    data[24] = new Record(25,  90, "Ia");
    data[25] = new Record(26,  90, "Ib");
    data[26] = new Record(27,  90, "Ic");
    data[27] = new Record(28, 100, "Ja");
    data[28] = new Record(29, 100, "Jb");
    data[29] = new Record(30, 100, "Jc");
    data[30] = new Record(31, 110, "Ka");
    data[31] = new Record(32, 110, "Kb");
    data[32] = new Record(33, 110, "Kc");
    data[33] = new Record(34, 120, "La");
    data[34] = new Record(35, 120, "Lb");
    data[35] = new Record(36, 120, "Lc");
    data[36] = new Record(37, 130, "Ma");
    data[37] = new Record(38, 130, "Mb");
    data[38] = new Record(39, 130, "Mc");
    data[39] = new Record(40, 140, "Na");
    data[40] = new Record(41, 140, "Nb");
    data[41] = new Record(42, 140, "Nc");
    data[42] = new Record(43, 150, "Oa");
    data[43] = new Record(44, 150, "Ob");
    data[44] = new Record(45, 150, "Oc");
    data[45] = new Record(46, 160, "Pa");
    data[46] = new Record(47, 160, "Pb");
    data[47] = new Record(48, 160, "Pc");
    data[48] = new Record(49, 170, "Qa");
    data[49] = new Record(50, 170, "Qb");
    data[50] = new Record(51, 170, "Qc");
    data[51] = new Record(52, 180, "Ra");
    data[52] = new Record(53, 180, "Rb");
    data[53] = new Record(54, 180, "Rc");
    data[54] = new Record(55, 190, "Sa");
    data[55] = new Record(56, 190, "Sb");
    data[56] = new Record(57, 190, "Sc");
    data[57] = new Record(58, 200, "Ta");
    data[58] = new Record(59, 200, "Tb");
    data[59] = new Record(60, 200, "Tc");
    data[60] = new Record(61, 210, "Ua");
    data[61] = new Record(62, 210, "Ub");
    data[62] = new Record(63, 210, "Uc");
    data[63] = new Record(64, 220, "Va");
    data[64] = new Record(65, 220, "Vb");
    data[65] = new Record(66, 220, "Vc");
    data[66] = new Record(67, 230, "Wa");
    data[67] = new Record(68, 230, "Wb");
    data[68] = new Record(69, 230, "Wc");
    data[69] = new Record(70, 240, "Xa");
    data[70] = new Record(71, 240, "Xb");
    data[71] = new Record(72, 240, "Xc");
    data[72] = new Record(73, 250, "Ya");
    data[73] = new Record(74, 250, "Yb");
    data[74] = new Record(75, 250, "Yc");
    data[75] = new Record(76, 260, "Za");
    data[76] = new Record(77, 260, "Zb");
    data[77] = new Record(78, 260, "Zc");

    return data;
  }

  //Data in a in reverse order with duplicate values to test stability
  public static Record[] reverseSorted() {
    List<Record> list = Arrays.asList(alreadySorted());
    Collections.reverse(list);
    return list.toArray(new Record[0]);
  }
}
