package jc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f75436a;

    /* renamed from: b, reason: collision with root package name */
    public final a f75437b;

    /* renamed from: c, reason: collision with root package name */
    public final r f75438c;

    public s(boolean z13, int i13) {
        this(true, z13 ? a.Bottom : a.None);
    }

    public s(boolean z13, a animation, r source) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f75436a = z13;
        this.f75437b = animation;
        this.f75438c = source;
    }

    public /* synthetic */ s(boolean z13, a aVar) {
        this(z13, aVar, r.UNKNOWN);
    }

    public s() {
        this(true, a.None);
    }

    public s(boolean z13) {
        this(z13, a.Bottom);
    }
}
