package xo;

import com.pinterest.api.model.Feed;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class n extends bp.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f135528c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ar0.g f135529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ar0.g gVar, PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout) {
        super(pinterestSwipeRefreshLayout);
        this.f135529d = gVar;
    }

    @Override // bp.c
    public final void a(Feed feed, boolean z13) {
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f23620a;
        int i13 = this.f135528c;
        ar0.g gVar = this.f135529d;
        switch (i13) {
            case 0:
                pinterestSwipeRefreshLayout.n(false);
                gVar.l();
                break;
            default:
                pinterestSwipeRefreshLayout.n(false);
                gVar.l();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout, ar0.g gVar) {
        super(pinterestSwipeRefreshLayout);
        this.f135529d = gVar;
    }
}
