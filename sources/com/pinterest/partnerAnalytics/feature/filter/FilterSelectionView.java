package com.pinterest.partnerAnalytics.feature.filter;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kw1.c;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import px1.d;
import px1.e;
import px1.q;
import px1.s;
import px1.t;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/filter/FilterSelectionView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FilterSelectionView extends LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f50184h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f50185a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f50186b;

    /* renamed from: c, reason: collision with root package name */
    public final t f50187c;

    /* renamed from: d, reason: collision with root package name */
    public Function1 f50188d;

    /* renamed from: e, reason: collision with root package name */
    public int f50189e;

    /* renamed from: f, reason: collision with root package name */
    public Function1 f50190f;

    /* renamed from: g, reason: collision with root package name */
    public int f50191g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterSelectionView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a, reason: from getter */
    public final GestaltText getF50185a() {
        return this.f50185a;
    }

    public final void b(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a0.p(this.f50186b, description);
    }

    public final void c(List entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        t tVar = this.f50187c;
        tVar.f101693f.clear();
        tVar.f101693f.addAll(entries);
    }

    public final void d(boolean z13) {
        this.f50187c.f101694g = z13;
    }

    public final void e(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f50188d = dVar;
    }

    public final void f(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f50190f = dVar;
    }

    public final void g(int i13) {
        this.f50191g = i13;
        t tVar = this.f50187c;
        tVar.i(tVar.f101696i);
        tVar.i(i13);
        tVar.f101696i = i13;
    }

    public final void h(int i13) {
        this.f50189e = i13;
        t tVar = this.f50187c;
        tVar.i(tVar.f101695h);
        tVar.i(i13);
        tVar.f101695h = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterSelectionView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        t tVar = new t(context, new s(this, 2), new s(this, 3));
        this.f50187c = tVar;
        this.f50188d = e.f101644w;
        this.f50190f = e.f101645x;
        View inflate = LayoutInflater.from(context).inflate(com.pinterest.partnerAnalytics.e.filter_selection_view, (ViewGroup) null);
        View findViewById = inflate.findViewById(com.pinterest.partnerAnalytics.d.tvTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        this.f50185a = gestaltText;
        View findViewById2 = inflate.findViewById(com.pinterest.partnerAnalytics.d.rvListItems);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = inflate.findViewById(com.pinterest.partnerAnalytics.d.tvDescription);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        this.f50186b = gestaltText2;
        ((RecyclerView) findViewById2).H2(tVar);
        int i14 = 0;
        addView(inflate, 0, new FrameLayout.LayoutParams(-1, -2));
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, h.FilterSelectionViewAttrs, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(h.FilterSelectionViewAttrs_filterTitle);
            String str = "";
            a0.p(gestaltText, string == null ? "" : string);
            String string2 = obtainStyledAttributes.getString(h.FilterSelectionViewAttrs_filterDescription);
            if (string2 != null) {
                str = string2;
            }
            gestaltText2.i(new c(str, 4));
            CharSequence[] textArray = obtainStyledAttributes.getTextArray(h.FilterSelectionViewAttrs_android_entries);
            textArray = textArray == null ? new CharSequence[0] : textArray;
            ArrayList arrayList = new ArrayList(textArray.length);
            for (CharSequence charSequence : textArray) {
                arrayList.add(charSequence.toString());
            }
            ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                int i15 = i14;
                if (!it.hasNext()) {
                    c(arrayList2);
                    obtainStyledAttributes.recycle();
                    return;
                }
                Object next = it.next();
                i14 = i15 + 1;
                if (i15 < 0) {
                    f0.p();
                    throw null;
                }
                String str2 = (String) next;
                arrayList2.add(new q(i15, str2, str2, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER));
            }
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }
}
