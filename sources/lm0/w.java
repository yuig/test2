package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements y {

    /* renamed from: a, reason: collision with root package name */
    public final zo.c f83905a;

    public w(zo.c viewType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f83905a = viewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f83905a == ((w) obj).f83905a;
    }

    public final int hashCode() {
        return this.f83905a.hashCode();
    }

    public final String toString() {
        return "ViewTypeLoaded(viewType=" + this.f83905a + ")";
    }
}
