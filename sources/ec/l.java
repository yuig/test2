package ec;

/* loaded from: classes3.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public final k f58314a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58315b;

    public l(String str, k kVar, boolean z13) {
        this.f58314a = kVar;
        this.f58315b = z13;
    }

    @Override // ec.b
    public final yb.c a(com.airbnb.lottie.v vVar, com.airbnb.lottie.h hVar, fc.c cVar) {
        if (vVar.f28458m) {
            return new yb.m(this);
        }
        jc.b.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f58314a + '}';
    }
}
