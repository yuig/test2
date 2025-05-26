package x7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class f extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f134025b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f134026c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f134031h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f134032i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f134033j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f134034k;

    /* renamed from: l, reason: collision with root package name */
    public long f134035l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f134036m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f134037n;

    /* renamed from: o, reason: collision with root package name */
    public h1.b f134038o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f134024a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final g1.i f134027d = new g1.i(0);

    /* renamed from: e, reason: collision with root package name */
    public final g1.i f134028e = new g1.i(0);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f134029f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f134030g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f134025b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f134030g;
        if (!arrayDeque.isEmpty()) {
            this.f134032i = (MediaFormat) arrayDeque.getLast();
        }
        g1.i iVar = this.f134027d;
        iVar.f63272b = iVar.f63271a;
        g1.i iVar2 = this.f134028e;
        iVar2.f63272b = iVar2.f63271a;
        this.f134029f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f134024a) {
            this.f134037n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f134024a) {
            this.f134034k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f134024a) {
            this.f134033j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i13) {
        synchronized (this.f134024a) {
            this.f134027d.a(i13);
            h1.b bVar = this.f134038o;
            if (bVar != null) {
                Object obj = bVar.f66449b;
                if (((p) obj).G != null) {
                    ((p) obj).G.a();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i13, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f134024a) {
            try {
                MediaFormat mediaFormat = this.f134032i;
                if (mediaFormat != null) {
                    this.f134028e.a(-2);
                    this.f134030g.add(mediaFormat);
                    this.f134032i = null;
                }
                this.f134028e.a(i13);
                this.f134029f.add(bufferInfo);
                h1.b bVar = this.f134038o;
                if (bVar != null) {
                    Object obj = bVar.f66449b;
                    if (((p) obj).G != null) {
                        ((p) obj).G.a();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f134024a) {
            this.f134028e.a(-2);
            this.f134030g.add(mediaFormat);
            this.f134032i = null;
        }
    }
}
