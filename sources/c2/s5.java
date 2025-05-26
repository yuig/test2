package c2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class s5 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f25220a = 20;

    /* renamed from: b, reason: collision with root package name */
    public static final float f25221b = 10;

    /* renamed from: c, reason: collision with root package name */
    public static final float f25222c = 2;

    /* JADX WARN: Removed duplicated region for block: B:102:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0052  */
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
    public static final void a(java.lang.String r43, kotlin.jvm.functions.Function1 r44, u2.q r45, boolean r46, boolean r47, b4.q0 r48, kotlin.jvm.functions.Function2 r49, kotlin.jvm.functions.Function2 r50, kotlin.jvm.functions.Function2 r51, kotlin.jvm.functions.Function2 r52, boolean r53, h4.p0 r54, w1.k1 r55, w1.j1 r56, boolean r57, int r58, int r59, o1.l r60, b3.x0 r61, c2.m1 r62, i2.o r63, int r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 1467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.s5.a(java.lang.String, kotlin.jvm.functions.Function1, u2.q, boolean, boolean, b4.q0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, h4.p0, w1.k1, w1.j1, boolean, int, int, o1.l, b3.x0, c2.m1, i2.o, int, int, int):void");
    }

    public static final void b(u2.q qVar, Function2 function2, Function2 function22, kl2.l lVar, Function2 function23, Function2 function24, boolean z13, float f13, p1.x0 x0Var, i2.o oVar, int i13) {
        int i14;
        n4.k kVar;
        int i15;
        boolean z14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-2112507061);
        if ((i13 & 6) == 0) {
            i14 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.j(function2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar.j(function22) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar.j(lVar) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar.j(function23) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= sVar.j(function24) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= sVar.i(z13) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= sVar.e(f13) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= sVar.h(x0Var) ? 67108864 : 33554432;
        }
        if ((38347923 & i14) == 38347922 && sVar.z()) {
            sVar.Q();
        } else {
            boolean z15 = ((3670016 & i14) == 1048576) | ((29360128 & i14) == 8388608) | ((234881024 & i14) == 67108864);
            Object J2 = sVar.J();
            if (z15 || J2 == i2.n.f71185a) {
                J2 = new u5(z13, f13, x0Var);
                sVar.g0(J2);
            }
            u5 u5Var = (u5) J2;
            n4.k kVar2 = (n4.k) sVar.m(t3.f2.f115989l);
            int i16 = sVar.P;
            i2.z1 o13 = sVar.o();
            u2.q X = ao2.m0.X(sVar, qVar);
            s3.k.Qo.getClass();
            s3.i iVar = s3.j.f110798b;
            boolean z16 = sVar.f71265a instanceof i2.f;
            if (!z16) {
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
            tb.f.f0(sVar, u5Var, hVar);
            s3.h hVar2 = s3.j.f110800d;
            tb.f.f0(sVar, o13, hVar2);
            s3.h hVar3 = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
                ep.b.y(i16, sVar, i16, hVar3);
            }
            s3.h hVar4 = s3.j.f110799c;
            tb.f.f0(sVar, X, hVar4);
            u2.i iVar2 = u2.b.f120017e;
            if (function23 != null) {
                sVar.W(69542167);
                u2.q j13 = androidx.compose.ui.layout.a.c("Leading").j(q5.f25110d);
                q3.p0 e13 = p1.q.e(iVar2, false);
                int i17 = sVar.P;
                i2.z1 o14 = sVar.o();
                u2.q X2 = ao2.m0.X(sVar, j13);
                if (!z16) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar.a0();
                kVar = kVar2;
                if (sVar.O) {
                    sVar.n(iVar);
                } else {
                    sVar.j0();
                }
                tb.f.f0(sVar, e13, hVar);
                tb.f.f0(sVar, o14, hVar2);
                if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
                    ep.b.y(i17, sVar, i17, hVar3);
                }
                tb.f.f0(sVar, X2, hVar4);
                function23.invoke(sVar, Integer.valueOf((i14 >> 12) & 14));
                sVar.r(true);
                sVar.r(false);
            } else {
                kVar = kVar2;
                sVar.W(69783378);
                sVar.r(false);
            }
            if (function24 != null) {
                sVar.W(69825941);
                u2.q j14 = androidx.compose.ui.layout.a.c("Trailing").j(q5.f25110d);
                q3.p0 e14 = p1.q.e(iVar2, false);
                int i18 = sVar.P;
                i2.z1 o15 = sVar.o();
                u2.q X3 = ao2.m0.X(sVar, j14);
                if (!z16) {
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
                if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
                    ep.b.y(i18, sVar, i18, hVar3);
                }
                tb.f.f0(sVar, X3, hVar4);
                function24.invoke(sVar, Integer.valueOf((i14 >> 15) & 14));
                sVar.r(true);
                i15 = 0;
                sVar.r(false);
            } else {
                i15 = 0;
                sVar.W(70069074);
                sVar.r(false);
            }
            n4.k kVar3 = kVar;
            float f14 = androidx.compose.foundation.layout.b.f(x0Var, kVar3);
            float e15 = androidx.compose.foundation.layout.b.e(x0Var, kVar3);
            u2.n nVar = u2.n.f120041b;
            if (function23 != null) {
                f14 = ql2.s.a(f14 - q5.f25109c, i15);
            }
            float f15 = f14;
            if (function24 != null) {
                e15 = ql2.s.a(e15 - q5.f25109c, i15);
            }
            u2.q r13 = androidx.compose.foundation.layout.b.r(nVar, f15, 0.0f, e15, 0.0f, 10);
            if (lVar != null) {
                sVar.W(70826807);
                lVar.invoke(androidx.compose.ui.layout.a.c("Hint").j(r13), sVar, Integer.valueOf((i14 >> 6) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER));
                z14 = false;
                sVar.r(false);
            } else {
                z14 = false;
                sVar.W(70914258);
                sVar.r(false);
            }
            u2.i iVar3 = u2.b.f120013a;
            if (function22 != null) {
                sVar.W(70948761);
                u2.q j15 = androidx.compose.ui.layout.a.c("Label").j(r13);
                q3.p0 e16 = p1.q.e(iVar3, false);
                int i19 = sVar.P;
                i2.z1 o16 = sVar.o();
                u2.q X4 = ao2.m0.X(sVar, j15);
                if (!z16) {
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
                if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i19))) {
                    ep.b.y(i19, sVar, i19, hVar3);
                }
                tb.f.f0(sVar, X4, hVar4);
                function22.invoke(sVar, Integer.valueOf((i14 >> 6) & 14));
                sVar.r(true);
                sVar.r(false);
            } else {
                sVar.W(71034290);
                sVar.r(z14);
            }
            u2.q j16 = androidx.compose.ui.layout.a.c("TextField").j(r13);
            q3.p0 e17 = p1.q.e(iVar3, true);
            int i23 = sVar.P;
            i2.z1 o17 = sVar.o();
            u2.q X5 = ao2.m0.X(sVar, j16);
            if (!z16) {
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
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i23))) {
                ep.b.y(i23, sVar, i23, hVar3);
            }
            tb.f.f0(sVar, X5, hVar4);
            function2.invoke(sVar, Integer.valueOf((i14 >> 3) & 14));
            sVar.r(true);
            sVar.r(true);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new r5(qVar, function2, function22, lVar, function23, function24, z13, f13, x0Var, i13);
        }
    }

    public static final int c(int i13, boolean z13, int i14, int i15, int i16, int i17, long j13, float f13, p1.x0 x0Var) {
        float f14 = f25222c * f13;
        float d2 = x0Var.d() * f13;
        float a13 = x0Var.a() * f13;
        int max = Math.max(i13, i17);
        return Math.max(ml2.c.c(z13 ? i14 + f14 + max + a13 : d2 + max + a13), Math.max(Math.max(i15, i16), n4.a.i(j13)));
    }
}
