package androidx.camera.core.impl;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class q2 implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f16948h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Executor f16949a;

    /* renamed from: b, reason: collision with root package name */
    public final t1 f16950b;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f16952d;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f16951c = new AtomicBoolean(true);

    /* renamed from: e, reason: collision with root package name */
    public Object f16953e = f16948h;

    /* renamed from: f, reason: collision with root package name */
    public int f16954f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16955g = false;

    public q2(AtomicReference atomicReference, Executor executor, t1 t1Var) {
        this.f16952d = atomicReference;
        this.f16949a = executor;
        this.f16950b = t1Var;
    }

    public final void a(int i13) {
        synchronized (this) {
            try {
                if (!this.f16951c.get()) {
                    return;
                }
                if (i13 <= this.f16954f) {
                    return;
                }
                this.f16954f = i13;
                if (this.f16955g) {
                    return;
                }
                this.f16955g = true;
                try {
                    this.f16949a.execute(this);
                } finally {
                    synchronized (this) {
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.f16951c.get()) {
                    this.f16955g = false;
                    return;
                }
                Object obj = this.f16952d.get();
                int i13 = this.f16954f;
                while (true) {
                    if (!Objects.equals(this.f16953e, obj)) {
                        this.f16953e = obj;
                        if (obj instanceof i) {
                            this.f16950b.onError(((i) obj).f16871a);
                        } else {
                            this.f16950b.a(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i13 == this.f16954f || !this.f16951c.get()) {
                                break;
                            }
                            obj = this.f16952d.get();
                            i13 = this.f16954f;
                        } finally {
                        }
                    }
                }
                this.f16955g = false;
            } finally {
            }
        }
    }
}
