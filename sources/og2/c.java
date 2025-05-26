package og2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class c implements a {
    @Override // og2.a
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // og2.a
    public final long now() {
        return System.currentTimeMillis();
    }
}
