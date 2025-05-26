package com.pinterest.feature.search.visual.lens.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import kh2.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import u81.c;
import u81.c0;
import u81.h;
import x61.e;
import x81.a0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/search/visual/lens/view/VirtualTryOnBottomSheetHeaderView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "x81/a0", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class VirtualTryOnBottomSheetHeaderView extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f48060d = 0;

    /* renamed from: a, reason: collision with root package name */
    public a0 f48061a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f48062b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48063c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VirtualTryOnBottomSheetHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f48063c.i(new c0(title, 5));
    }

    public final void b(boolean z13) {
        this.f48062b = z13;
        this.f48063c.i(new h(z13, 1));
    }

    public /* synthetic */ VirtualTryOnBottomSheetHeaderView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualTryOnBottomSheetHeaderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(c.f121013v);
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        j1.o1(gestaltText, 1);
        b.y2(gestaltText);
        addView(gestaltText);
        this.f48063c = gestaltText;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.margin_text);
        setPaddingRelative(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        setOrientation(1);
        setOnClickListener(new e(this, 20));
    }
}
