package dd2;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import h32.f1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f54451b;

    public /* synthetic */ e(g gVar, int i13) {
        this.f54450a = i13;
        this.f54451b = gVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f54450a;
        g this$0 = this.f54451b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    this$0.f54470k.B(1, true);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    this$0.c();
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    this$0.getClass();
                    this$0.f54461b.g(f1.WIDGET_UPSELL_TRY_IT_CLICK, null, this$0.d(), false);
                    ComponentName componentName = new ComponentName(this$0.getContext(), "com.pinterest.widget.SingleImageWidget");
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this$0.getContext());
                    if (appWidgetManager.isRequestPinAppWidgetSupported()) {
                        appWidgetManager.requestPinAppWidget(componentName, null, null);
                    }
                    this$0.a(true);
                    break;
                }
                break;
        }
    }
}
