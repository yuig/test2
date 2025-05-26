package o6;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f92932a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92933b;

    public i(int i13, int i14) {
        this.f92932a = i13;
        this.f92933b = i14;
    }

    public final int a() {
        return this.f92933b - this.f92932a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f92933b == iVar.f92933b && this.f92932a == iVar.f92932a;
    }

    public final int hashCode() {
        return (this.f92932a * 31) + this.f92933b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(this.f92932a);
        sb3.append(", ");
        return a.a.n(sb3, this.f92933b, "]");
    }
}
