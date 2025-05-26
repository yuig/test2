package nj1;

import jj1.d;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f90975a;

    public a(int i13) {
        this.f90975a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f90975a == ((a) obj).f90975a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90975a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("DeleteIdeaPinDisplayState(cornerRadius="), this.f90975a, ")");
    }
}
