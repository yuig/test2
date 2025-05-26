package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.graphics.Bitmap;
import android.graphics.Path;

/* loaded from: classes5.dex */
public final class f1 {
    public static Path a(Bitmap bitmap) {
        int i13;
        int i14;
        int i15;
        if (bitmap == null) {
            return new Path();
        }
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        Path path = new Path();
        kotlin.ranges.a p13 = ql2.s.p(ql2.s.q(0, height), 1);
        int i16 = p13.f80453a;
        int i17 = p13.f80454b;
        int i18 = p13.f80455c;
        if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
            loop0: while (true) {
                kotlin.ranges.a p14 = ql2.s.p(ql2.s.q(0, width), 1);
                i13 = p14.f80453a;
                int i19 = p14.f80454b;
                int i23 = p14.f80455c;
                if ((i23 > 0 && i13 <= i19) || (i23 < 0 && i19 <= i13)) {
                    while (bitmap.getPixel(i13, i16) == 0) {
                        if (i13 != i19) {
                            i13 += i23;
                        }
                    }
                    path.moveTo(i13, i16);
                    break loop0;
                }
                if (i16 == i17) {
                    break;
                }
                i16 += i18;
            }
        }
        i16 = 0;
        i13 = 0;
        kotlin.ranges.a p15 = ql2.s.p(ql2.s.q(i16 + 1, height), 1);
        int i24 = p15.f80453a;
        int i25 = p15.f80454b;
        int i26 = p15.f80455c;
        if ((i26 > 0 && i24 <= i25) || (i26 < 0 && i25 <= i24)) {
            i14 = i16;
            i15 = i13;
            while (true) {
                kotlin.ranges.a p16 = ql2.s.p(ql2.s.q(0, width), 1);
                int i27 = p16.f80453a;
                int i28 = p16.f80454b;
                int i29 = p16.f80455c;
                if ((i29 > 0 && i27 <= i28) || (i29 < 0 && i28 <= i27)) {
                    while (true) {
                        if (bitmap.getPixel(i27, i24) == 0) {
                            if (i27 == i28) {
                                break;
                            }
                            i27 += i29;
                        } else {
                            path.lineTo(i27, i24);
                            i14 = i24;
                            i15 = i27;
                            break;
                        }
                    }
                }
                if (i24 == i25) {
                    break;
                }
                i24 += i26;
            }
        } else {
            i14 = i16;
            i15 = i13;
        }
        kotlin.ranges.a p17 = ql2.s.p(ql2.s.q(i15 + 1, width), 1);
        int i33 = p17.f80453a;
        int i34 = p17.f80454b;
        int i35 = p17.f80455c;
        if ((i35 > 0 && i33 <= i34) || (i35 < 0 && i34 <= i33)) {
            while (true) {
                int i36 = height - 1;
                int u13 = ue.c.u(i36, 0, -1);
                if (u13 <= i36) {
                    while (true) {
                        if (bitmap.getPixel(i33, i36) == 0) {
                            if (i36 == u13) {
                                break;
                            }
                            i36--;
                        } else {
                            path.lineTo(i33, i36);
                            i15 = i33;
                            i14 = i36;
                            break;
                        }
                    }
                }
                if (i33 == i34) {
                    break;
                }
                i33 += i35;
            }
        }
        int i37 = i14 - 1;
        int u14 = ue.c.u(i37, i16, -1);
        if (u14 <= i37) {
            while (true) {
                int i38 = width - 1;
                int u15 = ue.c.u(i38, 0, -1);
                if (u15 <= i38) {
                    while (true) {
                        if (bitmap.getPixel(i38, i37) == 0) {
                            if (i38 == u15) {
                                break;
                            }
                            i38--;
                        } else {
                            path.lineTo(i38, i37);
                            i15 = i38;
                            break;
                        }
                    }
                }
                if (i37 == u14) {
                    break;
                }
                i37--;
            }
        }
        int i39 = i15 - 1;
        int u16 = ue.c.u(i39, i13, -1);
        if (u16 <= i39) {
            while (true) {
                kotlin.ranges.a p18 = ql2.s.p(ql2.s.q(0, height), 1);
                int i43 = p18.f80453a;
                int i44 = p18.f80454b;
                int i45 = p18.f80455c;
                if ((i45 > 0 && i43 <= i44) || (i45 < 0 && i44 <= i43)) {
                    while (true) {
                        if (bitmap.getPixel(i39, i43) == 0) {
                            if (i43 == i44) {
                                break;
                            }
                            i43 += i45;
                        } else {
                            path.lineTo(i39, i43);
                            break;
                        }
                    }
                }
                if (i39 == u16) {
                    break;
                }
                i39--;
            }
        }
        path.close();
        return path;
    }
}
