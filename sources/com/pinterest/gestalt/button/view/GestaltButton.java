package com.pinterest.gestalt.button.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.messaging.q;
import fm1.c;
import gm1.a;
import gm1.b;
import i2.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ps0.y;
import rm1.r;
import u50.f0;
import u50.o;
import xl1.f;
import yl1.d;
import yl1.e;
import yl1.g;
import yl1.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0015\u0004\u0003\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Lgm1/b;", "Lyl1/b;", "ps0/y", "LargeAlwaysDarkButton", "LargeAlwaysLightButton", "LargePrimaryButton", "LargeSecondaryButton", "LargeSelectedButton", "LargeShoppingButton", "LargeTertiaryButton", "LargeTransparentButton", "yl1/c", "SmallAlwaysDarkButton", "SmallAlwaysLightButton", "SmallPrimaryButton", "SmallSecondaryButton", "SmallSelectedButton", "SmallShoppingButton", "SmallTertiaryButton", "SmallTransparentButton", "yl1/d", "yl1/e", "button_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class GestaltButton extends n implements b {

    /* renamed from: h */
    public static final y f49319h = new y(20, 0);

    /* renamed from: i */
    public static final c f49320i = c.VISIBLE;

    /* renamed from: j */
    public static final yl1.c f49321j = yl1.c.LARGE;

    /* renamed from: k */
    public static final d f49322k = d.PRIMARY;

    /* renamed from: l */
    public static final e f49323l = e.INLINE;

    /* renamed from: f */
    public final q f49324f;

    /* renamed from: g */
    public View.OnClickListener f49325g;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$LargeAlwaysDarkButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LargeAlwaysDarkButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LargeAlwaysDarkButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ LargeAlwaysDarkButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LargeAlwaysDarkButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Large_AlwaysDark);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$LargeAlwaysLightButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LargeAlwaysLightButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LargeAlwaysLightButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ LargeAlwaysLightButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LargeAlwaysLightButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Large_AlwaysLight);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$LargePrimaryButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LargePrimaryButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LargePrimaryButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ LargePrimaryButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LargePrimaryButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Large_Primary);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$LargeSecondaryButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LargeSecondaryButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LargeSecondaryButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ LargeSecondaryButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LargeSecondaryButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Large_Secondary);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$LargeSelectedButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LargeSelectedButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LargeSelectedButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ LargeSelectedButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LargeSelectedButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Large_Selected);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$LargeShoppingButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LargeShoppingButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LargeShoppingButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ LargeShoppingButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LargeShoppingButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Large_Shopping);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$LargeTertiaryButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LargeTertiaryButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LargeTertiaryButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ LargeTertiaryButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LargeTertiaryButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Large_Tertiary);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$LargeTransparentButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LargeTransparentButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LargeTransparentButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ LargeTransparentButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LargeTransparentButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Large_Transparent);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$SmallAlwaysDarkButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SmallAlwaysDarkButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SmallAlwaysDarkButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ SmallAlwaysDarkButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallAlwaysDarkButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Small_AlwaysDark);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$SmallAlwaysLightButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SmallAlwaysLightButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SmallAlwaysLightButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ SmallAlwaysLightButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallAlwaysLightButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Small_AlwaysLight);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$SmallPrimaryButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SmallPrimaryButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SmallPrimaryButton(Context context) {
            this(6, context, (AttributeSet) null);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SmallPrimaryButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ SmallPrimaryButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallPrimaryButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Small_Primary);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$SmallSecondaryButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SmallSecondaryButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SmallSecondaryButton(Context context) {
            this(6, context, (AttributeSet) null);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SmallSecondaryButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ SmallSecondaryButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallSecondaryButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Small_Secondary);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$SmallSelectedButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SmallSelectedButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SmallSelectedButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ SmallSelectedButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallSelectedButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Small_Selected);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$SmallShoppingButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SmallShoppingButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SmallShoppingButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ SmallShoppingButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallShoppingButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Small_Shopping);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$SmallTertiaryButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SmallTertiaryButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SmallTertiaryButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ SmallTertiaryButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallTertiaryButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Small_Tertiary);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/gestalt/button/view/GestaltButton$SmallTransparentButton;", "Lcom/pinterest/gestalt/button/view/GestaltButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SmallTransparentButton extends GestaltButton {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SmallTransparentButton(@NotNull Context context, AttributeSet attributeSet) {
            this(4, context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ SmallTransparentButton(int i13, Context context, AttributeSet attributeSet) {
            this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallTransparentButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13, xl1.e.GestaltButton_Small_Transparent);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltButton(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final yl1.b c(GestaltButton gestaltButton, TypedArray typedArray) {
        gestaltButton.getClass();
        String string = typedArray.getString(f.GestaltButton_android_text);
        if (string == null) {
            string = "";
        }
        f0 h23 = bs1.c.h2(string);
        boolean z13 = typedArray.getBoolean(f.GestaltButton_android_enabled, true);
        c Y = d7.b.Y(typedArray, f.GestaltButton_android_visibility, f49320i);
        int i13 = typedArray.getInt(f.GestaltButton_gestalt_buttonColorPalette, -1);
        d dVar = i13 >= 0 ? d.values()[i13] : f49322k;
        int resourceId = typedArray.getResourceId(f.GestaltButton_android_backgroundTint, dVar.getColorPalette().f139324a);
        g colorPalette = dVar.getColorPalette();
        int i14 = colorPalette.f139325b;
        colorPalette.getClass();
        g gVar = new g(resourceId, i14);
        int i15 = typedArray.getInt(f.GestaltButton_gestalt_buttonSize, -1);
        yl1.c cVar = i15 >= 0 ? yl1.c.values()[i15] : f49321j;
        int i16 = typedArray.getInt(f.GestaltButton_gestalt_buttonWidth, -1);
        return new yl1.b(h23, z13, Y, null, gVar, cVar, r.b(typedArray, f.GestaltButton_gestalt_buttonStartIcon), r.b(typedArray, f.GestaltButton_gestalt_buttonEndIcon), gestaltButton.getId(), i16 >= 0 ? e.values()[i16] : f49323l, 8);
    }

    public final GestaltButton d(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltButton) this.f49324f.d(nextState, new i(23, this, h()));
    }

    public final GestaltButton e(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltButton) this.f49324f.c(eventHandler, new yl1.a(this, 1));
    }

    public final void f(yl1.b bVar) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        rm1.q qVar = bVar.f139306g;
        if (qVar != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            bitmapDrawable = k(qVar, context);
        } else {
            bitmapDrawable = null;
        }
        rm1.q qVar2 = bVar.f139307h;
        if (qVar2 != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            bitmapDrawable2 = k(qVar2, context2);
        } else {
            bitmapDrawable2 = null;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(bitmapDrawable, (Drawable) null, bitmapDrawable2, (Drawable) null);
        setCompoundDrawablePadding(dl2.b.G0(this, eo1.a.comp_button_icon_padding));
    }

    public final void g(View.OnClickListener onClickListener) {
        this.f49325g = onClickListener;
        j();
    }

    public final yl1.b h() {
        return (yl1.b) ((o) this.f49324f.f33803a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x008f, code lost:
    
        if ((r4 != null ? r4.f139307h : null) != r5.f139307h) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(yl1.b r4, yl1.b r5) {
        /*
            r3 = this;
            yl1.f r0 = yl1.f.f139315o
            yl1.a r1 = new yl1.a
            r2 = 10
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            yl1.f r0 = yl1.f.f139318r
            yl1.a r1 = new yl1.a
            r2 = 11
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            yl1.f r0 = yl1.f.f139319s
            yl1.a r1 = new yl1.a
            r2 = 12
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            yl1.f r0 = yl1.f.f139320t
            yl1.a r1 = new yl1.a
            r2 = 13
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            yl1.f r0 = yl1.f.f139321u
            yl1.a r1 = new yl1.a
            r2 = 2
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            yl1.f r0 = yl1.f.f139310j
            yl1.a r1 = new yl1.a
            r2 = 3
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            yl1.f r0 = yl1.f.f139311k
            yl1.a r1 = new yl1.a
            r2 = 4
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            yl1.f r0 = yl1.f.f139312l
            yl1.a r1 = new yl1.a
            r2 = 5
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            yl1.f r0 = yl1.f.f139313m
            yl1.a r1 = new yl1.a
            r2 = 6
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            yl1.f r0 = yl1.f.f139314n
            yl1.a r1 = new yl1.a
            r2 = 7
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            yl1.f r0 = yl1.f.f139316p
            yl1.a r1 = new yl1.a
            r2 = 8
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
            r0 = 0
            if (r4 == 0) goto L84
            rm1.q r1 = r4.f139306g
            goto L85
        L84:
            r1 = r0
        L85:
            rm1.q r2 = r5.f139306g
            if (r1 != r2) goto L91
            if (r4 == 0) goto L8d
            rm1.q r0 = r4.f139307h
        L8d:
            rm1.q r1 = r5.f139307h
            if (r0 == r1) goto L94
        L91:
            r3.f(r5)
        L94:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r5.f139308i
            if (r1 == r0) goto La6
            yl1.f r0 = yl1.f.f139317q
            yl1.a r1 = new yl1.a
            r2 = 9
            r1.<init>(r3, r2)
            df.j1.v(r4, r5, r0, r1)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.gestalt.button.view.GestaltButton.i(yl1.b, yl1.b):void");
    }

    public final void j() {
        this.f49324f.F(new yl1.a(this, 14), new yl1.a(this, 15));
    }

    public final BitmapDrawable k(rm1.q qVar, Context context) {
        Drawable f03 = bs1.c.f0(this, qVar.drawableRes(context), null, null, 6);
        f03.setTint(getCurrentTextColor());
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return d7.b.p0(f03, resources, dl2.b.G0(this, eo1.a.comp_button_icon_size), dl2.b.G0(this, eo1.a.comp_button_icon_size));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GestaltButton(int i13, int i14, Context context, AttributeSet attributeSet) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13, xl1.e.GestaltButton);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltButton(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(new m.e(context, i14), attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] GestaltButton = f.GestaltButton;
        Intrinsics.checkNotNullExpressionValue(GestaltButton, "GestaltButton");
        this.f49324f = new q(this, attributeSet, i13, GestaltButton, new yl1.a(this, 0));
        setGravity(17);
        i(null, h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GestaltButton(android.content.Context r9, yl1.b r10) {
        /*
            r8 = this;
            int r0 = xl1.e.GestaltButton
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "initialDisplayState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            m.e r1 = new m.e
            r1.<init>(r9, r0)
            r9 = 0
            r8.<init>(r1, r9, r0)
            com.google.firebase.messaging.q r0 = new com.google.firebase.messaging.q
            int[] r6 = xl1.f.GestaltButton
            java.lang.String r1 = "GestaltButton"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            ad1.b r7 = new ad1.b
            r1 = 1
            r7.<init>(r8, r1)
            r4 = 0
            r5 = 0
            r2 = r0
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f49324f = r0
            r0 = 17
            r8.setGravity(r0)
            r8.i(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.gestalt.button.view.GestaltButton.<init>(android.content.Context, yl1.b):void");
    }
}
