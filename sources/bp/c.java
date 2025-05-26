package bp;

import com.pinterest.api.model.Feed;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final PinterestSwipeRefreshLayout f23620a;

    /* renamed from: b, reason: collision with root package name */
    public g f23621b;

    public c(PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout) {
        this.f23620a = pinterestSwipeRefreshLayout;
    }

    public abstract void a(Feed feed, boolean z13);

    public final void b() {
        g gVar = this.f23621b;
        if (gVar == null || gVar.f23630d.n() <= 0) {
            return;
        }
        this.f23620a.n(true);
    }
}
