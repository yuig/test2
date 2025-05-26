package ln1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public f f84044a;

    /* renamed from: b, reason: collision with root package name */
    public c f84045b;

    /* renamed from: c, reason: collision with root package name */
    public e f84046c;

    /* renamed from: d, reason: collision with root package name */
    public i0 f84047d;

    /* renamed from: e, reason: collision with root package name */
    public fm1.c f84048e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84049f;

    public l(d displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f84044a = displayState.f83999a;
        this.f84045b = displayState.f84000b;
        this.f84046c = displayState.f84001c;
        this.f84047d = displayState.f84002d;
        this.f84048e = displayState.f84003e;
        this.f84049f = displayState.f84004f;
    }

    public final void a(e loadingState) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        this.f84046c = loadingState;
    }

    public final void b(yk1.i loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        this.f84046c = dl2.b.T2(loadState);
    }

    public final void c(f size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f84044a = size;
    }

    public final void d(fm1.c visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f84048e = visibility;
    }
}
