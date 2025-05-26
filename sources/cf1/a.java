package cf1;

import android.view.View;
import androidx.recyclerview.widget.y2;
import com.pinterest.feature.shopping.verifiedmerchant.inspirationalbadges.view.InspirationalBadgeTextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends y2 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f27641w = 0;

    /* renamed from: u, reason: collision with root package name */
    public final InspirationalBadgeTextView f27642u;

    /* renamed from: v, reason: collision with root package name */
    public final View.OnClickListener f27643v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InspirationalBadgeTextView view, View.OnClickListener onClickListener) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f27642u = view;
        this.f27643v = onClickListener;
    }
}
