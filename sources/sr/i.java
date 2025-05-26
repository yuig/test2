package sr;

import android.os.Bundle;
import h32.a4;
import kotlin.jvm.internal.Intrinsics;
import rr.n0;
import so.m4;
import so.n4;
import tq.a0;

/* loaded from: classes.dex */
public final class i implements o, b {

    /* renamed from: a, reason: collision with root package name */
    public final w20.a f115060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tb.c f115061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f115062c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f115063d;

    /* renamed from: e, reason: collision with root package name */
    public kk2.l f115064e;

    public i(us1.a activity, w20.a todayTabService, tb.c defaultLoggingWebhookDeeplinkUtil, m4 navigationWebhookDeeplinkUtilFactory, n4 coreWebhookDeeplinkUtilFactory) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(todayTabService, "todayTabService");
        Intrinsics.checkNotNullParameter(defaultLoggingWebhookDeeplinkUtil, "defaultLoggingWebhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(navigationWebhookDeeplinkUtilFactory, "navigationWebhookDeeplinkUtilFactory");
        Intrinsics.checkNotNullParameter(coreWebhookDeeplinkUtilFactory, "coreWebhookDeeplinkUtilFactory");
        this.f115060a = todayTabService;
        this.f115061b = defaultLoggingWebhookDeeplinkUtil;
        this.f115062c = coreWebhookDeeplinkUtilFactory.a(activity);
        this.f115063d = navigationWebhookDeeplinkUtilFactory.a(activity);
    }

    public final boolean a(Bundle bundle) {
        return this.f115063d.g(bundle);
    }

    @Override // sr.o, sr.p
    public final void clear() {
        kk2.l lVar = this.f115064e;
        if (lVar != null) {
            lVar.dispose();
            this.f115064e = null;
        }
    }

    @Override // sr.o
    public final void d(String articleId, String str, Integer num, a4 a4Var, String str2) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        this.f115064e = (kk2.l) this.f115060a.b(articleId, n00.b.a(n00.c.TODAY_ARTICLE_DEFAULT)).r(tk2.e.f118017c).l(wj2.c.a()).o(new n0(8, new e.f(this, str, str2, 27)), new n0(9, new a0(this, 13)));
    }
}
