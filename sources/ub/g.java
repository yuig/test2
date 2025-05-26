package ub;

import kb.b0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final String f121661b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f121662a;

    static {
        String h10 = b0.h("NetworkRequestCompat");
        Intrinsics.checkNotNullExpressionValue(h10, "tagWithPrefix(\"NetworkRequestCompat\")");
        f121661b = h10;
    }

    public g(Object obj) {
        this.f121662a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f121662a, ((g) obj).f121662a);
    }

    public final int hashCode() {
        Object obj = this.f121662a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f121662a + ')';
    }
}
