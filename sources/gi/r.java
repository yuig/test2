package gi;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class r implements Serializable, p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f65109a;

    public r(Object obj) {
        this.f65109a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return kh2.w.D0(this.f65109a, ((r) obj).f65109a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f65109a});
    }

    public final String toString() {
        return a.a.k("Suppliers.ofInstance(", this.f65109a.toString(), ")");
    }
}
