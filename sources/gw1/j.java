package gw1;

import android.view.View;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends y2 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f66233z = 0;

    /* renamed from: u, reason: collision with root package name */
    public final WebImageView f66234u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltText f66235v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltText f66236w;

    /* renamed from: x, reason: collision with root package name */
    public final GestaltText f66237x;

    /* renamed from: y, reason: collision with root package name */
    public final GestaltText f66238y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f66234u = (WebImageView) view.findViewById(com.pinterest.partnerAnalytics.d.pt_item_pin_image);
        this.f66235v = (GestaltText) view.findViewById(com.pinterest.partnerAnalytics.d.pt_item_pin_title);
        this.f66236w = (GestaltText) view.findViewById(com.pinterest.partnerAnalytics.d.pt_item_description);
        this.f66237x = (GestaltText) view.findViewById(com.pinterest.partnerAnalytics.d.pt_item_value);
        this.f66238y = (GestaltText) view.findViewById(com.pinterest.partnerAnalytics.d.pt_item_percentage);
    }
}
