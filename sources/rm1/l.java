package rm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public q f108714a;

    /* renamed from: b, reason: collision with root package name */
    public i f108715b;

    public l(f displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f108714a = displayState.f108702a;
        this.f108715b = displayState.f108703b;
    }

    public final void a(q icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f108714a = icon;
    }

    public final void b(i size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f108715b = size;
    }
}
