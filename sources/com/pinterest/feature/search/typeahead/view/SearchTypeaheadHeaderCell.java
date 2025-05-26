package com.pinterest.feature.search.typeahead.view;

import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import k71.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.j3;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import q71.a0;
import so.jb;
import ye2.o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/SearchTypeaheadHeaderCell;", "Landroid/widget/LinearLayout;", "Lk71/f;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadHeaderCell extends LinearLayout implements f, c {

    /* renamed from: a, reason: collision with root package name */
    public o f47858a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47859b;

    /* renamed from: c, reason: collision with root package name */
    public final j3 f47860c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f47861d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadHeaderCell(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f47858a == null) {
            this.f47858a = new o(this);
        }
        return this.f47858a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47858a == null) {
            this.f47858a = new o(this);
        }
        return this.f47858a.generatedComponent();
    }

    public /* synthetic */ SearchTypeaheadHeaderCell(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadHeaderCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f47859b) {
            this.f47859b = true;
            this.f47860c = ((jb) ((a0) generatedComponent())).f113485c.y6();
        }
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        this.f47861d = gestaltText;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setPaddingRelative(getResources().getDimensionPixelSize(r0.margin), getResources().getDimensionPixelSize(r0.margin), getResources().getDimensionPixelSize(r0.margin), 0);
        addView(gestaltText, new LinearLayout.LayoutParams(0, -2, 1.0f));
    }
}
