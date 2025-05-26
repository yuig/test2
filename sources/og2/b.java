package og2;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final long f94453a;

    public b(c systemClock) {
        Intrinsics.checkNotNullParameter(systemClock, "systemClock");
        this.f94453a = System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    @Override // og2.a
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    @Override // og2.a
    public final long now() {
        return SystemClock.elapsedRealtime() + this.f94453a;
    }
}
