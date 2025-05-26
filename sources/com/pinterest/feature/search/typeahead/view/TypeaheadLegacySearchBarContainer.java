package com.pinterest.feature.search.typeahead.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.feature.search.results.view.SearchBarView;
import com.pinterest.gestalt.text.GestaltText;
import k42.d;
import k42.e;
import k42.g;
import kh2.k3;
import l11.p;
import q71.d1;

/* loaded from: classes5.dex */
public final class TypeaheadLegacySearchBarContainer extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f47914f = 0;

    /* renamed from: a, reason: collision with root package name */
    public View f47915a;

    /* renamed from: b, reason: collision with root package name */
    public View f47916b;

    /* renamed from: c, reason: collision with root package name */
    public SearchBarView f47917c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltText f47918d;

    /* renamed from: e, reason: collision with root package name */
    public d1 f47919e;

    public TypeaheadLegacySearchBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i13) {
        View.inflate(context, e.view_typeahead_search_bar, this);
        setLayoutTransition(new LayoutTransition());
        this.f47915a = findViewById(d.back_button_space);
        this.f47916b = findViewById(d.filter_button_space);
        this.f47917c = (SearchBarView) findViewById(d.view_typeahead_search_bar);
        GestaltText gestaltText = (GestaltText) findViewById(d.view_typeahead_search_bar_cancel);
        this.f47918d = gestaltText;
        gestaltText.j(new p(this, 18));
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, g.TypeaheadSearchBarContainer, i13, 0);
        boolean z13 = obtainStyledAttributes.getBoolean(g.TypeaheadSearchBarContainer_showLensIcon, true);
        boolean z14 = obtainStyledAttributes.getBoolean(g.TypeaheadSearchBarContainer_focusSearchBar, true);
        SearchBarView searchBarView = this.f47917c;
        searchBarView.f47692i = z13;
        k3.R1(searchBarView.f47688e, z13);
        this.f47917c.f47693j = z14;
    }

    public TypeaheadLegacySearchBarContainer(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a(context, attributeSet, i13);
    }
}
