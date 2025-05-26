package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final zo.c f83895a;

    public r0(zo.c viewType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f83895a = viewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && this.f83895a == ((r0) obj).f83895a;
    }

    public final int hashCode() {
        return this.f83895a.hashCode();
    }

    public final String toString() {
        return "SaveViewTypeSelection(viewType=" + this.f83895a + ")";
    }
}
