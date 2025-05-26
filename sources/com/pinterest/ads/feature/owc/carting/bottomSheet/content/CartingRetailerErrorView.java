package com.pinterest.ads.feature.owc.carting.bottomSheet.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ps.p;
import ps.q;
import u50.r;
import xo.k;
import ys.b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ads/feature/owc/carting/bottomSheet/content/CartingRetailerErrorView;", "Landroid/widget/FrameLayout;", "Lys/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CartingRetailerErrorView extends FrameLayout implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35267b = 0;

    /* renamed from: a, reason: collision with root package name */
    public r f35268a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CartingRetailerErrorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ys.b
    public final void a(r eventIntake) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f35268a = eventIntake;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartingRetailerErrorView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View findViewById = View.inflate(context, q.ads_carting_retailer_error, this).findViewById(p.carting_launch_ad_url);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((GestaltButton) findViewById).e(new k(this, 17));
    }
}
