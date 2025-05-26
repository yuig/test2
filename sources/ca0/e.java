package ca0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f27095a;

    public e(String altText) {
        Intrinsics.checkNotNullParameter(altText, "altText");
        this.f27095a = altText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f27095a, ((e) obj).f27095a);
    }

    public final int hashCode() {
        return this.f27095a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("AltTextChanged(altText="), this.f27095a, ")");
    }
}
