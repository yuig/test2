package x21;

import com.pinterest.video.core.view.PinterestVideoView;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f131588a;

    public f(g gVar) {
        this.f131588a = gVar;
    }

    public final void a(PinterestVideoView pinterestVideoView) {
        g gVar = this.f131588a;
        int i13 = e.f131587a[gVar.f131591c.ordinal()];
        if (i13 == 1) {
            gVar.f131595g++;
            gVar.p();
        } else if (i13 == 2 || i13 == 3) {
            pinterestVideoView.j(0L, false);
        }
    }
}
