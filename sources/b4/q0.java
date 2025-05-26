package b4;

import b3.w0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f21647d = new q0(0, 0, null, 0, null, 0, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final g0 f21648a;

    /* renamed from: b, reason: collision with root package name */
    public final v f21649b;

    /* renamed from: c, reason: collision with root package name */
    public final z f21650c;

    public q0(long j13, long j14, g4.l lVar, long j15, m4.k kVar, int i13, long j16, int i14) {
        this(new g0((i14 & 1) != 0 ? b3.w.f21390n : j13, (i14 & 2) != 0 ? n4.m.f89189c : j14, (i14 & 4) != 0 ? null : lVar, (g4.j) null, (g4.k) null, (g4.e) null, (String) null, (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? n4.m.f89189c : j15, (m4.a) null, (m4.p) null, (i4.c) null, b3.w.f21390n, (i14 & 4096) != 0 ? null : kVar, (w0) null, (y) null, (d3.i) null), new v((32768 & i14) != 0 ? Integer.MIN_VALUE : i13, Integer.MIN_VALUE, (i14 & 131072) != 0 ? n4.m.f89189c : j16, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    public static q0 a(int i13, int i14, long j13, long j14, long j15, long j16, z zVar, q0 q0Var, g4.e eVar, g4.l lVar, m4.g gVar) {
        i4.c cVar;
        int i15;
        long j17;
        long j18;
        m4.o cVar2;
        long b13 = (i14 & 1) != 0 ? q0Var.f21648a.f21575a.b() : j13;
        long j19 = (i14 & 2) != 0 ? q0Var.f21648a.f21576b : j14;
        g4.l lVar2 = (i14 & 4) != 0 ? q0Var.f21648a.f21577c : lVar;
        g0 g0Var = q0Var.f21648a;
        g4.j jVar = g0Var.f21578d;
        g4.k kVar = g0Var.f21579e;
        g4.e eVar2 = (i14 & 32) != 0 ? g0Var.f21580f : eVar;
        String str = g0Var.f21581g;
        long j23 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? g0Var.f21582h : j15;
        m4.a aVar = g0Var.f21583i;
        m4.p pVar = g0Var.f21584j;
        i4.c cVar3 = g0Var.f21585k;
        long j24 = j23;
        long j25 = g0Var.f21586l;
        m4.k kVar2 = g0Var.f21587m;
        w0 w0Var = g0Var.f21588n;
        d3.i iVar = g0Var.f21590p;
        if ((i14 & 32768) != 0) {
            cVar = cVar3;
            i15 = q0Var.f21649b.f21664a;
        } else {
            cVar = cVar3;
            i15 = i13;
        }
        v vVar = q0Var.f21649b;
        int i16 = vVar.f21665b;
        if ((i14 & 131072) != 0) {
            j17 = j25;
            j18 = vVar.f21666c;
        } else {
            j17 = j25;
            j18 = j16;
        }
        m4.q qVar = vVar.f21667d;
        z zVar2 = (524288 & i14) != 0 ? q0Var.f21650c : zVar;
        m4.g gVar2 = (i14 & 1048576) != 0 ? vVar.f21669f : gVar;
        int i17 = vVar.f21670g;
        m4.g gVar3 = gVar2;
        int i18 = vVar.f21671h;
        m4.r rVar = vVar.f21672i;
        if (b3.w.c(b13, g0Var.f21575a.b())) {
            cVar2 = g0Var.f21575a;
        } else {
            cVar2 = b13 != 16 ? new m4.c(b13) : m4.m.f85803a;
        }
        return new q0(new g0(cVar2, j19, lVar2, jVar, kVar, eVar2, str, j24, aVar, pVar, cVar, j17, kVar2, w0Var, zVar2 != null ? zVar2.f21679a : null, iVar), new v(i15, i16, j18, qVar, zVar2 != null ? zVar2.f21680b : null, gVar3, i17, i18, rVar), zVar2);
    }

    public static q0 f(int i13, int i14, long j13, long j14, long j15, long j16, q0 q0Var, g4.e eVar, g4.j jVar, g4.l lVar, m4.k kVar) {
        long j17 = (i14 & 1) != 0 ? b3.w.f21390n : j13;
        long j18 = (i14 & 2) != 0 ? n4.m.f89189c : j14;
        g4.l lVar2 = (i14 & 4) != 0 ? null : lVar;
        g4.j jVar2 = (i14 & 8) != 0 ? null : jVar;
        g4.e eVar2 = (i14 & 32) != 0 ? null : eVar;
        long j19 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? n4.m.f89189c : j15;
        long j23 = b3.w.f21390n;
        m4.k kVar2 = (i14 & 4096) != 0 ? null : kVar;
        int i15 = (32768 & i14) != 0 ? Integer.MIN_VALUE : i13;
        long j24 = (i14 & 131072) != 0 ? n4.m.f89189c : j16;
        g0 a13 = h0.a(q0Var.f21648a, j17, null, Float.NaN, j18, lVar2, jVar2, null, eVar2, null, j19, null, null, null, j23, kVar2, null, null, null);
        v a14 = w.a(q0Var.f21649b, i15, Integer.MIN_VALUE, j24, null, null, null, 0, Integer.MIN_VALUE, null);
        return (q0Var.f21648a == a13 && q0Var.f21649b == a14) ? q0Var : new q0(a13, a14);
    }

    public final long b() {
        return this.f21648a.f21575a.b();
    }

    public final long c() {
        return this.f21648a.f21576b;
    }

    public final boolean d(q0 q0Var) {
        if (this != q0Var) {
            if (!Intrinsics.d(this.f21649b, q0Var.f21649b) || !this.f21648a.a(q0Var.f21648a)) {
                return false;
            }
        }
        return true;
    }

    public final q0 e(q0 q0Var) {
        return (q0Var == null || Intrinsics.d(q0Var, f21647d)) ? this : new q0(this.f21648a.c(q0Var.f21648a), this.f21649b.a(q0Var.f21649b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.f21648a, q0Var.f21648a) && Intrinsics.d(this.f21649b, q0Var.f21649b) && Intrinsics.d(this.f21650c, q0Var.f21650c);
    }

    public final int hashCode() {
        int hashCode = (this.f21649b.hashCode() + (this.f21648a.hashCode() * 31)) * 31;
        z zVar = this.f21650c;
        return hashCode + (zVar != null ? zVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextStyle(color=");
        sb3.append((Object) b3.w.i(b()));
        sb3.append(", brush=");
        g0 g0Var = this.f21648a;
        sb3.append(g0Var.f21575a.c());
        sb3.append(", alpha=");
        sb3.append(g0Var.f21575a.a());
        sb3.append(", fontSize=");
        sb3.append((Object) n4.m.d(g0Var.f21576b));
        sb3.append(", fontWeight=");
        sb3.append(g0Var.f21577c);
        sb3.append(", fontStyle=");
        sb3.append(g0Var.f21578d);
        sb3.append(", fontSynthesis=");
        sb3.append(g0Var.f21579e);
        sb3.append(", fontFamily=");
        sb3.append(g0Var.f21580f);
        sb3.append(", fontFeatureSettings=");
        sb3.append(g0Var.f21581g);
        sb3.append(", letterSpacing=");
        sb3.append((Object) n4.m.d(g0Var.f21582h));
        sb3.append(", baselineShift=");
        sb3.append(g0Var.f21583i);
        sb3.append(", textGeometricTransform=");
        sb3.append(g0Var.f21584j);
        sb3.append(", localeList=");
        sb3.append(g0Var.f21585k);
        sb3.append(", background=");
        jq.b.t(g0Var.f21586l, sb3, ", textDecoration=");
        sb3.append(g0Var.f21587m);
        sb3.append(", shadow=");
        sb3.append(g0Var.f21588n);
        sb3.append(", drawStyle=");
        sb3.append(g0Var.f21590p);
        sb3.append(", textAlign=");
        v vVar = this.f21649b;
        sb3.append((Object) m4.j.b(vVar.f21664a));
        sb3.append(", textDirection=");
        sb3.append((Object) m4.l.b(vVar.f21665b));
        sb3.append(", lineHeight=");
        sb3.append((Object) n4.m.d(vVar.f21666c));
        sb3.append(", textIndent=");
        sb3.append(vVar.f21667d);
        sb3.append(", platformStyle=");
        sb3.append(this.f21650c);
        sb3.append(", lineHeightStyle=");
        sb3.append(vVar.f21669f);
        sb3.append(", lineBreak=");
        sb3.append((Object) m4.e.a(vVar.f21670g));
        sb3.append(", hyphens=");
        sb3.append((Object) m4.d.b(vVar.f21671h));
        sb3.append(", textMotion=");
        sb3.append(vVar.f21672i);
        sb3.append(')');
        return sb3.toString();
    }

    public q0(g0 g0Var, v vVar, z zVar) {
        this.f21648a = g0Var;
        this.f21649b = vVar;
        this.f21650c = zVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q0(b4.g0 r4, b4.v r5) {
        /*
            r3 = this;
            b4.y r0 = r4.f21589o
            b4.x r1 = r5.f21668e
            if (r0 != 0) goto La
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            b4.z r2 = new b4.z
            r2.<init>(r0, r1)
            r0 = r2
        L10:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.q0.<init>(b4.g0, b4.v):void");
    }
}
