package n3;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: b, reason: collision with root package name */
    public final int f89028b;

    public a(int i13) {
        this.f89028b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f89028b == ((a) obj).f89028b;
    }

    public final int hashCode() {
        return this.f89028b;
    }

    public final String toString() {
        return cb.l(new StringBuilder("AndroidPointerIcon(type="), this.f89028b, ')');
    }
}
