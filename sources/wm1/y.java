package wm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends z {

    /* renamed from: b, reason: collision with root package name */
    public final rm1.q f130341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(rm1.q icon) {
        super(a0.ICON);
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f130341b = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f130341b == ((y) obj).f130341b;
    }

    public final int hashCode() {
        return this.f130341b.hashCode();
    }

    public final String toString() {
        return "StartIconDisplayState(icon=" + this.f130341b + ")";
    }
}
