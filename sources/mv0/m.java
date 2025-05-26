package mv0;

import androidx.recyclerview.widget.y2;
import com.pinterest.feature.storypin.creation.interesttagging.view.ShoppingBrandCapsule;
import kotlin.jvm.internal.Intrinsics;
import zp.y0;

/* loaded from: classes5.dex */
public final class m extends y2 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f88380w = 0;

    /* renamed from: u, reason: collision with root package name */
    public final ShoppingBrandCapsule f88381u;

    /* renamed from: v, reason: collision with root package name */
    public zd1.g f88382v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ShoppingBrandCapsule brandCapsuleView) {
        super(brandCapsuleView);
        Intrinsics.checkNotNullParameter(brandCapsuleView, "brandCapsuleView");
        this.f88381u = brandCapsuleView;
        brandCapsuleView.c(vn1.c.LIGHT);
        brandCapsuleView.setOnClickListener(new y0(brandCapsuleView, this, nVar, 14));
    }
}
