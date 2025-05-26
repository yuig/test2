package hr1;

import dl1.b0;
import kotlin.jvm.internal.Intrinsics;
import so.ka;

/* loaded from: classes2.dex */
public final class k extends e {

    /* renamed from: i, reason: collision with root package name */
    public final String f70000i;

    /* renamed from: j, reason: collision with root package name */
    public final ka f70001j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(mr1.c activityProvider, uj2.q resultsFeed, String logValue, ka facebookLoginFactory) {
        super(activityProvider, resultsFeed);
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        Intrinsics.checkNotNullParameter(logValue, "logValue");
        Intrinsics.checkNotNullParameter(facebookLoginFactory, "facebookLoginFactory");
        this.f70000i = logValue;
        this.f70001j = facebookLoginFactory;
    }

    @Override // or1.p
    public final String a() {
        return this.f70000i;
    }

    @Override // lr1.g
    public final kk2.m c() {
        kk2.m mVar = new kk2.m(i(), new b0(14, new j(this, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    public final hk2.o i() {
        hk2.o c13 = new fk2.c(4, g(), new b0(15, new j(this, 1))).c(e.h());
        Intrinsics.checkNotNullExpressionValue(c13, "andThen(...)");
        return c13;
    }

    public final kk2.m j() {
        kk2.m k13 = i().k(new oo1.d(13, d.f69987k));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }
}
