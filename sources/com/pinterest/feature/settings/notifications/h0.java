package com.pinterest.feature.settings.notifications;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f48199a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f48200b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f48201c;

    /* renamed from: d, reason: collision with root package name */
    public final String f48202d;

    /* renamed from: e, reason: collision with root package name */
    public final String f48203e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f48204f;

    public h0(String expandableSectionId, Boolean bool, c1 settingsOptionType, String sectionKey, String optionKey, boolean z13) {
        Intrinsics.checkNotNullParameter(expandableSectionId, "expandableSectionId");
        Intrinsics.checkNotNullParameter(settingsOptionType, "settingsOptionType");
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        Intrinsics.checkNotNullParameter(optionKey, "optionKey");
        this.f48199a = expandableSectionId;
        this.f48200b = bool;
        this.f48201c = settingsOptionType;
        this.f48202d = sectionKey;
        this.f48203e = optionKey;
        this.f48204f = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f48199a, h0Var.f48199a) && Intrinsics.d(this.f48200b, h0Var.f48200b) && this.f48201c == h0Var.f48201c && Intrinsics.d(this.f48202d, h0Var.f48202d) && Intrinsics.d(this.f48203e, h0Var.f48203e) && this.f48204f == h0Var.f48204f;
    }

    public final int hashCode() {
        int hashCode = this.f48199a.hashCode() * 31;
        Boolean bool = this.f48200b;
        return Boolean.hashCode(this.f48204f) + cb.d(this.f48203e, cb.d(this.f48202d, (this.f48201c.hashCode() + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UpdateSubscriptionRequest(expandableSectionId=");
        sb3.append(this.f48199a);
        sb3.append(", isGlobalPermissions=");
        sb3.append(this.f48200b);
        sb3.append(", settingsOptionType=");
        sb3.append(this.f48201c);
        sb3.append(", sectionKey=");
        sb3.append(this.f48202d);
        sb3.append(", optionKey=");
        sb3.append(this.f48203e);
        sb3.append(", value=");
        return a.a.r(sb3, this.f48204f, ")");
    }
}
