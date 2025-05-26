package com.pinterest.feature.unauth.sba;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f48833a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f48834b;

    public j(Context context, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48833a = url;
        this.f48834b = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f48833a, jVar.f48833a) && Intrinsics.d(this.f48834b, jVar.f48834b);
    }

    public final int hashCode() {
        return this.f48834b.hashCode() + (this.f48833a.hashCode() * 31);
    }

    public final String toString() {
        return "GoToContentClicked(url=" + this.f48833a + ", context=" + this.f48834b + ")";
    }
}
