package com.pinterest.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.pinterest.widget.SingleImageWidget;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.chromium.net.y;
import xc2.r;
import xc2.t;
import xc2.u;

/* loaded from: classes4.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f52850i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AppWidgetManager f52851j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int[] f52852k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function0 f52853l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AppWidgetManager appWidgetManager, int[] iArr, Function0 function0) {
        super(1);
        this.f52850i = context;
        this.f52851j = appWidgetManager;
        this.f52852k = iArr;
        this.f52853l = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u uVar = (u) obj;
        if (uVar instanceof t) {
            SingleImageWidget.Companion companion = SingleImageWidget.f52804g;
            Map map = ((t) uVar).f134581a;
            Context context = this.f52850i;
            companion.updateAppWidgets(map, context, this.f52851j, this.f52852k, new e(context));
        } else if (uVar instanceof r) {
            String str = ((r) uVar).f134578a;
        } else if (Intrinsics.d(uVar, xc2.s.f134580a)) {
            for (int i13 : this.f52852k) {
                int i14 = xc2.c.f134550d;
                y.a0(this.f52850i, SingleImageWidget.class, this.f52851j, i13);
            }
        }
        Function0 function0 = this.f52853l;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f80348a;
    }
}
