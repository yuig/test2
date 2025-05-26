package com.pinterest.feature.search.typeahead.view;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c0.d;
import com.pinterest.feature.search.results.view.SearchBarView;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import dl1.i0;
import i31.a;
import kh2.g3;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.f3;
import org.jetbrains.annotations.NotNull;
import q71.c1;
import q71.d1;
import q71.e1;
import q71.q;
import q71.t;
import so.jb;
import ve.h;
import vs0.b;
import ye2.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/TypeaheadSearchBarContainer;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "q71/d1", "searchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TypeaheadSearchBarContainer extends FrameLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    public o f47920a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47921b;

    /* renamed from: c, reason: collision with root package name */
    public f3 f47922c;

    /* renamed from: d, reason: collision with root package name */
    public LinearLayout f47923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeaheadSearchBarContainer(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f47921b) {
            this.f47921b = true;
            g3.N1(this, ((jb) ((e1) generatedComponent())).f113485c.w6());
        }
        g(context, attributeSet, 0);
    }

    public final void a() {
        TypeaheadGestaltSearchBarContainer d2 = d();
        if (d2 != null) {
            d.j(d2.f47910a, q.f102754z);
        }
        TypeaheadLegacySearchBarContainer e13 = e();
        if (e13 != null) {
            e13.f47917c.f47685b.clearAnimation();
        }
    }

    public final void b() {
        TypeaheadGestaltSearchBarContainer d2 = d();
        if (d2 != null) {
            d.j(d2.f47910a, q.A);
        }
        TypeaheadLegacySearchBarContainer e13 = e();
        if (e13 != null) {
            e13.f47917c.f47695l = true;
        }
    }

    public final void c() {
        LinearLayout linearLayout = this.f47923d;
        TypeaheadGestaltSearchBarContainer typeaheadGestaltSearchBarContainer = linearLayout instanceof TypeaheadGestaltSearchBarContainer ? (TypeaheadGestaltSearchBarContainer) linearLayout : null;
        if (typeaheadGestaltSearchBarContainer != null) {
            typeaheadGestaltSearchBarContainer.f47910a.post(new b(typeaheadGestaltSearchBarContainer, 24));
        }
        LinearLayout linearLayout2 = this.f47923d;
        TypeaheadLegacySearchBarContainer typeaheadLegacySearchBarContainer = linearLayout2 instanceof TypeaheadLegacySearchBarContainer ? (TypeaheadLegacySearchBarContainer) linearLayout2 : null;
        if (typeaheadLegacySearchBarContainer != null) {
            typeaheadLegacySearchBarContainer.f47917c.post(new b(typeaheadLegacySearchBarContainer, 25));
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f47920a == null) {
            this.f47920a = new o(this);
        }
        return this.f47920a;
    }

    public final TypeaheadGestaltSearchBarContainer d() {
        LinearLayout linearLayout = this.f47923d;
        if (linearLayout instanceof TypeaheadGestaltSearchBarContainer) {
            return (TypeaheadGestaltSearchBarContainer) linearLayout;
        }
        return null;
    }

    public final TypeaheadLegacySearchBarContainer e() {
        LinearLayout linearLayout = this.f47923d;
        if (linearLayout instanceof TypeaheadLegacySearchBarContainer) {
            return (TypeaheadLegacySearchBarContainer) linearLayout;
        }
        return null;
    }

    public final String f() {
        String I0;
        LinearLayout linearLayout = this.f47923d;
        String str = null;
        TypeaheadGestaltSearchBarContainer typeaheadGestaltSearchBarContainer = linearLayout instanceof TypeaheadGestaltSearchBarContainer ? (TypeaheadGestaltSearchBarContainer) linearLayout : null;
        if (typeaheadGestaltSearchBarContainer != null && (I0 = typeaheadGestaltSearchBarContainer.f47910a.I0()) != null) {
            return I0;
        }
        LinearLayout linearLayout2 = this.f47923d;
        TypeaheadLegacySearchBarContainer typeaheadLegacySearchBarContainer = linearLayout2 instanceof TypeaheadLegacySearchBarContainer ? (TypeaheadLegacySearchBarContainer) linearLayout2 : null;
        if (typeaheadLegacySearchBarContainer != null) {
            SearchBarView searchBarView = typeaheadLegacySearchBarContainer.f47917c;
            str = searchBarView.f47686c.getText() == null ? "" : searchBarView.f47686c.getText().toString();
        }
        return str == null ? "" : str;
    }

    public final void g(Context context, AttributeSet attributeSet, int i13) {
        f3 f3Var = this.f47922c;
        boolean z13 = false;
        if (f3Var != null && h.W(f3Var, context)) {
            z13 = true;
        }
        LinearLayout typeaheadGestaltSearchBarContainer = Intrinsics.d(Boolean.valueOf(z13), Boolean.TRUE) ? new TypeaheadGestaltSearchBarContainer(context, attributeSet, i13) : new TypeaheadLegacySearchBarContainer(context, attributeSet, i13);
        this.f47923d = typeaheadGestaltSearchBarContainer;
        addView(typeaheadGestaltSearchBarContainer);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47920a == null) {
            this.f47920a = new o(this);
        }
        return this.f47920a.generatedComponent();
    }

    public final void h() {
        LinearLayout linearLayout = this.f47923d;
        TypeaheadGestaltSearchBarContainer typeaheadGestaltSearchBarContainer = linearLayout instanceof TypeaheadGestaltSearchBarContainer ? (TypeaheadGestaltSearchBarContainer) linearLayout : null;
        if (typeaheadGestaltSearchBarContainer != null) {
            d.j(typeaheadGestaltSearchBarContainer.f47910a, q.B);
        }
        LinearLayout linearLayout2 = this.f47923d;
        TypeaheadLegacySearchBarContainer typeaheadLegacySearchBarContainer = linearLayout2 instanceof TypeaheadLegacySearchBarContainer ? (TypeaheadLegacySearchBarContainer) linearLayout2 : null;
        if (typeaheadLegacySearchBarContainer != null) {
            k3.R1(typeaheadLegacySearchBarContainer.f47917c.f47687d, false);
            k3.R1(typeaheadLegacySearchBarContainer.f47916b, true);
            k3.R1(typeaheadLegacySearchBarContainer.f47915a, true);
        }
    }

    public final void i(d1 d1Var) {
        LinearLayout linearLayout = this.f47923d;
        TypeaheadGestaltSearchBarContainer typeaheadGestaltSearchBarContainer = linearLayout instanceof TypeaheadGestaltSearchBarContainer ? (TypeaheadGestaltSearchBarContainer) linearLayout : null;
        if (typeaheadGestaltSearchBarContainer != null) {
            typeaheadGestaltSearchBarContainer.f47912c = d1Var;
            typeaheadGestaltSearchBarContainer.f47910a.g0(new c1(typeaheadGestaltSearchBarContainer, 1));
        }
        LinearLayout linearLayout2 = this.f47923d;
        TypeaheadLegacySearchBarContainer typeaheadLegacySearchBarContainer = linearLayout2 instanceof TypeaheadLegacySearchBarContainer ? (TypeaheadLegacySearchBarContainer) linearLayout2 : null;
        if (typeaheadLegacySearchBarContainer != null) {
            typeaheadLegacySearchBarContainer.f47919e = d1Var;
            typeaheadLegacySearchBarContainer.f47917c.f47690g = d1Var;
        }
    }

    public final void j(String text) {
        Intrinsics.checkNotNullParameter(text, "query");
        LinearLayout linearLayout = this.f47923d;
        TypeaheadGestaltSearchBarContainer typeaheadGestaltSearchBarContainer = linearLayout instanceof TypeaheadGestaltSearchBarContainer ? (TypeaheadGestaltSearchBarContainer) linearLayout : null;
        if (typeaheadGestaltSearchBarContainer != null) {
            Intrinsics.checkNotNullParameter(text, "query");
            GestaltSearchField gestaltSearchField = typeaheadGestaltSearchBarContainer.f47910a;
            Intrinsics.checkNotNullParameter(gestaltSearchField, "<this>");
            Intrinsics.checkNotNullParameter(text, "text");
            gestaltSearchField.a0(new i0(text, 1));
        }
        LinearLayout linearLayout2 = this.f47923d;
        TypeaheadLegacySearchBarContainer typeaheadLegacySearchBarContainer = linearLayout2 instanceof TypeaheadLegacySearchBarContainer ? (TypeaheadLegacySearchBarContainer) linearLayout2 : null;
        if (typeaheadLegacySearchBarContainer == null) {
            return;
        }
        SearchBarView searchBarView = typeaheadLegacySearchBarContainer.f47917c;
        searchBarView.f47686c.setText(text);
        try {
            searchBarView.f47686c.setSelection(text.length());
        } catch (IndexOutOfBoundsException unused) {
        }
        typeaheadLegacySearchBarContainer.f47917c.c(text.isEmpty());
    }

    public final void k(Boolean bool) {
        LinearLayout linearLayout = this.f47923d;
        TypeaheadGestaltSearchBarContainer typeaheadGestaltSearchBarContainer = linearLayout instanceof TypeaheadGestaltSearchBarContainer ? (TypeaheadGestaltSearchBarContainer) linearLayout : null;
        if (typeaheadGestaltSearchBarContainer != null) {
            d.j(typeaheadGestaltSearchBarContainer.f47910a, new a(bool != null ? bool.booleanValue() : false, 26));
        }
        LinearLayout linearLayout2 = this.f47923d;
        TypeaheadLegacySearchBarContainer typeaheadLegacySearchBarContainer = linearLayout2 instanceof TypeaheadLegacySearchBarContainer ? (TypeaheadLegacySearchBarContainer) linearLayout2 : null;
        if (typeaheadLegacySearchBarContainer != null) {
            SearchBarView searchBarView = typeaheadLegacySearchBarContainer.f47917c;
            boolean booleanValue = bool.booleanValue();
            searchBarView.f47692i = booleanValue;
            k3.R1(searchBarView.f47688e, booleanValue);
        }
    }

    public final void l() {
        d();
        TypeaheadLegacySearchBarContainer e13 = e();
        if (e13 != null) {
            e13.f47917c.f47685b.setVisibility(0);
        }
    }

    public final void m(t tVar) {
        TypeaheadGestaltSearchBarContainer d2 = d();
        if (d2 != null) {
            d2.f47913d = tVar;
        }
        TypeaheadLegacySearchBarContainer e13 = e();
        if (e13 != null) {
            e13.f47917c.f47694k = tVar;
        }
    }

    public final void n(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        TypeaheadGestaltSearchBarContainer d2 = d();
        if (d2 != null) {
            d.j(d2.f47910a, q.C);
        }
        TypeaheadLegacySearchBarContainer e13 = e();
        if (e13 != null) {
            e13.f47917c.f47685b.startAnimation(animation);
        }
    }

    public final void o(int i13) {
        LinearLayout linearLayout = this.f47923d;
        TypeaheadGestaltSearchBarContainer typeaheadGestaltSearchBarContainer = linearLayout instanceof TypeaheadGestaltSearchBarContainer ? (TypeaheadGestaltSearchBarContainer) linearLayout : null;
        if (typeaheadGestaltSearchBarContainer != null) {
            typeaheadGestaltSearchBarContainer.f47910a.a0(new uv.b(bs1.c.j2(new String[0], i13), 2));
        }
        LinearLayout linearLayout2 = this.f47923d;
        TypeaheadLegacySearchBarContainer typeaheadLegacySearchBarContainer = linearLayout2 instanceof TypeaheadLegacySearchBarContainer ? (TypeaheadLegacySearchBarContainer) linearLayout2 : null;
        if (typeaheadLegacySearchBarContainer != null) {
            typeaheadLegacySearchBarContainer.f47917c.f47686c.setHint(i13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeaheadSearchBarContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f47921b) {
            this.f47921b = true;
            g3.N1(this, ((jb) ((e1) generatedComponent())).f113485c.w6());
        }
        g(context, attributeSet, i13);
    }
}
