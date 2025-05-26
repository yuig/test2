package se0;

import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;

/* loaded from: classes.dex */
public final class i implements ue0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinterestSwipeRefreshLayout f112385a;

    public i(PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout) {
        this.f112385a = pinterestSwipeRefreshLayout;
    }

    @Override // ue0.a
    public final void b() {
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f112385a;
        n nVar = pinterestSwipeRefreshLayout.f44875i;
        if (nVar == n.USER_DRAG || nVar == n.USER_DRAG_X_RESET) {
            pinterestSwipeRefreshLayout.j();
        }
    }

    @Override // ue0.a
    public final void e(float f13, float f14) {
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f112385a;
        n nVar = pinterestSwipeRefreshLayout.f44875i;
        n nVar2 = n.USER_DRAG;
        if (nVar != nVar2) {
            pinterestSwipeRefreshLayout.f44875i = nVar2;
        }
        pinterestSwipeRefreshLayout.d(f14);
    }

    @Override // ue0.a
    public final void g() {
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f112385a;
        ((q) pinterestSwipeRefreshLayout.f44877k).f112418a.stop();
        n nVar = pinterestSwipeRefreshLayout.f44875i;
        if (nVar == n.IDLE) {
            pinterestSwipeRefreshLayout.f44875i = n.USER_DRAG;
            q qVar = (q) pinterestSwipeRefreshLayout.f44877k;
            qVar.getClass();
            qVar.setY(pinterestSwipeRefreshLayout.f44884r);
            return;
        }
        if (nVar == n.ANIMATE_TO_RESET) {
            pinterestSwipeRefreshLayout.e();
            pinterestSwipeRefreshLayout.f44875i = n.USER_DRAG_X_RESET;
        }
    }
}
