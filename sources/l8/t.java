package l8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class t extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final int f82084a;

    /* renamed from: b, reason: collision with root package name */
    public final u f82085b;

    /* renamed from: c, reason: collision with root package name */
    public final long f82086c;

    /* renamed from: d, reason: collision with root package name */
    public r f82087d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f82088e;

    /* renamed from: f, reason: collision with root package name */
    public int f82089f;

    /* renamed from: g, reason: collision with root package name */
    public Thread f82090g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f82091h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f82092i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f82093j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, Looper looper, u uVar, r rVar, int i13, long j13) {
        super(looper);
        this.f82093j = wVar;
        this.f82085b = uVar;
        this.f82087d = rVar;
        this.f82084a = i13;
        this.f82086c = j13;
    }

    public final void a(boolean z13) {
        this.f82092i = z13;
        this.f82088e = null;
        if (hasMessages(1)) {
            this.f82091h = true;
            removeMessages(1);
            if (!z13) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f82091h = true;
                    this.f82085b.o();
                    Thread thread = this.f82090g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (z13) {
            this.f82093j.f82098b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            r rVar = this.f82087d;
            rVar.getClass();
            rVar.s(this.f82085b, elapsedRealtime, elapsedRealtime - this.f82086c, true);
            this.f82087d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = elapsedRealtime - this.f82086c;
        r rVar = this.f82087d;
        rVar.getClass();
        rVar.p(this.f82085b, elapsedRealtime, j13, this.f82089f);
        this.f82088e = null;
        w wVar = this.f82093j;
        m8.a aVar = wVar.f82097a;
        t tVar = wVar.f82098b;
        tVar.getClass();
        aVar.execute(tVar);
    }

    public final long c() {
        return Math.min((this.f82089f - 1) * 1000, 5000);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i13;
        int i14;
        int i15;
        long j13;
        if (this.f82092i) {
            return;
        }
        int i16 = message.what;
        if (i16 == 1) {
            b();
            return;
        }
        if (i16 == 4) {
            throw ((Error) message.obj);
        }
        this.f82093j.f82098b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j14 = elapsedRealtime - this.f82086c;
        r rVar = this.f82087d;
        rVar.getClass();
        if (this.f82091h) {
            rVar.s(this.f82085b, elapsedRealtime, j14, false);
            return;
        }
        int i17 = message.what;
        if (i17 == 2) {
            try {
                rVar.d(this.f82085b, elapsedRealtime, j14);
                return;
            } catch (RuntimeException e13) {
                d7.u.d("LoadTask", "Unexpected exception handling load completed", e13);
                this.f82093j.f82099c = new Loader$UnexpectedLoaderException(e13);
                return;
            }
        }
        if (i17 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f82088e = iOException;
        int i18 = this.f82089f + 1;
        this.f82089f = i18;
        s e14 = rVar.e(this.f82085b, elapsedRealtime, j14, iOException, i18);
        i13 = e14.f82082a;
        if (i13 == 3) {
            this.f82093j.f82099c = this.f82088e;
            return;
        }
        i14 = e14.f82082a;
        if (i14 != 2) {
            i15 = e14.f82082a;
            if (i15 == 1) {
                this.f82089f = 1;
            }
            j13 = e14.f82083b;
            long c13 = j13 != -9223372036854775807L ? e14.f82083b : c();
            w wVar = this.f82093j;
            bf.b.t(wVar.f82098b == null);
            wVar.f82098b = this;
            if (c13 > 0) {
                sendEmptyMessageDelayed(1, c13);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z13;
        try {
            synchronized (this) {
                z13 = !this.f82091h;
                this.f82090g = Thread.currentThread();
            }
            if (z13) {
                Trace.beginSection("load:".concat(this.f82085b.getClass().getSimpleName()));
                try {
                    this.f82085b.h();
                    Trace.endSection();
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            }
            synchronized (this) {
                this.f82090g = null;
                Thread.interrupted();
            }
            if (this.f82092i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e13) {
            if (this.f82092i) {
                return;
            }
            obtainMessage(3, e13).sendToTarget();
        } catch (Error e14) {
            if (!this.f82092i) {
                d7.u.d("LoadTask", "Unexpected error loading stream", e14);
                obtainMessage(4, e14).sendToTarget();
            }
            throw e14;
        } catch (Exception e15) {
            if (this.f82092i) {
                return;
            }
            d7.u.d("LoadTask", "Unexpected exception loading stream", e15);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e15)).sendToTarget();
        } catch (OutOfMemoryError e16) {
            if (this.f82092i) {
                return;
            }
            d7.u.d("LoadTask", "OutOfMemory error loading stream", e16);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e16)).sendToTarget();
        }
    }
}
