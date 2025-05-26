package j41;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.ui.imageview.WebImageView;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nx.d0;

/* loaded from: classes5.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public WebImageView f74667a;

    @Override // j41.b
    public final void a(c92.n content, a dimensions) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        if (content instanceof h41.c) {
            WebImageView webImageView = this.f74667a;
            if (webImageView == null) {
                Intrinsics.r("image");
                throw null;
            }
            webImageView.requestLayout();
            h41.c cVar = (h41.c) content;
            if (!z.j(cVar.f67629b)) {
                WebImageView webImageView2 = this.f74667a;
                if (webImageView2 != null) {
                    webImageView2.V1(cVar.f67629b, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                    return;
                } else {
                    Intrinsics.r("image");
                    throw null;
                }
            }
            File file = cVar.f67630c;
            if (file != null) {
                WebImageView webImageView3 = this.f74667a;
                if (webImageView3 != null) {
                    webImageView3.t2(file);
                } else {
                    Intrinsics.r("image");
                    throw null;
                }
            }
        }
    }

    @Override // j41.b
    public final View b(a dimensions, Context context, d0 pinalyics) {
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalyics, "pinalyics");
        WebImageView webImageView = new WebImageView(context);
        webImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f74667a = webImageView;
        return kg.p.g(webImageView);
    }
}
