package com.appsflyer.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1jSDK<T> {

    @NotNull
    public final Function0<T> getRevenue;

    /* JADX WARN: Multi-variable type inference failed */
    public AFd1jSDK(@NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.getRevenue = function0;
    }
}
