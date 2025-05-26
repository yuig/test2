package xc2;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b extends AppWidgetProvider {
    public abstract void a(Context context);

    public final void b(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        kg.t.P();
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
        b(context, intent);
    }
}
