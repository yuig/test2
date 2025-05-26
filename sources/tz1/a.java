package tz1;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import c5.u;
import kotlin.jvm.internal.Intrinsics;
import lu1.d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d f119711a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f119712b;

    public a(d activityIntentFactory, Context context) {
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f119711a = activityIntentFactory;
        this.f119712b = context;
    }

    public static Notification b(a aVar, String title, String text, long j13, int i13) {
        if ((i13 & 4) != 0) {
            j13 = System.currentTimeMillis();
        }
        Intent intent = new Intent(aVar.f119712b, (Class<?>) aVar.f119711a.a(lu1.a.PINTEREST_ACTIVITY));
        aVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Context context = aVar.f119712b;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        b.a();
        u b13 = b.b(context, "03");
        b13.f25859x.icon = pz1.b.ic_stat_pinterest_nonpds;
        b13.t(text);
        b13.f25859x.when = j13;
        b13.h(title);
        b13.g(text);
        b13.f25842g = activity;
        Notification b14 = b13.b();
        Intrinsics.checkNotNullExpressionValue(b14, "build(...)");
        b14.flags |= 16;
        return b14;
    }

    public final void a(int i13) {
        Object systemService = this.f119712b.getSystemService("notification");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(i13);
    }
}
