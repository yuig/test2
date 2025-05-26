package j5;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f74672a;

    /* renamed from: b, reason: collision with root package name */
    public c f74673b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f74674c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f74672a) {
                    return;
                }
                this.f74672a = true;
                this.f74674c = true;
                c cVar = this.f74673b;
                if (cVar != null) {
                    try {
                        cVar.onCancel();
                    } catch (Throwable th3) {
                        synchronized (this) {
                            this.f74674c = false;
                            notifyAll();
                            throw th3;
                        }
                    }
                }
                synchronized (this) {
                    this.f74674c = false;
                    notifyAll();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void b(c cVar) {
        synchronized (this) {
            while (this.f74674c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.f74673b == cVar) {
                return;
            }
            this.f74673b = cVar;
            if (this.f74672a) {
                cVar.onCancel();
            }
        }
    }
}
