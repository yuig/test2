package we1;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends yk1.c implements r {

    /* renamed from: a, reason: collision with root package name */
    public List f129338a;

    /* renamed from: b, reason: collision with root package name */
    public List f129339b;

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(s view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        g gVar = (g) view;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        gVar.f129351b = this;
        g gVar2 = (g) view;
        ConstraintLayout constraintLayout = gVar2.f129352c;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundResource(eo1.d.lego_medium_black_rounded_rect);
            constraintLayout.setBackgroundColor(0);
        }
        List imageUrls = this.f129338a;
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        int i13 = 0;
        for (Object obj : imageUrls) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            WebImageView webImageView = new WebImageView(gVar2.getContext());
            webImageView.f52564p = new f(webImageView, gVar2, i13, 0);
            webImageView.loadUrl((String) obj);
            i13 = i14;
        }
    }
}
