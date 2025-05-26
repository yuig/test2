package com.pinterest.api.model;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class yj extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f44055i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f44056j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(Function2<? super float[], ? super Float, Unit> function2, float f13) {
        super(1);
        this.f44055i = function2;
        this.f44056j = f13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] resultMatrix = (float[]) obj;
        Intrinsics.checkNotNullParameter(resultMatrix, "resultMatrix");
        this.f44055i.invoke(resultMatrix, Float.valueOf(this.f44056j));
        return Unit.f80348a;
    }
}
