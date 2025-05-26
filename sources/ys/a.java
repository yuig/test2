package ys;

import android.view.View;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import ps.p;

/* loaded from: classes3.dex */
public final class a extends y2 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f140106y = 0;

    /* renamed from: u, reason: collision with root package name */
    public final GestaltText f140107u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltText f140108v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltText f140109w;

    /* renamed from: x, reason: collision with root package name */
    public final GestaltAvatar f140110x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View findViewById = itemView.findViewById(p.carting_merchant);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f140107u = (GestaltText) findViewById;
        View findViewById2 = itemView.findViewById(p.carting_cta);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f140108v = (GestaltText) findViewById2;
        View findViewById3 = itemView.findViewById(p.carting_price);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f140109w = (GestaltText) findViewById3;
        View findViewById4 = itemView.findViewById(p.carting_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f140110x = (GestaltAvatar) findViewById4;
    }
}
