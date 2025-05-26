package com.google.firebase.messaging;

import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements zl.a, d7.r, qa2.d0, HttpLoggingInterceptor.Logger, ak2.f, x7.q {
    public /* synthetic */ k(e3.a aVar) {
    }

    @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
    public void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // ak2.f
    public Object apply(Object obj) {
        DynamicFeed dynamicFeed = (DynamicFeed) obj;
        List a13 = dynamicFeed.a();
        String str = dynamicFeed.f35555c;
        String str2 = dynamicFeed.f35556d;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return new qr0.e(a13, str, str2);
    }

    @Override // d7.r
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        ((n7.c) obj).getClass();
    }

    @Override // qa2.d0
    public void onOpenPinCloseup(f30 it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }
}
