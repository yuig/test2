package com.pinterest.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.pinterest.widget.GalleryWallWidget;
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
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f52808i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AppWidgetManager f52809j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int[] f52810k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function0 f52811l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AppWidgetManager appWidgetManager, int[] iArr, Function0 function0) {
        super(1);
        this.f52808i = context;
        this.f52809j = appWidgetManager;
        this.f52810k = iArr;
        this.f52811l = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u uVar = (u) obj;
        if (uVar instanceof t) {
            GalleryWallWidget.Companion companion = GalleryWallWidget.f52799g;
            Map map = ((t) uVar).f134581a;
            Context context = this.f52808i;
            companion.updateAppWidgets(map, context, this.f52809j, this.f52810k, new a(context));
        } else if (uVar instanceof r) {
            String str = ((r) uVar).f134578a;
        } else if (Intrinsics.d(uVar, xc2.s.f134580a)) {
            for (int i13 : this.f52810k) {
                int i14 = xc2.c.f134550d;
                y.a0(this.f52808i, GalleryWallWidget.class, this.f52809j, i13);
            }
        }
        Function0 function0 = this.f52811l;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f80348a;
    }
}
