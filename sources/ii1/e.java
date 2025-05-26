package ii1;

import bi1.a0;
import ck2.i;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import gb2.f;
import java.util.LinkedHashMap;
import java.util.Map;
import ji1.g;
import jk2.j1;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import rh1.q1;
import so.qa;
import sq0.e0;
import uj2.q;
import wa2.p;
import yk1.v;

/* loaded from: classes5.dex */
public final class e extends vq0.b {

    /* renamed from: c, reason: collision with root package name */
    public final v f72322c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f72323d;

    /* renamed from: e, reason: collision with root package name */
    public final j f72324e;

    /* renamed from: f, reason: collision with root package name */
    public final qa f72325f;

    /* renamed from: g, reason: collision with root package name */
    public String f72326g;

    /* renamed from: h, reason: collision with root package name */
    public String f72327h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f72328i;

    /* renamed from: j, reason: collision with root package name */
    public final e f72329j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(uk1.d presenterPinalytics, q networkStateStream, v viewResources, qa videoCarouselItemPresenterFactory) {
        super(presenterPinalytics, networkStateStream);
        LinkedHashMap pinFeedbackStateUpdates = new LinkedHashMap();
        j impressionHelper = new j(16, 0);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinFeedbackStateUpdates, "pinFeedbackStateUpdates");
        Intrinsics.checkNotNullParameter(impressionHelper, "impressionHelper");
        Intrinsics.checkNotNullParameter(videoCarouselItemPresenterFactory, "videoCarouselItemPresenterFactory");
        this.f72322c = viewResources;
        this.f72323d = pinFeedbackStateUpdates;
        this.f72324e = impressionHelper;
        this.f72325f = videoCarouselItemPresenterFactory;
        this.f72329j = this;
    }

    @Override // vq0.g
    /* renamed from: D3, reason: merged with bridge method [inline-methods] */
    public final void r3(g gVar) {
        super.r3(gVar);
        Intrinsics.checkNotNullParameter(this, "videoCarouselInteractionListener");
        gVar.f76303e = this;
        uk2.d dVar = f.f64748b;
        qt.a aVar = new qt.a(19, d.f72318j);
        dVar.getClass();
        xj2.c F = pk2.f.j(new j1(dVar, aVar, 0), new qt.b(19, d.f72319k), 2, "filter(...)").F(new q1(5, new a0(this, 2)), new q1(6, d.f72320l), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        p pVar;
        s sVar = (s) getItem(i13);
        if (sVar instanceof ih) {
            return RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM;
        }
        if (!(sVar instanceof f30)) {
            return -2;
        }
        gb2.i iVar = (gb2.i) this.f72323d.get(((f30) sVar).getUid());
        if (iVar == null || (pVar = iVar.f64754b) == null) {
            pVar = p.STATE_NO_FEEDBACK;
        }
        int i14 = c.f72317a[pVar.ordinal()];
        return (i14 == 1 || i14 == 2 || i14 == 3) ? RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN : RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM;
    }

    @Override // vq0.g
    public final e0 p3() {
        return this.f72329j;
    }
}
