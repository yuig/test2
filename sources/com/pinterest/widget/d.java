package com.pinterest.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f52847i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AppWidgetManager f52848j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AppWidgetManager appWidgetManager) {
        super(1);
        this.f52847i = context;
        this.f52848j = appWidgetManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair widgetImageSizes;
        widgetImageSizes = GalleryWallWidget.f52799g.getWidgetImageSizes(this.f52847i, this.f52848j, ((Number) obj).intValue());
        return widgetImageSizes;
    }
}
