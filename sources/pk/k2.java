package pk;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f100443a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f100444b;

    public k2(Object obj, Object obj2) {
        this.f100443a = obj;
        this.f100444b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return kh2.g0.m(this.f100443a, k2Var.f100443a) && kh2.g0.m(this.f100444b, k2Var.f100444b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f100443a, this.f100444b});
    }

    public final String toString() {
        return "(" + this.f100443a + ", " + this.f100444b + ")";
    }
}
