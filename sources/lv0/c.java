package lv0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.t;
import h90.m;
import java.util.ArrayList;
import java.util.List;
import k1.b0;
import kotlin.jvm.internal.Intrinsics;
import kv0.l;
import m60.w;
import wk1.n;

/* loaded from: classes5.dex */
public final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    public final List f84986a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84987b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84988c;

    /* renamed from: d, reason: collision with root package name */
    public final String f84989d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84990e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84991f;

    /* renamed from: g, reason: collision with root package name */
    public final ag1.b f84992g;

    /* renamed from: h, reason: collision with root package name */
    public final h22.f f84993h;

    /* renamed from: i, reason: collision with root package name */
    public final t f84994i;

    /* renamed from: j, reason: collision with root package name */
    public final w f84995j;

    /* renamed from: k, reason: collision with root package name */
    public final l f84996k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList imageList, wk1.c params, String productLink, String str, String str2, String str3, boolean z13, ag1.b dataManager, h22.f storyPinService, t storyPinLocalDataRepository, w eventManager) {
        super(params);
        Intrinsics.checkNotNullParameter(imageList, "imageList");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(productLink, "productLink");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f84987b = productLink;
        this.f84988c = str;
        this.f84989d = str2;
        this.f84990e = str3;
        this.f84991f = z13;
        this.f84992g = dataManager;
        this.f84993h = storyPinService;
        this.f84994i = storyPinLocalDataRepository;
        this.f84995j = eventManager;
        Intrinsics.checkNotNullParameter(imageList, "imageList");
        l lVar = new l();
        lVar.o(RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE, new m(lVar, 10));
        if (lVar.d().isEmpty()) {
            lVar.k(imageList);
        }
        this.f84996k = lVar;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f84996k);
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(jv0.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        mv0.i iVar = (mv0.i) view;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        iVar.Z0 = this;
    }

    public final void v3(String imageUrl, boolean z13, i1.h updateViews) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(updateViews, "updateViews");
        xj2.c o13 = this.f84993h.d(true).r(tk2.e.f118017c).l(wj2.c.a()).o(new ev0.g(10, new b0(this, z13, imageUrl, updateViews)), new ev0.g(11, new a(this, 1)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }
}
