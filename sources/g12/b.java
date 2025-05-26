package g12;

import com.pinterest.repository.pin.PinService;
import dl1.m;
import dl1.s;
import e12.d;
import e12.e;
import fk2.h;
import hk2.c;
import kk2.k;
import kotlin.jvm.internal.Intrinsics;
import l7.w0;
import m60.g0;
import uj2.a0;
import uj2.b0;
import uj2.l;
import x02.w;

/* loaded from: classes4.dex */
public final class b implements uq0.b {

    /* renamed from: a, reason: collision with root package name */
    public final j22.b f63373a;

    /* renamed from: b, reason: collision with root package name */
    public final d f63374b;

    /* renamed from: c, reason: collision with root package name */
    public final e f63375c;

    /* renamed from: d, reason: collision with root package name */
    public final PinService f63376d;

    /* renamed from: e, reason: collision with root package name */
    public final String f63377e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f63378f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f63379g;

    /* renamed from: h, reason: collision with root package name */
    public final se2.a f63380h;

    /* renamed from: i, reason: collision with root package name */
    public final g0 f63381i;

    public b(j22.b searchService, d boardService, e myUserService, PinService pinService, String baseUrl, a0 subscribeScheduler, a0 observeScheduler, se2.a lazyBoardDeserializer, g0 pageSizeProvider) {
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(myUserService, "myUserService");
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(subscribeScheduler, "subscribeScheduler");
        Intrinsics.checkNotNullParameter(observeScheduler, "observeScheduler");
        Intrinsics.checkNotNullParameter(lazyBoardDeserializer, "lazyBoardDeserializer");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        this.f63373a = searchService;
        this.f63374b = boardService;
        this.f63375c = myUserService;
        this.f63376d = pinService;
        this.f63377e = baseUrl;
        this.f63378f = subscribeScheduler;
        this.f63379g = observeScheduler;
        this.f63380h = lazyBoardDeserializer;
        this.f63381i = pageSizeProvider;
    }

    @Override // dl1.a0
    public final uj2.b a(m mVar) {
        w params = (w) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        h hVar = new h(new w0(26), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "error(...)");
        return hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x016a, code lost:
    
        if (r1 != null) goto L64;
     */
    @Override // dl1.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final uj2.b0 b(dl1.m r23) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g12.b.b(dl1.m):uj2.b0");
    }

    @Override // dl1.a0
    public final l c(m mVar, s sVar) {
        w params = (w) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        c cVar = new c(new w0(28), 1);
        Intrinsics.checkNotNullExpressionValue(cVar, "error(...)");
        return cVar;
    }

    @Override // dl1.a0
    public final b0 e(m mVar) {
        w params = (w) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        k kVar = new k(new w0(27), 0);
        Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
        return kVar;
    }
}
