package ao2;

/* loaded from: classes2.dex */
public final class z0 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20243a;

    public z0(boolean z13) {
        this.f20243a = z13;
    }

    @Override // ao2.l1
    public final f2 b() {
        return null;
    }

    @Override // ao2.l1
    public final boolean isActive() {
        return this.f20243a;
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("Empty{"), this.f20243a ? "Active" : "New", '}');
    }
}
