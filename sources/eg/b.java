package eg;

import java.util.List;

/* loaded from: classes3.dex */
public final class b implements dg.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f58844a;

    public b(int i13) {
        this.f58844a = i13;
    }

    @Override // dg.a
    public final boolean a(List list) {
        return list != null && this.f58844a == list.size();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && this.f58844a == ((b) obj).f58844a;
    }

    public final int hashCode() {
        return this.f58844a;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("[DepthGuard: "), this.f58844a, "]");
    }
}
