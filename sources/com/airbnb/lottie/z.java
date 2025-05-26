package com.airbnb.lottie;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28505a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f28506b;

    public z(h hVar) {
        this.f28505a = hVar;
        this.f28506b = null;
    }

    public final Throwable a() {
        return this.f28506b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        Object obj2 = this.f28505a;
        if (obj2 != null && obj2.equals(zVar.f28505a)) {
            return true;
        }
        Throwable th3 = this.f28506b;
        if (th3 == null || zVar.f28506b == null) {
            return false;
        }
        return th3.toString().equals(th3.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28505a, this.f28506b});
    }

    public z(Throwable th3) {
        this.f28506b = th3;
        this.f28505a = null;
    }
}
