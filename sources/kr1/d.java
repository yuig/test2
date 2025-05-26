package kr1;

import jk2.g0;
import kk2.m;
import kotlin.jvm.internal.Intrinsics;
import lr1.g;
import qr1.d0;
import qr1.k;
import qr1.y;
import so.s9;
import so.t9;
import uj2.q;
import zq1.c0;

/* loaded from: classes4.dex */
public final class d extends g {

    /* renamed from: h, reason: collision with root package name */
    public final y f80770h;

    /* renamed from: i, reason: collision with root package name */
    public final String f80771i;

    /* renamed from: j, reason: collision with root package name */
    public final lu1.d f80772j;

    /* renamed from: k, reason: collision with root package name */
    public final s9 f80773k;

    /* renamed from: l, reason: collision with root package name */
    public final t9 f80774l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f80775m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mr1.c activityProvider, q resultsFeed, y pinterestSSOInfo, String logValue, lu1.d activityIntentFactory, s9 ssoLoginFactory, t9 ssoSignupFactory) {
        super(k.f105011b, activityProvider, resultsFeed);
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        Intrinsics.checkNotNullParameter(pinterestSSOInfo, "pinterestSSOInfo");
        Intrinsics.checkNotNullParameter(logValue, "logValue");
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        Intrinsics.checkNotNullParameter(ssoLoginFactory, "ssoLoginFactory");
        Intrinsics.checkNotNullParameter(ssoSignupFactory, "ssoSignupFactory");
        this.f80770h = pinterestSSOInfo;
        this.f80771i = logValue;
        this.f80772j = activityIntentFactory;
        this.f80773k = ssoLoginFactory;
        this.f80774l = ssoSignupFactory;
        this.f80775m = pinterestSSOInfo.f105053a;
    }

    @Override // or1.p
    public final String a() {
        return this.f80771i;
    }

    @Override // lr1.g
    public final m c() {
        g0 s13 = this.f84603c.s();
        Intrinsics.checkNotNullExpressionValue(s13, "firstOrError(...)");
        m mVar = new m(new kk2.g(s13, new c0(9, new c(this, 2)), 2), new jr1.a(6, new c(this, 3)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        m mVar2 = new m(mVar, new jr1.a(5, new c(this, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar2, "flatMap(...)");
        return mVar2;
    }
}
