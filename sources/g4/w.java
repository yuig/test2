package g4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final e f63479a;

    /* renamed from: b, reason: collision with root package name */
    public final l f63480b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63481c;

    /* renamed from: d, reason: collision with root package name */
    public final int f63482d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f63483e;

    public w(e eVar, l lVar, int i13, int i14, Object obj) {
        this.f63479a = eVar;
        this.f63480b = lVar;
        this.f63481c = i13;
        this.f63482d = i14;
        this.f63483e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f63479a, wVar.f63479a) && Intrinsics.d(this.f63480b, wVar.f63480b) && j.a(this.f63481c, wVar.f63481c) && k.a(this.f63482d, wVar.f63482d) && Intrinsics.d(this.f63483e, wVar.f63483e);
    }

    public final int hashCode() {
        e eVar = this.f63479a;
        int b13 = ep.b.b(this.f63482d, ep.b.b(this.f63481c, (((eVar == null ? 0 : eVar.hashCode()) * 31) + this.f63480b.f63474a) * 31, 31), 31);
        Object obj = this.f63483e;
        return b13 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb3.append(this.f63479a);
        sb3.append(", fontWeight=");
        sb3.append(this.f63480b);
        sb3.append(", fontStyle=");
        int i13 = this.f63481c;
        sb3.append((Object) (j.a(i13, 0) ? "Normal" : j.a(i13, 1) ? "Italic" : "Invalid"));
        sb3.append(", fontSynthesis=");
        sb3.append((Object) k.b(this.f63482d));
        sb3.append(", resourceLoaderCacheKey=");
        sb3.append(this.f63483e);
        sb3.append(')');
        return sb3.toString();
    }
}
