package ta0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final String f116888a;

    public k(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f116888a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f116888a, ((k) obj).f116888a);
    }

    public final int hashCode() {
        return this.f116888a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ShowStringToast(message="), this.f116888a, ")");
    }
}
