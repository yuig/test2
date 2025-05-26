package g72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f63927a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63928b;

    public b0(String nameField, String dataField) {
        Intrinsics.checkNotNullParameter(nameField, "nameField");
        Intrinsics.checkNotNullParameter(dataField, "dataField");
        this.f63927a = nameField;
        this.f63928b = dataField;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f63927a, b0Var.f63927a) && Intrinsics.d(this.f63928b, b0Var.f63928b);
    }

    public final int hashCode() {
        return this.f63928b.hashCode() + (this.f63927a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EffectDescriptor(nameField=");
        sb3.append(this.f63927a);
        sb3.append(", dataField=");
        return a.a.p(sb3, this.f63928b, ")");
    }
}
