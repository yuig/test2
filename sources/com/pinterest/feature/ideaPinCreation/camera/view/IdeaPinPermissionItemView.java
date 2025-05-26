package com.pinterest.feature.ideaPinCreation.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import dq1.b;
import eo1.c;
import kg.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import tt0.a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/IdeaPinPermissionItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinPermissionItemView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltIcon f45942a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45943b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f45944c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f45945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinPermissionItemView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_100);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.space_200);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(0);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltIcon gestaltIcon = new GestaltIcon(context2);
        gestaltIcon.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        gestaltIcon.g2(a.B);
        this.f45942a = gestaltIcon;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText i13 = new GestaltText(6, context3, (AttributeSet) null).i(a.C);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        i13.setLayoutParams(layoutParams);
        i13.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        this.f45943b = i13;
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.setBackgroundResource(b.ic_circle_outline_nonpds);
        frameLayout.addView(i13);
        this.f45944c = frameLayout;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context4, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        com.bumptech.glide.c.a1(layoutParams3, dimensionPixelSize2, 0, 0, 0);
        gestaltText.setLayoutParams(layoutParams3);
        this.f45945d = gestaltText;
        addView(gestaltIcon);
        addView(frameLayout);
        addView(gestaltText);
    }

    public final void a(boolean z13) {
        FrameLayout frameLayout = this.f45944c;
        GestaltText gestaltText = this.f45945d;
        GestaltText gestaltText2 = this.f45943b;
        GestaltIcon gestaltIcon = this.f45942a;
        if (z13) {
            t.e1(gestaltIcon);
            bs1.c.X0(frameLayout);
            gestaltText2.i(a.D);
            gestaltText.i(a.E);
            return;
        }
        t.O(gestaltIcon);
        bs1.c.U1(frameLayout);
        gestaltText2.i(a.F);
        gestaltText.i(a.G);
    }

    public final void b(int i13, int i14) {
        a0.p(this.f45943b, String.valueOf(i13));
        String string = getResources().getString(i14);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(this.f45945d, string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinPermissionItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_100);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.space_200);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(0);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltIcon gestaltIcon = new GestaltIcon(context2);
        gestaltIcon.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        gestaltIcon.g2(a.B);
        this.f45942a = gestaltIcon;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText i14 = new GestaltText(6, context3, (AttributeSet) null).i(a.C);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        i14.setLayoutParams(layoutParams);
        i14.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        this.f45943b = i14;
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.setBackgroundResource(b.ic_circle_outline_nonpds);
        frameLayout.addView(i14);
        this.f45944c = frameLayout;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context4, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        com.bumptech.glide.c.a1(layoutParams3, dimensionPixelSize2, 0, 0, 0);
        gestaltText.setLayoutParams(layoutParams3);
        this.f45945d = gestaltText;
        addView(gestaltIcon);
        addView(frameLayout);
        addView(gestaltText);
    }
}
