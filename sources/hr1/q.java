package hr1;

import kotlin.jvm.internal.Intrinsics;
import so.ka;
import so.la;
import uj2.b0;

/* loaded from: classes4.dex */
public final class q extends e {

    /* renamed from: i, reason: collision with root package name */
    public final String f70013i;

    /* renamed from: j, reason: collision with root package name */
    public final ka f70014j;

    /* renamed from: k, reason: collision with root package name */
    public final la f70015k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(mr1.c activityProvider, uj2.q resultsFeed, String logValue, ka facebookLoginFactory, la facebookConnectionFactory) {
        super(activityProvider, resultsFeed);
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        Intrinsics.checkNotNullParameter(logValue, "logValue");
        Intrinsics.checkNotNullParameter(facebookLoginFactory, "facebookLoginFactory");
        Intrinsics.checkNotNullParameter(facebookConnectionFactory, "facebookConnectionFactory");
        this.f70013i = logValue;
        this.f70014j = facebookLoginFactory;
        this.f70015k = facebookConnectionFactory;
    }

    @Override // or1.p
    public final String a() {
        return this.f70013i;
    }

    @Override // lr1.g
    public final kk2.m c() {
        kk2.m mVar = new kk2.m(i(), new oo1.d(14, new m(this, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    @Override // lr1.g
    public final b0 f() {
        kk2.m mVar = new kk2.m(i(), new oo1.d(15, new m(this, 3)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    public final kk2.m i() {
        kk2.m mVar = new kk2.m(new kk2.m(g(), new oo1.d(16, new m(this, 1)), 0), new oo1.d(17, new m(this, 2)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }
}
