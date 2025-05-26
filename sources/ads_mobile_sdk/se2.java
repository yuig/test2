package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class se2 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11069a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f11070b;

    public se2(Class cls, Class cls2) {
        this.f11069a = cls;
        this.f11070b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof se2)) {
            return false;
        }
        se2 se2Var = (se2) obj;
        return se2Var.f11069a.equals(this.f11069a) && se2Var.f11070b.equals(this.f11070b);
    }

    public final int hashCode() {
        return Objects.hash(this.f11069a, this.f11070b);
    }

    public final String toString() {
        return this.f11069a.getSimpleName() + " with serialization type: " + this.f11070b.getSimpleName();
    }
}
