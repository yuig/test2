package ht1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final et1.g f70296a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.g f70297b;

    /* renamed from: c, reason: collision with root package name */
    public final t.a f70298c;

    public o0(et1.g audioQueueProvider, et1.g minimumProvider, t.a durationBasedAudioPacketTimestampSetterFactory) {
        Intrinsics.checkNotNullParameter(audioQueueProvider, "audioQueueProvider");
        Intrinsics.checkNotNullParameter(minimumProvider, "minimumProvider");
        Intrinsics.checkNotNullParameter(durationBasedAudioPacketTimestampSetterFactory, "durationBasedAudioPacketTimestampSetterFactory");
        this.f70296a = audioQueueProvider;
        this.f70297b = minimumProvider;
        this.f70298c = durationBasedAudioPacketTimestampSetterFactory;
    }
}
