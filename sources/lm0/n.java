package lm0;

/* loaded from: classes5.dex */
public final class n implements y {

    /* renamed from: a, reason: collision with root package name */
    public final int f83883a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83884b;

    public n(int i13, int i14) {
        this.f83883a = i13;
        this.f83884b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f83883a == nVar.f83883a && this.f83884b == nVar.f83884b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83884b) + (Integer.hashCode(this.f83883a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ItemMoveFinished(oldPosition=");
        sb3.append(this.f83883a);
        sb3.append(", newPosition=");
        return a.a.n(sb3, this.f83884b, ")");
    }
}
