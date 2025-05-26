package com.pinterest.feature.search.typeahead.view;

import af2.b;
import af2.c;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import e0.t;
import e5.n;
import java.util.HashMap;
import java.util.List;
import k71.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import l11.p;
import n42.a;
import n42.d;
import n42.e;
import o71.c0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import q71.j0;
import rq.t4;
import so.jb;
import ye2.o;
import z32.n1;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/SearchTypeaheadRecentSearchPillView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lk71/m;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadRecentSearchPillView extends ConstraintLayout implements m, c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f47877g = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f47878a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47879b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f47880c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIconButton f47881d;

    /* renamed from: e, reason: collision with root package name */
    public l f47882e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f47883f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadRecentSearchPillView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // k71.m
    public final void J5(String str, boolean z13) {
        this.f47881d.t(new t4(z13, str, 26));
    }

    @Override // k71.m
    public final void M5(String url, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(url, "url");
        l lVar = this.f47882e;
        if (lVar == null) {
            Intrinsics.r("uriNavigator");
            throw null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        l.b(lVar, context, url, false, false, null, hashMap, 92);
    }

    @Override // k71.m
    public final void O4(int i13) {
    }

    @Override // k71.m
    public final void Q5(List searchDelightConfig) {
        Intrinsics.checkNotNullParameter(searchDelightConfig, "searchDelightConfig");
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f47878a == null) {
            this.f47878a = new o(this);
        }
        return this.f47878a;
    }

    @Override // k71.m
    public final void f3(String title, String str, n1 n1Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        setContentDescription(getResources().getString(e.content_description_search_typeahead, title));
    }

    @Override // k71.m
    public final void f6() {
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47878a == null) {
            this.f47878a = new o(this);
        }
        return this.f47878a.generatedComponent();
    }

    @Override // k71.m
    public final void i0(int i13) {
    }

    @Override // k71.m
    public final void j2(int i13) {
    }

    @Override // k71.m
    public final void k4(String title, String enteredQuery, n1 n1Var, boolean z13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(enteredQuery, "enteredQuery");
        a0.p(this.f47880c, title);
    }

    @Override // k71.m
    public final void o1(String str) {
    }

    @Override // k71.m
    public final void u(String str) {
    }

    @Override // k71.m
    public final void v0(int i13) {
    }

    @Override // k71.m
    public final void w5() {
    }

    @Override // k71.m
    public final void z5(c0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47883f = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadRecentSearchPillView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f47879b) {
            this.f47879b = true;
            t.F0(this, (l) ((jb) ((j0) generatedComponent())).f113485c.f114476s.get());
        }
        View.inflate(getContext(), d.search_typeahead_recent_search_pill, this);
        View findViewById = findViewById(n42.c.cell_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47880c = (GestaltText) findViewById;
        View findViewById2 = findViewById(n42.c.cell_clear);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById2;
        this.f47881d = gestaltIconButton;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, getResources().getDimensionPixelOffset(a.search_autocomplete_recent_search_pill_height)));
        Resources resources = getResources();
        int i14 = n42.b.recent_search_pill_background;
        ThreadLocal threadLocal = n.f57243a;
        setBackground(resources.getDrawable(i14, null));
        setOnClickListener(new x61.e(this, 11));
        gestaltIconButton.u(new p(this, 17));
    }
}
