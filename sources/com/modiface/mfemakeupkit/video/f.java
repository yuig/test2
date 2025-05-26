package com.modiface.mfemakeupkit.video;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private d f34706a = d.UNINITIALIZED;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodec f34707b = null;

    /* renamed from: c, reason: collision with root package name */
    private Surface f34708c = null;

    /* renamed from: d, reason: collision with root package name */
    private MediaCodec.BufferInfo f34709d = new MediaCodec.BufferInfo();

    /* renamed from: e, reason: collision with root package name */
    private boolean f34710e = false;

    public void a(@NonNull String str) {
        if (d()) {
            return;
        }
        this.f34707b = MediaCodec.createEncoderByType(str);
        this.f34706a = d.INITIALIZED;
    }

    public Surface b() {
        return this.f34708c;
    }

    public MediaFormat c() {
        if (d()) {
            return this.f34707b.getOutputFormat();
        }
        return null;
    }

    public boolean d() {
        return this.f34706a != d.UNINITIALIZED;
    }

    public boolean e() {
        return this.f34706a == d.STARTED;
    }

    public void f() {
        if (e()) {
            try {
                this.f34707b.stop();
            } catch (IllegalStateException unused) {
            }
        }
        Surface surface = this.f34708c;
        if (surface != null) {
            surface.release();
            this.f34708c = null;
        }
        if (d()) {
            this.f34707b.release();
            this.f34707b = null;
            this.f34706a = d.UNINITIALIZED;
        }
        this.f34709d = new MediaCodec.BufferInfo();
        this.f34710e = false;
    }

    public void g() {
        if (e()) {
            this.f34707b.signalEndOfInputStream();
        }
    }

    public g b(long j13) {
        if (e() && !this.f34710e) {
            ByteBuffer[] inputBuffers = this.f34707b.getInputBuffers();
            int dequeueInputBuffer = this.f34707b.dequeueInputBuffer(j13);
            if (dequeueInputBuffer >= 0) {
                ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                byteBuffer.clear();
                return new g(dequeueInputBuffer, byteBuffer);
            }
        }
        return null;
    }

    public void a(MediaFormat[] mediaFormatArr, boolean z13) {
        if (d()) {
            for (int i13 = 0; i13 < mediaFormatArr.length; i13++) {
                try {
                    this.f34707b.configure(mediaFormatArr[i13], (Surface) null, (MediaCrypto) null, 1);
                    break;
                } catch (MediaCodec.CryptoException | IllegalStateException e13) {
                    if (i13 >= mediaFormatArr.length - 1) {
                        throw e13;
                    }
                }
            }
            if (z13) {
                Surface surface = this.f34708c;
                if (surface != null) {
                    surface.release();
                    this.f34708c = null;
                }
                this.f34708c = this.f34707b.createInputSurface();
            }
            this.f34707b.start();
            this.f34706a = d.STARTED;
        }
    }

    public g a(long j13) {
        ByteBuffer byteBuffer = null;
        if (!e() || this.f34710e) {
            return null;
        }
        int dequeueOutputBuffer = this.f34707b.dequeueOutputBuffer(this.f34709d, j13);
        if (dequeueOutputBuffer >= 0 && (byteBuffer = this.f34707b.getOutputBuffers()[dequeueOutputBuffer]) != null) {
            MediaCodec.BufferInfo bufferInfo = this.f34709d;
            if (bufferInfo.size > 0) {
                byteBuffer.position(bufferInfo.offset);
                MediaCodec.BufferInfo bufferInfo2 = this.f34709d;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
        }
        if ((this.f34709d.flags & 4) != 0) {
            this.f34710e = true;
        }
        return new g(dequeueOutputBuffer, byteBuffer);
    }

    public void a(g gVar) {
        if (d() && gVar != null && gVar.a()) {
            this.f34707b.releaseOutputBuffer(gVar.f34711a, false);
        }
    }

    public MediaCodec.BufferInfo a() {
        return this.f34709d;
    }

    public void a(g gVar, int i13, int i14, long j13) {
        if (gVar == null || !gVar.a()) {
            return;
        }
        this.f34707b.queueInputBuffer(gVar.f34711a, i13, i14, j13, 0);
    }
}
