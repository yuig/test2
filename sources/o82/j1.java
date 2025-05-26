package o82;

/* loaded from: classes4.dex */
public final class j1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f93635a;

    /* renamed from: b, reason: collision with root package name */
    public final int f93636b;

    public j1(int i13, int i14) {
        this.f93635a = i13;
        this.f93636b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f93635a == j1Var.f93635a && this.f93636b == j1Var.f93636b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93636b) + (Integer.hashCode(this.f93635a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Move(fromPosition=");
        sb3.append(this.f93635a);
        sb3.append(", toPosition=");
        return a.a.n(sb3, this.f93636b, ")");
    }
}
