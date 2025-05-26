package com.pinterest.feature.pin.closeup.datasource;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f46931j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f46932k = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46933i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f46933i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f46933i) {
            case 0:
                tt1.a it = (tt1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Object c13 = it.c();
                Intrinsics.checkNotNullExpressionValue(c13, "getData(...)");
                return e0.b(new af1.a((List) c13));
            default:
                return Unit.f80348a;
        }
    }
}
