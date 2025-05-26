package pg0;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f100050a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f100051b;

    public a0(boolean z13, boolean z14) {
        this.f100050a = z13;
        this.f100051b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f100050a == a0Var.f100050a && this.f100051b == a0Var.f100051b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100051b) + (Boolean.hashCode(this.f100050a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ModifyContactContainerRowEvent(shouldShow=");
        sb3.append(this.f100050a);
        sb3.append(", isFixedHeightContainer=");
        return a.a.r(sb3, this.f100051b, ")");
    }
}
