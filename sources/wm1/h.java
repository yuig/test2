package wm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends n {

    /* renamed from: c, reason: collision with root package name */
    public final d f130300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d icon) {
        super(o.ICON, true);
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f130300c = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f130300c == ((h) obj).f130300c;
    }

    public final int hashCode() {
        return this.f130300c.hashCode();
    }

    public final String toString() {
        return "EndIconDisplayState(icon=" + this.f130300c + ")";
    }
}
