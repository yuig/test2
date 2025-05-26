package com.pinterest.feature.todaytab.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.v;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import qf1.z;
import we1.a2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/todaytab/tab/view/TodayTabThreePinsCollectionModule;", "Landroid/widget/RelativeLayout;", "Lch1/b;", "Lnx/v;", "Lh32/c3;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "todayTabLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TodayTabThreePinsCollectionModule extends RelativeLayout implements ch1.b, v {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f48679g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f48680a;

    /* renamed from: b, reason: collision with root package name */
    public final WebImageView f48681b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f48682c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f48683d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f48684e;

    /* renamed from: f, reason: collision with root package name */
    public dh1.e f48685f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TodayTabThreePinsCollectionModule(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ch1.b
    public final void A6(List imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        WebImageView[] webImageViewArr = {this.f48680a, this.f48681b, this.f48682c};
        ArrayList arrayList = new ArrayList();
        Iterator it = imageUrls.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            if (!(str == null || str.length() == 0)) {
                arrayList.add(next);
            }
        }
        int min = Math.min(arrayList.size(), 3);
        for (int i13 = 0; i13 < min; i13++) {
            webImageViewArr[i13].loadUrl((String) arrayList.get(i13));
            webImageViewArr[i13].setVisibility(0);
        }
    }

    @Override // ch1.b
    public final void D3(dh1.e eVar) {
        this.f48685f = eVar;
    }

    @Override // ch1.b
    public final void c(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f48683d.i(new z(text, 19));
    }

    @Override // ch1.b
    public final void d() {
        a0.p(this.f48684e, "");
        this.f48683d.i(b.f48707x);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        dh1.e eVar = this.f48685f;
        if (eVar != null) {
            return eVar.u3();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        dh1.e eVar = this.f48685f;
        if (eVar != null) {
            return eVar.v3();
        }
        return null;
    }

    @Override // ch1.b
    public final void p(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        a0.p(this.f48684e, text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayTabThreePinsCollectionModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), o92.c.three_pins_collection_today_article_module, this);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        Context context2 = getContext();
        int i14 = o92.a.usecase_module_background;
        Object obj = d5.a.f53679a;
        setBackground(context2.getDrawable(i14));
        setClipToPadding(false);
        View findViewById = findViewById(o92.b.usecase_three_pins_collection_image_1);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48680a = (WebImageView) findViewById;
        View findViewById2 = findViewById(o92.b.usecase_three_pins_collection_image_2);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48681b = (WebImageView) findViewById2;
        View findViewById3 = findViewById(o92.b.usecase_three_pins_collection_image_3);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48682c = (WebImageView) findViewById3;
        View findViewById4 = findViewById(o92.b.usecase_module_three_pins_collection_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48683d = (GestaltText) findViewById4;
        View findViewById5 = findViewById(o92.b.usecase_module_three_pins_collection_title);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48684e = (GestaltText) findViewById5;
        setOnClickListener(new a2(this, 16));
    }
}
