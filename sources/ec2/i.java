package ec2;

import com.pinterest.video.core.view.PinterestVideoView;

/* loaded from: classes2.dex */
public final class i implements ic2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinterestVideoView f58454a;

    public i(PinterestVideoView pinterestVideoView) {
        this.f58454a = pinterestVideoView;
    }

    @Override // ic2.e
    public final void a(boolean z13) {
        PinterestVideoView pinterestVideoView = this.f58454a;
        pinterestVideoView.Z0 = !z13;
        pinterestVideoView.T();
    }
}
