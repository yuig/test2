package su0;

import java.util.List;
import kh2.j1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends j1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f115223a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f115224b;

    public t(List transitions, ru0.a select) {
        Intrinsics.checkNotNullParameter(transitions, "transitions");
        Intrinsics.checkNotNullParameter(select, "select");
        this.f115223a = transitions;
        this.f115224b = select;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f115223a, tVar.f115223a) && Intrinsics.d(this.f115224b, tVar.f115224b);
    }

    public final int hashCode() {
        return this.f115224b.hashCode() + (this.f115223a.hashCode() * 31);
    }

    public final String toString() {
        return "EnterSelection(transitions=" + this.f115223a + ", select=" + this.f115224b + ")";
    }
}
