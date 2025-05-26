package com.pinterest.feature.ideaPinCreation.closeup.view;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f46354a;

    /* renamed from: b, reason: collision with root package name */
    public final float f46355b;

    /* renamed from: c, reason: collision with root package name */
    public final float f46356c;

    /* renamed from: d, reason: collision with root package name */
    public final Float f46357d;

    /* renamed from: e, reason: collision with root package name */
    public final Float f46358e;

    /* renamed from: f, reason: collision with root package name */
    public final Float f46359f;

    public w1(float f13, float f14, float f15, Float f16, Float f17, Float f18) {
        this.f46354a = f13;
        this.f46355b = f14;
        this.f46356c = f15;
        this.f46357d = f16;
        this.f46358e = f17;
        this.f46359f = f18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return Float.compare(this.f46354a, w1Var.f46354a) == 0 && Float.compare(this.f46355b, w1Var.f46355b) == 0 && Float.compare(this.f46356c, w1Var.f46356c) == 0 && Intrinsics.d(this.f46357d, w1Var.f46357d) && Intrinsics.d(this.f46358e, w1Var.f46358e) && Intrinsics.d(this.f46359f, w1Var.f46359f);
    }

    public final int hashCode() {
        int a13 = a.a.a(this.f46356c, a.a.a(this.f46355b, Float.hashCode(this.f46354a) * 31, 31), 31);
        Float f13 = this.f46357d;
        int hashCode = (a13 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.f46358e;
        int hashCode2 = (hashCode + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.f46359f;
        return hashCode2 + (f15 != null ? f15.hashCode() : 0);
    }

    public final String toString() {
        return "IdeaPinStickyGuidelineResult(adjustedCurrentX=" + this.f46354a + ", adjustedCurrentY=" + this.f46355b + ", adjustedCurrentRotation=" + this.f46356c + ", adjustedStartX=" + this.f46357d + ", adjustedStartY=" + this.f46358e + ", adjustedStartRotation=" + this.f46359f + ")";
    }
}
