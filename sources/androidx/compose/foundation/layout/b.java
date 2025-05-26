package androidx.compose.foundation.layout;

import a.cb;
import i1.f1;
import java.util.List;
import kotlin.jvm.functions.Function1;
import n4.k;
import p1.a1;
import p1.b1;
import p1.u0;
import p1.v0;
import p1.x0;
import p1.y0;
import q3.c1;
import q3.o0;
import q3.q0;
import q3.r;
import q3.r0;
import ql2.s;
import u2.q;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(u2.q r13, u2.e r14, boolean r15, kl2.l r16, i2.o r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.b.a(u2.q, u2.e, boolean, kl2.l, i2.o, int, int):void");
    }

    public static y0 b(float f13, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0;
        }
        float f14 = 0;
        return new y0(f13, f14, f13, f14);
    }

    public static y0 c(float f13, float f14, float f15, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0;
        }
        float f16 = 0;
        if ((i13 & 4) != 0) {
            f14 = 0;
        }
        if ((i13 & 8) != 0) {
            f15 = 0;
        }
        return new y0(f13, f16, f14, f15);
    }

    public static q d(q qVar, float f13) {
        return qVar.j(new AspectRatioElement(f13, false));
    }

    public static final float e(x0 x0Var, k kVar) {
        return kVar == k.Ltr ? x0Var.b(kVar) : x0Var.c(kVar);
    }

    public static final float f(x0 x0Var, k kVar) {
        return kVar == k.Ltr ? x0Var.c(kVar) : x0Var.b(kVar);
    }

    public static final b1 g(r rVar) {
        Object a13 = rVar.a();
        if (a13 instanceof b1) {
            return (b1) a13;
        }
        return null;
    }

    public static final float h(b1 b1Var) {
        if (b1Var != null) {
            return b1Var.f98486a;
        }
        return 0.0f;
    }

    public static q0 i(a1 a1Var, int i13, int i14, int i15, int i16, int i17, r0 r0Var, List list, c1[] c1VarArr, int i18) {
        int i19;
        int[] iArr;
        String str;
        float f13;
        String str2;
        long j13;
        int i23;
        int i24;
        a1 a1Var2;
        int i25;
        int g13;
        int i26;
        String str3;
        String str4;
        int i27;
        long j14;
        String str5;
        String str6;
        long j15;
        float f14;
        String str7;
        float f15;
        long j16;
        int i28;
        String str8;
        String str9;
        long j17;
        int i29;
        float f16;
        float f17;
        float f18;
        a1 a1Var3;
        int i33;
        long j18;
        int i34;
        List list2 = list;
        int i35 = i18;
        long j19 = i17;
        int[] iArr2 = new int[i35];
        float f19 = 0.0f;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i43 = 0;
        while (i36 < i35) {
            o0 o0Var = (o0) list2.get(i36);
            float h10 = h(g(o0Var));
            if (h10 > 0.0f) {
                f19 += h10;
                i37++;
                j18 = j19;
            } else {
                int i44 = i15 - i38;
                c1 c1Var = c1VarArr[i36];
                if (c1Var == null) {
                    if (i15 == Integer.MAX_VALUE) {
                        j18 = j19;
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i44 < 0 ? 0 : i44;
                        j18 = j19;
                    }
                    c1Var = o0Var.Q(a1Var.c(false, 0, i34, i16));
                } else {
                    j18 = j19;
                }
                c1 c1Var2 = c1Var;
                int i45 = a1Var.i(c1Var2);
                int j23 = a1Var.j(c1Var2);
                iArr2[i36] = i45;
                int i46 = i44 - i45;
                if (i46 < 0) {
                    i46 = 0;
                }
                i39 = Math.min(i17, i46);
                i38 += i45 + i39;
                int max = Math.max(i43, j23);
                c1VarArr[i36] = c1Var2;
                i43 = max;
            }
            i36++;
            list2 = list;
            i35 = i18;
            j19 = j18;
        }
        long j24 = j19;
        int i47 = i43;
        if (i37 == 0) {
            i26 = i38 - i39;
            a1Var2 = a1Var;
            i24 = i47;
            iArr = iArr2;
            i25 = 0;
            g13 = 0;
            i23 = i13;
        } else {
            int i48 = i15 != Integer.MAX_VALUE ? i15 : i13;
            long j25 = j24 * (i37 - 1);
            int i49 = i47;
            long b13 = s.b((i48 - i38) - j25, 0L);
            float f23 = b13 / f19;
            long j26 = b13;
            int i53 = 0;
            while (true) {
                i19 = i49;
                iArr = iArr2;
                str = "weightedSize ";
                f13 = f19;
                str2 = "weightChildrenCount ";
                j13 = b13;
                if (i53 >= i18) {
                    break;
                }
                float h13 = h(g((o0) list.get(i53)));
                float f24 = f23 * h13;
                try {
                    j26 -= Math.round(f24);
                    i53++;
                    i49 = i19;
                    iArr2 = iArr;
                    f19 = f13;
                    b13 = j13;
                } catch (IllegalArgumentException e13) {
                    StringBuilder t13 = a.a.t("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ", i15, "mainAxisMin ", i13, "targetSpace ");
                    t13.append(i48);
                    t13.append("arrangementSpacingPx ");
                    t13.append(j24);
                    t13.append("weightChildrenCount ");
                    t13.append(i37);
                    t13.append("fixedSpace ");
                    t13.append(i38);
                    cb.v(t13, "arrangementSpacingTotal ", j25, "remainingToTarget ");
                    t13.append(j13);
                    t13.append("totalWeight ");
                    t13.append(f13);
                    t13.append("weightUnitSpace ");
                    t13.append(f23);
                    t13.append("itemWeight ");
                    t13.append(h13);
                    t13.append(str);
                    t13.append(f24);
                    throw new IllegalArgumentException(t13.toString()).initCause(e13);
                }
            }
            String str10 = "remainingToTarget ";
            String str11 = "arrangementSpacingTotal ";
            long j27 = j24;
            String str12 = "weightUnitSpace ";
            float f25 = f13;
            String str13 = "totalWeight ";
            long j28 = j13;
            i23 = i13;
            long j29 = j25;
            int i54 = i38;
            int i55 = 0;
            int i56 = 0;
            i24 = i19;
            List list3 = list;
            String str14 = "fixedSpace ";
            int i57 = i18;
            while (i55 < i57) {
                if (c1VarArr[i55] == null) {
                    o0 o0Var2 = (o0) list3.get(i55);
                    b1 g14 = g(o0Var2);
                    int i58 = i37;
                    float h14 = h(g14);
                    if (h14 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    String str15 = str2;
                    if (j26 < 0) {
                        j17 = j27;
                        i29 = -1;
                    } else if (j26 > 0) {
                        j17 = j27;
                        i29 = 1;
                    } else {
                        j17 = j27;
                        i29 = 0;
                    }
                    j26 -= i29;
                    float f26 = f23 * h14;
                    int i59 = i29;
                    int max2 = Math.max(0, Math.round(f26) + i29);
                    try {
                        if (g14 != null) {
                            try {
                                if (!g14.f98487b) {
                                    a1Var3 = a1Var;
                                    f16 = f26;
                                    f17 = f23;
                                    i33 = 0;
                                    String str16 = str10;
                                    f18 = h14;
                                    str8 = str16;
                                    c1 Q = o0Var2.Q(a1Var3.c(true, i33, max2, i16));
                                    int i63 = a1Var3.i(Q);
                                    int j33 = a1Var3.j(Q);
                                    iArr[i55] = i63;
                                    i56 += i63;
                                    int max3 = Math.max(i24, j33);
                                    c1VarArr[i55] = Q;
                                    i24 = max3;
                                    i28 = i58;
                                    str3 = str15;
                                    j16 = j17;
                                    j14 = j28;
                                    str5 = str12;
                                    str9 = str13;
                                    str6 = str11;
                                    str4 = str;
                                    i27 = i54;
                                    j15 = j29;
                                    f14 = f25;
                                    f15 = f17;
                                    str7 = str14;
                                }
                            } catch (IllegalArgumentException e14) {
                                e = e14;
                                f16 = f26;
                                f17 = f23;
                                String str17 = str10;
                                f18 = h14;
                                str8 = str17;
                                StringBuilder t14 = a.a.t("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i15, "mainAxisMin ", i23, "targetSpace ");
                                t14.append(i48);
                                t14.append("arrangementSpacingPx ");
                                t14.append(j17);
                                t14.append(str15);
                                t14.append(i58);
                                t14.append(str14);
                                t14.append(i54);
                                cb.v(t14, str11, j29, str8);
                                t14.append(j28);
                                t14.append(str13);
                                t14.append(f25);
                                t14.append(str12);
                                t14.append(f17);
                                t14.append("weight ");
                                t14.append(f18);
                                t14.append(str);
                                t14.append(f16);
                                t14.append("crossAxisDesiredSize nullremainderUnit ");
                                t14.append(i59);
                                t14.append("childMainAxisSize ");
                                t14.append(max2);
                                throw new IllegalArgumentException(t14.toString()).initCause(e);
                            }
                        }
                        if (max2 != Integer.MAX_VALUE) {
                            a1Var3 = a1Var;
                            f16 = f26;
                            i33 = max2;
                            f17 = f23;
                            String str162 = str10;
                            f18 = h14;
                            str8 = str162;
                            c1 Q2 = o0Var2.Q(a1Var3.c(true, i33, max2, i16));
                            int i632 = a1Var3.i(Q2);
                            int j332 = a1Var3.j(Q2);
                            iArr[i55] = i632;
                            i56 += i632;
                            int max32 = Math.max(i24, j332);
                            c1VarArr[i55] = Q2;
                            i24 = max32;
                            i28 = i58;
                            str3 = str15;
                            j16 = j17;
                            j14 = j28;
                            str5 = str12;
                            str9 = str13;
                            str6 = str11;
                            str4 = str;
                            i27 = i54;
                            j15 = j29;
                            f14 = f25;
                            f15 = f17;
                            str7 = str14;
                        }
                        c1 Q22 = o0Var2.Q(a1Var3.c(true, i33, max2, i16));
                        int i6322 = a1Var3.i(Q22);
                        int j3322 = a1Var3.j(Q22);
                        iArr[i55] = i6322;
                        i56 += i6322;
                        int max322 = Math.max(i24, j3322);
                        c1VarArr[i55] = Q22;
                        i24 = max322;
                        i28 = i58;
                        str3 = str15;
                        j16 = j17;
                        j14 = j28;
                        str5 = str12;
                        str9 = str13;
                        str6 = str11;
                        str4 = str;
                        i27 = i54;
                        j15 = j29;
                        f14 = f25;
                        f15 = f17;
                        str7 = str14;
                    } catch (IllegalArgumentException e15) {
                        e = e15;
                        StringBuilder t142 = a.a.t("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i15, "mainAxisMin ", i23, "targetSpace ");
                        t142.append(i48);
                        t142.append("arrangementSpacingPx ");
                        t142.append(j17);
                        t142.append(str15);
                        t142.append(i58);
                        t142.append(str14);
                        t142.append(i54);
                        cb.v(t142, str11, j29, str8);
                        t142.append(j28);
                        t142.append(str13);
                        t142.append(f25);
                        t142.append(str12);
                        t142.append(f17);
                        t142.append("weight ");
                        t142.append(f18);
                        t142.append(str);
                        t142.append(f16);
                        t142.append("crossAxisDesiredSize nullremainderUnit ");
                        t142.append(i59);
                        t142.append("childMainAxisSize ");
                        t142.append(max2);
                        throw new IllegalArgumentException(t142.toString()).initCause(e);
                    }
                    a1Var3 = a1Var;
                    f16 = f26;
                    f17 = f23;
                    i33 = 0;
                    String str1622 = str10;
                    f18 = h14;
                    str8 = str1622;
                } else {
                    str3 = str2;
                    str4 = str;
                    i27 = i54;
                    j14 = j28;
                    str5 = str12;
                    str6 = str11;
                    j15 = j29;
                    f14 = f25;
                    str7 = str14;
                    f15 = f23;
                    j16 = j27;
                    i28 = i37;
                    str8 = str10;
                    str9 = str13;
                }
                i55++;
                str2 = str3;
                j28 = j14;
                str12 = str5;
                str13 = str9;
                str11 = str6;
                str14 = str7;
                i57 = i18;
                str10 = str8;
                f25 = f14;
                i37 = i28;
                j27 = j16;
                f23 = f15;
                j29 = j15;
                list3 = list;
                i54 = i27;
                str = str4;
            }
            a1Var2 = a1Var;
            int i64 = i54;
            i25 = 0;
            g13 = s.g((int) (i56 + j29), 0, i15 - i64);
            i26 = i64;
        }
        int i65 = i26 + g13;
        if (i65 < 0) {
            i65 = i25;
        }
        int max4 = Math.max(i65, i23);
        int max5 = Math.max(i24, Math.max(i14, i25));
        int[] iArr3 = new int[i18];
        for (int i66 = i25; i66 < i18; i66++) {
            iArr3[i66] = i25;
        }
        a1Var2.f(max4, iArr, iArr3, r0Var);
        return a1Var.g(c1VarArr, r0Var, iArr3, max4, max5);
    }

    public static final q j(q qVar, Function1 function1) {
        return qVar.j(new OffsetPxElement(function1, new f1(3, function1)));
    }

    public static final q k(q qVar, float f13, float f14) {
        return qVar.j(new OffsetElement(f13, f14, new p1.r0(f13, f14, 0)));
    }

    public static q l(q qVar, float f13, float f14, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0;
        }
        if ((i13 & 2) != 0) {
            f14 = 0;
        }
        return k(qVar, f13, f14);
    }

    public static final q m(q qVar, x0 x0Var) {
        return qVar.j(new PaddingValuesElement(x0Var, new q0.e(x0Var, 10)));
    }

    public static final q n(q qVar, float f13) {
        return qVar.j(new PaddingElement(f13, f13, f13, f13, new v0(0, f13)));
    }

    public static final q o(q qVar, float f13, float f14) {
        return qVar.j(new PaddingElement(f13, f14, f13, f14, new p1.r0(f13, f14, 1)));
    }

    public static q p(q qVar, float f13, float f14, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0;
        }
        if ((i13 & 2) != 0) {
            f14 = 0;
        }
        return o(qVar, f13, f14);
    }

    public static final q q(q qVar, float f13, float f14, float f15, float f16) {
        return qVar.j(new PaddingElement(f13, f14, f15, f16, new u0(1)));
    }

    public static q r(q qVar, float f13, float f14, float f15, float f16, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0;
        }
        if ((i13 & 2) != 0) {
            f14 = 0;
        }
        if ((i13 & 4) != 0) {
            f15 = 0;
        }
        if ((i13 & 8) != 0) {
            f16 = 0;
        }
        return q(qVar, f13, f14, f15, f16);
    }
}
