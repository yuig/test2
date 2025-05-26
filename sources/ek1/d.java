package ek1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f59224a;

    /* renamed from: b, reason: collision with root package name */
    public final List f59225b;

    public d(int i13, List pinChips) {
        Intrinsics.checkNotNullParameter(pinChips, "pinChips");
        this.f59224a = i13;
        this.f59225b = pinChips;
    }

    public final List a() {
        return this.f59225b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f59224a == dVar.f59224a && Intrinsics.d(this.f59225b, dVar.f59225b);
    }

    public final int hashCode() {
        return this.f59225b.hashCode() + (Integer.hashCode(this.f59224a) * 31);
    }

    public final String toString() {
        return "ExistingSlideshow(currentIndex=" + this.f59224a + ", pinChips=" + this.f59225b + ")";
    }
}
