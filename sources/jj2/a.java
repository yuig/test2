package jj2;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f76318b = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f76319a = f76318b.incrementAndGet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f76319a == ((a) obj).f76319a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f76319a;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("RegisteredReader{"), this.f76319a, "}");
    }
}
