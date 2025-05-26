package mu;

/* loaded from: classes3.dex */
public final class e implements m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f88198a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f88199b;

    public e(boolean z13, boolean z14) {
        this.f88198a = z13;
        this.f88199b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f88198a == eVar.f88198a && this.f88199b == eVar.f88199b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88199b) + (Boolean.hashCode(this.f88198a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnActivate(isSideSwipe=");
        sb3.append(this.f88198a);
        sb3.append(", bottomToolBarEnabled=");
        return a.a.r(sb3, this.f88199b, ")");
    }
}
