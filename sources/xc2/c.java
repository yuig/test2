package xc2;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import h32.a4;
import h32.d4;
import i01.r0;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import pc.q0;

/* loaded from: classes4.dex */
public abstract class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f134550d = 0;

    /* renamed from: a, reason: collision with root package name */
    public lu1.b f134551a;

    /* renamed from: b, reason: collision with root package name */
    public vy.m f134552b;

    /* renamed from: c, reason: collision with root package name */
    public w f134553c;

    public final void c(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context.getPackageName(), getClass().getName()));
        Intrinsics.f(appWidgetIds);
        if (!(appWidgetIds.length == 0)) {
            onUpdate(context, AppWidgetManager.getInstance(context), appWidgetIds);
        }
    }

    @Override // xc2.b, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent e13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        if (!Intrinsics.d("ANDROID_WIDGET_CLICK", intent.getAction())) {
            if (Intrinsics.d("com.pinterest.unauth.ACTION_USER_LOG_IN_SUCCESS", intent.getAction())) {
                c(context);
                return;
            }
            return;
        }
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("WIDGET_CLICK_TYPE") : null;
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != -1153434141) {
                if (hashCode == 680616662) {
                    if (string.equals("WIDGET_ERROR_CLICK")) {
                        vy.m mVar = this.f134552b;
                        if (mVar == null) {
                            Intrinsics.r("analyticsApi");
                            throw null;
                        }
                        mVar.l("ANDROID_WIDGET_CLICK", z0.g(new Pair("WIDGET_CLICK_TYPE", "WIDGET_ERROR_CLICK"), new Pair("WIDGET_DISPLAY_TYPE", getClass().getSimpleName())));
                        c(context);
                        lu1.b bVar = this.f134551a;
                        if (bVar != null) {
                            context.startActivity(((lu1.c) bVar).e(context, false));
                            return;
                        } else {
                            Intrinsics.r("baseActivityHelper");
                            throw null;
                        }
                    }
                    return;
                }
                if (hashCode == 721241764 && string.equals("WIDGET_LOG_IN_CLICK")) {
                    vy.m mVar2 = this.f134552b;
                    if (mVar2 == null) {
                        Intrinsics.r("analyticsApi");
                        throw null;
                    }
                    mVar2.k("ANDROID_WIDGET_CLICK", z0.g(new Pair("WIDGET_CLICK_TYPE", "WIDGET_LOG_IN_CLICK"), new Pair("WIDGET_DISPLAY_TYPE", getClass().getSimpleName())));
                    lu1.b bVar2 = this.f134551a;
                    if (bVar2 == null) {
                        Intrinsics.r("baseActivityHelper");
                        throw null;
                    }
                    Intent i13 = ((lu1.c) bVar2).i(context);
                    i13.setFlags(i13.getFlags() + 268435456);
                    context.startActivity(i13);
                    return;
                }
                return;
            }
            if (string.equals("WIDGET_PIN_CLICK")) {
                w wVar = this.f134553c;
                if (wVar == null) {
                    Intrinsics.r("widgetViewModel");
                    throw null;
                }
                String widgetName = getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(widgetName, "getSimpleName(...)");
                String widgetId = intent.getStringExtra("WIDGET_ID");
                if (widgetId == null) {
                    widgetId = "";
                }
                Intrinsics.checkNotNullParameter("homeFeed", "widgetContentSource");
                Intrinsics.checkNotNullParameter(widgetName, "widgetName");
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                o oVar = (o) wVar.f134586a;
                oVar.getClass();
                Intrinsics.checkNotNullParameter("homeFeed", "widgetContentSource");
                Intrinsics.checkNotNullParameter(widgetName, "widgetName");
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                fk2.g i14 = com.bumptech.glide.d.u0(oVar.f134568a.a(new p50.v(widgetName, new q0(widgetId)))).i();
                Intrinsics.checkNotNullExpressionValue(i14, "ignoreElement(...)");
                i14.i(new r0(24), new lb2.r(16, n.f134566n));
                String stringExtra = intent.getStringExtra("WIDGET_PIN_ID");
                if (stringExtra != null) {
                    lu1.b bVar3 = this.f134551a;
                    if (bVar3 == null) {
                        Intrinsics.r("baseActivityHelper");
                        throw null;
                    }
                    e13 = ((lu1.c) bVar3).j(context);
                    e13.putExtra("com.pinterest.EXTRA_SOURCE", "SOURCE_APP_WIDGET");
                    e13.setFlags(e13.getFlags() + 268435456);
                    int value = d4.ANDROID_WIDGET.getValue();
                    int value2 = a4.PIN_CLOSEUP.getValue();
                    StringBuilder v13 = a.a.v("pinterest://pinterest.com/pin/", stringExtra, "?utm_source=", value, "&utm_medium=");
                    v13.append(value2);
                    e13.setData(Uri.parse(v13.toString()));
                } else {
                    lu1.b bVar4 = this.f134551a;
                    if (bVar4 == null) {
                        Intrinsics.r("baseActivityHelper");
                        throw null;
                    }
                    e13 = ((lu1.c) bVar4).e(context, false);
                }
                context.startActivity(e13);
            }
        }
    }
}
