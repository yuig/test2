package su0;

import java.util.List;
import kh2.j1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends j1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f115225a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f115226b;

    public u(List transitions, ru0.a select) {
        Intrinsics.checkNotNullParameter(transitions, "transitions");
        Intrinsics.checkNotNullParameter(select, "select");
        this.f115225a = transitions;
        this.f115226b = select;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f115225a, uVar.f115225a) && Intrinsics.d(this.f115226b, uVar.f115226b);
    }

    public final int hashCode() {
        return this.f115226b.hashCode() + (this.f115225a.hashCode() * 31);
    }

    public final String toString() {
        return "ExitSelection(transitions=" + this.f115225a + ", select=" + this.f115226b + ")";
    }
}
