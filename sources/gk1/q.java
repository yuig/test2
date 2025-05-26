package gk1;

/* loaded from: classes2.dex */
public final class q implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65255a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65256b;

    public q(boolean z13, boolean z14) {
        this.f65255a = z13;
        this.f65256b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f65255a == qVar.f65255a && this.f65256b == qVar.f65256b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65256b) + (Boolean.hashCode(this.f65255a) * 31);
    }

    public final boolean j() {
        return this.f65256b;
    }

    public final boolean k() {
        return this.f65255a;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ButtonOverlayVisibilityChanged(isVisible=");
        sb3.append(this.f65255a);
        sb3.append(", saveOverlayVisibility=");
        return a.a.r(sb3, this.f65256b, ")");
    }
}
