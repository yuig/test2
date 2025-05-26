package com.pinterest.feature.video.model;

import java.util.LinkedHashSet;
import kb.c0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final kb.g f48997a;

    static {
        c0 c0Var = c0.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c0 networkType = c0.CONNECTED;
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        f48997a = new kb.g(new ub.g(null), networkType, false, false, false, false, -1L, -1L, CollectionsKt.J0(linkedHashSet));
    }
}
