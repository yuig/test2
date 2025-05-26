package com.pinterest.feature.search.typeahead.view;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import d5.a;
import k71.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n42.d;
import n42.e;
import o71.k;
import org.jetbrains.annotations.NotNull;
import pk.a0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/SearchTypeaheadYourBoardCell;", "Landroid/widget/LinearLayout;", "Lk71/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadYourBoardCell extends LinearLayout implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47905d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ProportionalImageView f47906a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f47907b;

    /* renamed from: c, reason: collision with root package name */
    public k f47908c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadYourBoardCell(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // k71.c
    public final void D4(k listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47908c = listener;
    }

    @Override // k71.c
    public final void H5(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f47906a.w2(uri);
    }

    @Override // k71.c
    public final void R3(String title, String str) {
        String string;
        Intrinsics.checkNotNullParameter(title, "title");
        if (str == null || (string = getResources().getString(e.content_description_board_typeahead, title, str)) == null) {
            string = getResources().getString(e.content_description_board_typeahead_no_owner, title);
        }
        setContentDescription(string);
    }

    @Override // k71.c
    public final void u(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
    }

    @Override // k71.c
    public final void u1(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        a0.p(this.f47907b, title);
    }

    public /* synthetic */ SearchTypeaheadYourBoardCell(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadYourBoardCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, d.list_search_type_your_board_item, this);
        View findViewById = findViewById(n42.c.cell_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ProportionalImageView proportionalImageView = (ProportionalImageView) findViewById;
        this.f47906a = proportionalImageView;
        View findViewById2 = findViewById(n42.c.cell_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47907b = (GestaltText) findViewById2;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setOrientation(0);
        int i14 = k42.c.rounded_corners_pressed_state;
        Object obj = a.f53679a;
        setBackground(context.getDrawable(i14));
        proportionalImageView.U1(eo1.c.lego_corner_radius_small);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.margin_half);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int K = a0.K(16, resources);
        setPaddingRelative(K, dimensionPixelSize, K, dimensionPixelSize);
        setOnClickListener(new x61.e(this, 14));
    }
}
