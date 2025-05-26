package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final cl0.a f104310a;

    public n(cl0.a option) {
        Intrinsics.checkNotNullParameter(option, "option");
        this.f104310a = option;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f104310a == ((n) obj).f104310a;
    }

    public final int hashCode() {
        return this.f104310a.hashCode();
    }

    public final String toString() {
        return "OptionSelected(option=" + this.f104310a + ")";
    }
}
