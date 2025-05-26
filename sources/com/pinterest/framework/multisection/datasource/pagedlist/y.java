package com.pinterest.framework.multisection.datasource.pagedlist;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final List f49200b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(List itemsToAppend, boolean z13) {
        super(z13);
        Intrinsics.checkNotNullParameter(itemsToAppend, "itemsToAppend");
        this.f49200b = itemsToAppend;
    }
}
