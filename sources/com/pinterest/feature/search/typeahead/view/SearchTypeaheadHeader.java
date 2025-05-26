package com.pinterest.feature.search.typeahead.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import bs1.c;
import com.pinterest.feature.ideaPinCreation.closeup.view.d0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import defpackage.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import q71.q;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/SearchTypeaheadHeader;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadHeader extends LinearLayout implements n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47854d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f47855a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIconButton f47856b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f47857c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadHeader(Context context, int i13, boolean z13, int i14) {
        this(6, context, (AttributeSet) null);
        z13 = (i14 & 8) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(context, "context");
        a0.q(this.f47855a, c.j2(new String[0], i13));
        a aVar = new a(22, null);
        GestaltIconButton gestaltIconButton = this.f47856b;
        gestaltIconButton.u(aVar);
        gestaltIconButton.t(new d0(6, null));
        if (z13) {
            this.f47855a.i(q.f102740l);
            setPaddingRelative(getResources().getDimensionPixelOffset(eo1.c.space_200), getResources().getDimensionPixelOffset(eo1.c.margin), getResources().getDimensionPixelOffset(eo1.c.margin), getResources().getDimensionPixelOffset(eo1.c.space_100));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadHeader(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SearchTypeaheadHeader(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadHeader(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        this.f47855a = gestaltText;
        GestaltIconButton t13 = new GestaltIconButton(6, context, (AttributeSet) null).t(q.f102741m);
        this.f47856b = t13;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(r0.margin);
        setPaddingRelative(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, 0);
        addView(gestaltText, new LinearLayout.LayoutParams(0, -2, 1.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        Unit unit = Unit.f80348a;
        addView(t13, layoutParams);
    }
}
