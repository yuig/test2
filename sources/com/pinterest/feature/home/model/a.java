package com.pinterest.feature.home.model;

import com.pinterest.api.model.DynamicFeed;
import dl1.m;
import dl1.p;
import dl1.s;
import java.util.List;
import jk2.h0;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;
import uj2.q;

/* loaded from: classes.dex */
public final class a implements p {
    @Override // dl1.y
    public final q b(m mVar) {
        g params = (g) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        h0 h0Var = h0.f76488a;
        Intrinsics.checkNotNullExpressionValue(h0Var, "empty(...)");
        return h0Var;
    }

    @Override // dl1.p
    public final boolean c(m mVar, s sVar) {
        g params = (g) mVar;
        DynamicFeed model = (DynamicFeed) sVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        return params.a();
    }

    @Override // dl1.p
    public final s e(m mVar) {
        g params = (g) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        return null;
    }

    @Override // dl1.p
    public final boolean f(List params, List models) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(models, "models");
        return false;
    }

    @Override // dl1.p
    public final boolean g(m mVar) {
        g params = (g) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        return true;
    }

    @Override // dl1.p
    public final b0 i(List paramsList) {
        Intrinsics.checkNotNullParameter(paramsList, "paramsList");
        throw new UnsupportedOperationException();
    }
}
