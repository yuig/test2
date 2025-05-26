package ec;

import a.cb;

/* loaded from: classes.dex */
public final class t implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f58346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58347b;

    /* renamed from: c, reason: collision with root package name */
    public final dc.a f58348c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58349d;

    public t(String str, int i13, dc.a aVar, boolean z13) {
        this.f58346a = str;
        this.f58347b = i13;
        this.f58348c = aVar;
        this.f58349d = z13;
    }

    @Override // ec.b
    public final yb.c a(com.airbnb.lottie.v vVar, com.airbnb.lottie.h hVar, fc.c cVar) {
        return new yb.t(vVar, cVar, this);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShapePath{name=");
        sb3.append(this.f58346a);
        sb3.append(", index=");
        return cb.l(sb3, this.f58347b, '}');
    }
}
