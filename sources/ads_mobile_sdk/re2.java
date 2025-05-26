package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class re2 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f10597a;

    /* renamed from: b, reason: collision with root package name */
    public final jl f10598b;

    public re2(jl jlVar, Class cls) {
        this.f10597a = cls;
        this.f10598b = jlVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof re2)) {
            return false;
        }
        re2 re2Var = (re2) obj;
        return re2Var.f10597a.equals(this.f10597a) && re2Var.f10598b.equals(this.f10598b);
    }

    public final int hashCode() {
        return Objects.hash(this.f10597a, this.f10598b);
    }

    public final String toString() {
        return this.f10597a.getSimpleName() + ", object identifier: " + this.f10598b;
    }
}
