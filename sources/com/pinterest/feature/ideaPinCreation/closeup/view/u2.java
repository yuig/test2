package com.pinterest.feature.ideaPinCreation.closeup.view;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f46329a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46330b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46331c;

    /* renamed from: d, reason: collision with root package name */
    public final float f46332d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46333e;

    /* renamed from: f, reason: collision with root package name */
    public final int f46334f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f46335g;

    /* renamed from: h, reason: collision with root package name */
    public final int f46336h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f46337i;

    public u2(int i13, int i14, int i15, float f13, int i16, int i17, Integer num, int i18, Integer num2) {
        this.f46329a = i13;
        this.f46330b = i14;
        this.f46331c = i15;
        this.f46332d = f13;
        this.f46333e = i16;
        this.f46334f = i17;
        this.f46335g = num;
        this.f46336h = i18;
        this.f46337i = num2;
    }

    public static u2 a(u2 u2Var, int i13, int i14, int i15, float f13, int i16, int i17, Integer num, int i18, int i19) {
        return new u2((i19 & 1) != 0 ? u2Var.f46329a : i13, (i19 & 2) != 0 ? u2Var.f46330b : i14, (i19 & 4) != 0 ? u2Var.f46331c : i15, (i19 & 8) != 0 ? u2Var.f46332d : f13, i16, i17, (i19 & 64) != 0 ? u2Var.f46335g : num, (i19 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? u2Var.f46336h : i18, u2Var.f46337i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return this.f46329a == u2Var.f46329a && this.f46330b == u2Var.f46330b && this.f46331c == u2Var.f46331c && Float.compare(this.f46332d, u2Var.f46332d) == 0 && this.f46333e == u2Var.f46333e && this.f46334f == u2Var.f46334f && Intrinsics.d(this.f46335g, u2Var.f46335g) && this.f46336h == u2Var.f46336h && Intrinsics.d(this.f46337i, u2Var.f46337i);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f46334f, ep.b.b(this.f46333e, a.a.a(this.f46332d, ep.b.b(this.f46331c, ep.b.b(this.f46330b, Integer.hashCode(this.f46329a) * 31, 31), 31), 31), 31), 31);
        Integer num = this.f46335g;
        int b14 = ep.b.b(this.f46336h, (b13 + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.f46337i;
        return b14 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TagSpec(horizontalPadding=");
        sb3.append(this.f46329a);
        sb3.append(", verticalPadding=");
        sb3.append(this.f46330b);
        sb3.append(", elementSpacing=");
        sb3.append(this.f46331c);
        sb3.append(", backgroundCornerRadius=");
        sb3.append(this.f46332d);
        sb3.append(", iconWidth=");
        sb3.append(this.f46333e);
        sb3.append(", iconHeight=");
        sb3.append(this.f46334f);
        sb3.append(", iconResId=");
        sb3.append(this.f46335g);
        sb3.append(", maxLine=");
        sb3.append(this.f46336h);
        sb3.append(", maxChar=");
        return a.c.i(sb3, this.f46337i, ")");
    }
}
