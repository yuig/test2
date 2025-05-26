package vn0;

import kotlin.jvm.internal.Intrinsics;
import tk0.q;

/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final q f126255a;

    public c(q innerEvent) {
        Intrinsics.checkNotNullParameter(innerEvent, "innerEvent");
        this.f126255a = innerEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f126255a, ((c) obj).f126255a);
    }

    public final int hashCode() {
        return this.f126255a.hashCode();
    }

    public final String toString() {
        return "WrappedOrganizeFloatingToolbarEvent(innerEvent=" + this.f126255a + ")";
    }
}
