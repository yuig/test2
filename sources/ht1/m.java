package ht1;

import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final et1.g f70271a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.d0 f70272b;

    /* renamed from: c, reason: collision with root package name */
    public final et1.g f70273c;

    /* renamed from: d, reason: collision with root package name */
    public final et1.c f70274d;

    /* renamed from: e, reason: collision with root package name */
    public final j f70275e;

    /* renamed from: f, reason: collision with root package name */
    public final id1.a f70276f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f70277g;

    /* renamed from: h, reason: collision with root package name */
    public final v0 f70278h;

    /* renamed from: i, reason: collision with root package name */
    public final v0 f70279i;

    /* renamed from: j, reason: collision with root package name */
    public final et1.d f70280j;

    /* renamed from: k, reason: collision with root package name */
    public final n0 f70281k;

    public m(et1.g audioMixerNodeProvider, o0 pcmAlignerFactory, et1.g dynamicAudioConverterProvider, et1.d0 passThroughNodeFactory, id1.a componentProvider, et1.o replaceGapsWithSilenceProvider) {
        Intrinsics.checkNotNullParameter(audioMixerNodeProvider, "audioMixerNodeProvider");
        Intrinsics.checkNotNullParameter(pcmAlignerFactory, "pcmAlignerFactory");
        Intrinsics.checkNotNullParameter(dynamicAudioConverterProvider, "dynamicAudioConverterProvider");
        Intrinsics.checkNotNullParameter(passThroughNodeFactory, "passThroughNodeFactory");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(replaceGapsWithSilenceProvider, "replaceGapsWithSilenceProvider");
        this.f70271a = dynamicAudioConverterProvider;
        this.f70272b = passThroughNodeFactory;
        this.f70273c = replaceGapsWithSilenceProvider;
        et1.c cVar = (et1.c) componentProvider.get();
        this.f70274d = cVar;
        et1.v0 v0Var = (et1.v0) cVar;
        j jVar = (j) audioMixerNodeProvider.a(v0Var.b());
        this.f70275e = jVar;
        id1.a b13 = v0Var.b();
        this.f70276f = b13;
        b0 b0Var = (b0) dynamicAudioConverterProvider.a(b13);
        this.f70277g = new HashMap();
        this.f70278h = b0Var.f70165q;
        v0 a13 = et1.d0.a(passThroughNodeFactory);
        this.f70279i = a13;
        et1.d dVar = v0Var.f60109a;
        this.f70280j = dVar;
        id1.a componentProvider2 = v0Var.b();
        pcmAlignerFactory.getClass();
        Intrinsics.checkNotNullParameter(componentProvider2, "componentProvider");
        n0 n0Var = new n0((et1.c) componentProvider2.get(), pcmAlignerFactory, componentProvider2);
        this.f70281k = n0Var;
        v0Var.a(n0Var, "PCM Aligner");
        v0Var.a(audioMixerNodeProvider, "Audio Mixer");
        v0Var.a(a13, "Set Mixer Output Format");
        v0Var.a(b0Var, "Convert mixer output");
        et1.u0 u0Var = (et1.u0) dVar;
        u0Var.e(a13);
        u0Var.a(b0Var.f70167s, a13);
        u0Var.a(b0Var.f70166r, jVar.f70257k);
        u0Var.a(b0Var.f70163o, jVar.f70255i);
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70274d).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70274d).h(callback);
    }
}
