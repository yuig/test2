package com.pinterest.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb2.r;
import org.jetbrains.annotations.NotNull;
import xc2.i;
import xc2.p;
import xc2.w;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/pinterest/widget/SingleImageWidget;", "Lxc2/c;", "<init>", "()V", "Companion", "widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SingleImageWidget extends Hilt_SingleImageWidget {

    /* renamed from: g */
    public static final Companion f52804g = new Companion(null);

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J]\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u001a\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JK\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00032\u001a\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006'"}, d2 = {"Lcom/pinterest/widget/SingleImageWidget$Companion;", "", "", "", "", "Lxc2/i;", "widgetPinModelMap", "Landroid/content/Context;", "context", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetIds", "Lkotlin/Function2;", "", "Landroid/app/PendingIntent;", "getPendingIntent", "", "updateAppWidgets", "(Ljava/util/Map;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[ILkotlin/jvm/functions/Function2;)V", "widgetPinModel", "appWidgetId", "updateSingleImageWidget", "(Lxc2/i;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILkotlin/jvm/functions/Function2;)V", "widgetId", "Lkotlin/Pair;", "getWidgetImageSizes", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;I)Lkotlin/Pair;", "Lxc2/w;", "widgetViewModel", "Lkotlin/Function0;", "onAppWidgetUpdated", "update", "(Lxc2/w;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[ILkotlin/jvm/functions/Function0;)V", "DEFAULT_HEIGHT", "I", "DEFAULT_WIDTH", "<init>", "()V", "widget_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Pair<Integer, Integer> getWidgetImageSizes(Context context, AppWidgetManager appWidgetManager, int widgetId) {
            int intValue = ((Number) 0).intValue();
            int intValue2 = ((Number) 0).intValue();
            Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(widgetId);
            if (appWidgetOptions != null) {
                intValue = appWidgetOptions.getInt("appWidgetMinWidth");
                intValue2 = appWidgetOptions.getInt("appWidgetMaxHeight");
            }
            Integer valueOf = Integer.valueOf(intValue);
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            int i13 = RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL;
            Integer valueOf2 = Integer.valueOf(j1.Q(context, valueOf != null ? valueOf.intValue() : 110));
            Integer valueOf3 = Integer.valueOf(intValue2);
            Integer num = valueOf3.intValue() != 0 ? valueOf3 : null;
            if (num != null) {
                i13 = num.intValue();
            }
            return new Pair<>(valueOf2, Integer.valueOf(j1.Q(context, i13)));
        }

        public static /* synthetic */ void update$default(Companion companion, w wVar, Context context, AppWidgetManager appWidgetManager, int[] iArr, Function0 function0, int i13, Object obj) {
            if ((i13 & 16) != 0) {
                function0 = null;
            }
            companion.update(wVar, context, appWidgetManager, iArr, function0);
        }

        public static final void update$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void update$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public final void updateAppWidgets(Map<Integer, ? extends List<i>> widgetPinModelMap, Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds, Function2<? super String, ? super Integer, PendingIntent> getPendingIntent) {
            for (int i13 : appWidgetIds) {
                List<i> list = widgetPinModelMap.get(Integer.valueOf(i13));
                if (list != null && (!list.isEmpty())) {
                    SingleImageWidget.f52804g.updateSingleImageWidget(list.get(0), context, appWidgetManager, i13, getPendingIntent);
                }
            }
        }

        private final void updateSingleImageWidget(i widgetPinModel, Context context, AppWidgetManager appWidgetManager, int appWidgetId, Function2<? super String, ? super Integer, PendingIntent> getPendingIntent) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), xc2.f.single_image_widget);
            remoteViews.setImageViewBitmap(xc2.e.widget_image, widgetPinModel.f134555b);
            if (Build.VERSION.SDK_INT >= 31) {
                remoteViews.setBoolean(xc2.e.widget_image, "setClipToOutline", true);
            }
            remoteViews.setOnClickPendingIntent(xc2.e.widget_image, (PendingIntent) getPendingIntent.invoke(widgetPinModel.f134554a, Integer.valueOf(appWidgetId)));
            appWidgetManager.updateAppWidget(appWidgetId, remoteViews);
        }

        public final void update(@NotNull w widgetViewModel, @NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] appWidgetIds, Function0<Unit> onAppWidgetUpdated) {
            Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
            Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
            h hVar = new h(context, appWidgetManager);
            int[] appWidgetIds2 = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context.getPackageName(), Companion.class.getDeclaringClass().getName()));
            p pVar = p.SINGLE_IMAGE;
            Intrinsics.f(appWidgetIds2);
            widgetViewModel.b(pVar, appWidgetIds2, appWidgetIds);
            widgetViewModel.c(appWidgetIds, hVar, 1, appWidgetIds2.length, "SingleImageWidget").A(wj2.c.a()).F(new r(14, new f(context, appWidgetManager, appWidgetIds, onAppWidgetUpdated)), new r(15, g.f52854i), ck2.i.f27923c, ck2.i.f27924d);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        w wVar = this.f134553c;
        if (wVar != null) {
            Companion.update$default(f52804g, wVar, context, appWidgetManager, appWidgetIds, null, 16, null);
        } else {
            Intrinsics.r("widgetViewModel");
            throw null;
        }
    }
}
