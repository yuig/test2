package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class aq implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final String f35827a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35828b;

    static {
        new zp(null);
    }

    public aq(@NotNull String title, boolean z13) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f35827a = title;
        this.f35828b = z13;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getPath() {
        return this.f35827a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return Intrinsics.d(this.f35827a, aqVar.f35827a) && this.f35828b == aqVar.f35828b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35828b) + (this.f35827a.hashCode() * 31);
    }

    public final String toString() {
        return "IdeaPinMusicBrowseTitleModel(title=" + this.f35827a + ", isFirstTitle=" + this.f35828b + ")";
    }
}
