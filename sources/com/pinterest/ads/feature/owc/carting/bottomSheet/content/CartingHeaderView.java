package com.pinterest.ads.feature.owc.carting.bottomSheet.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ps.p;
import ps.q;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/ads/feature/owc/carting/bottomSheet/content/CartingHeaderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CartingHeaderView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f35265a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f35266b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CartingHeaderView(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartingHeaderView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View inflate = View.inflate(context, q.ads_carting_common_content, this);
        View findViewById = inflate.findViewById(p.carting_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f35265a = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(p.carting_promoted_by);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f35266b = (GestaltText) findViewById2;
    }
}
