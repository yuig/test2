package gi;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class o0 extends j0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f65103a;

    public o0(j0 j0Var) {
        this.f65103a = j0Var;
    }

    @Override // gi.j0
    public final j0 a() {
        return this.f65103a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f65103a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0) {
            return this.f65103a.equals(((o0) obj).f65103a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f65103a.hashCode();
    }

    public final String toString() {
        return this.f65103a.toString().concat(".reverse()");
    }
}
