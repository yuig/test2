package org.chromium.net.impl;

import J.N;
import a.a;
import android.util.Log;
import androidx.appcompat.app.v;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import jp2.i0;
import jp2.n;
import ne0.b;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes2.dex */
public final class CronetUploadDataStream extends UploadDataSink {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f97376a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f97377b;

    /* renamed from: c, reason: collision with root package name */
    public final CronetUrlRequest f97378c;

    /* renamed from: d, reason: collision with root package name */
    public long f97379d;

    /* renamed from: e, reason: collision with root package name */
    public long f97380e;

    /* renamed from: f, reason: collision with root package name */
    public long f97381f;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f97383h;

    /* renamed from: j, reason: collision with root package name */
    public long f97385j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f97387l;

    /* renamed from: g, reason: collision with root package name */
    public final n f97382g = new n(this);

    /* renamed from: i, reason: collision with root package name */
    public final Object f97384i = new Object();

    /* renamed from: k, reason: collision with root package name */
    public int f97386k = 3;

    public CronetUploadDataStream(UploadDataProvider uploadDataProvider, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.f97376a = executor;
        this.f97377b = new i0(uploadDataProvider);
        this.f97378c = cronetUrlRequest;
    }

    public final void a(int i13) {
        if (this.f97386k != i13) {
            throw new IllegalStateException(a.f("Expected ", i13, ", but was ", this.f97386k));
        }
    }

    public final void b() {
        synchronized (this.f97384i) {
            try {
                if (this.f97386k == 0) {
                    this.f97387l = true;
                    return;
                }
                long j13 = this.f97385j;
                if (j13 == 0) {
                    return;
                }
                N.MMW1G0N1(j13);
                this.f97385j = 0L;
                e(new v(this, 19));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        synchronized (this.f97384i) {
            try {
                if (this.f97386k == 0) {
                    throw new IllegalStateException("Method should not be called when read has not completed.");
                }
                if (this.f97387l) {
                    b();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d(Throwable th3) {
        boolean z13;
        synchronized (this.f97384i) {
            int i13 = this.f97386k;
            if (i13 == 3) {
                throw new IllegalStateException("There is no read or rewind or length check in progress.", th3);
            }
            z13 = i13 == 2;
            this.f97386k = 3;
            this.f97383h = null;
            c();
        }
        if (z13) {
            try {
                this.f97377b.close();
            } catch (Exception e13) {
                Log.e("cr_CronetUploadDataStream", "Failure closing data provider", e13);
            }
        }
        this.f97378c.i(th3);
    }

    public final void e(Runnable runnable) {
        try {
            this.f97376a.execute(runnable);
        } catch (Throwable th3) {
            this.f97378c.i(th3);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        synchronized (this.f97384i) {
            a(0);
            d(exc);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z13) {
        synchronized (this.f97384i) {
            try {
                a(0);
                if (this.f97381f != this.f97383h.limit()) {
                    throw new IllegalStateException("ByteBuffer limit changed");
                }
                if (z13 && this.f97379d >= 0) {
                    throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
                }
                int position = this.f97383h.position();
                long j13 = this.f97380e - position;
                this.f97380e = j13;
                if (j13 < 0 && this.f97379d >= 0) {
                    throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", Long.valueOf(this.f97379d - this.f97380e), Long.valueOf(this.f97379d)));
                }
                this.f97383h = null;
                this.f97386k = 3;
                c();
                long j14 = this.f97385j;
                if (j14 == 0) {
                    return;
                }
                N.MpWH3VIr(j14, this, position, z13);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        synchronized (this.f97384i) {
            a(1);
            d(exc);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        synchronized (this.f97384i) {
            try {
                a(1);
                this.f97386k = 3;
                this.f97380e = this.f97379d;
                long j13 = this.f97385j;
                if (j13 == 0) {
                    return;
                }
                N.MFpRjSMv(j13, this);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @CalledByNative
    public void onUploadDataStreamDestroyed() {
        b();
    }

    @CalledByNative
    public void readData(ByteBuffer byteBuffer) {
        this.f97383h = byteBuffer;
        this.f97381f = byteBuffer.limit();
        e(this.f97382g);
    }

    @CalledByNative
    public void rewind() {
        e(new b(this, 15));
    }
}
