package we1;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class h extends ConstraintLayout implements yk1.n, nx.v {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f129368h = 0;

    /* renamed from: a, reason: collision with root package name */
    public WebImageView f129369a;

    /* renamed from: b, reason: collision with root package name */
    public WebImageView f129370b;

    /* renamed from: c, reason: collision with root package name */
    public WebImageView f129371c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltText f129372d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltText f129373e;

    /* renamed from: f, reason: collision with root package name */
    public final float f129374f;

    /* renamed from: g, reason: collision with root package name */
    public uo0.c f129375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f129374f = getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
        setOnClickListener(new lc1.b(this, 21));
    }

    public final void L(List imageUrls) {
        WebImageView webImageView;
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        if (!imageUrls.isEmpty()) {
            WebImageView webImageView2 = this.f129369a;
            if (webImageView2 != null) {
                webImageView2.V1((String) imageUrls.get(0), (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
            }
            if (imageUrls.size() > 1) {
                WebImageView webImageView3 = this.f129370b;
                if (webImageView3 != null) {
                    webImageView3.V1((String) imageUrls.get(1), (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                }
                if (imageUrls.size() <= 2 || (webImageView = this.f129371c) == null) {
                    return;
                }
                webImageView.V1((String) imageUrls.get(2), (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
            }
        }
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f129375g;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f129375g;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }
}
