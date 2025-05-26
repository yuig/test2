package bm1;

/* loaded from: classes5.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f23506a = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f23506a == ((j) obj).f23506a;
    }

    public final int hashCode() {
        rm1.q qVar = this.f23506a;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    public final String toString() {
        return "Save(icon=" + this.f23506a + ")";
    }
}
