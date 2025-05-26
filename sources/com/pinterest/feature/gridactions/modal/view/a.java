package com.pinterest.feature.gridactions.modal.view;

import android.content.Context;
import com.pinterest.feature.gridactions.modal.view.PinOverflowMenuModalImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import me.o;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PinOverflowMenuModalImpl f45718i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PinOverflowMenuModalImpl pinOverflowMenuModalImpl) {
        super(0);
        this.f45718i = pinOverflowMenuModalImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f45718i.getView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return (PinOverflowMenuModalImpl.a) o.a(bs1.c.k0(context), PinOverflowMenuModalImpl.a.class);
    }
}
