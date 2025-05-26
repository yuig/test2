package s1;

/* loaded from: classes2.dex */
public final class o implements p {

    /* renamed from: a, reason: collision with root package name */
    public final float f110490a;

    public o(float f13) {
        this.f110490a = f13;
    }

    @Override // s1.p
    public final int a(n4.b bVar, int i13) {
        return bVar.R(this.f110490a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return n4.e.a(this.f110490a, ((o) obj).f110490a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f110490a);
    }
}
