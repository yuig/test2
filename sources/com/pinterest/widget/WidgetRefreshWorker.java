package com.pinterest.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import com.pinterest.widget.GalleryWallWidget;
import com.pinterest.widget.SingleImageWidget;
import kb.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uj2.b0;
import xc2.k;
import xc2.p;
import xc2.w;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/widget/WidgetRefreshWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lxc2/w;", "widgetViewModel", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxc2/w;)V", "widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WidgetRefreshWorker extends RxWorker {

    /* renamed from: f, reason: collision with root package name */
    public final Context f52805f;

    /* renamed from: g, reason: collision with root package name */
    public final w f52806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetRefreshWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull w widgetViewModel) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        this.f52805f = context;
        this.f52806g = widgetViewModel;
    }

    @Override // androidx.work.RxWorker
    public final b0 i() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f52805f);
        WorkerParameters workerParameters = this.f78963b;
        int d2 = workerParameters.f19998b.d("widget_id", -1);
        String h10 = workerParameters.f19998b.h("widget_type");
        p valueOf = h10 != null ? p.valueOf(h10) : null;
        int i13 = valueOf != null ? k.f134558a[valueOf.ordinal()] : -1;
        if (i13 == 1) {
            SingleImageWidget.Companion companion = SingleImageWidget.f52804g;
            Intrinsics.f(appWidgetManager);
            SingleImageWidget.Companion.update$default(companion, this.f52806g, this.f52805f, appWidgetManager, new int[]{d2}, null, 16, null);
        } else {
            if (i13 != 2) {
                kk2.b j13 = b0.j(new kb.w());
                Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
                return j13;
            }
            GalleryWallWidget.Companion companion2 = GalleryWallWidget.f52799g;
            Intrinsics.f(appWidgetManager);
            GalleryWallWidget.Companion.update$default(companion2, this.f52806g, this.f52805f, appWidgetManager, new int[]{d2}, null, 16, null);
        }
        kk2.b j14 = b0.j(z.a());
        Intrinsics.checkNotNullExpressionValue(j14, "just(...)");
        return j14;
    }
}
