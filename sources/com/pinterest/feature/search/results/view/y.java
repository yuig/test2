package com.pinterest.feature.search.results.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class y extends kotlin.jvm.internal.p implements Function1 {
    public y(Object obj) {
        super(1, obj, SearchGridMultiSectionFragment.class, "addDisposable", "addDisposable(Lio/reactivex/disposables/Disposable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xj2.c p03 = (xj2.c) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        ((SearchGridMultiSectionFragment) this.receiver).R6(p03);
        return Unit.f80348a;
    }
}
