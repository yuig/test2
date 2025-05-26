package km1;

import jm1.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f80202a;

    public a() {
        c orientation = b.f80203c;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f80202a = orientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f80202a == ((a) obj).f80202a;
    }

    public final int hashCode() {
        return this.f80202a.hashCode();
    }

    public final String toString() {
        return "DisplayState(orientation=" + this.f80202a + ")";
    }
}
