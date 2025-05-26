package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final gj0.d f27786a;

    public b1(gj0.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f27786a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && Intrinsics.d(this.f27786a, ((b1) obj).f27786a);
    }

    public final int hashCode() {
        return this.f27786a.hashCode();
    }

    public final String toString() {
        return "ToolbarEvent(event=" + this.f27786a + ")";
    }
}
