package ht1;

import android.media.MediaFormat;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final et1.x f70212a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.c f70213b;

    /* renamed from: c, reason: collision with root package name */
    public MediaFormat f70214c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f70215d;

    /* renamed from: e, reason: collision with root package name */
    public final v0 f70216e;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f70217f;

    /* renamed from: g, reason: collision with root package name */
    public final w f70218g;

    /* renamed from: h, reason: collision with root package name */
    public final v f70219h;

    /* renamed from: i, reason: collision with root package name */
    public final s0 f70220i;

    /* renamed from: j, reason: collision with root package name */
    public final l f70221j;

    /* renamed from: k, reason: collision with root package name */
    public final v0 f70222k;

    /* renamed from: l, reason: collision with root package name */
    public final v0 f70223l;

    /* renamed from: m, reason: collision with root package name */
    public final v0 f70224m;

    /* renamed from: n, reason: collision with root package name */
    public final f f70225n;

    public g(long j13, long j14, long j15, et1.r trimAudioToStartTimeFactory, et1.r trimAudioToEndTimeFactory, t.a startTimeSetterFactory, et1.d0 passThroughNodeFactory, t.a mediaPacketToAudioPacketFactory, et1.x audioDecoderFactory, et1.c mutableSubcomponent) {
        Intrinsics.checkNotNullParameter(trimAudioToStartTimeFactory, "trimAudioToStartTimeFactory");
        Intrinsics.checkNotNullParameter(trimAudioToEndTimeFactory, "trimAudioToEndTimeFactory");
        Intrinsics.checkNotNullParameter(startTimeSetterFactory, "startTimeSetterFactory");
        Intrinsics.checkNotNullParameter(passThroughNodeFactory, "passThroughNodeFactory");
        Intrinsics.checkNotNullParameter(mediaPacketToAudioPacketFactory, "mediaPacketToAudioPacketFactory");
        Intrinsics.checkNotNullParameter(audioDecoderFactory, "audioDecoderFactory");
        Intrinsics.checkNotNullParameter(mutableSubcomponent, "mutableSubcomponent");
        this.f70212a = audioDecoderFactory;
        this.f70213b = mutableSubcomponent;
        v0 a13 = et1.d0.a(passThroughNodeFactory);
        this.f70215d = a13;
        v0 a14 = et1.d0.a(passThroughNodeFactory);
        this.f70216e = a14;
        v0 a15 = et1.d0.a(passThroughNodeFactory);
        this.f70217f = a15;
        et1.h0 simpleProducerFactory = trimAudioToStartTimeFactory.f60083a;
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "$simpleProducerFactory");
        simpleProducerFactory.getClass();
        w wVar = new w(j13, new mt1.j());
        this.f70218g = wVar;
        et1.h0 simpleProducerFactory2 = trimAudioToEndTimeFactory.f60083a;
        Intrinsics.checkNotNullParameter(simpleProducerFactory2, "$simpleProducerFactory");
        simpleProducerFactory2.getClass();
        v vVar = new v(j14, new mt1.j());
        this.f70219h = vVar;
        startTimeSetterFactory.getClass();
        s0 s0Var = new s0(j15);
        this.f70220i = s0Var;
        mediaPacketToAudioPacketFactory.getClass();
        l lVar = new l(1);
        this.f70221j = lVar;
        this.f70222k = a13;
        this.f70223l = a14;
        this.f70224m = a15;
        f fVar = new f(this, 0);
        this.f70225n = fVar;
        et1.v0 v0Var = (et1.v0) mutableSubcomponent;
        v0Var.a(a13, "Decode Audio");
        v0Var.a(a14, "On Audio Decoded");
        v0Var.a(a15, "On Output Format Changed");
        v0Var.a(fVar, "Set Input Format");
        v0Var.a(lVar, "Convert MediaPacket to AudioPacket");
        v0Var.a(wVar, "Trim audio to input offset");
        v0Var.a(vVar, "Trim audio to input end time");
        v0Var.a(s0Var, "Offset timestamps to output start time");
        e producePacketCallback = e.f70209i;
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        a13.f88158a = producePacketCallback;
    }

    public final et1.d a() {
        return ((et1.v0) this.f70213b).f60109a;
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70213b).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70213b).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70213b.j(callback);
    }

    public final String toString() {
        return "AudioDecoderPipeline inputFormat=[" + this.f70214c + "]";
    }
}
