package ia0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import ao2.m0;
import b3.r0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import i2.z1;
import java.util.ArrayList;
import java.util.List;
import kh2.j1;
import kh2.n3;
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
public abstract class l {
    static {
        IntRange intRange = new IntRange(0, 4, 1);
        ArrayList collages = new ArrayList(g0.q(intRange, 10));
        ql2.k it = intRange.iterator();
        while (it.f104109c) {
            it.b();
            collages.add(new q(ra0.d.f106910c, new b((rl1.q) null, bs1.c.h2("Ben Silbermann"), 5)));
        }
        Intrinsics.checkNotNullParameter("Featured Collages", "string");
        f0 title = new f0("Featured Collages");
        Intrinsics.checkNotNullParameter("Our picks for you! Create your own take by remixing one of these popular collages", "string");
        f0 description = new f0("Our picks for you! Create your own take by remixing one of these popular collages");
        Intrinsics.checkNotNullParameter(collages, "collages");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
    }

    public static final void a(i0 i0Var, u2.q qVar, i0 i0Var2, i2.o oVar, int i13, int i14) {
        i0 i0Var3;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1509053188);
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
        sVar.W(-1302103755);
        if (e(i0Var, sVar)) {
            dl2.b.c(new rn1.a(i0Var, vn1.c.DEFAULT, null, null, vn1.g.HEADING_400, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097132), null, null, null, sVar, 8, 14);
        }
        sVar.r(false);
        if (e(i0Var4, sVar)) {
            androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, com.bumptech.glide.d.A(eo1.c.space_100, sVar)), sVar);
            i0Var3 = i0Var4;
            dl2.b.c(new rn1.a(i0Var4, vn1.c.SUBTLE, null, null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097132), null, null, null, sVar, 8, 14);
        } else {
            i0Var3 = i0Var4;
        }
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new d(i0Var, qVar2, i0Var3, i13, i14, 0);
        }
    }

    public static final void b(List collages, u2.q qVar, o0 o0Var, float f13, float f14, Function1 function1, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(collages, "collages");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-735011563);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        o0 b13 = (i14 & 4) != 0 ? s0.b(0, new s1.c(collages, 1), sVar, 3) : o0Var;
        float f15 = (i14 & 8) != 0 ? c.f71946a : f13;
        float f16 = (i14 & 16) != 0 ? c.f71947b : f14;
        Function1 function12 = (i14 & 32) != 0 ? e.f71954i : function1;
        androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.e.b(qVar2, 1.0f), null, false, q2.i.c(1803224703, new g(f15, b13, f16, collages, function12), sVar), sVar, 3072, 6);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new u80.e(collages, qVar2, b13, f15, f16, function12, i13, i14);
        }
    }

    public static final void c(q state, u2.q qVar, float f13, long j13, Function0 function0, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-971361739);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        float f14 = (i14 & 4) != 0 ? 0.5625f : f13;
        long j14 = (i14 & 8) != 0 ? o.f71978a : j13;
        Function0 function02 = (i14 & 16) != 0 ? h.f71963i : function0;
        u2.q b13 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.b.d(qVar2, f14), v1.i.a(com.bumptech.glide.d.A(eo1.c.rounding_300, sVar)));
        sVar.W(527296739);
        Object J2 = sVar.J();
        if (J2 == i2.n.f71185a) {
            J2 = d7.g.o(sVar);
        }
        sVar.r(false);
        u2.q d2 = androidx.compose.foundation.a.d(b13, (o1.l) J2, null, false, null, function02, 28);
        p0 e13 = p1.q.e(u2.b.f120013a, false);
        int i16 = sVar.P;
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
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
        boolean booleanValue = ((Boolean) sVar.m(v2.f116235a)).booleanValue();
        r0 r0Var = b3.s0.f21349a;
        if (booleanValue) {
            sVar.W(897245409);
            p1.q.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.f17184c, b3.w.f21384h, r0Var), sVar, 6);
            sVar.r(false);
        } else {
            sVar.W(897417831);
            kh2.n.e(state.f71984a.f106912b, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.f17184c, b3.w.f21380d, r0Var), sVar, 56, 0);
            sVar.r(false);
        }
        sVar.W(860240380);
        if (!b3.w.c(j14, b3.w.f21389m) && b3.w.d(j14) > 0.0f) {
            p1.q.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.f17184c, j14, r0Var), sVar, 0);
        }
        sVar.r(false);
        if (!state.f71985b.e(sVar)) {
            n3.d(state.f71985b, androidx.compose.foundation.layout.b.o(cVar.a(nVar, u2.b.f120019g), 6, 8), 0L, sVar, 8, 4);
        }
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new i(state, qVar2, f14, j14, function02, i13, i14, 0);
        }
    }

    public static final void d(m state, u2.q qVar, Function1 function1, i2.o oVar, int i13, int i14) {
        s3.h hVar;
        s3.h hVar2;
        s3.h hVar3;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1461922255);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        Function1 function12 = (i14 & 4) != 0 ? j.f71972i : function1;
        int size = state.f71975a.size();
        int min = Math.min(1, size);
        sVar.W(-1858261079);
        boolean f13 = sVar.f(size);
        Object J2 = sVar.J();
        if (f13 || J2 == i2.n.f71185a) {
            J2 = new k(size, 0);
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
        s3.h hVar4 = s3.j.f110801e;
        tb.f.f0(sVar, a13, hVar4);
        s3.h hVar5 = s3.j.f110800d;
        tb.f.f0(sVar, o14, hVar5);
        s3.h hVar6 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar6);
        }
        s3.h hVar7 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar7);
        boolean e13 = e(state.f71976b, sVar);
        boolean e14 = e(state.f71977c, sVar);
        sVar.W(-276621566);
        if (e13 || e14) {
            float A = com.bumptech.glide.d.A(eo1.c.space_400, sVar);
            hVar = hVar7;
            hVar2 = hVar6;
            hVar3 = hVar5;
            a(state.f71976b, androidx.compose.foundation.layout.b.r(nVar, A, 0.0f, A, A, 2), state.f71977c, sVar, 520, 0);
        } else {
            hVar = hVar7;
            hVar2 = hVar6;
            hVar3 = hVar5;
        }
        sVar.r(false);
        b(state.f71975a, null, b13, 0.0f, 0.0f, function12, sVar, ((i13 << 9) & 458752) | 8, 26);
        androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, com.bumptech.glide.d.A(eo1.c.space_500, sVar)), sVar);
        u2.q j13 = androidx.compose.foundation.layout.e.c(nVar, com.bumptech.glide.d.A(eo1.c.space_200, sVar)).j(new HorizontalAlignElement(u2.b.f120026n));
        p0 e15 = p1.q.e(u2.b.f120013a, false);
        int i17 = sVar.P;
        z1 o15 = sVar.o();
        u2.q X2 = m0.X(sVar, j13);
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
        tb.f.f0(sVar, e15, hVar4);
        tb.f.f0(sVar, o15, hVar3);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar2);
        }
        tb.f.f0(sVar, X2, hVar);
        j1.l(size, b13, null, 0L, 0.0f, 0.0f, 0.0f, 0.0f, sVar, 0, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
        sVar.r(true);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 17, state, qVar2, function12);
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
            r0 = 179180535(0xaae13f7, float:1.67631E-32)
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
        throw new UnsupportedOperationException("Method not decompiled: ia0.l.e(u50.i0, i2.o):boolean");
    }
}
