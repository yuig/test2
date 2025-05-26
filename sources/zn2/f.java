package zn2;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f142316a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final long f142317b = System.nanoTime();

    public static long a() {
        return System.nanoTime() - f142317b;
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
