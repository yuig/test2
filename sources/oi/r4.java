package oi;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public final class r4 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f95080a;

    /* renamed from: b, reason: collision with root package name */
    public final BlockingQueue f95081b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f95082c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o4 f95083d;

    public r4(o4 o4Var, String str, BlockingQueue blockingQueue) {
        this.f95083d = o4Var;
        com.bumptech.glide.d.t(blockingQueue);
        this.f95080a = new Object();
        this.f95081b = blockingQueue;
        setName(str);
    }

    public final void a(InterruptedException interruptedException) {
        y3 zzj = this.f95083d.zzj();
        zzj.f95271i.b(interruptedException, a.a.C(getName(), " was interrupted"));
    }

    public final void b() {
        synchronized (this.f95083d.f94992i) {
            try {
                if (!this.f95082c) {
                    this.f95083d.f94993j.release();
                    this.f95083d.f94992i.notifyAll();
                    o4 o4Var = this.f95083d;
                    if (this == o4Var.f94986c) {
                        o4Var.f94986c = null;
                    } else if (this == o4Var.f94987d) {
                        o4Var.f94987d = null;
                    } else {
                        o4Var.zzj().f95268f.c("Current scheduler thread is neither worker nor network");
                    }
                    this.f95082c = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z13 = false;
        while (!z13) {
            try {
                this.f95083d.f94993j.acquire();
                z13 = true;
            } catch (InterruptedException e13) {
                a(e13);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                s4 s4Var = (s4) this.f95081b.poll();
                if (s4Var != null) {
                    Process.setThreadPriority(s4Var.f95150b ? threadPriority : 10);
                    s4Var.run();
                } else {
                    synchronized (this.f95080a) {
                        if (this.f95081b.peek() == null) {
                            this.f95083d.getClass();
                            try {
                                this.f95080a.wait(30000L);
                            } catch (InterruptedException e14) {
                                a(e14);
                            }
                        }
                    }
                    synchronized (this.f95083d.f94992i) {
                        if (this.f95081b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            b();
            throw th3;
        }
    }
}
