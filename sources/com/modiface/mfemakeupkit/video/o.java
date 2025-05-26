package com.modiface.mfemakeupkit.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private n f34725a = n.UNINITIALIZED;

    /* renamed from: b, reason: collision with root package name */
    private boolean f34726b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34727c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34728d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f34729e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f34730f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f34731g = 0;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private h f34732h = new h();

    /* renamed from: i, reason: collision with root package name */
    private MediaMuxer f34733i = null;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    private final p f34734j;

    public o(@NonNull p pVar) {
        this.f34734j = pVar;
    }

    public void a(@NonNull String str, boolean z13) {
        b();
        this.f34733i = new MediaMuxer(str, 0);
        this.f34725a = n.INITIALIZED;
        this.f34728d = z13;
        this.f34732h = new h();
    }

    public void b() {
        if (this.f34725a == n.STARTED) {
            h hVar = this.f34732h;
            if (hVar.f34713a > 0) {
                try {
                    if (this.f34727c && hVar.f34714b <= 0) {
                        ByteBuffer wrap = ByteBuffer.wrap(new byte[this.f34734j.f34756j]);
                        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                        bufferInfo.offset = 0;
                        bufferInfo.presentationTimeUs = this.f34731g;
                        bufferInfo.size = this.f34734j.f34756j;
                        bufferInfo.flags = 1;
                        this.f34733i.writeSampleData(this.f34730f, wrap, bufferInfo);
                        this.f34732h.f34714b = 1L;
                    }
                } catch (IllegalArgumentException | IllegalStateException unused) {
                    this.f34732h.f34714b = 0L;
                }
                if (!this.f34727c || this.f34732h.f34714b > 0) {
                    try {
                        this.f34733i.stop();
                    } catch (IllegalStateException unused2) {
                    }
                }
            }
        }
        MediaMuxer mediaMuxer = this.f34733i;
        if (mediaMuxer != null) {
            mediaMuxer.release();
            this.f34733i = null;
        }
        this.f34725a = n.UNINITIALIZED;
        this.f34731g = 0L;
        this.f34726b = false;
        this.f34727c = false;
        this.f34728d = false;
    }

    public void a(boolean z13) {
        this.f34728d = z13;
    }

    @NonNull
    public h a() {
        return this.f34732h;
    }

    public boolean a(MediaFormat mediaFormat) {
        if (this.f34728d && this.f34725a == n.INITIALIZED && !this.f34727c && mediaFormat != null) {
            this.f34730f = this.f34733i.addTrack(mediaFormat);
            this.f34727c = true;
        }
        return !this.f34728d || this.f34727c;
    }

    public void a(g gVar, MediaCodec.BufferInfo bufferInfo) {
        if (this.f34728d && this.f34725a == n.STARTED && this.f34727c && gVar != null && gVar.a() && bufferInfo != null && bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
            this.f34733i.writeSampleData(this.f34730f, gVar.f34712b, bufferInfo);
            h hVar = this.f34732h;
            hVar.f34714b++;
            hVar.f34715c = true;
        }
    }

    public boolean b(MediaFormat mediaFormat) {
        if (this.f34725a == n.INITIALIZED && !this.f34726b && mediaFormat != null) {
            this.f34729e = this.f34733i.addTrack(mediaFormat);
            this.f34726b = true;
        }
        return this.f34726b;
    }

    public void b(g gVar, MediaCodec.BufferInfo bufferInfo) {
        if (this.f34725a == n.UNINITIALIZED || !this.f34726b || gVar == null || !gVar.a() || bufferInfo == null || bufferInfo.size <= 0 || (bufferInfo.flags & 2) != 0) {
            return;
        }
        if (this.f34725a == n.INITIALIZED && this.f34726b && (!this.f34728d || this.f34727c)) {
            this.f34733i.start();
            this.f34731g = bufferInfo.presentationTimeUs;
            this.f34725a = n.STARTED;
        }
        if (this.f34725a != n.STARTED) {
            return;
        }
        this.f34733i.writeSampleData(this.f34729e, gVar.f34712b, bufferInfo);
        this.f34732h.f34713a++;
    }
}
