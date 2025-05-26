package com.pinterest.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import android.widget.RemoteViews;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/pinterest/widget/GalleryWallWidget;", "Lxc2/c;", "<init>", "()V", "Companion", "widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GalleryWallWidget extends Hilt_GalleryWallWidget {

    /* renamed from: g */
    public static final Companion f52799g = new Companion(null);

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J]\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u001a\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010\u0016\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00032\u001a\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010'¨\u0006,"}, d2 = {"Lcom/pinterest/widget/GalleryWallWidget$Companion;", "", "", "", "", "Lxc2/i;", "widgetPinModelMap", "Landroid/content/Context;", "context", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetIds", "Lkotlin/Function2;", "", "Landroid/app/PendingIntent;", "getPendingIntent", "", "updateAppWidgets", "(Ljava/util/Map;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[ILkotlin/jvm/functions/Function2;)V", "widgetPinModels", "appWidgetId", "updateGalleryWallWidget", "(Ljava/util/List;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILkotlin/jvm/functions/Function2;)V", "widgetId", "Lkotlin/Pair;", "getWidgetImageSizes", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;I)Lkotlin/Pair;", "Lxc2/w;", "widgetViewModel", "Lkotlin/Function0;", "onAppWidgetUpdated", "update", "(Lxc2/w;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[ILkotlin/jvm/functions/Function0;)V", "DEFAULT_HEIGHT", "I", "DEFAULT_WIDTH", "", "WIDGET_LARGE_VIEW_HEIGHT", "F", "WIDGET_SMALL_VIEW_HEIGHT", "WIDGET_VIEW_DESIRED_WIDTH", "<init>", "()V", "widget_release"}, k = 1, mv = {1, 9, 0})
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
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            Integer valueOf2 = Integer.valueOf(j1.Q(context, ((valueOf != null ? valueOf.intValue() : 320) - 32) / 3));
            Integer valueOf3 = Integer.valueOf(intValue2);
            return new Pair<>(valueOf2, Integer.valueOf(j1.Q(context, (((valueOf3.intValue() > 0 ? valueOf3 : null) != null ? r1.intValue() : RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL) - 20) / 2)));
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
                if (list != null) {
                    GalleryWallWidget.f52799g.updateGalleryWallWidget(list, context, appWidgetManager, i13, getPendingIntent);
                }
            }
        }

        private final void updateGalleryWallWidget(List<i> widgetPinModels, Context context, AppWidgetManager appWidgetManager, int appWidgetId, Function2<? super String, ? super Integer, PendingIntent> getPendingIntent) {
            RemoteViews remoteViews;
            if (widgetPinModels.size() >= 3) {
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), xc2.f.gallery_wall_widget_small);
                remoteViews2.setImageViewBitmap(xc2.e.gallery_wall_pin_1, widgetPinModels.get(0).f134555b);
                remoteViews2.setOnClickPendingIntent(xc2.e.gallery_wall_pin_1, (PendingIntent) getPendingIntent.invoke(widgetPinModels.get(0).f134554a, Integer.valueOf(appWidgetId)));
                remoteViews2.setImageViewBitmap(xc2.e.gallery_wall_pin_2, widgetPinModels.get(1).f134555b);
                remoteViews2.setOnClickPendingIntent(xc2.e.gallery_wall_pin_2, (PendingIntent) getPendingIntent.invoke(widgetPinModels.get(1).f134554a, Integer.valueOf(appWidgetId)));
                remoteViews2.setImageViewBitmap(xc2.e.gallery_wall_pin_3, widgetPinModels.get(2).f134555b);
                remoteViews2.setOnClickPendingIntent(xc2.e.gallery_wall_pin_3, (PendingIntent) getPendingIntent.invoke(widgetPinModels.get(2).f134554a, Integer.valueOf(appWidgetId)));
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 31) {
                    remoteViews2.setBoolean(xc2.e.gallery_wall_pin_1, "setClipToOutline", true);
                    remoteViews2.setBoolean(xc2.e.gallery_wall_pin_2, "setClipToOutline", true);
                    remoteViews2.setBoolean(xc2.e.gallery_wall_pin_3, "setClipToOutline", true);
                }
                if (widgetPinModels.size() >= 6) {
                    remoteViews = new RemoteViews(context.getPackageName(), xc2.f.gallery_wall_widget_large);
                    remoteViews.setImageViewBitmap(xc2.e.gallery_wall_pin_1, widgetPinModels.get(0).f134555b);
                    remoteViews.setOnClickPendingIntent(xc2.e.gallery_wall_pin_1, (PendingIntent) getPendingIntent.invoke(widgetPinModels.get(0).f134554a, Integer.valueOf(appWidgetId)));
                    remoteViews.setImageViewBitmap(xc2.e.gallery_wall_pin_2, widgetPinModels.get(1).f134555b);
                    remoteViews.setOnClickPendingIntent(xc2.e.gallery_wall_pin_2, (PendingIntent) getPendingIntent.invoke(widgetPinModels.get(1).f134554a, Integer.valueOf(appWidgetId)));
                    remoteViews.setImageViewBitmap(xc2.e.gallery_wall_pin_3, widgetPinModels.get(2).f134555b);
                    remoteViews.setOnClickPendingIntent(xc2.e.gallery_wall_pin_3, (PendingIntent) getPendingIntent.invoke(widgetPinModels.get(2).f134554a, Integer.valueOf(appWidgetId)));
                    remoteViews.setImageViewBitmap(xc2.e.gallery_wall_pin_4, widgetPinModels.get(3).f134555b);
                    remoteViews.setOnClickPendingIntent(xc2.e.gallery_wall_pin_4, (PendingIntent) getPendingIntent.invoke(widgetPinModels.get(3).f134554a, Integer.valueOf(appWidgetId)));
                    remoteViews.setImageViewBitmap(xc2.e.gallery_wall_pin_5, widgetPinModels.get(4).f134555b);
                    remoteViews.setOnClickPendingIntent(xc2.e.gallery_wall_pin_5, (PendingIntent) getPendingIntent.invoke(widgetPinModels.get(4).f134554a, Integer.valueOf(appWidgetId)));
                    remoteViews.setImageViewBitmap(xc2.e.gallery_wall_pin_6, widgetPinModels.get(5).f134555b);
                    remoteViews.setOnClickPendingIntent(xc2.e.gallery_wall_pin_6, (PendingIntent) getPendingIntent.invoke(widgetPinModels.get(5).f134554a, Integer.valueOf(appWidgetId)));
                    if (i13 >= 31) {
                        remoteViews.setBoolean(xc2.e.gallery_wall_pin_1, "setClipToOutline", true);
                        remoteViews.setBoolean(xc2.e.gallery_wall_pin_2, "setClipToOutline", true);
                        remoteViews.setBoolean(xc2.e.gallery_wall_pin_3, "setClipToOutline", true);
                        remoteViews.setBoolean(xc2.e.gallery_wall_pin_4, "setClipToOutline", true);
                        remoteViews.setBoolean(xc2.e.gallery_wall_pin_5, "setClipToOutline", true);
                        remoteViews.setBoolean(xc2.e.gallery_wall_pin_6, "setClipToOutline", true);
                    }
                } else {
                    remoteViews = null;
                }
                LinkedHashMap h10 = z0.h(new Pair(new SizeF(349.0f, 102.0f), remoteViews2));
                if (remoteViews != null) {
                    h10.put(new SizeF(349.0f, 240.0f), remoteViews);
                }
                if (i13 >= 31) {
                    remoteViews2 = w2.b.i(h10);
                }
                appWidgetManager.updateAppWidget(appWidgetId, remoteViews2);
            }
        }

        public final void update(@NotNull w widgetViewModel, @NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] appWidgetIds, Function0<Unit> onAppWidgetUpdated) {
            Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
            Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
            d dVar = new d(context, appWidgetManager);
            int[] appWidgetIds2 = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context.getPackageName(), Companion.class.getDeclaringClass().getName()));
            p pVar = p.GALLERY_WALL;
            Intrinsics.f(appWidgetIds2);
            widgetViewModel.b(pVar, appWidgetIds2, appWidgetIds);
            widgetViewModel.c(appWidgetIds, dVar, 6, appWidgetIds2.length, "GalleryWallWidget").A(wj2.c.a()).F(new r(12, new b(context, appWidgetManager, appWidgetIds, onAppWidgetUpdated)), new r(13, c.f52812i), ck2.i.f27923c, ck2.i.f27924d);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        w wVar = this.f134553c;
        if (wVar != null) {
            Companion.update$default(f52799g, wVar, context, appWidgetManager, appWidgetIds, null, 16, null);
        } else {
            Intrinsics.r("widgetViewModel");
            throw null;
        }
    }
}
