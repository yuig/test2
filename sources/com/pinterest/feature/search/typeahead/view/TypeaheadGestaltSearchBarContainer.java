package com.pinterest.feature.search.typeahead.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import i31.a;
import k42.d;
import k42.e;
import k42.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q71.c1;
import q71.d1;
import q71.q;
import q71.t;
import vs0.b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/TypeaheadGestaltSearchBarContainer;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "searchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TypeaheadGestaltSearchBarContainer extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f47909e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltSearchField f47910a;

    /* renamed from: b, reason: collision with root package name */
    public String f47911b;

    /* renamed from: c, reason: collision with root package name */
    public d1 f47912c;

    /* renamed from: d, reason: collision with root package name */
    public t f47913d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeaheadGestaltSearchBarContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeaheadGestaltSearchBarContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47911b = "";
        View.inflate(context, e.view_typeahead_gestalt_search_bar, this);
        setLayoutTransition(new LayoutTransition());
        View findViewById = findViewById(d.view_typeahead_search_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltSearchField gestaltSearchField = (GestaltSearchField) findViewById;
        this.f47910a = gestaltSearchField;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, g.TypeaheadSearchBarContainer, i13, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z13 = obtainStyledAttributes.getBoolean(g.TypeaheadSearchBarContainer_showLensIcon, true);
        boolean z14 = obtainStyledAttributes.getBoolean(g.TypeaheadSearchBarContainer_focusSearchBar, true);
        gestaltSearchField.a0(q.f102753y);
        gestaltSearchField.g0(new c1(this, 0));
        c0.d.j(this.f47910a, new a(z13, 26));
        if (z14) {
            this.f47910a.post(new b(this, 24));
        }
    }
}
