package com.pinterest.navigation.factory;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/navigation/factory/UnregisteredFragmentException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class UnregisteredFragmentException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnregisteredFragmentException(String description) {
        super(description);
        Intrinsics.checkNotNullParameter(description, "description");
    }
}
