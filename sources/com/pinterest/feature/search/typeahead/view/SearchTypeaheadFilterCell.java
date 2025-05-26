package com.pinterest.feature.search.typeahead.view;

import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import k71.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import o71.n;
import org.jetbrains.annotations.NotNull;
import q71.s;
import so.jb;
import ye2.o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/SearchTypeaheadFilterCell;", "Landroid/widget/LinearLayout;", "Lk71/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "searchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadFilterCell extends LinearLayout implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public o f47846a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47847b;

    /* renamed from: c, reason: collision with root package name */
    public final q f47848c;

    /* renamed from: d, reason: collision with root package name */
    public n f47849d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadFilterCell(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f47846a == null) {
            this.f47846a = new o(this);
        }
        return this.f47846a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47846a == null) {
            this.f47846a = new o(this);
        }
        return this.f47846a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadFilterCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f47847b) {
            this.f47847b = true;
            this.f47848c = (q) ((jb) ((s) generatedComponent())).f113483a.O0.get();
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getResources().getDimensionPixelSize(eo1.c.space_300));
    }

    public /* synthetic */ SearchTypeaheadFilterCell(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }
}
