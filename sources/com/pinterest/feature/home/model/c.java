package com.pinterest.feature.home.model;

import dl1.m;
import dl1.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements z {
    @Override // dl1.z
    public final boolean a(m mVar, dl1.a action) {
        g params = (g) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(action, "action");
        int i13 = b.f45779a[action.ordinal()];
        return i13 != 1 ? i13 != 2 ? params.a() : params.a() : params.a() && !params.f45793f;
    }

    @Override // dl1.z
    public final boolean b(m mVar, dl1.a action) {
        g params = (g) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(action, "action");
        int i13 = b.f45779a[action.ordinal()];
        return i13 != 1 ? i13 != 2 ? params.a() : params.a() : params.a() && params.f45792e && !params.f45793f;
    }
}
