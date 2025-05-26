package hn1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final yl1.b f69649a;

    public d(yl1.b buttonDisplayState) {
        Intrinsics.checkNotNullParameter(buttonDisplayState, "buttonDisplayState");
        this.f69649a = buttonDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f69649a, ((d) obj).f69649a);
    }

    public final int hashCode() {
        return this.f69649a.hashCode();
    }

    public final String toString() {
        return "Button(buttonDisplayState=" + this.f69649a + ")";
    }
}
