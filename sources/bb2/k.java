package bb2;

import android.graphics.Bitmap;
import com.pinterest.ui.imageview.WebImageView;
import kh2.k3;

/* loaded from: classes4.dex */
public final class k extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebImageView f22611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f22612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f22613c;

    public k(WebImageView webImageView, float f13, float f14) {
        this.f22611a = webImageView;
        this.f22612b = f13;
        this.f22613c = f14;
    }

    @Override // hs1.c
    public final void a(boolean z13) {
        WebImageView webImageView = this.f22611a;
        bs1.c.U1(webImageView);
        Bitmap bitmap = webImageView.C;
        if (bitmap != null) {
            webImageView.setImageBitmap(k3.B(webImageView.getContext(), bitmap, this.f22612b, this.f22613c));
            bs1.c.U1(webImageView);
        }
    }
}
