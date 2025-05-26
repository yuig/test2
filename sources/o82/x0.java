package o82;

/* loaded from: classes4.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f93744a;

    /* renamed from: b, reason: collision with root package name */
    public final int f93745b;

    public x0(int i13, int i14) {
        this.f93744a = i13;
        this.f93745b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f93744a == x0Var.f93744a && this.f93745b == x0Var.f93745b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93745b) + (Integer.hashCode(this.f93744a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SectionAndPosition(sectionIndex=");
        sb3.append(this.f93744a);
        sb3.append(", positionInSection=");
        return a.a.n(sb3, this.f93745b, ")");
    }
}
