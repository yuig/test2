package ca0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f27131a;

    public j(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f27131a = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f27131a, ((j) obj).f27131a);
    }

    public final int hashCode() {
        return this.f27131a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DescriptionChanged(description="), this.f27131a, ")");
    }
}
