package vl1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends l {

    /* renamed from: d, reason: collision with root package name */
    public final rm1.q f126120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rm1.q icon) {
        super(q.banner_neutral_background, rm1.q.PINTEREST, rm1.c.SUBTLE);
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f126120d = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f126120d == ((h) obj).f126120d;
    }

    public final int hashCode() {
        return this.f126120d.hashCode();
    }

    public final String toString() {
        return "Neutral(icon=" + this.f126120d + ")";
    }
}
