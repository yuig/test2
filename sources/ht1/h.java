package ht1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final et1.c f70228a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f70229b;

    /* renamed from: c, reason: collision with root package name */
    public final a f70230c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f70231d;

    public h(MediaFormat encodedFormat, et1.m0 muxRender, id1.a componentProvider, et1.r fixedFrameCountPcmPacketForwarderFactory, t.a increasingAudioPacketTimestampCheckerFactory, t.a increasingMediaPacketTimestampCheckerFactory, et1.m muxRenderNodeFactory, et1.d0 passThroughNodeFactory, et1.y audioCodecFactory, t.a audioPacketToMediaPacketFactory) {
        nt1.c audioFormat;
        nt1.c r13;
        Intrinsics.checkNotNullParameter(encodedFormat, "outputFormat");
        Intrinsics.checkNotNullParameter(muxRender, "muxRender");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(fixedFrameCountPcmPacketForwarderFactory, "fixedFrameCountPcmPacketForwarderFactory");
        Intrinsics.checkNotNullParameter(increasingAudioPacketTimestampCheckerFactory, "increasingAudioPacketTimestampCheckerFactory");
        Intrinsics.checkNotNullParameter(increasingMediaPacketTimestampCheckerFactory, "increasingMediaPacketTimestampCheckerFactory");
        Intrinsics.checkNotNullParameter(muxRenderNodeFactory, "muxRenderNodeFactory");
        Intrinsics.checkNotNullParameter(passThroughNodeFactory, "passThroughNodeFactory");
        Intrinsics.checkNotNullParameter(audioCodecFactory, "audioCodecFactory");
        Intrinsics.checkNotNullParameter(audioPacketToMediaPacketFactory, "audioPacketToMediaPacketFactory");
        increasingAudioPacketTimestampCheckerFactory.getClass();
        g0 g0Var = new g0(0);
        increasingMediaPacketTimestampCheckerFactory.getClass();
        g0 g0Var2 = new g0(1);
        et1.c cVar = (et1.c) componentProvider.get();
        this.f70228a = cVar;
        et1.v0 v0Var = (et1.v0) cVar;
        id1.a mutableComponentProvider = v0Var.b();
        audioCodecFactory.getClass();
        Intrinsics.checkNotNullParameter(encodedFormat, "encodedFormat");
        Intrinsics.checkNotNullParameter(mutableComponentProvider, "mutableComponentProvider");
        Object obj = mutableComponentProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        et1.h0 h0Var = audioCodecFactory.f60122b;
        d dVar = new d(audioCodecFactory.f60121a, h0Var, (et1.c) obj, encodedFormat, true, audioCodecFactory.f60123c);
        boolean z13 = dVar.f70194n;
        MediaCodec mediaCodec = dVar.f70199s;
        if (z13) {
            audioFormat = new nt1.b(z0.d());
        } else {
            MediaFormat inputFormat = mediaCodec.getInputFormat();
            Intrinsics.checkNotNullExpressionValue(inputFormat, "getInputFormat(...)");
            audioFormat = e0.t.r(inputFormat);
        }
        if (dVar.f70194n) {
            r13 = new nt1.b(z0.d());
        } else {
            MediaFormat outputFormat = mediaCodec.getOutputFormat();
            Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
            r13 = e0.t.r(outputFormat);
        }
        int x13 = l3.c.x(0, r13);
        et1.h0 simpleProducerFactory = fixedFrameCountPcmPacketForwarderFactory.f60083a;
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "$simpleProducerFactory");
        Intrinsics.checkNotNullParameter(audioFormat, "audioFormat");
        c0 c0Var = new c0(x13, simpleProducerFactory, audioFormat);
        u uVar = new u();
        audioPacketToMediaPacketFactory.getClass();
        n nVar = new n(0);
        lt1.g a13 = muxRenderNodeFactory.a(muxRender, et1.j0.AUDIO, v0Var.b());
        this.f70229b = g0Var;
        this.f70230c = dVar.f70201u;
        v0 a14 = et1.d0.a(passThroughNodeFactory);
        this.f70231d = a14;
        v0Var.a(g0Var, "Verify incoming timestamps are increasing");
        v0Var.a(g0Var2, "Verify pipeline sends increasing timestamps to muxer");
        v0Var.a(c0Var, "Send Ideally-sized packets for encoder");
        v0Var.a(dVar, "Encode audio");
        v0Var.a(uVar, "Discard priming packets");
        v0Var.a(a13, "Audio stream muxer");
        v0Var.a(a14, "Port: On Presentation Time Output");
        v0Var.a(nVar, "Convert Output AudioPacket to MediaPacket");
        ((et1.u0) a()).a(c0Var, g0Var);
        ((et1.u0) a()).a(nVar, c0Var);
        ((et1.u0) a()).a(dVar.f70205y, nVar);
        ((et1.u0) a()).a(uVar, dVar.f70204x);
        ((et1.u0) a()).a(g0Var2, uVar);
        ((et1.u0) a()).a(a13.f84832k, g0Var2);
        ((et1.u0) a()).a(a13.f84829h, dVar.f70202v);
        ((et1.u0) a()).a(a14, a13.f84831j);
    }

    public final et1.d a() {
        return ((et1.v0) this.f70228a).f60109a;
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70228a).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70228a).h(callback);
    }

    public final String toString() {
        return "AudioExportPipeline";
    }
}
