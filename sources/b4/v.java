package b4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f21664a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21665b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21666c;

    /* renamed from: d, reason: collision with root package name */
    public final m4.q f21667d;

    /* renamed from: e, reason: collision with root package name */
    public final x f21668e;

    /* renamed from: f, reason: collision with root package name */
    public final m4.g f21669f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21670g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21671h;

    /* renamed from: i, reason: collision with root package name */
    public final m4.r f21672i;

    public v(int i13, int i14, long j13, m4.q qVar, x xVar, m4.g gVar, int i15, int i16, m4.r rVar) {
        this.f21664a = i13;
        this.f21665b = i14;
        this.f21666c = j13;
        this.f21667d = qVar;
        this.f21668e = xVar;
        this.f21669f = gVar;
        this.f21670g = i15;
        this.f21671h = i16;
        this.f21672i = rVar;
        if (n4.m.a(j13, n4.m.f89189c) || n4.m.c(j13) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + n4.m.c(j13) + ')').toString());
    }

    public final v a(v vVar) {
        if (vVar == null) {
            return this;
        }
        return w.a(this, vVar.f21664a, vVar.f21665b, vVar.f21666c, vVar.f21667d, vVar.f21668e, vVar.f21669f, vVar.f21670g, vVar.f21671h, vVar.f21672i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return m4.j.a(this.f21664a, vVar.f21664a) && m4.l.a(this.f21665b, vVar.f21665b) && n4.m.a(this.f21666c, vVar.f21666c) && Intrinsics.d(this.f21667d, vVar.f21667d) && Intrinsics.d(this.f21668e, vVar.f21668e) && Intrinsics.d(this.f21669f, vVar.f21669f) && this.f21670g == vVar.f21670g && m4.d.a(this.f21671h, vVar.f21671h) && Intrinsics.d(this.f21672i, vVar.f21672i);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f21665b, Integer.hashCode(this.f21664a) * 31, 31);
        n4.n[] nVarArr = n4.m.f89188b;
        int c13 = a.a.c(this.f21666c, b13, 31);
        m4.q qVar = this.f21667d;
        int hashCode = (c13 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        x xVar = this.f21668e;
        int hashCode2 = (hashCode + (xVar != null ? xVar.hashCode() : 0)) * 31;
        m4.g gVar = this.f21669f;
        int b14 = ep.b.b(this.f21671h, ep.b.b(this.f21670g, (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31), 31);
        m4.r rVar = this.f21672i;
        return b14 + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) m4.j.b(this.f21664a)) + ", textDirection=" + ((Object) m4.l.b(this.f21665b)) + ", lineHeight=" + ((Object) n4.m.d(this.f21666c)) + ", textIndent=" + this.f21667d + ", platformStyle=" + this.f21668e + ", lineHeightStyle=" + this.f21669f + ", lineBreak=" + ((Object) m4.e.a(this.f21670g)) + ", hyphens=" + ((Object) m4.d.b(this.f21671h)) + ", textMotion=" + this.f21672i + ')';
    }
}
