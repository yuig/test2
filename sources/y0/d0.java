package y0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import v.w0;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f136312a;

    /* renamed from: b, reason: collision with root package name */
    public final int f136313b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f136314c;

    /* renamed from: d, reason: collision with root package name */
    public final r4.l f136315d;

    /* renamed from: e, reason: collision with root package name */
    public final r4.i f136316e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f136317f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public long f136318g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f136319h = false;

    public d0(MediaCodec mediaCodec, int i13) {
        mediaCodec.getClass();
        this.f136312a = mediaCodec;
        com.bumptech.glide.d.l(i13);
        this.f136313b = i13;
        this.f136314c = mediaCodec.getInputBuffer(i13);
        AtomicReference atomicReference = new AtomicReference();
        this.f136315d = com.bumptech.glide.d.L(new w0(atomicReference, 5));
        r4.i iVar = (r4.i) atomicReference.get();
        iVar.getClass();
        this.f136316e = iVar;
    }

    public final void a() {
        r4.i iVar = this.f136316e;
        if (this.f136317f.getAndSet(true)) {
            return;
        }
        try {
            this.f136312a.queueInputBuffer(this.f136313b, 0, 0, 0L, 0);
            iVar.b(null);
        } catch (IllegalStateException e13) {
            iVar.d(e13);
        }
    }

    public final void b() {
        r4.i iVar = this.f136316e;
        ByteBuffer byteBuffer = this.f136314c;
        if (this.f136317f.getAndSet(true)) {
            return;
        }
        try {
            this.f136312a.queueInputBuffer(this.f136313b, byteBuffer.position(), byteBuffer.limit(), this.f136318g, this.f136319h ? 4 : 0);
            iVar.b(null);
        } catch (IllegalStateException e13) {
            iVar.d(e13);
        }
    }
}
