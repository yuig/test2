package com.pinterest.feature.pin.edit.section.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import v11.a;
import x11.b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/pin/edit/section/view/PinEditBoardSectionPickerCellView;", "Landroid/widget/LinearLayout;", "Lv11/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinEditBoardSectionPickerCellView extends LinearLayout implements a {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f47158c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f47159a;

    /* renamed from: b, reason: collision with root package name */
    public String f47160b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinEditBoardSectionPickerCellView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PinEditBoardSectionPickerCellView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinEditBoardSectionPickerCellView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        int dimensionPixelOffset = gestaltText.getResources().getDimensionPixelOffset(r0.margin);
        gestaltText.i(b.f131573j);
        gestaltText.setMaxLines(2);
        gestaltText.setEllipsize(TextUtils.TruncateAt.END);
        int i14 = dimensionPixelOffset / 2;
        gestaltText.setPaddingRelative(dimensionPixelOffset, i14, dimensionPixelOffset, i14);
        this.f47159a = gestaltText;
        addView(gestaltText);
    }
}
