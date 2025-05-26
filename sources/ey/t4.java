package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t4 extends w4 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f60579j = 1;

    public /* synthetic */ t4(int i13, long j13, b0 b0Var, Runnable runnable, boolean z13, boolean z14, boolean z15, boolean z16) {
        this((i13 & 32) != 0 ? 10000L : j13, b0Var, runnable, z13, z14, (i13 & 16) != 0 ? false : z15, (i13 & 64) != 0 ? false : z16);
    }

    @Override // ey.c0
    public final boolean b() {
        switch (this.f60579j) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public /* synthetic */ t4(int i13, b0 b0Var, Runnable runnable, boolean z13, boolean z14) {
        this(10000L, b0Var, runnable, z13, z14, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(long j13, b0 tag, Runnable runnable, boolean z13, boolean z14, boolean z15) {
        super(j13, tag, runnable, z13, z14, z15, 0);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(long j13, b0 tag, Runnable runnable, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(runnable, tag, z13, z14, j13, z15, z16);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }
}
