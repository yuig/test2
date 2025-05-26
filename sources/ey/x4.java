package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x4 extends w4 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f60623j = 1;

    public /* synthetic */ x4(int i13, long j13, b0 b0Var, Runnable runnable, boolean z13, boolean z14) {
        this((i13 & 16) != 0 ? 10000L : j13, b0Var, runnable, z13, z14, false);
    }

    @Override // ey.c0
    public final boolean b() {
        switch (this.f60623j) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(long j13, b0 tag, Runnable runnable, boolean z13, boolean z14, boolean z15) {
        super(runnable, tag, z13, z14, j13, z15);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    public /* synthetic */ x4(Runnable runnable, b0 b0Var, boolean z13) {
        this(runnable, b0Var, z13, 10000L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(Runnable runnable, b0 tag, boolean z13, long j13) {
        super(j13, tag, runnable, z13);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }
}
