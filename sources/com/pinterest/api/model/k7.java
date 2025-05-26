package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k7 extends l7 {

    /* renamed from: a, reason: collision with root package name */
    public final gw f39326a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(@NotNull gw modelHelper) {
        super(null);
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        this.f39326a = modelHelper;
    }

    public final void a(wy0 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        gw gwVar = this.f39326a;
        if (model == null) {
            gwVar.getClass();
            return;
        }
        if (gwVar.f38164c == null) {
            gwVar.f38164c = new lz0();
        }
        if (gwVar.f38164c.b(model)) {
            ew.n(model);
        }
    }
}
