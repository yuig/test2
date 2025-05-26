package ht1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final mt1.a f70282a;

    /* renamed from: b, reason: collision with root package name */
    public final mt1.d f70283b;

    public m0(o alignAudio, x onAudioAligned) {
        Intrinsics.checkNotNullParameter(alignAudio, "alignAudio");
        Intrinsics.checkNotNullParameter(onAudioAligned, "onAudioAligned");
        this.f70282a = alignAudio;
        this.f70283b = onAudioAligned;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.f70282a, m0Var.f70282a) && Intrinsics.d(this.f70283b, m0Var.f70283b);
    }

    public final int hashCode() {
        return this.f70283b.hashCode() + (this.f70282a.hashCode() * 31);
    }

    public final String toString() {
        return "PcmAlignerTrack(alignAudio=" + this.f70282a + ", onAudioAligned=" + this.f70283b + ")";
    }
}
