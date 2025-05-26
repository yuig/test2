package com.pinterest.ads.feature.owc.carting.bottomSheet.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ps.p;
import ps.q;
import u50.r;
import ys.b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000b\fB%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/pinterest/ads/feature/owc/carting/bottomSheet/content/CartingRetailerView;", "Landroid/widget/FrameLayout;", "Lys/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vs/b", "ys/a", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CartingRetailerView extends FrameLayout implements b {

    /* renamed from: a, reason: collision with root package name */
    public r f35269a;

    /* renamed from: b, reason: collision with root package name */
    public final vs.b f35270b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/pinterest/ads/feature/owc/carting/bottomSheet/content/CartingRetailerView$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ads_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.pinterest.ads.feature.owc.carting.bottomSheet.content.CartingRetailerView$1, reason: invalid class name */
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
        public final boolean l() {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CartingRetailerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ys.b
    public final void a(r eventIntake) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f35269a = eventIntake;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartingRetailerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, q.ads_carting_retailers, this);
        View findViewById = inflate.findViewById(p.carting_list);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        PinterestRecyclerView pinterestRecyclerView = (PinterestRecyclerView) findViewById;
        View findViewById2 = inflate.findViewById(p.carting_available_at);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        vs.b bVar = new vs.b();
        this.f35270b = bVar;
        pinterestRecyclerView.l(new AnonymousClass1());
        pinterestRecyclerView.j(bVar);
    }
}
