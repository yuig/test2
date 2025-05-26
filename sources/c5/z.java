package c5;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import v.e1;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25862a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f25863b;

    /* renamed from: c, reason: collision with root package name */
    public final u f25864c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f25865d;

    public z(u uVar) {
        ArrayList arrayList;
        new ArrayList();
        this.f25865d = new Bundle();
        this.f25864c = uVar;
        Context context = uVar.f25836a;
        this.f25862a = context;
        Notification.Builder builder = new Notification.Builder(context, uVar.f25856u);
        this.f25863b = builder;
        Notification notification = uVar.f25859x;
        int i13 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(uVar.f25840e).setContentText(uVar.f25841f).setContentInfo(null).setContentIntent(uVar.f25842g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0).setNumber(uVar.f25844i).setProgress(0, 0, false);
        IconCompat iconCompat = uVar.f25843h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(uVar.f25845j);
        Iterator it = uVar.f25837b.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            int i14 = Build.VERSION.SDK_INT;
            IconCompat a13 = oVar.a();
            Notification.Action.Builder builder2 = new Notification.Action.Builder(a13 != null ? a13.f(null) : null, oVar.f25829f, oVar.f25830g);
            Bundle bundle = oVar.f25824a;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            boolean z13 = oVar.f25826c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z13);
            builder2.setAllowGeneratedReplies(z13);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i14 >= 28) {
                y.n(builder2);
            }
            if (i14 >= 29) {
                v0.a.i(builder2);
            }
            if (i14 >= 31) {
                e1.d(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", oVar.f25827d);
            builder2.addExtras(bundle2);
            this.f25863b.addAction(builder2.build());
        }
        Bundle bundle3 = uVar.f25851p;
        if (bundle3 != null) {
            this.f25865d.putAll(bundle3);
        }
        int i15 = Build.VERSION.SDK_INT;
        this.f25863b.setShowWhen(uVar.f25846k);
        this.f25863b.setLocalOnly(uVar.f25850o);
        this.f25863b.setGroup(uVar.f25848m);
        this.f25863b.setSortKey(null);
        this.f25863b.setGroupSummary(uVar.f25849n);
        this.f25863b.setCategory(null);
        this.f25863b.setColor(uVar.f25852q);
        this.f25863b.setVisibility(uVar.f25853r);
        this.f25863b.setPublicVersion(null);
        this.f25863b.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = uVar.f25838c;
        ArrayList arrayList3 = uVar.f25860y;
        if (i15 < 28) {
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it2.next());
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    g1.h hVar = new g1.h(arrayList3.size() + arrayList.size());
                    hVar.addAll(arrayList);
                    hVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(hVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                this.f25863b.addPerson((String) it3.next());
            }
        }
        ArrayList arrayList4 = uVar.f25839d;
        if (arrayList4.size() > 0) {
            if (uVar.f25851p == null) {
                uVar.f25851p = new Bundle();
            }
            Bundle bundle4 = uVar.f25851p.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i16 = 0;
            while (i16 < arrayList4.size()) {
                String num = Integer.toString(i16);
                o oVar2 = (o) arrayList4.get(i16);
                Bundle bundle7 = new Bundle();
                IconCompat a14 = oVar2.a();
                bundle7.putInt("icon", a14 != null ? a14.b() : i13);
                bundle7.putCharSequence("title", oVar2.f25829f);
                bundle7.putParcelable("actionIntent", oVar2.f25830g);
                Bundle bundle8 = oVar2.f25824a;
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", oVar2.f25826c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", oVar2.f25827d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
                i16++;
                i13 = 0;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (uVar.f25851p == null) {
                uVar.f25851p = new Bundle();
            }
            uVar.f25851p.putBundle("android.car.EXTENSIONS", bundle4);
            this.f25865d.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i17 = Build.VERSION.SDK_INT;
        this.f25863b.setExtras(uVar.f25851p);
        this.f25863b.setRemoteInputHistory(null);
        RemoteViews remoteViews = uVar.f25854s;
        if (remoteViews != null) {
            this.f25863b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = uVar.f25855t;
        if (remoteViews2 != null) {
            this.f25863b.setCustomBigContentView(remoteViews2);
        }
        this.f25863b.setBadgeIconType(0);
        this.f25863b.setSettingsText(null);
        this.f25863b.setShortcutId(null);
        this.f25863b.setTimeoutAfter(0L);
        this.f25863b.setGroupAlertBehavior(uVar.f25857v);
        if (!TextUtils.isEmpty(uVar.f25856u)) {
            this.f25863b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i17 >= 28) {
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it4.next());
                throw null;
            }
        }
        if (i17 >= 29) {
            v0.a.g(this.f25863b, uVar.f25858w);
            v0.a.h(this.f25863b);
        }
    }
}
