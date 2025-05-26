package fq0;

import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import uk1.d;

/* loaded from: classes5.dex */
public final class a extends d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f62793g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f62794h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z13, f0 pinalyticsFactory, int i13) {
        super(pinalyticsFactory);
        this.f62793g = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
            this.f62794h = z13;
        } else {
            Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
            super(pinalyticsFactory);
            this.f62794h = z13;
        }
    }

    @Override // uk1.d
    public final g0 f() {
        switch (this.f62793g) {
            case 0:
                return g0.USER_PINS;
            default:
                return super.f();
        }
    }

    @Override // uk1.d
    public final a4 i() {
        int i13 = this.f62793g;
        boolean z13 = this.f62794h;
        switch (i13) {
            case 0:
                return z13 ? a4.USER_SELF : a4.USER_OTHERS;
            default:
                return z13 ? a4.FEED_KLP : a4.FEED_INTEREST;
        }
    }

    @Override // uk1.d
    public final d4 j() {
        switch (this.f62793g) {
            case 0:
                return d4.USER;
            default:
                return super.j();
        }
    }
}
