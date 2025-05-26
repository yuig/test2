package com.pinterest.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f52855i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AppWidgetManager f52856j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AppWidgetManager appWidgetManager) {
        super(1);
        this.f52855i = context;
        this.f52856j = appWidgetManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair widgetImageSizes;
        widgetImageSizes = SingleImageWidget.f52804g.getWidgetImageSizes(this.f52855i, this.f52856j, ((Number) obj).intValue());
        return widgetImageSizes;
    }
}
