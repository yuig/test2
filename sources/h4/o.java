package h4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: g, reason: collision with root package name */
    public static final o f67597g = new o(false, 0, true, 1, 1, i4.c.f71503c);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f67598a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67599b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f67600c;

    /* renamed from: d, reason: collision with root package name */
    public final int f67601d;

    /* renamed from: e, reason: collision with root package name */
    public final int f67602e;

    /* renamed from: f, reason: collision with root package name */
    public final i4.c f67603f;

    public o(boolean z13, int i13, boolean z14, int i14, int i15, i4.c cVar) {
        this.f67598a = z13;
        this.f67599b = i13;
        this.f67600c = z14;
        this.f67601d = i14;
        this.f67602e = i15;
        this.f67603f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f67598a != oVar.f67598a || !r.a(this.f67599b, oVar.f67599b) || this.f67600c != oVar.f67600c || !s.a(this.f67601d, oVar.f67601d) || !n.a(this.f67602e, oVar.f67602e)) {
            return false;
        }
        oVar.getClass();
        return Intrinsics.d(null, null) && Intrinsics.d(this.f67603f, oVar.f67603f);
    }

    public final int hashCode() {
        return this.f67603f.f71504a.hashCode() + ep.b.b(this.f67602e, ep.b.b(this.f67601d, ep.b.e(this.f67600c, ep.b.b(this.f67599b, Boolean.hashCode(this.f67598a) * 31, 31), 31), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f67598a + ", capitalization=" + ((Object) r.b(this.f67599b)) + ", autoCorrect=" + this.f67600c + ", keyboardType=" + ((Object) s.b(this.f67601d)) + ", imeAction=" + ((Object) n.b(this.f67602e)) + ", platformImeOptions=null, hintLocales=" + this.f67603f + ')';
    }
}
