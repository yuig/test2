package com.pinterest.api.model;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class um {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f42584a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42585b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42586c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42587d;

    /* renamed from: e, reason: collision with root package name */
    public final int f42588e;

    /* renamed from: f, reason: collision with root package name */
    public final String f42589f;

    /* renamed from: g, reason: collision with root package name */
    public final int f42590g;

    /* renamed from: h, reason: collision with root package name */
    public final int f42591h;

    public um(@NotNull f30 pin, String str, String str2, int i13, int i14, String str3, int i15, int i16) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f42584a = pin;
        this.f42585b = str;
        this.f42586c = str2;
        this.f42587d = i13;
        this.f42588e = i14;
        this.f42589f = str3;
        this.f42590g = i15;
        this.f42591h = i16;
    }

    public final f30 a() {
        return this.f42584a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof um) {
            um umVar = (um) obj;
            if (Intrinsics.d(umVar.f42585b, this.f42585b)) {
                Boolean K4 = umVar.f42584a.K4();
                Intrinsics.checkNotNullExpressionValue(K4, "getIsEligibleForFlashlightShopping(...)");
                K4.booleanValue();
                f30 f30Var = this.f42584a;
                if (Intrinsics.d(K4, f30Var.K4()) && Intrinsics.d(umVar.f42584a.Q6(), f30Var.Q6()) && Intrinsics.d(b40.r(umVar.f42584a), b40.r(f30Var)) && Intrinsics.d(umVar.f42584a, f30Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f42584a.hashCode() * 31;
        String str = this.f42585b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GalleryItem(pin=");
        sb3.append(this.f42584a);
        sb3.append(", imageSignature=");
        sb3.append(this.f42585b);
        sb3.append(", largeUrl=");
        sb3.append(this.f42586c);
        sb3.append(", largeWidth=");
        sb3.append(this.f42587d);
        sb3.append(", largeHeight=");
        sb3.append(this.f42588e);
        sb3.append(", mediumUrl=");
        sb3.append(this.f42589f);
        sb3.append(", mediumWidth=");
        sb3.append(this.f42590g);
        sb3.append(", mediumHeight=");
        return a.a.n(sb3, this.f42591h, ")");
    }

    public /* synthetic */ um(f30 f30Var, String str, String str2, int i13, int i14, String str3, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(f30Var, str, str2, (i17 & 8) != 0 ? 0 : i13, (i17 & 16) != 0 ? 0 : i14, str3, (i17 & 64) != 0 ? 0 : i15, (i17 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? 0 : i16);
    }
}
