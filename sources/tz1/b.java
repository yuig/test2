package tz1;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import c5.e0;
import c5.u;
import java.util.ArrayList;
import java.util.HashSet;
import m60.f0;
import pk.a0;
import pz1.e;
import tb0.g;
import tb0.h;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static e0 f119713a;

    /* renamed from: b, reason: collision with root package name */
    public static NotificationManager f119714b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f119715c = Boolean.FALSE;

    public static void a() {
        HashSet hashSet = h.f117076w;
        g.f117075a.h("Creating Notification Channels");
        Context context = kb0.a.f79058b;
        Application W = f0.W();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NotificationChannelGroup("g99", W.getString(e.notification_channel_name_general)));
        arrayList.add(new NotificationChannelGroup("g01", W.getString(e.notification_channel_grp_name_recommendations)));
        arrayList.add(new NotificationChannelGroup("g02", W.getString(e.notification_channel_grp_name_activity)));
        if (f119714b == null) {
            f119714b = (NotificationManager) f0.W().getSystemService(NotificationManager.class);
        }
        NotificationManager notificationManager = f119714b;
        if (notificationManager != null) {
            notificationManager.createNotificationChannelGroups(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr = {"01", "011", "012", "013", "014", "02", "021", "022", "03", "99"};
        Application W2 = f0.W();
        String[] strArr2 = {W2.getString(e.notification_channel_name_boards), W2.getString(e.notification_channel_name_pin_picks), W2.getString(e.notification_channel_name_popular_pins), W2.getString(e.notification_channel_name_search), W2.getString(e.notification_channel_name_topics), W2.getString(e.notification_channel_name_activity), W2.getString(e.notification_channel_name_messaging), W2.getString(e.notification_channel_name_social), W2.getString(e.notification_channel_name_upload), W2.getString(e.notification_channel_name_general)};
        Application W3 = f0.W();
        String[] strArr3 = {W3.getString(e.notification_channel_description_boards), W3.getString(e.notification_channel_description_pin_picks), W3.getString(e.notification_channel_description_popular_pins), W3.getString(e.notification_channel_description_search), W3.getString(e.notification_channel_description_topics), W3.getString(e.notification_channel_description_activity), W3.getString(e.notification_channel_description_messaging), W3.getString(e.notification_channel_description_social), W3.getString(e.notification_channel_description_upload), W3.getString(e.notification_channel_description_general)};
        int[] iArr = {4, 4, 4, 4, 4, 4, 4, 4, 2, 4};
        String[] strArr4 = {"g01", "g01", "g01", "g01", "g01", "g02", "g02", "g02", "g99", "g99"};
        for (int i13 = 0; i13 < 10; i13++) {
            NotificationChannel notificationChannel = new NotificationChannel(strArr[i13], strArr2[i13], iArr[i13]);
            notificationChannel.setGroup(strArr4[i13]);
            notificationChannel.setDescription(strArr3[i13]);
            arrayList2.add(notificationChannel);
        }
        if (f119714b == null) {
            Context context2 = kb0.a.f79058b;
            f119714b = (NotificationManager) f0.W().getSystemService(NotificationManager.class);
        }
        NotificationManager notificationManager2 = f119714b;
        if (notificationManager2 != null) {
            notificationManager2.createNotificationChannels(arrayList2);
        }
    }

    public static u b(Context context, String str) {
        int color;
        HashSet hashSet = h.f117076w;
        g.f117075a.h("Get Base Notification Builder");
        if (a0.q0(context)) {
            int i13 = eo1.b.color_white_mochimalist_0;
            Object obj = d5.a.f53679a;
            color = context.getColor(i13);
        } else {
            int i14 = eo1.b.color_red_pushpin_450;
            Object obj2 = d5.a.f53679a;
            color = context.getColor(i14);
        }
        u uVar = new u(context, str);
        uVar.e(color);
        uVar.r(pz1.b.ic_stat_pinterest_nonpds);
        return uVar;
    }

    public static e0 c() {
        if (f119713a == null) {
            Context context = kb0.a.f79058b;
            f119713a = new e0(f0.W());
        }
        return f119713a;
    }
}
