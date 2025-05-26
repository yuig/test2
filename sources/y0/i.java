package y0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import v.w0;

/* loaded from: classes2.dex */
public final class i implements h {

    /* renamed from: a */
    public final MediaCodec f136342a;

    /* renamed from: b */
    public final MediaCodec.BufferInfo f136343b;

    /* renamed from: c */
    public final int f136344c;

    /* renamed from: d */
    public final ByteBuffer f136345d;

    /* renamed from: e */
    public final r4.l f136346e;

    /* renamed from: f */
    public final r4.i f136347f;

    /* renamed from: g */
    public final AtomicBoolean f136348g = new AtomicBoolean(false);

    public i(MediaCodec mediaCodec, int i13, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.f136342a = mediaCodec;
        this.f136344c = i13;
        this.f136345d = mediaCodec.getOutputBuffer(i13);
        this.f136343b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.f136346e = com.bumptech.glide.d.L(new w0(atomicReference, 2));
        r4.i iVar = (r4.i) atomicReference.get();
        iVar.getClass();
        this.f136347f = iVar;
    }

    @Override // y0.h
    public final long F0() {
        return this.f136343b.presentationTimeUs;
    }

    @Override // y0.h
    public final MediaCodec.BufferInfo Y() {
        return this.f136343b;
    }

    public final boolean a() {
        return (this.f136343b.flags & 1) != 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        r4.i iVar = this.f136347f;
        if (this.f136348g.getAndSet(true)) {
            return;
        }
        try {
            this.f136342a.releaseOutputBuffer(this.f136344c, false);
            iVar.b(null);
        } catch (IllegalStateException e13) {
            iVar.d(e13);
        }
    }

    @Override // y0.h
    public final long size() {
        return this.f136343b.size;
    }

    @Override // y0.h
    public final ByteBuffer t0() {
        if (this.f136348g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        MediaCodec.BufferInfo bufferInfo = this.f136343b;
        int i13 = bufferInfo.offset;
        ByteBuffer byteBuffer = this.f136345d;
        byteBuffer.position(i13);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }
}
