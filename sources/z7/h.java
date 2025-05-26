package z7;

import androidx.media3.exoplayer.offline.DownloadRequest;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class h extends Thread implements k {

    /* renamed from: a, reason: collision with root package name */
    public final DownloadRequest f140932a;

    /* renamed from: b, reason: collision with root package name */
    public final l f140933b;

    /* renamed from: c, reason: collision with root package name */
    public final j f140934c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f140935d;

    /* renamed from: e, reason: collision with root package name */
    public final int f140936e;

    /* renamed from: f, reason: collision with root package name */
    public volatile g f140937f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f140938g;

    /* renamed from: h, reason: collision with root package name */
    public Exception f140939h;

    /* renamed from: i, reason: collision with root package name */
    public long f140940i = -1;

    public h(DownloadRequest downloadRequest, l lVar, j jVar, boolean z13, int i13, g gVar) {
        this.f140932a = downloadRequest;
        this.f140933b = lVar;
        this.f140934c = jVar;
        this.f140935d = z13;
        this.f140936e = i13;
        this.f140937f = gVar;
    }

    public final void a(boolean z13) {
        if (z13) {
            this.f140937f = null;
        }
        if (this.f140938g) {
            return;
        }
        this.f140938g = true;
        this.f140933b.cancel();
        interrupt();
    }

    public final void b(long j13, long j14, float f13) {
        this.f140934c.f140953a = j14;
        this.f140934c.f140954b = f13;
        if (j13 != this.f140940i) {
            this.f140940i = j13;
            g gVar = this.f140937f;
            if (gVar != null) {
                gVar.obtainMessage(11, (int) (j13 >> 32), (int) j13, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f140935d) {
                this.f140933b.remove();
            } else {
                long j13 = -1;
                int i13 = 0;
                while (!this.f140938g) {
                    try {
                        this.f140933b.a(this);
                        break;
                    } catch (IOException e13) {
                        if (!this.f140938g) {
                            long j14 = this.f140934c.f140953a;
                            if (j14 != j13) {
                                i13 = 0;
                                j13 = j14;
                            }
                            int i14 = i13 + 1;
                            if (i14 > this.f140936e) {
                                throw e13;
                            }
                            Thread.sleep(Math.min(i13 * 1000, 5000));
                            i13 = i14;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e14) {
            this.f140939h = e14;
        }
        g gVar = this.f140937f;
        if (gVar != null) {
            gVar.obtainMessage(10, this).sendToTarget();
        }
    }
}
