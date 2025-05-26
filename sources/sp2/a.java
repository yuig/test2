package sp2;

import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final tb.c f114892a = new tb.c(17);

    /* renamed from: b, reason: collision with root package name */
    public final e f114893b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f114894c;

    public a(e eVar) {
        this.f114893b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    j n13 = this.f114892a.n();
                    if (n13 == null) {
                        synchronized (this) {
                            n13 = this.f114892a.m();
                            if (n13 == null) {
                                this.f114894c = false;
                                this.f114894c = false;
                                return;
                            }
                        }
                    }
                    this.f114893b.c(n13);
                } catch (InterruptedException e13) {
                    this.f114893b.f114917q.s(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e13);
                    this.f114894c = false;
                    return;
                }
            } catch (Throwable th3) {
                this.f114894c = false;
                throw th3;
            }
        }
    }
}
