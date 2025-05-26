package c2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class j3 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f24856a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final long f24857b = kh2.w.Q(8);

    /* JADX WARN: Removed duplicated region for block: B:102:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(h4.f0 r44, kotlin.jvm.functions.Function1 r45, u2.q r46, boolean r47, boolean r48, b4.q0 r49, kotlin.jvm.functions.Function2 r50, kotlin.jvm.functions.Function2 r51, kotlin.jvm.functions.Function2 r52, kotlin.jvm.functions.Function2 r53, boolean r54, h4.p0 r55, w1.k1 r56, w1.j1 r57, boolean r58, int r59, int r60, o1.l r61, b3.x0 r62, c2.m1 r63, i2.o r64, int r65, int r66, int r67) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.j3.a(h4.f0, kotlin.jvm.functions.Function1, u2.q, boolean, boolean, b4.q0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, h4.p0, w1.k1, w1.j1, boolean, int, int, o1.l, b3.x0, c2.m1, i2.o, int, int, int):void");
    }

    public static final void b(u2.q qVar, Function2 function2, kl2.l lVar, Function2 function22, Function2 function23, Function2 function24, boolean z13, float f13, Function1 function1, Function2 function25, p1.x0 x0Var, i2.o oVar, int i13, int i14) {
        int i15;
        int i16;
        n4.k kVar;
        int i17;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-2049536174);
        if ((i13 & 6) == 0) {
            i15 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= sVar.j(function2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= sVar.j(lVar) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i13 & 3072) == 0) {
            i15 |= sVar.j(function22) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= sVar.j(function23) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i15 |= sVar.j(function24) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i15 |= sVar.i(z13) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= sVar.e(f13) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= sVar.j(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i13) == 0) {
            i15 |= sVar.j(function25) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | (sVar.h(x0Var) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i15 & 306783379) == 306783378 && (i16 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            boolean z14 = ((3670016 & i15) == 1048576) | ((234881024 & i15) == 67108864) | ((29360128 & i15) == 8388608) | ((i16 & 14) == 4);
            Object J2 = sVar.J();
            if (z14 || J2 == i2.n.f71185a) {
                J2 = new l3(function1, z13, f13, x0Var);
                sVar.g0(J2);
            }
            l3 l3Var = (l3) J2;
            n4.k kVar2 = (n4.k) sVar.m(t3.f2.f115989l);
            int i18 = sVar.P;
            i2.z1 o13 = sVar.o();
            u2.q X = ao2.m0.X(sVar, qVar);
            s3.k.Qo.getClass();
            s3.i iVar = s3.j.f110798b;
            boolean z15 = sVar.f71265a instanceof i2.f;
            if (!z15) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar.a0();
            if (sVar.O) {
                sVar.n(iVar);
            } else {
                sVar.j0();
            }
            s3.h hVar = s3.j.f110801e;
            tb.f.f0(sVar, l3Var, hVar);
            s3.h hVar2 = s3.j.f110800d;
            tb.f.f0(sVar, o13, hVar2);
            s3.h hVar3 = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
                ep.b.y(i18, sVar, i18, hVar3);
            }
            s3.h hVar4 = s3.j.f110799c;
            tb.f.f0(sVar, X, hVar4);
            function25.invoke(sVar, Integer.valueOf((i15 >> 27) & 14));
            u2.i iVar2 = u2.b.f120017e;
            if (function23 != null) {
                sVar.W(-988654503);
                u2.q j13 = androidx.compose.ui.layout.a.c("Leading").j(q5.f25110d);
                q3.p0 e13 = p1.q.e(iVar2, false);
                int i19 = sVar.P;
                kVar = kVar2;
                i2.z1 o14 = sVar.o();
                u2.q X2 = ao2.m0.X(sVar, j13);
                if (!z15) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar.a0();
                if (sVar.O) {
                    sVar.n(iVar);
                } else {
                    sVar.j0();
                }
                tb.f.f0(sVar, e13, hVar);
                tb.f.f0(sVar, o14, hVar2);
                if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i19))) {
                    ep.b.y(i19, sVar, i19, hVar3);
                }
                tb.f.f0(sVar, X2, hVar4);
                function23.invoke(sVar, Integer.valueOf((i15 >> 12) & 14));
                sVar.r(true);
                sVar.r(false);
            } else {
                kVar = kVar2;
                sVar.W(-988413292);
                sVar.r(false);
            }
            if (function24 != null) {
                sVar.W(-988370729);
                u2.q j14 = androidx.compose.ui.layout.a.c("Trailing").j(q5.f25110d);
                q3.p0 e14 = p1.q.e(iVar2, false);
                int i23 = sVar.P;
                i2.z1 o15 = sVar.o();
                u2.q X3 = ao2.m0.X(sVar, j14);
                if (!z15) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar.a0();
                if (sVar.O) {
                    sVar.n(iVar);
                } else {
                    sVar.j0();
                }
                tb.f.f0(sVar, e14, hVar);
                tb.f.f0(sVar, o15, hVar2);
                if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i23))) {
                    ep.b.y(i23, sVar, i23, hVar3);
                }
                tb.f.f0(sVar, X3, hVar4);
                function24.invoke(sVar, Integer.valueOf((i15 >> 15) & 14));
                sVar.r(true);
                i17 = 0;
                sVar.r(false);
            } else {
                i17 = 0;
                sVar.W(-988127596);
                sVar.r(false);
            }
            n4.k kVar3 = kVar;
            float f14 = androidx.compose.foundation.layout.b.f(x0Var, kVar3);
            float e15 = androidx.compose.foundation.layout.b.e(x0Var, kVar3);
            u2.n nVar = u2.n.f120041b;
            if (function23 != null) {
                f14 = ql2.s.a(f14 - q5.f25109c, i17);
            }
            float f15 = f14;
            if (function24 != null) {
                e15 = ql2.s.a(e15 - q5.f25109c, i17);
            }
            u2.q r13 = androidx.compose.foundation.layout.b.r(nVar, f15, 0.0f, e15, 0.0f, 10);
            if (lVar != null) {
                sVar.W(-987369863);
                lVar.invoke(androidx.compose.ui.layout.a.c("Hint").j(r13), sVar, Integer.valueOf((i15 >> 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER));
                sVar.r(false);
            } else {
                sVar.W(-987282412);
                sVar.r(false);
            }
            u2.q j15 = androidx.compose.ui.layout.a.c("TextField").j(r13);
            u2.i iVar3 = u2.b.f120013a;
            q3.p0 e16 = p1.q.e(iVar3, true);
            int i24 = sVar.P;
            i2.z1 o16 = sVar.o();
            u2.q X4 = ao2.m0.X(sVar, j15);
            if (!z15) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar.a0();
            if (sVar.O) {
                sVar.n(iVar);
            } else {
                sVar.j0();
            }
            tb.f.f0(sVar, e16, hVar);
            tb.f.f0(sVar, o16, hVar2);
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i24))) {
                ep.b.y(i24, sVar, i24, hVar3);
            }
            tb.f.f0(sVar, X4, hVar4);
            function2.invoke(sVar, Integer.valueOf((i15 >> 3) & 14));
            sVar.r(true);
            if (function22 != null) {
                sVar.W(-987052578);
                u2.q c13 = androidx.compose.ui.layout.a.c("Label");
                q3.p0 e17 = p1.q.e(iVar3, false);
                int i25 = sVar.P;
                i2.z1 o17 = sVar.o();
                u2.q X5 = ao2.m0.X(sVar, c13);
                if (!z15) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar.a0();
                if (sVar.O) {
                    sVar.n(iVar);
                } else {
                    sVar.j0();
                }
                tb.f.f0(sVar, e17, hVar);
                tb.f.f0(sVar, o17, hVar2);
                if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i25))) {
                    ep.b.y(i25, sVar, i25, hVar3);
                }
                tb.f.f0(sVar, X5, hVar4);
                function22.invoke(sVar, Integer.valueOf((i15 >> 9) & 14));
                sVar.r(true);
                sVar.r(false);
            } else {
                sVar.W(-986969932);
                sVar.r(false);
            }
            sVar.r(true);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new h3(qVar, function2, lVar, function22, function23, function24, z13, f13, function1, function25, x0Var, i13, i14);
        }
    }

    public static final int c(int i13, int i14, int i15, int i16, int i17, float f13, long j13, float f14, p1.x0 x0Var) {
        int max = Math.max(i15, Math.max(i17, tb.f.V(i16, f13, 0)));
        float d2 = x0Var.d() * f14;
        return Math.max(n4.a.i(j13), Math.max(i13, Math.max(i14, ml2.c.c(tb.f.U(d2, Math.max(d2, i16 / 2.0f), f13) + max + (x0Var.a() * f14)))));
    }

    public static final int d(int i13, int i14, int i15, int i16, int i17, float f13, long j13, float f14, p1.x0 x0Var) {
        int max = Math.max(i15, Math.max(tb.f.V(i16, f13, 0), i17)) + i13 + i14;
        n4.k kVar = n4.k.Ltr;
        return Math.max(max, Math.max(ml2.c.c((i16 + ((x0Var.b(kVar) + x0Var.c(kVar)) * f14)) * f13), n4.a.j(j13)));
    }
}
