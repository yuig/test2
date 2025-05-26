package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final n f23274a;

    public o(n action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f23274a = action;
    }

    public static o e(n action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new o(action);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f23274a, ((o) obj).f23274a);
    }

    public final int hashCode() {
        return this.f23274a.hashCode();
    }

    public final String toString() {
        return "ClickThroughDisplayState(action=" + this.f23274a + ")";
    }

    public /* synthetic */ o() {
        this(k.f23247a);
    }
}
