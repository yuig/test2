package ui0;

import com.pinterest.video.core.view.PinterestVideoView;

/* loaded from: classes5.dex */
public final class h extends pc2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f122270b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PinterestVideoView pinterestVideoView, k kVar) {
        super(pinterestVideoView);
        this.f122270b = kVar;
    }

    @Override // pc2.a
    public final boolean f() {
        boolean f13 = super.f();
        nc2.h hVar = nc2.h.f90405a;
        nc2.h.f90406b = f13;
        PinterestVideoView pinterestVideoView = this.f122270b.f122278g;
        pinterestVideoView.q0().v(!f13);
        if (pinterestVideoView.f()) {
            pinterestVideoView.W(!f13);
        }
        return f13;
    }
}
