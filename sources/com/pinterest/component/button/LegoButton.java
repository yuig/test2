package com.pinterest.component.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import le0.i;
import m.e;
import org.jetbrains.annotations.NotNull;
import xk2.d;

@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/component/button/LegoButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "xa0/j", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class LegoButton extends AppCompatButton {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f44743h = 0;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f44744d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f44745e;

    /* renamed from: f, reason: collision with root package name */
    public int f44746f;

    /* renamed from: g, reason: collision with root package name */
    public final int f44747g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44747g = getResources().getDimensionPixelSize(c.button_icon_margin);
        c(attributeSet);
    }

    public static void d(LegoButton legoButton, int i13) {
        if (i13 == 0) {
            legoButton.setCompoundDrawablesRelative(null, null, null, null);
            return;
        }
        Context context = legoButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        legoButton.f44744d = bs1.c.h0(context, i13);
        legoButton.f(true, false);
    }

    public final void c(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.LegoButton);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int resourceId = obtainStyledAttributes.getResourceId(i.LegoButton_icon, 0);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f44744d = bs1.c.h0(context, resourceId);
            this.f44746f = obtainStyledAttributes.getDimensionPixelSize(i.LegoButton_iconSize, 0);
            f(true, true);
            obtainStyledAttributes.recycle();
        }
    }

    public final void e() {
        CharSequence text = getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        setCompoundDrawablePadding(text.length() == 0 ? 0 : this.f44747g);
    }

    public final void f(boolean z13, boolean z14) {
        Drawable drawable = this.f44744d;
        if (drawable == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(this.f44746f);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : drawable.getIntrinsicWidth();
        Integer valueOf2 = Integer.valueOf(this.f44746f);
        if (valueOf2.intValue() == 0) {
            valueOf2 = null;
        }
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : drawable.getIntrinsicHeight();
        Drawable mutate = drawable.mutate();
        if (z13) {
            mutate.setColorFilter(new PorterDuffColorFilter(getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        }
        mutate.setBounds(0, 0, intValue, intValue2);
        if (z14) {
            setCompoundDrawablesRelative(mutate, null, null, null);
        } else {
            setCompoundDrawablesRelative(null, null, mutate, null);
        }
        e();
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i13) {
        setBackgroundTintList(ColorStateList.valueOf(i13));
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        e();
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i13) {
        super.setTextColor(i13);
        Drawable[] compoundDrawables = getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
        int length = compoundDrawables.length;
        for (int i14 = 0; i14 < length; i14++) {
            Drawable drawable = compoundDrawables[i14];
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            if (mutate != null) {
                mutate.setColorFilter(new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44747g = getResources().getDimensionPixelSize(c.button_icon_margin);
        c(attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegoButton(Context context, int i13) {
        this(new e(context, i13), null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
