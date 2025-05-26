package com.google.android.libraries.ads.mobile.sdk.internal.util;

import android.os.Bundle;
import com.google.gson.reflect.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nm.i0;
import nm.j0;
import nm.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/internal/util/AndroidBundleTypeAdapterFactory;", "Lnm/j0;", "<init>", "()V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AndroidBundleTypeAdapterFactory implements j0 {
    @Override // nm.j0
    public final i0 a(o gson, TypeToken type) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(type, "type");
        if (Bundle.class.isAssignableFrom(type.f33846a)) {
            return new BundleTypeAdapter(gson);
        }
        return null;
    }
}
