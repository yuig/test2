package y92;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f138311a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f138312b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f138313c;

    public f(jm0.f onMoveStarted, jm0.g onMoveInProgress, jm0.g onMoveFinished) {
        Intrinsics.checkNotNullParameter(onMoveStarted, "onMoveStarted");
        Intrinsics.checkNotNullParameter(onMoveInProgress, "onMoveInProgress");
        Intrinsics.checkNotNullParameter(onMoveFinished, "onMoveFinished");
        this.f138311a = onMoveStarted;
        this.f138312b = onMoveInProgress;
        this.f138313c = onMoveFinished;
    }

    @Override // y92.e
    public final void D1(int i13) {
        this.f138311a.invoke(Integer.valueOf(i13));
    }

    @Override // y92.e
    public final void c0(int i13, int i14) {
        this.f138312b.invoke(Integer.valueOf(i13), Integer.valueOf(i14));
    }

    @Override // y92.e
    public final void o3(int i13, int i14) {
        this.f138313c.invoke(Integer.valueOf(i13), Integer.valueOf(i14));
    }
}
