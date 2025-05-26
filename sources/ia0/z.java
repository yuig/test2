package ia0;

import ao2.m0;
import b3.r0;
import i2.f2;
import i2.z1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import q3.p0;
import s1.o0;
import s1.s0;
import t3.v2;
import u50.f0;
import u50.h0;
import u50.i0;

/* loaded from: classes5.dex */
public abstract class z {
    static {
        IntRange intRange = new IntRange(0, 4, 1);
        ArrayList collages = new ArrayList(g0.q(intRange, 10));
        ql2.k it = intRange.iterator();
        while (it.f104109c) {
            it.b();
            ra0.d dVar = ra0.d.f106910c;
            Intrinsics.checkNotNullParameter("Ben Silbermann", "string");
            collages.add(new q(dVar, new b((rl1.q) null, new f0("Ben Silbermann"), 5)));
        }
        Intrinsics.checkNotNullParameter("Featured Collages", "string");
        f0 title = new f0("Featured Collages");
        Intrinsics.checkNotNullParameter("Our picks for you! Create your own take by remixing one of these popular collages", "string");
        f0 description = new f0("Our picks for you! Create your own take by remixing one of these popular collages");
        Intrinsics.checkNotNullParameter(collages, "collages");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
    }

    public static final void a(m state, u2.q qVar, Function1 function1, Function1 function12, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1481064412);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        Function1 function13 = (i14 & 4) != 0 ? s.f71988i : function1;
        Function1 function14 = (i14 & 8) != 0 ? t.f71989i : function12;
        int size = state.f71975a.size();
        int min = Math.min(1, size);
        sVar.W(-1949591741);
        boolean f13 = sVar.f(size);
        Object J2 = sVar.J();
        if (f13 || J2 == i2.n.f71185a) {
            J2 = new k(size, 1);
            sVar.g0(J2);
        }
        sVar.r(false);
        s1.e b13 = s0.b(min, (Function0) J2, sVar, 2);
        u2.q o13 = androidx.compose.foundation.layout.e.o(androidx.compose.foundation.layout.e.b(qVar2, 1.0f));
        p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar, 0);
        int i16 = sVar.P;
        z1 o14 = sVar.o();
        u2.q X = m0.X(sVar, o13);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o14, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        boolean e13 = e(state.f71976b, sVar);
        boolean e14 = e(state.f71977c, sVar);
        sVar.W(1944463268);
        if (e13 || e14) {
            float A = com.bumptech.glide.d.A(eo1.c.space_400, sVar);
            c(state.f71976b, androidx.compose.foundation.layout.b.r(nVar, A, 0.0f, A, A, 2), state.f71977c, sVar, 520, 0);
        }
        sVar.r(false);
        int i17 = i13 << 9;
        d(state.f71975a, null, b13, 0.0f, 0.0f, function13, function14, sVar, (458752 & i17) | 8 | (i17 & 3670016), 26);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((u50.o) state, qVar2, (Object) function13, (Object) function14, i13, i14, 13);
        }
    }

    public static final void b(q state, u2.q qVar, float f13, long j13, Function0 function0, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1147683294);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        float f14 = (i14 & 4) != 0 ? 0.5625f : f13;
        long j14 = (i14 & 8) != 0 ? o.f71978a : j13;
        Function0 function02 = (i14 & 16) != 0 ? u.f71990i : function0;
        u2.q b13 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.b.d(qVar2, f14), v1.i.a(com.bumptech.glide.d.A(eo1.c.rounding_300, sVar)));
        sVar.W(-1979376744);
        Object J2 = sVar.J();
        if (J2 == i2.n.f71185a) {
            J2 = d7.g.o(sVar);
        }
        sVar.r(false);
        u2.q d2 = androidx.compose.foundation.a.d(b13, (o1.l) J2, null, false, null, function02, 28);
        p0 e13 = p1.q.e(u2.b.f120013a, false);
        int i15 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = m0.X(sVar, d2);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, e13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
            ep.b.y(i15, sVar, i15, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        boolean booleanValue = ((Boolean) sVar.m(v2.f116235a)).booleanValue();
        r0 r0Var = b3.s0.f21349a;
        if (booleanValue) {
            sVar.W(2097912908);
            p1.q.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.f17184c, b3.w.f21384h, r0Var), sVar, 6);
            sVar.r(false);
        } else {
            sVar.W(2098085330);
            kh2.n.e(state.f71984a.f106912b, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.f17184c, b3.w.f21380d, r0Var), sVar, 56, 0);
            sVar.r(false);
        }
        if (!b3.w.c(j14, b3.w.f21389m) && b3.w.d(j14) > 0.0f) {
            p1.q.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.f17184c, j14, r0Var), sVar, 0);
        }
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new i(state, qVar2, f14, j14, function02, i13, i14, 1);
        }
    }

    public static final void c(i0 i0Var, u2.q qVar, i0 i0Var2, i2.o oVar, int i13, int i14) {
        i0 i0Var3;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(970423632);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        i0 i0Var4 = (i14 & 4) != 0 ? h0.f120562a : i0Var2;
        p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar, 0);
        int i16 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = m0.X(sVar, qVar2);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        sVar.W(1444688751);
        if (e(i0Var, sVar)) {
            dl2.b.c(new rn1.a(i0Var, vn1.c.DEFAULT, null, null, vn1.g.HEADING_300, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097132), null, null, null, sVar, 8, 14);
        }
        sVar.r(false);
        if (e(i0Var4, sVar)) {
            androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, com.bumptech.glide.d.A(eo1.c.space_100, sVar)), sVar);
            i0Var3 = i0Var4;
            dl2.b.c(new rn1.a(i0Var4, vn1.c.SUBTLE, null, null, vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097132), null, null, null, sVar, 8, 14);
        } else {
            i0Var3 = i0Var4;
        }
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new d(i0Var, qVar2, i0Var3, i13, i14, 1);
        }
    }

    public static final void d(List collages, u2.q qVar, o0 o0Var, float f13, float f14, Function1 function1, Function1 function12, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(collages, "collages");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1405224670);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        o0 b13 = (i14 & 4) != 0 ? s0.b(0, new s1.c(collages, 2), sVar, 3) : o0Var;
        float f15 = (i14 & 8) != 0 ? r.f71986a : f13;
        float f16 = (i14 & 16) != 0 ? r.f71987b : f14;
        Function1 function13 = (i14 & 32) != 0 ? v.f71991i : function1;
        Function1 function14 = (i14 & 64) != 0 ? w.f71992i : function12;
        androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.e.b(qVar2, 1.0f), null, false, q2.i.c(1450709516, new x(f15, b13, f16, collages, function13, function14), sVar), sVar, 3072, 6);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new y(collages, qVar2, b13, f15, f16, function13, function14, i13, i14);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if ((!kotlin.text.z.j((java.lang.CharSequence) dl2.b.u2(r2, r3))) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e(u50.i0 r2, i2.o r3) {
        /*
            i2.s r3 = (i2.s) r3
            r0 = -427622627(0xffffffffe682ff1d, float:-3.0930683E23)
            r3.W(r0)
            u50.h0 r0 = u50.h0.f120562a
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r2, r0)
            r1 = 0
            if (r0 != 0) goto L20
            java.lang.Object r2 = dl2.b.u2(r2, r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.z.j(r2)
            r0 = 1
            r2 = r2 ^ r0
            if (r2 == 0) goto L20
            goto L21
        L20:
            r0 = r1
        L21:
            r3.r(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.z.e(u50.i0, i2.o):boolean");
    }
}
