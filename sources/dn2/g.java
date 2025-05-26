package dn2;

import am2.d0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f55623a;

    public g(Object obj) {
        this.f55623a = obj;
    }

    public abstract b0 a(d0 d0Var);

    public Object b() {
        return this.f55623a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            Object b13 = b();
            g gVar = obj instanceof g ? (g) obj : null;
            if (!Intrinsics.d(b13, gVar != null ? gVar.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object b13 = b();
        if (b13 != null) {
            return b13.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
