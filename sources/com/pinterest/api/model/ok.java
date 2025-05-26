package com.pinterest.api.model;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ok extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f40746i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f40747j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(Function2<? super float[], ? super Float, Unit> function2, float f13) {
        super(1);
        this.f40746i = function2;
        this.f40747j = f13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] resultMatrix = (float[]) obj;
        Intrinsics.checkNotNullParameter(resultMatrix, "resultMatrix");
        this.f40746i.invoke(resultMatrix, Float.valueOf(this.f40747j));
        return Unit.f80348a;
    }
}
