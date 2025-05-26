package rt0;

import d7.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tt0.q0;
import tt0.x;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f109966a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f109967b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f109968c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f109969d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f109970e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f109971f;

    public d(q0 q0Var, x xVar, x xVar2, Function1 onSegmentsChanged, x xVar3, x xVar4, int i13) {
        Function1 onIsRecordingChanged = q0Var;
        onIsRecordingChanged = (i13 & 1) != 0 ? c.f109960j : onIsRecordingChanged;
        Function1 onIsPlayingBackChanged = xVar;
        onIsPlayingBackChanged = (i13 & 2) != 0 ? c.f109961k : onIsPlayingBackChanged;
        Function1 onIsSeekingChanged = xVar2;
        onIsSeekingChanged = (i13 & 4) != 0 ? c.f109962l : onIsSeekingChanged;
        Function1 onCountdownChanged = xVar3;
        onCountdownChanged = (i13 & 16) != 0 ? c.f109963m : onCountdownChanged;
        Function1 onPhotoChanged = xVar4;
        onPhotoChanged = (i13 & 32) != 0 ? c.f109964n : onPhotoChanged;
        Intrinsics.checkNotNullParameter(onIsRecordingChanged, "onIsRecordingChanged");
        Intrinsics.checkNotNullParameter(onIsPlayingBackChanged, "onIsPlayingBackChanged");
        Intrinsics.checkNotNullParameter(onIsSeekingChanged, "onIsSeekingChanged");
        Intrinsics.checkNotNullParameter(onSegmentsChanged, "onSegmentsChanged");
        Intrinsics.checkNotNullParameter(onCountdownChanged, "onCountdownChanged");
        Intrinsics.checkNotNullParameter(onPhotoChanged, "onPhotoChanged");
        this.f109966a = onIsRecordingChanged;
        this.f109967b = onIsPlayingBackChanged;
        this.f109968c = onIsSeekingChanged;
        this.f109969d = onSegmentsChanged;
        this.f109970e = onCountdownChanged;
        this.f109971f = onPhotoChanged;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f109966a, dVar.f109966a) && Intrinsics.d(this.f109967b, dVar.f109967b) && Intrinsics.d(this.f109968c, dVar.f109968c) && Intrinsics.d(this.f109969d, dVar.f109969d) && Intrinsics.d(this.f109970e, dVar.f109970e) && Intrinsics.d(this.f109971f, dVar.f109971f);
    }

    public final int hashCode() {
        return this.f109971f.hashCode() + g.c(this.f109970e, g.c(this.f109969d, g.c(this.f109968c, g.c(this.f109967b, this.f109966a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "IdeaPinCreationCameraModelListener(onIsRecordingChanged=" + this.f109966a + ", onIsPlayingBackChanged=" + this.f109967b + ", onIsSeekingChanged=" + this.f109968c + ", onSegmentsChanged=" + this.f109969d + ", onCountdownChanged=" + this.f109970e + ", onPhotoChanged=" + this.f109971f + ")";
    }
}
