package r0;

import android.content.ContentProviderClient;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class l0 implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f105599a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f105600b;

    /* renamed from: c, reason: collision with root package name */
    public final long f105601c;

    /* renamed from: d, reason: collision with root package name */
    public final q f105602d;

    /* renamed from: e, reason: collision with root package name */
    public final gc.c f105603e;

    public l0(j0 j0Var, long j13, q qVar, boolean z13) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f105599a = atomicBoolean;
        gc.c G = gc.c.G();
        this.f105603e = G;
        this.f105600b = j0Var;
        this.f105601c = j13;
        this.f105602d = qVar;
        if (z13) {
            atomicBoolean.set(true);
        } else {
            ((e0.e) G.f64764b).a("stop");
        }
    }

    public final void a(final int i13, final RuntimeException runtimeException) {
        gc.c cVar = this.f105603e;
        switch (cVar.f64763a) {
            case 16:
                ((e0.e) cVar.f64764b).close();
                break;
            default:
                ContentProviderClient contentProviderClient = (ContentProviderClient) cVar.f64764b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    break;
                }
                break;
        }
        if (this.f105599a.getAndSet(true)) {
            return;
        }
        final j0 j0Var = this.f105600b;
        synchronized (j0Var.f105566g) {
            try {
                if (!j0.p(this, j0Var.f105573n) && !j0.p(this, j0Var.f105572m)) {
                    kh2.m0.p("Recorder", "stop() called on a recording that is no longer active: " + this.f105602d);
                    return;
                }
                i iVar = null;
                switch (j0Var.f105569j) {
                    case CONFIGURING:
                    case IDLING:
                        throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        com.bumptech.glide.d.v(null, j0.p(this, j0Var.f105573n));
                        i iVar2 = j0Var.f105573n;
                        j0Var.f105573n = null;
                        j0Var.x();
                        iVar = iVar2;
                        break;
                    case RECORDING:
                    case PAUSED:
                        j0Var.C(i0.STOPPING);
                        final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                        final i iVar3 = j0Var.f105572m;
                        j0Var.f105561d.execute(new Runnable() { // from class: r0.v
                            @Override // java.lang.Runnable
                            public final void run() {
                                j0.this.H(iVar3, micros, i13, runtimeException);
                            }
                        });
                        break;
                    case STOPPING:
                    case RESETTING:
                        com.bumptech.glide.d.v(null, j0.p(this, j0Var.f105572m));
                        break;
                }
                if (iVar != null) {
                    if (i13 == 10) {
                        kh2.m0.s("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                    }
                    j0Var.j(iVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", runtimeException));
                }
            } finally {
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a(0, null);
    }

    public final void finalize() {
        try {
            ((e0.e) this.f105603e.f64764b).d();
            a(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
