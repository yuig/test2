package i12;

import dl1.a0;
import dl1.m;
import dl1.s;
import dl1.u;
import fk2.h;
import hk2.i;
import hk2.o;
import java.util.Date;
import java.util.TimeZone;
import jk2.h0;
import kk2.k;
import kk2.r;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;
import uj2.l;

/* loaded from: classes4.dex */
public final class b implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71059a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f71060b;

    public b(l22.a didItService) {
        Intrinsics.checkNotNullParameter(didItService, "didItService");
        this.f71060b = didItService;
    }

    @Override // dl1.a0
    public final /* bridge */ /* synthetic */ uj2.b a(m mVar) {
        switch (this.f71059a) {
        }
        return g((u) mVar);
    }

    @Override // dl1.a0
    public final /* bridge */ /* synthetic */ b0 b(m mVar) {
        switch (this.f71059a) {
        }
        return h((u) mVar);
    }

    @Override // dl1.a0
    public final l c(m mVar, s sVar) {
        i iVar = i.f69412a;
        switch (this.f71059a) {
            case 0:
                u params = (u) mVar;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullExpressionValue(iVar, "empty(...)");
                return iVar;
            case 1:
                u params2 = (u) mVar;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullExpressionValue(iVar, "empty(...)");
                return iVar;
            case 2:
                u params3 = (u) mVar;
                Intrinsics.checkNotNullParameter(params3, "params");
                Intrinsics.checkNotNullExpressionValue(iVar, "empty(...)");
                return iVar;
            default:
                u params4 = (u) mVar;
                Intrinsics.checkNotNullParameter(params4, "params");
                l22.b bVar = params4 instanceof l22.b ? (l22.b) params4 : null;
                if (bVar == null) {
                    hk2.c cVar = new hk2.c(new j12.i(24), 1);
                    Intrinsics.checkNotNullExpressionValue(cVar, "error(...)");
                    return cVar;
                }
                l o13 = ((l22.a) this.f71060b).j(params4.a(), bVar.f81476e, ((l22.b) params4).f81477f).o();
                Intrinsics.checkNotNullExpressionValue(o13, "toMaybe(...)");
                return o13;
        }
    }

    @Override // dl1.a0
    public final /* bridge */ /* synthetic */ b0 e(m mVar) {
        switch (this.f71059a) {
        }
        return f((u) mVar);
    }

    public final b0 f(u params) {
        h0 h0Var = h0.f76488a;
        switch (this.f71059a) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "params");
                o h10 = b0.h(h0Var);
                Intrinsics.checkNotNullExpressionValue(h10, "fromObservable(...)");
                return h10;
            case 1:
                Intrinsics.checkNotNullParameter(params, "params");
                r rVar = r.f79973a;
                Intrinsics.checkNotNullExpressionValue(rVar, "never(...)");
                return rVar;
            case 2:
                Intrinsics.checkNotNullParameter(params, "params");
                o h13 = b0.h(h0Var);
                Intrinsics.checkNotNullExpressionValue(h13, "fromObservable(...)");
                return h13;
            default:
                Intrinsics.checkNotNullParameter(params, "params");
                k kVar = new k(new j12.i(25), 0);
                Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
                return kVar;
        }
    }

    public final uj2.b g(u params) {
        fk2.m mVar = fk2.m.f62459a;
        switch (this.f71059a) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 1:
                Intrinsics.checkNotNullParameter(params, "params");
                fk2.u uVar = fk2.u.f62476a;
                Intrinsics.checkNotNullExpressionValue(uVar, "never(...)");
                return uVar;
            case 2:
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            default:
                Intrinsics.checkNotNullParameter(params, "params");
                h hVar = new h(new j12.i(23), 1);
                Intrinsics.checkNotNullExpressionValue(hVar, "error(...)");
                return hVar;
        }
    }

    public final b0 h(u params) {
        int i13 = this.f71059a;
        Object obj = this.f71060b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "params");
                return ((qz.k) obj).a();
            case 1:
                Intrinsics.checkNotNullParameter(params, "params");
                l12.b bVar = (l12.b) obj;
                String a13 = params.a();
                String a14 = n00.b.a(n00.c.EXPLORE_ARTICLE_BASE);
                String a15 = n00.b.a(n00.c.EXPLORE_COVER_IMAGE);
                Date date = new Date();
                Intrinsics.checkNotNullParameter(date, "date");
                return bVar.a(a13, a14, a15, TimeZone.getDefault().getOffset(date.getTime()) / 60000, 5);
            case 2:
                Intrinsics.checkNotNullParameter(params, "params");
                return ((o12.a) obj).k(params.a(), n00.b.a(n00.c.COLLAGE_RETRIEVAL_FEED));
            default:
                Intrinsics.checkNotNullParameter(params, "params");
                k kVar = new k(new j12.i(26), 0);
                Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
                return kVar;
        }
    }

    public b(o12.a collageService) {
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        this.f71060b = collageService;
    }

    public b(qz.k boardVideoTemplateService) {
        Intrinsics.checkNotNullParameter(boardVideoTemplateService, "boardVideoTemplateService");
        this.f71060b = boardVideoTemplateService;
    }

    public b(l12.b service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f71060b = service;
    }
}
