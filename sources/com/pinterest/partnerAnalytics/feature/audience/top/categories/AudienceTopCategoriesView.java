package com.pinterest.partnerAnalytics.feature.audience.top.categories;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.d;
import com.pinterest.partnerAnalytics.e;
import ex1.c;
import g41.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lx1.h;
import lx1.i;
import lx1.k;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/audience/top/categories/AudienceTopCategoriesView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AudienceTopCategoriesView extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f50148g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f50149a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltButton f50150b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f50151c;

    /* renamed from: d, reason: collision with root package name */
    public final h f50152d;

    /* renamed from: e, reason: collision with root package name */
    public final int f50153e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f50154f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudienceTopCategoriesView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(List list) {
        Intrinsics.checkNotNullParameter(list, "categoryItems");
        h hVar = this.f50152d;
        if (hVar == null) {
            Intrinsics.r("adapter");
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "list");
        hVar.C(list);
    }

    public final void b(Function0 callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.f50150b.e(new c(1, callBack));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceTopCategoriesView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50149a = m.b(i.f85085i);
        int i14 = 1;
        this.f50154f = true;
        View.inflate(context, e.audience_top_categories_card, this);
        View findViewById = findViewById(d.rvCategoryList);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        View findViewById2 = findViewById(d.btnSeeAllCategories);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        this.f50150b = gestaltButton;
        View findViewById3 = findViewById(d.tvDisclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50151c = (GestaltText) findViewById3;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, com.pinterest.partnerAnalytics.h.AudienceTopCategoriesView, 0, 0);
        try {
            this.f50153e = obtainStyledAttributes.getInt(com.pinterest.partnerAnalytics.h.AudienceTopCategoriesView_audienceTopCategoriesListLimit, 0);
            this.f50154f = obtainStyledAttributes.getBoolean(com.pinterest.partnerAnalytics.h.AudienceTopCategoriesView_audienceTopCategoriesSortEnabled, true);
            gestaltButton.d(new fx1.d(obtainStyledAttributes.getBoolean(com.pinterest.partnerAnalytics.h.AudienceTopCategoriesView_audienceTopCategoriesIsAllCategoriesVisible, true), i14));
            obtainStyledAttributes.recycle();
            this.f50152d = new h(this.f50154f, this.f50153e);
            PinterestLinearLayoutManager pinterestLinearLayoutManager = new PinterestLinearLayoutManager(new a(this, 19));
            h hVar = this.f50152d;
            if (hVar == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            recyclerView.m(new k(context, pinterestLinearLayoutManager, hVar));
            h hVar2 = this.f50152d;
            if (hVar2 != null) {
                recyclerView.H2(hVar2);
            } else {
                Intrinsics.r("adapter");
                throw null;
            }
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }
}
