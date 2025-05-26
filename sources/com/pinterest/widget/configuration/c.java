package com.pinterest.widget.configuration;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Intent;
import ao2.j0;
import com.pinterest.widget.GalleryWallWidget;
import com.pinterest.widget.SingleImageWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import xc2.w;

/* loaded from: classes4.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ gx.e f52831r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f52832s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gx.e eVar, m mVar, bl2.c cVar) {
        super(2, cVar);
        this.f52831r = eVar;
        this.f52832s = mVar;
    }

    public static final void r(Activity activity, m mVar) {
        activity.setResult(-1, new Intent().putExtra("appWidgetId", mVar.f52842a).putExtra("appWidgetIds", new int[]{mVar.f52842a}));
        activity.finishAndRemoveTask();
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f52831r, this.f52832s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        gx.e eVar = this.f52831r;
        Activity activity = ((n82.b) eVar.f66246b).f89936a;
        if (activity != null) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(activity);
            m mVar = this.f52832s;
            AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(mVar.f52842a);
            if (appWidgetInfo != null) {
                boolean d2 = Intrinsics.d(appWidgetInfo.provider.getClassName(), k0.f80436a.b(SingleImageWidget.class).e());
                int i13 = mVar.f52842a;
                if (d2) {
                    SingleImageWidget.f52804g.update((w) eVar.f66247c, activity, appWidgetManager, new int[]{i13}, new b(activity, mVar, 0));
                } else {
                    GalleryWallWidget.f52799g.update((w) eVar.f66247c, activity, appWidgetManager, new int[]{i13}, new b(activity, mVar, 1));
                }
            }
        }
        return Unit.f80348a;
    }
}
