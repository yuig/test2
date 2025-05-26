package com.pinterest.api.model;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class up extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final up f42621i = new up();

    public up() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        oq it = (oq) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }
}
