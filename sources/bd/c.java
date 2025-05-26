package bd;

import ao2.i1;
import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22684a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f22685b;

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f22685b = new i1(newSingleThreadExecutor);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22684a) {
            return;
        }
        this.f22685b.close();
        this.f22684a = true;
    }
}
