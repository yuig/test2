package n31;

import g51.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f89158a;

    public a(l onTap) {
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        this.f89158a = onTap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f89158a, ((a) obj).f89158a);
    }

    public final int hashCode() {
        return this.f89158a.hashCode();
    }

    public final String toString() {
        return "SoftDeletionCta(onTap=" + this.f89158a + ")";
    }
}
