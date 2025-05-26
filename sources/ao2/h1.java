package ao2;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class h1 extends f0 implements Closeable, AutoCloseable {
    static {
        os.d safeCast = new os.d(6);
        e0 baseKey = f0.f20145b;
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        if (baseKey instanceof kotlin.coroutines.b) {
            kotlin.coroutines.h hVar = baseKey.f80405b;
        }
    }

    public abstract Executor o();
}
