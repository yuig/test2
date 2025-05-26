package com.pinterest.hairball.network;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class g extends e {
    public abstract f a(Object... objArr);

    public final f b(Object obj) {
        return a(obj);
    }

    @Override // com.pinterest.hairball.network.e
    public final d getBuilder(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return a(Arrays.copyOf(params, params.length));
    }
}
