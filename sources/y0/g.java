package y0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import v.w0;

/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f136337a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodec.BufferInfo f136338b;

    /* renamed from: c, reason: collision with root package name */
    public final r4.i f136339c;

    public g(i iVar) {
        MediaCodec.BufferInfo bufferInfo = iVar.f136343b;
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        this.f136338b = bufferInfo2;
        ByteBuffer t03 = iVar.t0();
        MediaCodec.BufferInfo bufferInfo3 = iVar.f136343b;
        t03.position(bufferInfo3.offset);
        t03.limit(bufferInfo3.offset + bufferInfo3.size);
        ByteBuffer allocate = ByteBuffer.allocate(bufferInfo3.size);
        allocate.order(t03.order());
        allocate.put(t03);
        allocate.flip();
        this.f136337a = allocate;
        AtomicReference atomicReference = new AtomicReference();
        com.bumptech.glide.d.L(new w0(atomicReference, 1));
        r4.i iVar2 = (r4.i) atomicReference.get();
        iVar2.getClass();
        this.f136339c = iVar2;
    }

    @Override // y0.h
    public final long F0() {
        return this.f136338b.presentationTimeUs;
    }

    @Override // y0.h
    public final MediaCodec.BufferInfo Y() {
        return this.f136338b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f136339c.b(null);
    }

    @Override // y0.h
    public final long size() {
        return this.f136338b.size;
    }

    @Override // y0.h
    public final ByteBuffer t0() {
        return this.f136337a;
    }
}
