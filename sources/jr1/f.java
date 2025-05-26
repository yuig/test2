package jr1;

import jk2.g0;
import kk2.m;
import kotlin.jvm.internal.Intrinsics;
import lr1.g;
import qr1.i;
import so.m9;
import so.n9;
import so.p9;
import uj2.b0;
import uj2.q;

/* loaded from: classes4.dex */
public final class f extends g {

    /* renamed from: h, reason: collision with root package name */
    public final String f77553h;

    /* renamed from: i, reason: collision with root package name */
    public final m9 f77554i;

    /* renamed from: j, reason: collision with root package name */
    public final n9 f77555j;

    /* renamed from: k, reason: collision with root package name */
    public final p9 f77556k;

    /* renamed from: l, reason: collision with root package name */
    public final f30.b f77557l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(mr1.c activityProvider, q resultsFeed, String logValue, m9 lineLoginFactory, n9 lineSignupFactory, p9 lineConnectionFactory, f30.b apiUtils) {
        super(i.f105009b, activityProvider, resultsFeed);
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        Intrinsics.checkNotNullParameter(logValue, "logValue");
        Intrinsics.checkNotNullParameter(lineLoginFactory, "lineLoginFactory");
        Intrinsics.checkNotNullParameter(lineSignupFactory, "lineSignupFactory");
        Intrinsics.checkNotNullParameter(lineConnectionFactory, "lineConnectionFactory");
        Intrinsics.checkNotNullParameter(apiUtils, "apiUtils");
        this.f77553h = logValue;
        this.f77554i = lineLoginFactory;
        this.f77555j = lineSignupFactory;
        this.f77556k = lineConnectionFactory;
        this.f77557l = apiUtils;
    }

    @Override // or1.p
    public final String a() {
        return this.f77553h;
    }

    @Override // lr1.g
    public final m c() {
        m mVar = new m(g(), new oo1.d(28, new c(this, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    @Override // lr1.g
    public final b0 f() {
        m mVar = new m(g(), new oo1.d(29, new c(this, 3)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    public final m g() {
        m k13 = this.f84602b.I5().k(new a(0, new c(this, 1)));
        g0 s13 = this.f84603c.s();
        Intrinsics.checkNotNullExpressionValue(s13, "firstOrError(...)");
        m mVar = new m(b0.v(k13, s13, new ep.g(22, d.f77551i)), new a(1, new c(this, 2)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }
}
