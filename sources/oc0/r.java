package oc0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final a f94047a;

    /* renamed from: b, reason: collision with root package name */
    public final List f94048b;

    public r(a barsState, List tabs) {
        Intrinsics.checkNotNullParameter(barsState, "barsState");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f94047a = barsState;
        this.f94048b = tabs;
    }

    public final a a() {
        return this.f94047a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f94047a, rVar.f94047a) && Intrinsics.d(this.f94048b, rVar.f94048b);
    }

    public final int hashCode() {
        return this.f94048b.hashCode() + (this.f94047a.f94032a.hashCode() * 31);
    }

    public final String toString() {
        return "ScaffoldBarsDisplayState(barsState=" + this.f94047a + ", tabs=" + this.f94048b + ")";
    }
}
