package c2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class o4 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f25042a = 30;

    /* renamed from: b, reason: collision with root package name */
    public static final float f25043b = 16;

    /* renamed from: c, reason: collision with root package name */
    public static final float f25044c = 6;

    /* renamed from: d, reason: collision with root package name */
    public static final float f25045d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final float f25046e = 48;

    /* renamed from: f, reason: collision with root package name */
    public static final float f25047f = 68;

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(u2.q r16, boolean r17, b3.x0 r18, long r19, long r21, long r23, float r25, i2.o r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.o4.a(u2.q, boolean, b3.x0, long, long, long, float, i2.o, int, int):void");
    }

    public static final void b(Function2 function2, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(917397959);
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(function2) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i15 = 1;
        if ((i14 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            n4 n4Var = n4.f25009a;
            u2.n nVar = u2.n.f120041b;
            int i16 = sVar.P;
            i2.z1 o13 = sVar.o();
            u2.q X = ao2.m0.X(sVar, nVar);
            s3.k.Qo.getClass();
            s3.i iVar = s3.j.f110798b;
            boolean z13 = sVar.f71265a instanceof i2.f;
            if (!z13) {
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
            tb.f.f0(sVar, n4Var, hVar);
            s3.h hVar2 = s3.j.f110800d;
            tb.f.f0(sVar, o13, hVar2);
            s3.h hVar3 = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
                ep.b.y(i16, sVar, i16, hVar3);
            }
            s3.h hVar4 = s3.j.f110799c;
            tb.f.f0(sVar, X, hVar4);
            u2.q o14 = androidx.compose.foundation.layout.b.o(nVar, f25043b, f25044c);
            q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
            int i17 = sVar.P;
            i2.z1 o15 = sVar.o();
            u2.q X2 = ao2.m0.X(sVar, o14);
            if (!z13) {
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
            tb.f.f0(sVar, o15, hVar2);
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
                ep.b.y(i17, sVar, i17, hVar3);
            }
            tb.f.f0(sVar, X2, hVar4);
            function2.invoke(sVar, Integer.valueOf(i14 & 14));
            sVar.r(true);
            sVar.r(true);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new b3(function2, i13, i15);
        }
    }
}
