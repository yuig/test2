package zi2;

import aj2.f;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final d f142042a = new d();

    @Override // zi2.b
    public final long a() {
        return System.nanoTime();
    }

    @Override // zi2.b
    public final long now() {
        f.f15443a.getClass();
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public final String toString() {
        return "SystemClock{}";
    }
}
