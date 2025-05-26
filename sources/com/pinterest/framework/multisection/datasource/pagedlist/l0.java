package com.pinterest.framework.multisection.datasource.pagedlist;

import com.pinterest.repository.TypedId;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 extends kotlin.jvm.internal.r {

    /* renamed from: f, reason: collision with root package name */
    public final String f49148f;

    /* renamed from: g, reason: collision with root package name */
    public final TypedId[] f49149g;

    public l0(String bookmark, TypedId[] typedIds) {
        Intrinsics.checkNotNullParameter(bookmark, "bookmark");
        Intrinsics.checkNotNullParameter(typedIds, "typedIds");
        this.f49148f = bookmark;
        this.f49149g = typedIds;
    }
}
