package com.pinterest.hairball.network;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class e {
    public abstract d getBuilder(Object... objArr);

    public /* bridge */ a prepare(Object[] objArr) {
        return prepare(objArr);
    }

    public d prepare(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return getBuilder(Arrays.copyOf(params, params.length));
    }
}
