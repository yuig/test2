package com.pinterest.hairball.network;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uj2.b0;

/* loaded from: classes5.dex */
public abstract class d implements c {

    @NotNull
    private final Object[] params;
    final /* synthetic */ e this$0;

    public d(e eVar, Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.this$0 = eVar;
        this.params = params;
    }

    @Override // com.pinterest.hairball.network.b
    public xj2.c execute(ak2.e onSuccess, ak2.e onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        xj2.c o13 = ((b0) buildRequest()).r(tk2.e.f118017c).l(wj2.c.a()).o(onSuccess, onError);
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        return o13;
    }

    @NotNull
    public Object[] getParams() {
        return this.params;
    }
}
