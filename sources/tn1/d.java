package tn1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f118622a;

    /* renamed from: b, reason: collision with root package name */
    public final List f118623b;

    public d(List classicStyle, List vrStyle) {
        Intrinsics.checkNotNullParameter(classicStyle, "classicStyle");
        Intrinsics.checkNotNullParameter(vrStyle, "vrStyle");
        this.f118622a = classicStyle;
        this.f118623b = vrStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f118622a, dVar.f118622a) && Intrinsics.d(this.f118623b, dVar.f118623b);
    }

    public final int hashCode() {
        return this.f118623b.hashCode() + (this.f118622a.hashCode() * 31);
    }

    public final String toString() {
        return "Styles(classicStyle=" + this.f118622a + ", vrStyle=" + this.f118623b + ")";
    }
}
