package m62;

import java.util.List;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q extends m2 {

    /* renamed from: d, reason: collision with root package name */
    public final List f86041d;

    public q(List fonts) {
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        this.f86041d = fonts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f86041d, ((q) obj).f86041d);
    }

    public final int hashCode() {
        return this.f86041d.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Fonts(fonts="), this.f86041d, ")");
    }
}
