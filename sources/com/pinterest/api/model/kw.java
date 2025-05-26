package com.pinterest.api.model;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class kw extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final String f39557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(@NotNull dl1.s model, @NotNull ReferenceQueue<dl1.s> queue) {
        super(model, queue);
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(queue, "queue");
        String b13 = model.b();
        Intrinsics.checkNotNullExpressionValue(b13, "getUid(...)");
        this.f39557a = b13;
    }
}
