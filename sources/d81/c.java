package d81;

import com.pinterest.api.model.wy0;
import dl1.m;
import dl1.p;
import dl1.s;
import dl1.u;
import fk2.h;
import hk2.o;
import j41.i;
import ja.f0;
import ja.j0;
import java.util.List;
import jk2.h0;
import kk2.g;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import tk2.e;
import uj2.b0;
import uj2.q;
import w71.d;

/* loaded from: classes5.dex */
public final class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f53994a;

    /* renamed from: b, reason: collision with root package name */
    public final y71.c f53995b;

    /* renamed from: c, reason: collision with root package name */
    public z71.c f53996c;

    public c(b60.b activeUserManager, y71.c draftDataProvider) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(draftDataProvider, "draftDataProvider");
        this.f53994a = activeUserManager;
        this.f53995b = draftDataProvider;
    }

    @Override // dl1.y
    public final q b(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        String draftId = params.a();
        y71.c cVar = this.f53995b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        d dVar = cVar.f138014a;
        dVar.getClass();
        f0 d2 = f0.d(1, "SELECT EXISTS(SELECT * FROM collage_drafts WHERE id = ?)");
        d2.c1(1, draftId);
        q u13 = new g(new kk2.m(j0.b(new w71.b(dVar, d2, 0)), new d51.a(22, new y71.b(2, this, params)), 0), new a81.a(3, new i(this, 20)), 3).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    @Override // dl1.p
    public final boolean c(m mVar, s sVar) {
        Boolean bool;
        u params = (u) mVar;
        z71.c model = (z71.c) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        z71.c cVar = this.f53996c;
        this.f53996c = model;
        boolean d2 = Intrinsics.d(cVar != null ? cVar.getLocalPage() : null, model.getLocalPage());
        y71.c cVar2 = this.f53995b;
        if (!d2) {
            bool = (Boolean) cVar2.c(model.c(), model.getLocalPage()).r(e.f118017c).d();
        } else if (Intrinsics.d(cVar.getLocalPage().getOverlayItems(), model.getLocalPage().getOverlayItems())) {
            wy0 f13 = ((b60.d) this.f53994a).f();
            String uid = f13 != null ? f13.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            bool = (Boolean) cVar2.a(uid, model).r(e.f118017c).d();
        } else {
            List<z71.i> overlayItems = cVar.getLocalPage().getOverlayItems();
            List overlayItems2 = model.getLocalPage().getOverlayItems();
            boolean z13 = false;
            if (overlayItems.size() == overlayItems2.size()) {
                int i13 = 0;
                for (z71.i iVar : overlayItems) {
                    int i14 = i13 + 1;
                    if (!Intrinsics.d(iVar, overlayItems2.get(i13))) {
                        if (!Intrinsics.d(iVar.getConfig().getId(), ((z71.i) overlayItems2.get(i13)).getConfig().getId())) {
                            Object d13 = cVar2.b(model.getLocalPage().e(), overlayItems2.subList(i13, overlayItems2.size())).r(e.f118017c).d();
                            Intrinsics.checkNotNullExpressionValue(d13, "blockingGet(...)");
                            return ((Boolean) d13).booleanValue();
                        }
                        String pageId = model.getLocalPage().e();
                        z71.i overlayItem = (z71.i) overlayItems2.get(i13);
                        cVar2.getClass();
                        Intrinsics.checkNotNullParameter(pageId, "pageId");
                        Intrinsics.checkNotNullParameter(overlayItem, "overlayItem");
                        Intrinsics.checkNotNullParameter(pageId, "pageId");
                        Intrinsics.checkNotNullParameter(overlayItem, "overlayItem");
                        String id3 = overlayItem.getConfig().getId();
                        x71.b bVar = new x71.b(overlayItem, id3, pageId);
                        w71.g gVar = cVar2.f138016c;
                        gVar.getClass();
                        f0 d14 = f0.d(1, "SELECT EXISTS(SELECT * FROM collage_item WHERE id = ?)");
                        d14.c1(1, id3);
                        kk2.m mVar2 = new kk2.m(j0.b(new f0.e(7, gVar, d14)), new d51.a(20, new y71.b(0, cVar2, bVar)), 0);
                        Intrinsics.checkNotNullExpressionValue(mVar2, "flatMap(...)");
                        Object d15 = mVar2.r(e.f118017c).d();
                        Intrinsics.checkNotNullExpressionValue(d15, "blockingGet(...)");
                        return ((Boolean) d15).booleanValue();
                    }
                    i13 = i14;
                }
            } else {
                z71.i data = (z71.i) CollectionsKt.i0(overlayItems, overlayItems2).get(0);
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                String id4 = data.getConfig().getId();
                w71.g gVar2 = cVar2.f138016c;
                gVar2.getClass();
                Boolean bool2 = (Boolean) y71.c.d(new h(new f0.e(9, gVar2, id4), 2)).r(e.f118017c).d();
                if (bool2 != null) {
                    z13 = bool2.booleanValue();
                }
            }
            bool = Boolean.valueOf(z13);
        }
        Intrinsics.f(bool);
        return bool.booleanValue();
    }

    @Override // dl1.p
    public final s e(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        z71.c cVar = this.f53996c;
        if (Intrinsics.d(cVar != null ? cVar.c() : null, params.a())) {
            return this.f53996c;
        }
        return null;
    }

    @Override // dl1.p
    public final boolean f(List params, List models) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(models, "models");
        return false;
    }

    @Override // dl1.p
    public final boolean g(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        this.f53996c = null;
        String draftId = params.a();
        y71.c cVar = this.f53995b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        d dVar = cVar.f138014a;
        dVar.getClass();
        Object d2 = y71.c.d(new h(new f0.e(6, dVar, draftId), 2)).r(e.f118017c).d();
        Intrinsics.checkNotNullExpressionValue(d2, "blockingGet(...)");
        return ((Boolean) d2).booleanValue();
    }

    @Override // dl1.p
    public final b0 i(List paramsList) {
        Intrinsics.checkNotNullParameter(paramsList, "paramsList");
        o h10 = b0.h(h0.f76488a);
        Intrinsics.checkNotNullExpressionValue(h10, "fromObservable(...)");
        return h10;
    }
}
