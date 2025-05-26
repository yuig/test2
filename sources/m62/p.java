package m62;

import java.util.List;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends m2 {

    /* renamed from: d, reason: collision with root package name */
    public final List f86039d;

    public p(List effects) {
        Intrinsics.checkNotNullParameter(effects, "effects");
        this.f86039d = effects;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f86039d, ((p) obj).f86039d);
    }

    public final int hashCode() {
        return this.f86039d.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Effects(effects="), this.f86039d, ")");
    }
}
