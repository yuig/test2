package com.pinterest.pushnotification;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f50287a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final h f50288b = new h();

    public static void a(String type, Throwable throwable) {
        Intrinsics.checkNotNullParameter(type, "type");
        tb0.k kVar = new tb0.k();
        kVar.c("Type", type);
        if (throwable != null) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            kVar.a(null, null, throwable);
        }
        tb0.g.f117075a.k("BoardNotificationExceptions", kVar.f117102a);
    }
}
