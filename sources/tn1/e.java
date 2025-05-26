package tn1;

import kotlin.jvm.internal.Intrinsics;
import vn1.g;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final g f118624a;

    /* renamed from: b, reason: collision with root package name */
    public final g f118625b;

    public e(g classicVariant, g vrVariant) {
        Intrinsics.checkNotNullParameter(classicVariant, "classicVariant");
        Intrinsics.checkNotNullParameter(vrVariant, "vrVariant");
        this.f118624a = classicVariant;
        this.f118625b = vrVariant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f118624a == eVar.f118624a && this.f118625b == eVar.f118625b;
    }

    public final int hashCode() {
        return this.f118625b.hashCode() + (this.f118624a.hashCode() * 31);
    }

    public final String toString() {
        return "Variants(classicVariant=" + this.f118624a + ", vrVariant=" + this.f118625b + ")";
    }
}
