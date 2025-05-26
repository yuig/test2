package x31;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f131620a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f131621b;

    public e(int i13, boolean z13) {
        this.f131620a = i13;
        this.f131621b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f131620a == eVar.f131620a && this.f131621b == eVar.f131621b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131621b) + (Integer.hashCode(this.f131620a) * 31);
    }

    public final String toString() {
        return "FilterEnabled(id=" + this.f131620a + ", enable=" + this.f131621b + ")";
    }
}
