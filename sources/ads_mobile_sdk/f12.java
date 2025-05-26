package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class f12 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5007a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f5008b;

    public f12(Class cls, Class cls2) {
        this.f5007a = cls;
        this.f5008b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f12)) {
            return false;
        }
        f12 f12Var = (f12) obj;
        return f12Var.f5007a.equals(this.f5007a) && f12Var.f5008b.equals(this.f5008b);
    }

    public final int hashCode() {
        return Objects.hash(this.f5007a, this.f5008b);
    }

    public final String toString() {
        return this.f5007a.getSimpleName() + " with primitive type: " + this.f5008b.getSimpleName();
    }
}
