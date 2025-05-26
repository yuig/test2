package com.pinterest.feature.search.typeahead.view;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b31.f;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import d5.a;
import k71.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import n42.d;
import n42.e;
import o71.k;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import q71.p;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/SearchTypeaheadBoardCell;", "Landroid/widget/LinearLayout;", "Lk71/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadBoardCell extends LinearLayout implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f47841e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f47842a;

    /* renamed from: b, reason: collision with root package name */
    public final v f47843b;

    /* renamed from: c, reason: collision with root package name */
    public final v f47844c;

    /* renamed from: d, reason: collision with root package name */
    public k f47845d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadBoardCell(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // k71.c
    public final void D4(k listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47845d = listener;
    }

    @Override // k71.c
    public final void H5(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Object value = this.f47842a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ProportionalImageView) value).w2(uri);
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
        Object value = this.f47844c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((GestaltText) value).i(new f(text, 21));
    }

    @Override // k71.c
    public final void u1(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Object value = this.f47843b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a0.p((GestaltText) value, title);
    }

    public /* synthetic */ SearchTypeaheadBoardCell(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadBoardCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47842a = m.b(new p(this, 1));
        this.f47843b = m.b(new p(this, 2));
        this.f47844c = m.b(new p(this, 0));
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int K = a0.K(16, resources);
        View.inflate(context, d.list_search_typeahead_board_item, this);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setOrientation(0);
        int i14 = k42.c.rounded_corners_pressed_state;
        Object obj = a.f53679a;
        setBackground(context.getDrawable(i14));
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin_half);
        setPaddingRelative(K, dimensionPixelSize, K, dimensionPixelSize);
        setOnClickListener(new x61.e(this, 5));
    }
}
