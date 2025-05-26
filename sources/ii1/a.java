package ii1;

import com.pinterest.api.model.ih;
import com.pinterest.feature.videocarousel.view.VideoCarouselActionCellView;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f72300a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f72301b;

    /* renamed from: c, reason: collision with root package name */
    public ih f72302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uk1.d presenterPinalytics, HashMap auxData) {
        super(0);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f72300a = presenterPinalytics;
        this.f72301b = auxData;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        hi1.a view = (hi1.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        p3();
    }

    public final void p3() {
        ih ihVar;
        if (isBound() && (ihVar = this.f72302c) != null) {
            hi1.a aVar = (hi1.a) getView();
            String title = ihVar.g();
            Intrinsics.checkNotNullExpressionValue(title, "getActionText(...)");
            VideoCarouselActionCellView videoCarouselActionCellView = (VideoCarouselActionCellView) aVar;
            videoCarouselActionCellView.getClass();
            Intrinsics.checkNotNullParameter(title, "title");
            videoCarouselActionCellView.f49047d.setText(title);
            VideoCarouselActionCellView videoCarouselActionCellView2 = (VideoCarouselActionCellView) ((hi1.a) getView());
            videoCarouselActionCellView2.getClass();
            Intrinsics.checkNotNullParameter(this, "clickListener");
            videoCarouselActionCellView2.f49048e = this;
        }
    }
}
