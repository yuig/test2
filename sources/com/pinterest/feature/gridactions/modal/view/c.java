package com.pinterest.feature.gridactions.modal.view;

import android.view.View;
import com.pinterest.feature.gridactions.modal.view.PinOverflowMenuModalImpl;
import h32.a4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lb0.i;
import so.c9;
import so.s8;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PinOverflowMenuModalImpl f45720i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PinOverflowMenuModalImpl pinOverflowMenuModalImpl) {
        super(0);
        this.f45720i = pinOverflowMenuModalImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PinOverflowMenuModalImpl.a customComponentDependencies;
        boolean z13;
        jo1.a aVar;
        String str;
        a4 a4Var;
        View view;
        PinOverflowMenuModalImpl pinOverflowMenuModalImpl = this.f45720i;
        customComponentDependencies = pinOverflowMenuModalImpl.getCustomComponentDependencies();
        s8 s8Var = (s8) customComponentDependencies;
        s8 s8Var2 = s8Var.f114284f;
        z13 = pinOverflowMenuModalImpl.isHomefeedTab;
        Boolean valueOf = Boolean.valueOf(z13);
        aVar = pinOverflowMenuModalImpl.baseFragmentType;
        aVar.getClass();
        str = pinOverflowMenuModalImpl.uniqueScreenKey;
        i iVar = new i(str);
        a4Var = pinOverflowMenuModalImpl.viewParameterType;
        i iVar2 = new i(a4Var);
        view = pinOverflowMenuModalImpl.originView;
        return new c9(s8Var.f114255d, s8Var.f114269e, s8Var2, valueOf, aVar, iVar2, iVar, view);
    }
}
