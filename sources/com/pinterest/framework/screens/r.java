package com.pinterest.framework.screens;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.p implements Function2 {
    public r(s sVar) {
        super(2, sVar, s.class, "equalsScreenClass", "equalsScreenClass(Lcom/pinterest/framework/screens/ScreenDescription;Lcom/pinterest/framework/screens/ScreenDescription;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z13;
        Class screenClass;
        ScreenDescription screenDescription = (ScreenDescription) obj;
        ScreenDescription screenDescription2 = (ScreenDescription) obj2;
        ((s) this.receiver).getClass();
        if (screenDescription == null || (screenClass = screenDescription.getScreenClass()) == null) {
            z13 = false;
        } else {
            z13 = Intrinsics.d(screenClass, screenDescription2 != null ? screenDescription2.getScreenClass() : null);
        }
        return Boolean.valueOf(z13);
    }
}
