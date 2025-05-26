package x7;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import d7.n0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e implements m {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f134016g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f134017h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f134018a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f134019b;

    /* renamed from: c, reason: collision with root package name */
    public z6.a f134020c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f134021d;

    /* renamed from: e, reason: collision with root package name */
    public final a7.o f134022e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f134023f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        a7.o oVar = new a7.o(1);
        this.f134018a = mediaCodec;
        this.f134019b = handlerThread;
        this.f134022e = oVar;
        this.f134021d = new AtomicReference();
    }

    public static d f() {
        ArrayDeque arrayDeque = f134016g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void a(int i13, int i14, MediaCodec.CryptoInfo cryptoInfo, long j13, int i15) {
        try {
            synchronized (f134017h) {
                this.f134018a.queueSecureInputBuffer(i13, i14, cryptoInfo, j13, i15);
            }
        } catch (RuntimeException e13) {
            pk2.f.p(this.f134021d, e13);
        }
    }

    @Override // x7.m
    public final void b(int i13, k7.c cVar, long j13, int i14) {
        h();
        d f13 = f();
        f13.f134010a = i13;
        f13.f134011b = 0;
        f13.f134012c = 0;
        f13.f134014e = j13;
        f13.f134015f = i14;
        int i15 = cVar.f78447f;
        MediaCodec.CryptoInfo cryptoInfo = f13.f134013d;
        cryptoInfo.numSubSamples = i15;
        int[] iArr = cVar.f78445d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = cVar.f78446e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = cVar.f78443b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = cVar.f78442a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = cVar.f78444c;
        if (n0.f53866a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f78448g, cVar.f78449h));
        }
        this.f134020c.obtainMessage(2, f13).sendToTarget();
    }

    @Override // x7.m
    public final void c(Bundle bundle) {
        h();
        z6.a aVar = this.f134020c;
        int i13 = n0.f53866a;
        aVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // x7.m
    public final void d(int i13, int i14, int i15, long j13) {
        h();
        d f13 = f();
        f13.f134010a = i13;
        f13.f134011b = 0;
        f13.f134012c = i14;
        f13.f134014e = j13;
        f13.f134015f = i15;
        z6.a aVar = this.f134020c;
        int i16 = n0.f53866a;
        aVar.obtainMessage(1, f13).sendToTarget();
    }

    public final void e(Bundle bundle) {
        try {
            this.f134018a.setParameters(bundle);
        } catch (RuntimeException e13) {
            pk2.f.p(this.f134021d, e13);
        }
    }

    @Override // x7.m
    public final void flush() {
        if (this.f134023f) {
            try {
                z6.a aVar = this.f134020c;
                aVar.getClass();
                aVar.removeCallbacksAndMessages(null);
                a7.o oVar = this.f134022e;
                oVar.f();
                z6.a aVar2 = this.f134020c;
                aVar2.getClass();
                aVar2.obtainMessage(3).sendToTarget();
                oVar.b();
            } catch (InterruptedException e13) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e13);
            }
        }
    }

    @Override // x7.m
    public final void h() {
        RuntimeException runtimeException = (RuntimeException) this.f134021d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // x7.m
    public final void shutdown() {
        if (this.f134023f) {
            flush();
            this.f134019b.quit();
        }
        this.f134023f = false;
    }

    @Override // x7.m
    public final void start() {
        if (this.f134023f) {
            return;
        }
        HandlerThread handlerThread = this.f134019b;
        handlerThread.start();
        this.f134020c = new z6.a(this, handlerThread.getLooper(), 1);
        this.f134023f = true;
    }
}
