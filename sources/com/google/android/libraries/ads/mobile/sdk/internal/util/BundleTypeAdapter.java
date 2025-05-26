package com.google.android.libraries.ads.mobile.sdk.internal.util;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nm.i0;
import nm.o;
import um.a;
import um.c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/internal/util/BundleTypeAdapter;", "Lnm/i0;", "Landroid/os/Bundle;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BundleTypeAdapter extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f32091a;

    public BundleTypeAdapter(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f32091a = gson;
    }

    @Override // nm.i0
    public final Object c(a aVar) {
        return new Bundle();
    }

    @Override // nm.i0
    public final void e(c cVar, Object obj) {
        Bundle bundle = (Bundle) obj;
        if (cVar == null) {
            return;
        }
        if (bundle == null) {
            cVar.m();
            return;
        }
        cVar.d();
        for (String str : bundle.keySet()) {
            cVar.h(str);
            Object obj2 = bundle.get(str);
            if (obj2 == null) {
                cVar.m();
            } else {
                this.f32091a.m(obj2, obj2.getClass(), cVar);
            }
        }
        cVar.g();
    }
}
