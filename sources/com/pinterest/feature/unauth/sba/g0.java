package com.pinterest.feature.unauth.sba;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f48818a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f48819b;

    public g0(Context context, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48818a = url;
        this.f48819b = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f48818a, g0Var.f48818a) && Intrinsics.d(this.f48819b, g0Var.f48819b);
    }

    public final int hashCode() {
        return this.f48819b.hashCode() + (this.f48818a.hashCode() * 31);
    }

    public final String toString() {
        return "GoToMwebContent(url=" + this.f48818a + ", context=" + this.f48819b + ")";
    }
}
