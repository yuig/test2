package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i7 extends dl1.t0 implements el1.b {

    /* renamed from: a, reason: collision with root package name */
    public final p6 f38686a;

    /* renamed from: b, reason: collision with root package name */
    public el1.a f38687b;

    public i7(@NotNull p6 store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f38686a = store;
    }

    @Override // dl1.t0, dl1.p
    public final boolean c(dl1.m params, dl1.s model) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        if (params instanceof dl1.b) {
            d(model);
            return false;
        }
        super.c(params, model);
        return false;
    }

    public final boolean d(dl1.s model) {
        p6 p6Var = this.f38686a;
        p6Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        boolean z13 = model instanceof ue;
        gw gwVar = p6Var.f40890a;
        if (z13) {
            new j7(gwVar).a((ue) model);
        } else {
            if (!(model instanceof wy0)) {
                return false;
            }
            new k7(gwVar).a((wy0) model);
        }
        return true;
    }
}
