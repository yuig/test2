package ha2;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f68476a;

    public w(int i13) {
        this.f68476a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f68476a == ((w) obj).f68476a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68476a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ExtraLabel(textResId="), this.f68476a, ")");
    }
}
