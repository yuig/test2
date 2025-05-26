package wn1;

/* loaded from: classes5.dex */
public final class w extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f130587b;

    public w(int i13) {
        super(i13);
        this.f130587b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f130587b == ((w) obj).f130587b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130587b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130587b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("SecondaryIconClick(id="), this.f130587b, ")");
    }
}
