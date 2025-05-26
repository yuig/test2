package com.pinterest.selectPinsLibrary.datasource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lk1.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/selectPinsLibrary/datasource/SelectPinsFilter;", "Llk1/a;", "<init>", "()V", "selectPinsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SelectPinsFilter extends a {
    @Override // lk1.a
    public final boolean a(String str) {
        return !Intrinsics.d(str, "pin");
    }
}
