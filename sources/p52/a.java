package p52;

import a.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l82.h;

/* loaded from: classes4.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final List f98903a;

    public a(List pinIds) {
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        this.f98903a = pinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f98903a, ((a) obj).f98903a);
    }

    public final int hashCode() {
        return this.f98903a.hashCode();
    }

    public final String toString() {
        return c.j(new StringBuilder("GetPinsByIdsSideEffectRequest(pinIds="), this.f98903a, ")");
    }
}
