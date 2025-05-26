package lm0;

/* loaded from: classes5.dex */
public final class o implements y {

    /* renamed from: a, reason: collision with root package name */
    public final int f83887a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83888b;

    public o(int i13, int i14) {
        this.f83887a = i13;
        this.f83888b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f83887a == oVar.f83887a && this.f83888b == oVar.f83888b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83888b) + (Integer.hashCode(this.f83887a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ItemMoveInProgress(fromPosition=");
        sb3.append(this.f83887a);
        sb3.append(", toPosition=");
        return a.a.n(sb3, this.f83888b, ")");
    }
}
