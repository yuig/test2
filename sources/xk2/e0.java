package xk2;

import kh2.c3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class e0 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final d0 f135207b = new d0(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f135208a;

    public /* synthetic */ e0(long j13) {
        this.f135208a = j13;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return c3.q0(this.f135208a, ((e0) obj).f135208a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            return this.f135208a == ((e0) obj).f135208a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f135208a);
    }

    public final String toString() {
        return c3.s0(this.f135208a);
    }
}
