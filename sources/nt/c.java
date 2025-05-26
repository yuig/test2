package nt;

/* loaded from: classes3.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f91994a;

    public c(int i13) {
        this.f91994a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f91994a == ((c) obj).f91994a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91994a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("DefaultGender(idGenderString="), this.f91994a, ")");
    }
}
