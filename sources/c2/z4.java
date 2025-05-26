package c2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class z4 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f25465a;

    /* renamed from: c, reason: collision with root package name */
    public static final float f25467c;

    /* renamed from: f, reason: collision with root package name */
    public static final float f25470f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f25471g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f25472h;

    /* renamed from: b, reason: collision with root package name */
    public static final float f25466b = 14;

    /* renamed from: d, reason: collision with root package name */
    public static final float f25468d = 24;

    /* renamed from: e, reason: collision with root package name */
    public static final float f25469e = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final j1.o2 f25473i = new j1.o2(100, (j1.c0) null, 6);

    /* renamed from: j, reason: collision with root package name */
    public static final float f25474j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final float f25475k = 6;

    /* renamed from: l, reason: collision with root package name */
    public static final float f25476l = RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;

    static {
        float f13 = 34;
        f25465a = f13;
        float f14 = 20;
        f25467c = f14;
        f25470f = f13;
        f25471g = f14;
        f25472h = f13 - f14;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r31, kotlin.jvm.functions.Function1 r32, u2.q r33, boolean r34, o1.l r35, c2.l1 r36, i2.o r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.z4.a(boolean, kotlin.jvm.functions.Function1, u2.q, boolean, o1.l, c2.l1, i2.o, int, int):void");
    }

    public static final void b(p1.u uVar, boolean z13, boolean z14, l1 l1Var, Function0 function0, o1.k kVar, i2.o oVar, int i13) {
        int i14;
        am.d dVar;
        long j13;
        u2.n nVar;
        float f13;
        long j14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(70908914);
        if ((i13 & 6) == 0) {
            i14 = (sVar.h(uVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.i(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar.i(z14) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar.h(l1Var) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar.j(function0) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= sVar.h(kVar) ? 131072 : 65536;
        }
        int i15 = i14;
        if ((i15 & 74899) == 74898 && sVar.z()) {
            sVar.Q();
        } else {
            Object J2 = sVar.J();
            am.d dVar2 = i2.n.f71185a;
            if (J2 == dVar2) {
                J2 = new s2.t();
                sVar.g0(J2);
            }
            s2.t tVar = (s2.t) J2;
            int i16 = 1;
            boolean z15 = (i15 & 458752) == 131072;
            Object J3 = sVar.J();
            if (z15 || J3 == dVar2) {
                J3 = new x4(kVar, tVar, null);
                sVar.g0(J3);
            }
            i2.u.e(kVar, (Function2) J3, sVar);
            float f14 = tVar.isEmpty() ^ true ? f25475k : f25474j;
            l1Var.getClass();
            sVar.W(-1176343362);
            i2.q1 K1 = bs1.c.K1(new b3.w(z14 ? z13 ? l1Var.f24915b : l1Var.f24917d : z13 ? l1Var.f24919f : l1Var.f24921h), sVar);
            sVar.r(false);
            u2.n nVar2 = u2.n.f120041b;
            u2.q j15 = uVar.a(nVar2, u2.b.f120017e).j(androidx.compose.foundation.layout.e.f17184c);
            boolean h10 = sVar.h(K1);
            Object J4 = sVar.J();
            if (h10 || J4 == dVar2) {
                J4 = new h2(K1, i16);
                sVar.g0(J4);
            }
            androidx.compose.foundation.a.a(j15, (Function1) J4, sVar, 0);
            sVar.W(-66424183);
            if (z14) {
                dVar = dVar2;
                j13 = z13 ? l1Var.f24914a : l1Var.f24916c;
            } else {
                dVar = dVar2;
                j13 = z13 ? l1Var.f24918e : l1Var.f24920g;
            }
            i2.q1 K12 = bs1.c.K1(new b3.w(j13), sVar);
            sVar.r(false);
            l2 l2Var = (l2) sVar.m(m2.f24958a);
            float f15 = ((n4.e) sVar.m(m2.f24959b)).f89175a + f14;
            if (!b3.w.c(((b3.w) K12.getValue()).f21392a, ((s0) sVar.m(u0.f25271a)).e()) || l2Var == null) {
                nVar = nVar2;
                f13 = f14;
                sVar.W(1478489190);
                sVar.r(false);
                j14 = ((b3.w) K12.getValue()).f21392a;
            } else {
                sVar.W(1478408187);
                nVar = nVar2;
                f13 = f14;
                j14 = ((i1) l2Var).a(((b3.w) K12.getValue()).f21392a, f15, sVar, 0);
                sVar.r(false);
            }
            u2.n nVar3 = nVar;
            i2.v3 a13 = i1.u1.a(j14, null, null, sVar, 0, 14);
            u2.q a14 = uVar.a(nVar3, u2.b.f120016d);
            boolean z16 = (i15 & 57344) == 16384;
            Object J5 = sVar.J();
            if (z16 || J5 == dVar) {
                J5 = new b2(1, function0);
                sVar.g0(J5);
            }
            u2.q f16 = androidx.compose.foundation.layout.e.f(androidx.compose.foundation.d.a(androidx.compose.foundation.layout.b.j(a14, (Function1) J5), kVar, p3.c(f25468d, 0L, sVar, 54, 4)), f25467c);
            v1.h hVar = v1.i.f123828a;
            androidx.compose.foundation.layout.a.a(androidx.compose.foundation.a.b(kh2.m0.Q0(f16, f13, hVar, 24), ((b3.w) a13.getValue()).f21392a, hVar), sVar);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new y4(uVar, z13, z14, l1Var, function0, kVar, i13);
        }
    }
}
