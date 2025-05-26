package oc0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f94032a;

    public a() {
        this(m.f94046a);
    }

    public final Function2 a() {
        return this.f94032a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f94032a, ((a) obj).f94032a);
    }

    public final int hashCode() {
        return this.f94032a.hashCode();
    }

    public final String toString() {
        return "BarsState(topBar=" + this.f94032a + ")";
    }

    public a(Function2 topBar) {
        Intrinsics.checkNotNullParameter(topBar, "topBar");
        this.f94032a = topBar;
    }
}
