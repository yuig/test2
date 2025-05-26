package c2;

import androidx.compose.foundation.BorderModifierNodeElement;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    public static final g5 f24781a = new g5();

    /* renamed from: b, reason: collision with root package name */
    public static final float f24782b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f24783c = RecyclerViewTypes.VIEW_TYPE_PIN_WEBVIEW_AD;

    /* renamed from: d, reason: collision with root package name */
    public static final float f24784d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final float f24785e = 2;

    public static m1 d(long j13, long j14, long j15, long j16, long j17, i2.o oVar, int i13) {
        long j18;
        long j19;
        long j23;
        long j24;
        long j25;
        long j26;
        if ((i13 & 1) != 0) {
            i2.s sVar = (i2.s) oVar;
            j18 = b3.w.b(((b3.w) sVar.m(c1.f24577a)).f21392a, ((Number) sVar.m(b1.f24558a)).floatValue());
        } else {
            j18 = j13;
        }
        i2.u0 u0Var = c1.f24577a;
        i2.s sVar2 = (i2.s) oVar;
        long j27 = ((b3.w) sVar2.m(u0Var)).f21392a;
        i2.w3 w3Var = u0.f25271a;
        if (((s0) sVar2.m(w3Var)).f()) {
            androidx.compose.ui.graphics.a.q(j27);
        } else {
            androidx.compose.ui.graphics.a.q(j27);
        }
        long b13 = b3.w.b(j18, 0.38f);
        long j28 = b3.w.f21389m;
        long d2 = (i13 & 8) != 0 ? ((s0) ((i2.s) oVar).m(w3Var)).d() : j14;
        long b14 = ((s0) ((i2.s) oVar).m(w3Var)).b();
        if ((i13 & 32) != 0) {
            i2.s sVar3 = (i2.s) oVar;
            long d13 = ((s0) sVar3.m(w3Var)).d();
            j19 = b14;
            long j29 = ((b3.w) sVar3.m(u0Var)).f21392a;
            j23 = b3.w.b(d13, (!((s0) sVar3.m(w3Var)).f() ? ((double) androidx.compose.ui.graphics.a.q(j29)) < 0.5d : ((double) androidx.compose.ui.graphics.a.q(j29)) > 0.5d) ? 0.87f : 1.0f);
        } else {
            j19 = b14;
            j23 = j15;
        }
        if ((i13 & 64) != 0) {
            i2.s sVar4 = (i2.s) oVar;
            long c13 = ((s0) sVar4.m(w3Var)).c();
            j24 = j23;
            long j33 = ((b3.w) sVar4.m(u0Var)).f21392a;
            if (((s0) sVar4.m(w3Var)).f()) {
                androidx.compose.ui.graphics.a.q(j33);
            } else {
                androidx.compose.ui.graphics.a.q(j33);
            }
            j25 = b3.w.b(c13, 0.38f);
        } else {
            j24 = j23;
            j25 = j16;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            i2.s sVar5 = (i2.s) oVar;
            long j34 = ((b3.w) sVar5.m(u0Var)).f21392a;
            if (((s0) sVar5.m(w3Var)).f()) {
                androidx.compose.ui.graphics.a.q(j34);
            } else {
                androidx.compose.ui.graphics.a.q(j34);
            }
            j26 = b3.w.b(j25, 0.38f);
        } else {
            j26 = j17;
        }
        long b15 = ((s0) ((i2.s) oVar).m(w3Var)).b();
        long b16 = b3.w.b(((s0) ((i2.s) oVar).m(w3Var)).c(), 0.54f);
        i2.s sVar6 = (i2.s) oVar;
        long j35 = ((b3.w) sVar6.m(u0Var)).f21392a;
        if (((s0) sVar6.m(w3Var)).f()) {
            androidx.compose.ui.graphics.a.q(j35);
        } else {
            androidx.compose.ui.graphics.a.q(j35);
        }
        long b17 = b3.w.b(b16, 0.38f);
        long b18 = b3.w.b(((s0) ((i2.s) oVar).m(w3Var)).c(), 0.54f);
        i2.s sVar7 = (i2.s) oVar;
        long j36 = ((b3.w) sVar7.m(u0Var)).f21392a;
        if (((s0) sVar7.m(w3Var)).f()) {
            androidx.compose.ui.graphics.a.q(j36);
        } else {
            androidx.compose.ui.graphics.a.q(j36);
        }
        long b19 = b3.w.b(b18, 0.38f);
        long b23 = ((s0) ((i2.s) oVar).m(w3Var)).b();
        i2.s sVar8 = (i2.s) oVar;
        long d14 = ((s0) sVar8.m(w3Var)).d();
        long j37 = ((b3.w) sVar8.m(u0Var)).f21392a;
        long b24 = b3.w.b(d14, (!((s0) sVar8.m(w3Var)).f() ? ((double) androidx.compose.ui.graphics.a.q(j37)) < 0.5d : ((double) androidx.compose.ui.graphics.a.q(j37)) > 0.5d) ? 0.87f : 1.0f);
        i2.s sVar9 = (i2.s) oVar;
        long c14 = ((s0) sVar9.m(w3Var)).c();
        long j38 = ((b3.w) sVar9.m(u0Var)).f21392a;
        long b25 = b3.w.b(c14, (!((s0) sVar9.m(w3Var)).f() ? ((double) androidx.compose.ui.graphics.a.q(j38)) < 0.5d : ((double) androidx.compose.ui.graphics.a.q(j38)) > 0.5d) ? 0.6f : 0.74f);
        i2.s sVar10 = (i2.s) oVar;
        long j39 = ((b3.w) sVar10.m(u0Var)).f21392a;
        if (((s0) sVar10.m(w3Var)).f()) {
            androidx.compose.ui.graphics.a.q(j39);
        } else {
            androidx.compose.ui.graphics.a.q(j39);
        }
        long b26 = b3.w.b(b25, 0.38f);
        long b27 = ((s0) ((i2.s) oVar).m(w3Var)).b();
        i2.s sVar11 = (i2.s) oVar;
        long c15 = ((s0) sVar11.m(w3Var)).c();
        long j43 = ((b3.w) sVar11.m(u0Var)).f21392a;
        long b28 = b3.w.b(c15, (!((s0) sVar11.m(w3Var)).f() ? ((double) androidx.compose.ui.graphics.a.q(j43)) < 0.5d : ((double) androidx.compose.ui.graphics.a.q(j43)) > 0.5d) ? 0.6f : 0.74f);
        i2.s sVar12 = (i2.s) oVar;
        long j44 = ((b3.w) sVar12.m(u0Var)).f21392a;
        if (((s0) sVar12.m(w3Var)).f()) {
            androidx.compose.ui.graphics.a.q(j44);
        } else {
            androidx.compose.ui.graphics.a.q(j44);
        }
        return new m1(j18, b13, d2, j19, j24, j25, b15, j26, b16, b17, b16, b18, b19, b23, j28, b24, b25, b26, b27, b28, b3.w.b(b28, 0.38f));
    }

    public static m1 e(long j13, long j14, long j15, i2.o oVar, int i13) {
        long j16;
        long j17;
        i2.u0 u0Var = c1.f24577a;
        i2.s sVar = (i2.s) oVar;
        long b13 = b3.w.b(((b3.w) sVar.m(u0Var)).f21392a, ((Number) sVar.m(b1.f24558a)).floatValue());
        i2.s sVar2 = (i2.s) oVar;
        long j18 = ((b3.w) sVar2.m(u0Var)).f21392a;
        i2.w3 w3Var = u0.f25271a;
        if (((s0) sVar2.m(w3Var)).f()) {
            androidx.compose.ui.graphics.a.q(j18);
        } else {
            androidx.compose.ui.graphics.a.q(j18);
        }
        long b14 = b3.w.b(b13, 0.38f);
        long b15 = (i13 & 4) != 0 ? b3.w.b(((s0) ((i2.s) oVar).m(w3Var)).c(), 0.12f) : j13;
        long d2 = ((s0) ((i2.s) oVar).m(w3Var)).d();
        long b16 = ((s0) ((i2.s) oVar).m(w3Var)).b();
        if ((i13 & 32) != 0) {
            i2.s sVar3 = (i2.s) oVar;
            long d13 = ((s0) sVar3.m(w3Var)).d();
            j16 = b16;
            long j19 = ((b3.w) sVar3.m(u0Var)).f21392a;
            j17 = b3.w.b(d13, (!((s0) sVar3.m(w3Var)).f() ? ((double) androidx.compose.ui.graphics.a.q(j19)) < 0.5d : ((double) androidx.compose.ui.graphics.a.q(j19)) > 0.5d) ? 0.87f : 1.0f);
        } else {
            j16 = b16;
            j17 = j14;
        }
        i2.s sVar4 = (i2.s) oVar;
        long b17 = (i13 & 64) != 0 ? b3.w.b(((s0) ((i2.s) oVar).m(w3Var)).c(), 0.42f) : j15;
        long j23 = ((b3.w) sVar4.m(u0Var)).f21392a;
        if (((s0) sVar4.m(w3Var)).f()) {
            androidx.compose.ui.graphics.a.q(j23);
        } else {
            androidx.compose.ui.graphics.a.q(j23);
        }
        long b18 = b3.w.b(b17, 0.38f);
        long b19 = ((s0) ((i2.s) oVar).m(w3Var)).b();
        long b23 = b3.w.b(((s0) ((i2.s) oVar).m(w3Var)).c(), 0.54f);
        i2.s sVar5 = (i2.s) oVar;
        long j24 = ((b3.w) sVar5.m(u0Var)).f21392a;
        if (((s0) sVar5.m(w3Var)).f()) {
            androidx.compose.ui.graphics.a.q(j24);
        } else {
            androidx.compose.ui.graphics.a.q(j24);
        }
        long b24 = b3.w.b(b23, 0.38f);
        long b25 = b3.w.b(((s0) ((i2.s) oVar).m(w3Var)).c(), 0.54f);
        i2.s sVar6 = (i2.s) oVar;
        long j25 = ((b3.w) sVar6.m(u0Var)).f21392a;
        if (((s0) sVar6.m(w3Var)).f()) {
            androidx.compose.ui.graphics.a.q(j25);
        } else {
            androidx.compose.ui.graphics.a.q(j25);
        }
        long b26 = b3.w.b(b25, 0.38f);
        long b27 = ((s0) ((i2.s) oVar).m(w3Var)).b();
        i2.s sVar7 = (i2.s) oVar;
        long d14 = ((s0) sVar7.m(w3Var)).d();
        long j26 = ((b3.w) sVar7.m(u0Var)).f21392a;
        long b28 = b3.w.b(d14, (!((s0) sVar7.m(w3Var)).f() ? ((double) androidx.compose.ui.graphics.a.q(j26)) < 0.5d : ((double) androidx.compose.ui.graphics.a.q(j26)) > 0.5d) ? 0.87f : 1.0f);
        i2.s sVar8 = (i2.s) oVar;
        long c13 = ((s0) sVar8.m(w3Var)).c();
        long j27 = ((b3.w) sVar8.m(u0Var)).f21392a;
        long b29 = b3.w.b(c13, (!((s0) sVar8.m(w3Var)).f() ? ((double) androidx.compose.ui.graphics.a.q(j27)) < 0.5d : ((double) androidx.compose.ui.graphics.a.q(j27)) > 0.5d) ? 0.6f : 0.74f);
        i2.s sVar9 = (i2.s) oVar;
        long j28 = ((b3.w) sVar9.m(u0Var)).f21392a;
        if (((s0) sVar9.m(w3Var)).f()) {
            androidx.compose.ui.graphics.a.q(j28);
        } else {
            androidx.compose.ui.graphics.a.q(j28);
        }
        long b33 = b3.w.b(b29, 0.38f);
        long b34 = ((s0) ((i2.s) oVar).m(w3Var)).b();
        i2.s sVar10 = (i2.s) oVar;
        long c14 = ((s0) sVar10.m(w3Var)).c();
        long j29 = ((b3.w) sVar10.m(u0Var)).f21392a;
        long b35 = b3.w.b(c14, (!((s0) sVar10.m(w3Var)).f() ? ((double) androidx.compose.ui.graphics.a.q(j29)) < 0.5d : ((double) androidx.compose.ui.graphics.a.q(j29)) > 0.5d) ? 0.6f : 0.74f);
        i2.s sVar11 = (i2.s) oVar;
        long j33 = ((b3.w) sVar11.m(u0Var)).f21392a;
        if (((s0) sVar11.m(w3Var)).f()) {
            androidx.compose.ui.graphics.a.q(j33);
        } else {
            androidx.compose.ui.graphics.a.q(j33);
        }
        return new m1(b13, b14, d2, j16, j17, b17, b19, b18, b23, b24, b23, b25, b26, b27, b15, b28, b29, b33, b34, b35, b3.w.b(b35, 0.38f));
    }

    public final void a(boolean z13, boolean z14, o1.k kVar, m1 m1Var, b3.x0 x0Var, float f13, float f14, i2.o oVar, int i13, int i14) {
        int i15;
        b3.x0 x0Var2;
        float f15;
        float f16;
        float f17;
        b3.x0 x0Var3;
        float f18;
        int i16;
        int i17;
        int i18;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(943754022);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (sVar.i(z13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= sVar.i(z14) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= sVar.h(kVar) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= sVar.h(m1Var) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) == 0) {
                x0Var2 = x0Var;
                if (sVar.h(x0Var2)) {
                    i18 = 16384;
                    i15 |= i18;
                }
            } else {
                x0Var2 = x0Var;
            }
            i18 = 8192;
            i15 |= i18;
        } else {
            x0Var2 = x0Var;
        }
        if ((196608 & i13) == 0) {
            if ((i14 & 32) == 0) {
                f15 = f13;
                if (sVar.e(f15)) {
                    i17 = 131072;
                    i15 |= i17;
                }
            } else {
                f15 = f13;
            }
            i17 = 65536;
            i15 |= i17;
        } else {
            f15 = f13;
        }
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) == 0) {
                f16 = f14;
                if (sVar.e(f16)) {
                    i16 = 1048576;
                    i15 |= i16;
                }
            } else {
                f16 = f14;
            }
            i16 = 524288;
            i15 |= i16;
        } else {
            f16 = f14;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            i15 |= sVar.h(this) ? 8388608 : 4194304;
        }
        if ((4793491 & i15) == 4793490 && sVar.z()) {
            sVar.Q();
            x0Var3 = x0Var2;
            f18 = f15;
            f17 = f16;
        } else {
            sVar.S();
            if ((i13 & 1) == 0 || sVar.y()) {
                if ((i14 & 16) != 0) {
                    x0Var2 = ((b4) sVar.m(c4.f24581a)).f24564a;
                    i15 &= -57345;
                }
                if ((i14 & 32) != 0) {
                    i15 &= -458753;
                    f15 = f24785e;
                }
                if ((i14 & 64) != 0) {
                    i15 &= -3670017;
                    f16 = f24784d;
                }
            } else {
                sVar.Q();
                if ((i14 & 16) != 0) {
                    i15 &= -57345;
                }
                if ((i14 & 32) != 0) {
                    i15 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    i15 &= -3670017;
                }
            }
            b3.x0 x0Var4 = x0Var2;
            float f19 = f15;
            f17 = f16;
            sVar.s();
            int i19 = (i15 & 14) | (i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | (i15 & 896) | (i15 & 7168);
            int i23 = i15 >> 3;
            k1.y yVar = (k1.y) j1.j(z13, z14, kVar, m1Var, f19, f17, sVar, i19 | (57344 & i23) | (i23 & 458752)).getValue();
            p1.q.a(new BorderModifierNodeElement(yVar.f78091a, yVar.f78092b, x0Var4), sVar, 0);
            x0Var3 = x0Var4;
            f18 = f19;
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new c5(this, z13, z14, kVar, m1Var, x0Var3, f18, f17, i13, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r39, kotlin.jvm.functions.Function2 r40, boolean r41, boolean r42, h4.p0 r43, o1.k r44, boolean r45, kotlin.jvm.functions.Function2 r46, kotlin.jvm.functions.Function2 r47, kotlin.jvm.functions.Function2 r48, kotlin.jvm.functions.Function2 r49, b3.x0 r50, c2.m1 r51, p1.x0 r52, kotlin.jvm.functions.Function2 r53, i2.o r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.g5.b(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, h4.p0, o1.k, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, b3.x0, c2.m1, p1.x0, kotlin.jvm.functions.Function2, i2.o, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x019d, code lost:
    
        if (r8.h(r51) == false) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r38, kotlin.jvm.functions.Function2 r39, boolean r40, boolean r41, h4.p0 r42, o1.k r43, boolean r44, kotlin.jvm.functions.Function2 r45, kotlin.jvm.functions.Function2 r46, kotlin.jvm.functions.Function2 r47, kotlin.jvm.functions.Function2 r48, b3.x0 r49, c2.m1 r50, p1.x0 r51, i2.o r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.g5.c(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, h4.p0, o1.k, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, b3.x0, c2.m1, p1.x0, i2.o, int, int, int):void");
    }
}
