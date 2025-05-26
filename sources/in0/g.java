package in0;

import android.media.MediaCodec;
import android.opengl.GLES20;
import android.util.Size;
import co2.c0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends gn0.a {

    /* renamed from: c, reason: collision with root package name */
    public final c0 f72816c;

    /* renamed from: d, reason: collision with root package name */
    public final h f72817d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f72818e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f72819f;

    /* renamed from: g, reason: collision with root package name */
    public int f72820g;

    /* renamed from: h, reason: collision with root package name */
    public final ByteBuffer f72821h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fn0.e extractor, c0 framesChannel, h renderer, Size inputSize, jh0.d endOfStreamAction) {
        super(extractor);
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        Intrinsics.checkNotNullParameter(framesChannel, "framesChannel");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(inputSize, "inputSize");
        Intrinsics.checkNotNullParameter(endOfStreamAction, "endOfStreamAction");
        this.f72816c = framesChannel;
        this.f72817d = renderer;
        this.f72818e = inputSize;
        this.f72819f = endOfStreamAction;
        this.f72821h = ByteBuffer.allocateDirect(inputSize.getHeight() * inputSize.getWidth() * 4).order(ByteOrder.nativeOrder());
    }

    @Override // gn0.a
    public final Object a(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, int i13, bl2.c cVar) {
        MediaCodec mediaCodec2;
        int i14;
        boolean z13;
        fn0.f fVar;
        int i15 = bufferInfo.flags;
        if ((i15 & 2) != 0) {
            return Unit.f80348a;
        }
        if ((i15 & 4) != 0) {
            mediaCodec.stop();
            this.f72819f.invoke();
            int i16 = this.f72820g;
            this.f72820g = i16 + 1;
            fVar = new fn0.f(i16, bn0.b.f23562c, 0, bufferInfo.presentationTimeUs, 4, true);
        } else {
            if (bufferInfo.size == 0 || bufferInfo.presentationTimeUs < 0) {
                mediaCodec2 = mediaCodec;
                i14 = i13;
                z13 = false;
            } else {
                z13 = true;
                mediaCodec2 = mediaCodec;
                i14 = i13;
            }
            mediaCodec2.releaseOutputBuffer(i14, z13);
            if (z13) {
                zn2.h.f142318a.getClass();
                zn2.f.f142316a.getClass();
                long a13 = zn2.f.a();
                this.f72817d.e(0L, false);
                Size size = this.f72818e;
                int width = size.getWidth();
                int height = size.getHeight();
                ByteBuffer outFrameBuffer = this.f72821h;
                Intrinsics.checkNotNullExpressionValue(outFrameBuffer, "outFrameBuffer");
                Intrinsics.checkNotNullParameter(outFrameBuffer, "pixelBuffer");
                outFrameBuffer.position(0);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, outFrameBuffer);
                outFrameBuffer.rewind();
                zn2.b.e(zn2.g.a(a13));
                int i17 = this.f72820g;
                this.f72820g = i17 + 1;
                Intrinsics.checkNotNullExpressionValue(outFrameBuffer, "outFrameBuffer");
                fVar = new fn0.f(i17, new bn0.b(outFrameBuffer, size), bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags, false);
            } else {
                fVar = null;
            }
        }
        if (fVar != null) {
            fVar.toString();
            Object o13 = this.f72816c.o(fVar, cVar);
            if (o13 == cl2.a.COROUTINE_SUSPENDED) {
                return o13;
            }
        }
        return Unit.f80348a;
    }
}
