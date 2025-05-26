package com.modiface.mfemakeupkit.utils;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f34679a = new l0();

    public l0() {
        super(1);
    }

    @NotNull
    public final Double a(double d2) {
        return Double.valueOf((d2 * (-1)) + 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).doubleValue());
    }
}
