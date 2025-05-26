package lr;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f84509a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84510b;

    public f0() {
        int i13 = sk1.c.post_follow_toast_message;
        this.f84509a = 5000;
        this.f84510b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f84509a == f0Var.f84509a && this.f84510b == f0Var.f84510b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84510b) + (Integer.hashCode(this.f84509a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserFollowToastConfig(toastDuration=");
        sb3.append(this.f84509a);
        sb3.append(", toastMessageRes=");
        return a.a.n(sb3, this.f84510b, ")");
    }
}
