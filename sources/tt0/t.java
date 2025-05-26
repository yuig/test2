package tt0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f119208a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f119209b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f119210c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f119211d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f119212e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f119213f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f119214g;

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f119215h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f119216i;

    public t(Function0 deleteLastPage, Function1 toggleGhostMode, Function0 startRecording, Function1 stopRecording, Function0 toggleSpeedControls, Function1 toggleLens, Function0 toggleFlash, Function0 cancelCountdown, Function0 takePhoto) {
        Intrinsics.checkNotNullParameter(deleteLastPage, "deleteLastPage");
        Intrinsics.checkNotNullParameter(toggleGhostMode, "toggleGhostMode");
        Intrinsics.checkNotNullParameter(startRecording, "startRecording");
        Intrinsics.checkNotNullParameter(stopRecording, "stopRecording");
        Intrinsics.checkNotNullParameter(toggleSpeedControls, "toggleSpeedControls");
        Intrinsics.checkNotNullParameter(toggleLens, "toggleLens");
        Intrinsics.checkNotNullParameter(toggleFlash, "toggleFlash");
        Intrinsics.checkNotNullParameter(cancelCountdown, "cancelCountdown");
        Intrinsics.checkNotNullParameter(takePhoto, "takePhoto");
        this.f119208a = deleteLastPage;
        this.f119209b = toggleGhostMode;
        this.f119210c = startRecording;
        this.f119211d = stopRecording;
        this.f119212e = toggleSpeedControls;
        this.f119213f = toggleLens;
        this.f119214g = toggleFlash;
        this.f119215h = cancelCountdown;
        this.f119216i = takePhoto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f119208a, tVar.f119208a) && Intrinsics.d(this.f119209b, tVar.f119209b) && Intrinsics.d(this.f119210c, tVar.f119210c) && Intrinsics.d(this.f119211d, tVar.f119211d) && Intrinsics.d(this.f119212e, tVar.f119212e) && Intrinsics.d(this.f119213f, tVar.f119213f) && Intrinsics.d(this.f119214g, tVar.f119214g) && Intrinsics.d(this.f119215h, tVar.f119215h) && Intrinsics.d(this.f119216i, tVar.f119216i);
    }

    public final int hashCode() {
        return this.f119216i.hashCode() + d7.g.b(this.f119215h, d7.g.b(this.f119214g, d7.g.c(this.f119213f, d7.g.b(this.f119212e, d7.g.c(this.f119211d, d7.g.b(this.f119210c, d7.g.c(this.f119209b, this.f119208a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnControlEvent(deleteLastPage=");
        sb3.append(this.f119208a);
        sb3.append(", toggleGhostMode=");
        sb3.append(this.f119209b);
        sb3.append(", startRecording=");
        sb3.append(this.f119210c);
        sb3.append(", stopRecording=");
        sb3.append(this.f119211d);
        sb3.append(", toggleSpeedControls=");
        sb3.append(this.f119212e);
        sb3.append(", toggleLens=");
        sb3.append(this.f119213f);
        sb3.append(", toggleFlash=");
        sb3.append(this.f119214g);
        sb3.append(", cancelCountdown=");
        sb3.append(this.f119215h);
        sb3.append(", takePhoto=");
        return pk2.f.i(sb3, this.f119216i, ")");
    }
}
