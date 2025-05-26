package y71;

import a.cb;
import fk2.f0;
import fk2.h;
import ja.j0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kk2.m;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import rx0.f;
import w71.d;
import w71.g;
import w71.i;
import z71.e;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f138014a;

    /* renamed from: b, reason: collision with root package name */
    public final i f138015b;

    /* renamed from: c, reason: collision with root package name */
    public final g f138016c;

    public c(d draftsDao, i pageDao, g itemsDao) {
        Intrinsics.checkNotNullParameter(draftsDao, "draftsDao");
        Intrinsics.checkNotNullParameter(pageDao, "pageDao");
        Intrinsics.checkNotNullParameter(itemsDao, "itemsDao");
        this.f138014a = draftsDao;
        this.f138015b = pageDao;
        this.f138016c = itemsDao;
    }

    public static f0 d(h hVar) {
        f0 m13 = hVar.q(Boolean.TRUE).m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m13, "onErrorReturnItem(...)");
        return m13;
    }

    public final m a(String userId, z71.c data) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(data, "data");
        x71.a aVar = new x71.a(data.c(), userId, new Date());
        e localPage = data.getLocalPage();
        d dVar = this.f138014a;
        dVar.getClass();
        ja.f0 d2 = ja.f0.d(1, "SELECT EXISTS(SELECT * FROM collage_drafts WHERE id = ?)");
        d2.c1(1, aVar.f134111a);
        m mVar = new m(new m(new m(j0.b(new w71.b(dVar, d2, 0)), new d51.a(16, new y11.c(28, this, aVar)), 0), new d51.a(17, new f(this, aVar, localPage, 16)), 0), new d51.a(18, new y11.c(29, this, localPage)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    public final f0 b(String pageId, List overlayItems) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(overlayItems, "overlayItems");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(overlayItems, "overlayItems");
        List<z71.i> list = overlayItems;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (z71.i iVar : list) {
            arrayList.add(new x71.b(iVar, iVar.getConfig().getId(), pageId));
        }
        g gVar = this.f138016c;
        gVar.getClass();
        return d(new h(new f0.e(8, gVar, arrayList), 2));
    }

    public final m c(String draftId, e localPage) {
        String g13;
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(localPage, "localPage");
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        if (localPage == null || (g13 = localPage.e()) == null) {
            g13 = cb.g("toString(...)");
        }
        x71.c cVar = new x71.c(localPage != null ? localPage.getBackgroundImage() : null, g13, draftId);
        String e13 = localPage.e();
        i iVar = this.f138015b;
        iVar.getClass();
        ja.f0 d2 = ja.f0.d(1, "SELECT EXISTS(SELECT * FROM collage_page WHERE id = ?)");
        d2.c1(1, e13);
        m mVar = new m(j0.b(new f0.e(10, iVar, d2)), new d51.a(19, new b(1, this, cVar)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }
}
