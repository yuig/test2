package qf2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nf2.n;
import of2.h;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final n f103800a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f103801b;

    /* renamed from: c, reason: collision with root package name */
    public Thread f103802c;

    public d(n sharedObjectLoader) {
        Intrinsics.checkNotNullParameter(sharedObjectLoader, "sharedObjectLoader");
        this.f103800a = sharedObjectLoader;
        this.f103801b = new AtomicBoolean(false);
    }

    public final void a(e listener, sg2.a configService, of2.b anrService) {
        Thread thread;
        Intrinsics.checkNotNullParameter(listener, "sampler");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(anrService, "anrService");
        if (this.f103801b.get() && (thread = this.f103802c) != null && Thread.currentThread().getId() == thread.getId()) {
            return;
        }
        this.f103801b.set(false);
        this.f103802c = Thread.currentThread();
        if (this.f103800a.a()) {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper);
            }
            if (((sg2.b) configService).f112881f.d()) {
                synchronized (this) {
                    try {
                        if (!this.f103801b.get()) {
                            b bVar = (b) listener;
                            Thread currentThread = Thread.currentThread();
                            Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread()");
                            bVar.f103796m = currentThread;
                            if (bVar.f103787d.monitorCurrentThread()) {
                                Intrinsics.checkNotNullParameter(listener, "listener");
                                ((h) anrService).f94438i.add(listener);
                                this.f103801b.set(true);
                            }
                        }
                        Unit unit = Unit.f80348a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }
}
