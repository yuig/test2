package com.pinterest.framework.multisection.datasource.pagedlist;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final List f49201b;

    /* renamed from: c, reason: collision with root package name */
    public final int f49202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(List itemsToInsert, int i13) {
        super(true);
        Intrinsics.checkNotNullParameter(itemsToInsert, "itemsToInsert");
        this.f49201b = itemsToInsert;
        this.f49202c = i13;
    }
}
