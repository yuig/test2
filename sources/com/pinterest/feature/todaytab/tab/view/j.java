package com.pinterest.feature.todaytab.tab.view;

import android.content.Context;
import com.pinterest.feature.core.view.EmptyView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48733i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f48734j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i13) {
        super(0);
        this.f48733i = i13;
        this.f48734j = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f48733i;
        k kVar = this.f48734j;
        switch (i13) {
            case 0:
                kVar.D5();
                return Unit.f80348a;
            case 1:
                Context requireContext = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new h(requireContext, new j(kVar, 0));
            case 2:
                Context requireContext2 = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new m(requireContext2);
            default:
                return new EmptyView(kVar.requireContext());
        }
    }
}
