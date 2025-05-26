package com.pinterest.widget;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import n60.o;
import org.chromium.net.y;

/* loaded from: classes4.dex */
public final class e extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f52849i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(2);
        this.f52849i = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        int intValue = ((Number) obj2).intValue();
        int i13 = xc2.c.f134550d;
        Bundle a13 = o.a("WIDGET_CLICK_TYPE", "WIDGET_PIN_CLICK");
        if (str != null) {
            a13.putString("WIDGET_PIN_ID", str);
        }
        a13.putString("WIDGET_ID", String.valueOf(intValue));
        Unit unit = Unit.f80348a;
        return y.S(this.f52849i, SingleImageWidget.class, a13, str);
    }
}
