package j12;

import dl1.a0;
import dl1.m;
import dl1.s;
import dl1.u;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;
import uj2.l;

/* loaded from: classes2.dex */
public final class j implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74420a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f74421b;

    public j(k boardSectionService) {
        Intrinsics.checkNotNullParameter(boardSectionService, "boardSectionService");
        this.f74421b = boardSectionService;
    }

    @Override // dl1.a0
    public final /* bridge */ /* synthetic */ uj2.b a(m mVar) {
        switch (this.f74420a) {
        }
        return g((u) mVar);
    }

    @Override // dl1.a0
    public final /* bridge */ /* synthetic */ b0 b(m mVar) {
        switch (this.f74420a) {
        }
        return h((u) mVar);
    }

    @Override // dl1.a0
    public final l c(m mVar, s sVar) {
        switch (this.f74420a) {
            case 0:
                u params = (u) mVar;
                Intrinsics.checkNotNullParameter(params, "params");
                boolean z13 = params instanceof d;
                Object obj = this.f74421b;
                if (z13) {
                    d dVar = (d) params;
                    l o13 = ((k) obj).l(dVar.f74415e, dVar.f74414d).o();
                    Intrinsics.checkNotNullExpressionValue(o13, "toMaybe(...)");
                    return o13;
                }
                if (params instanceof e) {
                    l o14 = ((k) obj).f(params.a(), ((e) params).f74416d, n00.b.a(n00.c.BOARD_SECTION_DETAILED)).o();
                    Intrinsics.checkNotNullExpressionValue(o14, "toMaybe(...)");
                    return o14;
                }
                if (!(params instanceof f)) {
                    hk2.c cVar = new hk2.c(new i(1), 1);
                    Intrinsics.checkNotNullExpressionValue(cVar, "error(...)");
                    return cVar;
                }
                String a13 = params.a();
                f fVar = (f) params;
                l o15 = ((k) obj).g(a13, fVar.f74417d, fVar.f74418e).o();
                Intrinsics.checkNotNullExpressionValue(o15, "toMaybe(...)");
                return o15;
            default:
                Intrinsics.checkNotNullParameter((u) mVar, "params");
                hk2.c cVar2 = new hk2.c(new i(3), 1);
                Intrinsics.checkNotNullExpressionValue(cVar2, "error(...)");
                return cVar2;
        }
    }

    @Override // dl1.a0
    public final /* bridge */ /* synthetic */ b0 e(m mVar) {
        switch (this.f74420a) {
        }
        return f((u) mVar);
    }

    public final b0 f(u params) {
        switch (this.f74420a) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "params");
                if (!(params instanceof c)) {
                    kk2.k kVar = new kk2.k(new i(0), 0);
                    Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
                    return kVar;
                }
                c cVar = (c) params;
                return ((k) this.f74421b).j(cVar.f74411d, cVar.f74412e, CollectionsKt.Z(cVar.f74413f, ",", null, null, 0, null, null, 62), n00.b.a(n00.c.BOARD_SECTION_DETAILED));
            default:
                Intrinsics.checkNotNullParameter(params, "params");
                kk2.k kVar2 = new kk2.k(new i(2), 0);
                Intrinsics.checkNotNullExpressionValue(kVar2, "error(...)");
                return kVar2;
        }
    }

    public final uj2.b g(u params) {
        int i13 = this.f74420a;
        Object obj = this.f74421b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "params");
                return ((k) obj).c(params.a());
            default:
                Intrinsics.checkNotNullParameter(params, "params");
                return ((q12.b) obj).e(params.a());
        }
    }

    public final b0 h(u params) {
        int i13 = this.f74420a;
        Object obj = this.f74421b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "params");
                return ((k) obj).k(params.a(), n00.b.a(n00.c.BOARD_SECTION_DETAILED));
            default:
                Intrinsics.checkNotNullParameter(params, "params");
                return ((q12.b) obj).b(params.a(), n00.b.a(n00.c.CONVERSATION_FEED));
        }
    }

    public j(q12.b service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f74421b = service;
    }
}
