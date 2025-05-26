package ht1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final tb0.h f70181a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.c f70182b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f70183c;

    /* renamed from: d, reason: collision with root package name */
    public final et1.b f70184d;

    /* renamed from: e, reason: collision with root package name */
    public final long f70185e;

    /* renamed from: f, reason: collision with root package name */
    public final nt1.a f70186f;

    /* renamed from: g, reason: collision with root package name */
    public MediaFormat f70187g;

    /* renamed from: h, reason: collision with root package name */
    public final int f70188h;

    /* renamed from: i, reason: collision with root package name */
    public int f70189i;

    /* renamed from: j, reason: collision with root package name */
    public final MediaCodec.BufferInfo f70190j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f70191k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f70192l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f70193m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f70194n;

    /* renamed from: o, reason: collision with root package name */
    public long f70195o;

    /* renamed from: p, reason: collision with root package name */
    public final int f70196p;

    /* renamed from: q, reason: collision with root package name */
    public final nt1.e f70197q;

    /* renamed from: r, reason: collision with root package name */
    public final b f70198r;

    /* renamed from: s, reason: collision with root package name */
    public final MediaCodec f70199s;

    /* renamed from: t, reason: collision with root package name */
    public Function0 f70200t;

    /* renamed from: u, reason: collision with root package name */
    public final a f70201u;

    /* renamed from: v, reason: collision with root package name */
    public final b f70202v;

    /* renamed from: w, reason: collision with root package name */
    public final mt1.j f70203w;

    /* renamed from: x, reason: collision with root package name */
    public final mt1.j f70204x;

    /* renamed from: y, reason: collision with root package name */
    public final c f70205y;

    public d(tb0.h crashReporting, et1.h0 simpleProducerFactory, et1.c mutableSubcomponent, MediaFormat encodedFormat, boolean z13, et1.b mediaCodecInputBufferCopier) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        Intrinsics.checkNotNullParameter(mutableSubcomponent, "mutableSubcomponent");
        Intrinsics.checkNotNullParameter(encodedFormat, "encodedFormat");
        Intrinsics.checkNotNullParameter(mediaCodecInputBufferCopier, "mediaCodecInputBufferCopier");
        this.f70181a = crashReporting;
        this.f70182b = mutableSubcomponent;
        this.f70183c = z13;
        this.f70184d = mediaCodecInputBufferCopier;
        this.f70185e = 10000L;
        this.f70188h = 1;
        this.f70189i = 1;
        this.f70190j = new MediaCodec.BufferInfo();
        this.f70191k = ByteBuffer.allocateDirect(8192);
        this.f70197q = new nt1.e(0, 1);
        b bVar = new b(0);
        this.f70198r = bVar;
        try {
            String c13 = nt1.d.c(encodedFormat);
            Intrinsics.f(c13);
            MediaCodec createEncoderByType = z13 ? MediaCodec.createEncoderByType(c13) : MediaCodec.createDecoderByType(c13);
            Intrinsics.f(createEncoderByType);
            this.f70199s = createEncoderByType;
            a aVar = new a(this);
            this.f70201u = aVar;
            this.f70202v = bVar;
            simpleProducerFactory.getClass();
            mt1.j jVar = new mt1.j();
            this.f70203w = jVar;
            this.f70204x = jVar;
            c cVar = new c(this);
            this.f70205y = cVar;
            et1.v0 v0Var = (et1.v0) mutableSubcomponent;
            v0Var.a(aVar, "On Input Format Changed");
            v0Var.a(bVar, "On Output Format Changed");
            v0Var.a(jVar, "On Audio Processed");
            v0Var.a(cVar, "Process Audio");
            createEncoderByType.configure(encodedFormat, (Surface) null, (MediaCrypto) null, z13 ? 1 : 0);
            createEncoderByType.start();
            this.f70193m = true;
            MediaFormat inputFormat = createEncoderByType.getInputFormat();
            Intrinsics.checkNotNullExpressionValue(inputFormat, "getInputFormat(...)");
            nt1.a r13 = e0.t.r(inputFormat);
            this.f70186f = r13;
            if (z13) {
                ft1.i g13 = r13.g();
                Intrinsics.f(g13);
                this.f70188h = g13.getSize();
                Integer h10 = r13.h();
                Intrinsics.f(h10);
                int intValue = h10.intValue();
                ft1.i g14 = r13.g();
                Intrinsics.f(g14);
                this.f70196p = g14.getSize() * intValue;
                Integer b13 = r13.b();
                Intrinsics.f(b13);
                this.f70197q = new nt1.e(1, b13.intValue());
            }
            ((et1.u0) ((et1.v0) mutableSubcomponent).f60109a).e(aVar);
        } catch (IOException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public static final boolean a(d dVar, et1.k kVar) {
        long j13 = dVar.f70185e;
        if (j13 >= 0) {
            j13 = 0;
        }
        MediaCodec mediaCodec = dVar.f70199s;
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j13);
        if (dequeueInputBuffer < 0) {
            return false;
        }
        ByteBuffer inputBuffer = mediaCodec.getInputBuffer(dequeueInputBuffer);
        Intrinsics.f(inputBuffer);
        dVar.f70184d.a(dVar.f70188h, kVar.f60038b, inputBuffer);
        dVar.f70199s.queueInputBuffer(dequeueInputBuffer, 0, kVar.f60038b.limit(), kVar.f60040d, (dVar.f70183c || !kVar.f60039c) ? 0 : 1);
        return true;
    }

    public static final void b(d dVar) {
        int dequeueInputBuffer;
        boolean z13 = dVar.f70193m;
        MediaCodec mediaCodec = dVar.f70199s;
        if (z13) {
            do {
                long j13 = dVar.f70185e;
                dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j13);
                if (dequeueInputBuffer < 0) {
                    dVar.c(j13);
                }
            } while (dequeueInputBuffer < 0);
            dVar.f70199s.queueInputBuffer(dequeueInputBuffer, 0, 0, dVar.f70195o, 4);
            dVar.c(-1L);
            mediaCodec.stop();
            dVar.f70193m = false;
            dVar.f70194n = true;
        }
        mediaCodec.release();
        dVar.f70198r.f();
        dVar.f70203w.f();
        Function0 function0 = dVar.f70200t;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void c(long j13) {
        boolean z13;
        while (!this.f70192l) {
            MediaCodec mediaCodec = this.f70199s;
            MediaCodec.BufferInfo bufferInfo = this.f70190j;
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j13);
            while (true) {
                z13 = this.f70183c;
                if (dequeueOutputBuffer >= 0) {
                    break;
                }
                if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
                    String str = z13 ? "encoder" : "decoder";
                    this.f70181a.h("Codec type [" + str + "] output format changed from [" + this.f70187g + "] to [" + outputFormat + "]");
                    this.f70187g = outputFormat;
                    if (!z13) {
                        ft1.i g13 = e0.t.r(outputFormat).g();
                        Intrinsics.f(g13);
                        this.f70189i = g13.getSize();
                    }
                    MediaFormat packet = mediaCodec.getOutputFormat();
                    Intrinsics.checkNotNullExpressionValue(packet, "getOutputFormat(...)");
                    b bVar = this.f70198r;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(packet, "packet");
                    Function1 function1 = bVar.f70147b;
                    if (function1 != null) {
                        function1.invoke(packet);
                    }
                } else if (dequeueOutputBuffer == -1) {
                    dequeueOutputBuffer = -1;
                    break;
                }
                dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            }
            if (dequeueOutputBuffer < 0) {
                return;
            }
            if ((bufferInfo.flags & 4) != 0) {
                this.f70192l = true;
                if (bufferInfo.size == 0) {
                    return;
                }
            }
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
            Intrinsics.f(outputBuffer);
            boolean z14 = (bufferInfo.flags & 2) != 0;
            if (this.f70191k.capacity() < outputBuffer.remaining()) {
                this.f70191k = ByteBuffer.allocateDirect(outputBuffer.remaining());
            }
            this.f70191k.clear();
            this.f70191k.order(outputBuffer.order());
            ByteBuffer dispatchBuffer = this.f70191k;
            Intrinsics.checkNotNullExpressionValue(dispatchBuffer, "dispatchBuffer");
            nt1.d.f(this.f70189i, dispatchBuffer, outputBuffer);
            this.f70191k.flip();
            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            if (!z14 && this.f70191k.hasRemaining()) {
                boolean z15 = !z13;
                boolean z16 = (bufferInfo.flags & 1) != 0;
                MediaFormat mediaFormat = this.f70187g;
                Intrinsics.f(mediaFormat);
                nt1.a r13 = e0.t.r(mediaFormat);
                ByteBuffer dispatchBuffer2 = this.f70191k;
                Intrinsics.checkNotNullExpressionValue(dispatchBuffer2, "dispatchBuffer");
                this.f70203w.e(new et1.k(r13, dispatchBuffer2, z15 | z16, bufferInfo.presentationTimeUs));
            }
        }
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70182b).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70182b).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70182b.j(callback);
    }

    public final String toString() {
        Object r13;
        Object r14;
        boolean z13 = this.f70194n;
        MediaCodec mediaCodec = this.f70199s;
        if (z13) {
            r13 = new nt1.b(z0.d());
        } else {
            MediaFormat inputFormat = mediaCodec.getInputFormat();
            Intrinsics.checkNotNullExpressionValue(inputFormat, "getInputFormat(...)");
            r13 = e0.t.r(inputFormat);
        }
        if (this.f70194n) {
            r14 = new nt1.b(z0.d());
        } else {
            MediaFormat outputFormat = mediaCodec.getOutputFormat();
            Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
            r14 = e0.t.r(outputFormat);
        }
        boolean z14 = this.f70192l;
        boolean z15 = this.f70193m;
        boolean z16 = this.f70194n;
        int i13 = this.f70189i;
        StringBuilder sb3 = new StringBuilder("AudioCodecNode isEncoder=[");
        sb3.append(this.f70183c);
        sb3.append("] inputFormat=[");
        sb3.append(r13);
        sb3.append("] outputFormat=[");
        sb3.append(r14);
        sb3.append("] isCodecEOS=[");
        sb3.append(z14);
        sb3.append("] codecStarted=[");
        a.c.v(sb3, z15, "] codecFinished=[", z16, "] input word size [");
        sb3.append(this.f70188h);
        sb3.append("] output word size [");
        sb3.append(i13);
        sb3.append("]");
        return sb3.toString();
    }
}
