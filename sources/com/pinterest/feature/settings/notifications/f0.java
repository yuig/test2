package com.pinterest.feature.settings.notifications;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f48186a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48187b;

    /* renamed from: c, reason: collision with root package name */
    public final String f48188c;

    public f0(String id3, String categoryKey, String subCategoryLabel) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(subCategoryLabel, "subCategoryLabel");
        this.f48186a = id3;
        this.f48187b = categoryKey;
        this.f48188c = subCategoryLabel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f48186a, f0Var.f48186a) && Intrinsics.d(this.f48187b, f0Var.f48187b) && Intrinsics.d(this.f48188c, f0Var.f48188c);
    }

    public final int hashCode() {
        return this.f48188c.hashCode() + cb.d(this.f48187b, this.f48186a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OptionsLoadRequest(id=");
        sb3.append(this.f48186a);
        sb3.append(", categoryKey=");
        sb3.append(this.f48187b);
        sb3.append(", subCategoryLabel=");
        return a.a.p(sb3, this.f48188c, ")");
    }
}
