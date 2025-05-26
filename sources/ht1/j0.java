package ht1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final et1.r f70258a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.s f70259b;

    /* renamed from: c, reason: collision with root package name */
    public final t.a f70260c;

    public j0(et1.r demuxerFactory, et1.s audioDecoderPipelineFactory, t.a volumeControlFactory) {
        Intrinsics.checkNotNullParameter(demuxerFactory, "demuxerFactory");
        Intrinsics.checkNotNullParameter(audioDecoderPipelineFactory, "audioDecoderPipelineFactory");
        Intrinsics.checkNotNullParameter(volumeControlFactory, "volumeControlFactory");
        this.f70258a = demuxerFactory;
        this.f70259b = audioDecoderPipelineFactory;
        this.f70260c = volumeControlFactory;
    }
}
