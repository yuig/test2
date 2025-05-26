package h62;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f67848a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67849b;

    public l(int i13, int i14) {
        this.f67848a = i13;
        this.f67849b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f67848a == lVar.f67848a && this.f67849b == lVar.f67849b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67849b) + (Integer.hashCode(this.f67848a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EditHistoryState(undoSize=");
        sb3.append(this.f67848a);
        sb3.append(", redoSize=");
        return a.a.n(sb3, this.f67849b, ")");
    }
}
