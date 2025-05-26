package hn0;

import android.media.MediaCodec;
import co2.b0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends gn0.a {

    /* renamed from: c, reason: collision with root package name */
    public final b0 f69629c;

    /* renamed from: d, reason: collision with root package name */
    public final h f69630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fn0.e extractor, b0 watermarkFramesChannel, h renderer) {
        super(extractor);
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        Intrinsics.checkNotNullParameter(watermarkFramesChannel, "watermarkFramesChannel");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f69629c = watermarkFramesChannel;
        this.f69630d = renderer;
    }

    @Override // gn0.a
    public final Object a(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, int i13, bl2.c cVar) {
        int i14 = bufferInfo.flags;
        if ((i14 & 2) != 0) {
            return Unit.f80348a;
        }
        if ((i14 & 4) == 0) {
            Object c13 = c(mediaCodec, i13, bufferInfo.presentationTimeUs, cVar);
            return c13 == cl2.a.COROUTINE_SUSPENDED ? c13 : Unit.f80348a;
        }
        mediaCodec.releaseOutputBuffer(i13, false);
        mediaCodec.stop();
        return Unit.f80348a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(2:3|(15:5|6|(1:(4:9|10|11|12)(2:44|45))(13:46|47|48|49|50|51|52|53|54|55|56|57|(1:59)(1:60))|13|14|15|(1:38)(1:19)|20|(4:24|(1:26)|27|28)|29|(1:31)|32|(1:34)|35|36))|72|6|(0)(0)|13|14|15|(1:17)|38|20|(5:22|24|(0)|27|28)|29|(0)|32|(0)|35|36|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0153 A[LOOP:0: B:25:0x0151->B:26:0x0153, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.media.MediaCodec r21, int r22, long r23, bl2.c r25) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hn0.g.c(android.media.MediaCodec, int, long, bl2.c):java.lang.Object");
    }
}
