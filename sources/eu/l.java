package eu;

import android.graphics.Bitmap;
import com.pinterest.ui.imageview.WebImageView;
import kh2.k3;

/* loaded from: classes3.dex */
public final class l extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebImageView f60144b;

    public l(WebImageView webImageView, int i13) {
        this.f60143a = i13;
        this.f60144b = webImageView;
    }

    @Override // hs1.c
    public final void a(boolean z13) {
        int i13 = this.f60143a;
        WebImageView webImageView = this.f60144b;
        switch (i13) {
            case 0:
                webImageView.F0(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_100));
                break;
            case 2:
                webImageView.F0(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_100));
                break;
            case 3:
                webImageView.F0(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_100));
                break;
            case 4:
                Bitmap bitmap = webImageView.C;
                if (bitmap != null) {
                    webImageView.setImageBitmap(k3.C(webImageView.getContext(), bitmap, 0.0f, 6.0f, 4));
                    break;
                }
                break;
            case 5:
                webImageView.F0(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_100));
                break;
            case 6:
                Bitmap bitmap2 = webImageView.C;
                if (bitmap2 != null) {
                    webImageView.setImageBitmap(k3.C(webImageView.getContext(), bitmap2, 0.0f, 0.0f, 12));
                    break;
                }
                break;
        }
    }

    @Override // hs1.c
    public final void b() {
        switch (this.f60143a) {
            case 1:
                this.f60144b.animate().alpha(1.0f).setDuration(1000L).start();
                break;
        }
    }
}
