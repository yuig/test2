package ht1;

import android.media.MediaFormat;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h0 implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final et1.c f70232a;

    /* renamed from: b, reason: collision with root package name */
    public final c f70233b;

    /* renamed from: c, reason: collision with root package name */
    public final mt1.j f70234c;

    /* renamed from: d, reason: collision with root package name */
    public final n f70235d;

    public h0(MediaFormat formatToDecode, tb0.h crashReporting, et1.b mediaCodecInputBufferCopier, t.a mediaFormatToImmutableFactory, et1.h0 simpleProducerFactory, id1.a componentProvider) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(formatToDecode, "formatToDecode");
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(mediaFormatToImmutableFactory, "mediaFormatToImmutableFactory");
        Intrinsics.checkNotNullParameter(mediaCodecInputBufferCopier, "mediaCodecInputBufferCopier");
        et1.c cVar = (et1.c) componentProvider.get();
        this.f70232a = cVar;
        Object obj = componentProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        d dVar = new d(crashReporting, simpleProducerFactory, (et1.c) obj, formatToDecode, false, mediaCodecInputBufferCopier);
        this.f70233b = dVar.f70205y;
        this.f70234c = dVar.f70204x;
        mediaFormatToImmutableFactory.getClass();
        n nVar = new n(3);
        this.f70235d = nVar;
        et1.v0 v0Var = (et1.v0) cVar;
        v0Var.a(dVar, "Audio Codec");
        v0Var.a(nVar, "Adapt Codec's MediaFormat to an ImmutableMediaFormat");
        ((et1.u0) ((et1.v0) cVar).f60109a).a(nVar, dVar.f70202v);
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70232a).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70232a).h(callback);
    }
}
