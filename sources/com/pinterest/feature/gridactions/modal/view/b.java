package com.pinterest.feature.gridactions.modal.view;

import com.pinterest.feature.gridactions.modal.view.PinOverflowMenuModalImpl;
import df.j1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PinOverflowMenuModalImpl f45719i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PinOverflowMenuModalImpl pinOverflowMenuModalImpl) {
        super(0);
        this.f45719i = pinOverflowMenuModalImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        kf0.a pinOverFlowMenuComponent;
        pinOverFlowMenuComponent = this.f45719i.getPinOverFlowMenuComponent();
        return (PinOverflowMenuModalImpl.b) j1.b0(PinOverflowMenuModalImpl.b.class, pinOverFlowMenuComponent);
    }
}
