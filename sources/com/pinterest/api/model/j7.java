package com.pinterest.api.model;

import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j7 extends l7 {

    /* renamed from: a, reason: collision with root package name */
    public final gw f38992a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(@NotNull gw modelHelper) {
        super(null);
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        this.f38992a = modelHelper;
    }

    public final void a(ue model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f38992a.getClass();
        if (model != null) {
            LruCache lruCache = ew.f37357a;
            if (model.getId() == null) {
                return;
            }
            LruCache lruCache2 = ew.f37369m;
            synchronized (lruCache2) {
                lruCache2.put(model.getId(), model);
            }
        }
    }
}
