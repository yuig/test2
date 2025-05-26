package ec2;

import com.pinterest.video.core.view.PinterestVideoView;

/* loaded from: classes4.dex */
public final class m implements ic2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinterestVideoView f58459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bc2.k f58460b;

    public m(bc2.k kVar, PinterestVideoView pinterestVideoView) {
        this.f58459a = pinterestVideoView;
        this.f58460b = kVar;
    }

    @Override // ic2.e
    public final void a(boolean z13) {
        boolean z14 = !z13 && d7.b.f0(this.f58460b.f22663g);
        PinterestVideoView pinterestVideoView = this.f58459a;
        pinterestVideoView.Z0 = z14;
        pinterestVideoView.T();
    }
}
