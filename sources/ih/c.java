package ih;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import c5.u;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f72256c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final c f72257d = new c();

    public static AlertDialog i(Context context, int i13, jh.s sVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i13 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(jh.p.c(context, i13));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b13 = jh.p.b(context, i13);
        if (b13 != null) {
            if (sVar == null) {
                sVar = null;
            }
            builder.setPositiveButton(b13, sVar);
        }
        String f13 = jh.p.f(context, i13);
        if (f13 != null) {
            builder.setTitle(f13);
        }
        Log.w("GoogleApiAvailability", a.a.d("Creating dialog for Google Play services availability issue. ConnectionResult=", i13), new IllegalArgumentException());
        return builder.create();
    }

    public static void j(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                i.T6(alertDialog, onCancelListener).S6(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(alertDialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @Override // ih.d
    public final Intent a(int i13, Context context, String str) {
        return super.a(i13, context, str);
    }

    @Override // ih.d
    public final int b(Context context) {
        return super.c(context, d.f72258a);
    }

    @Override // ih.d
    public final int c(Context context, int i13) {
        return super.c(context, i13);
    }

    public final AlertDialog e(Activity activity, int i13) {
        return f(activity, i13, 9001, null);
    }

    public final AlertDialog f(Activity activity, int i13, int i14, DialogInterface.OnCancelListener onCancelListener) {
        return i(activity, i13, jh.s.b(activity, super.a(i13, activity, "d"), i14), onCancelListener);
    }

    public final String g(int i13) {
        AtomicBoolean atomicBoolean = f.f72261a;
        return ConnectionResult.x1(i13);
    }

    public final boolean h(int i13) {
        AtomicBoolean atomicBoolean = f.f72261a;
        return i13 == 1 || i13 == 2 || i13 == 3 || i13 == 9;
    }

    public final void k(Context context, int i13, PendingIntent pendingIntent) {
        int i14;
        Log.w("GoogleApiAvailability", a.a.e("GMS core API Availability. ConnectionResult=", i13, ", tag=null"), new IllegalArgumentException());
        if (i13 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i13 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e13 = jh.p.e(context, i13);
        String d2 = jh.p.d(context, i13);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        com.bumptech.glide.d.t(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        u uVar = new u(context, null);
        uVar.f25850o = true;
        uVar.d(true);
        uVar.h(e13);
        c5.s sVar = new c5.s(0);
        sVar.d(d2);
        uVar.s(sVar);
        if (b7.c.D(context)) {
            uVar.f25859x.icon = context.getApplicationInfo().icon;
            uVar.f25845j = 2;
            if (b7.c.E(context)) {
                uVar.a(gh.b.common_full_open_on_phone, resources.getString(gh.c.common_open_on_phone), pendingIntent);
            } else {
                uVar.f25842g = pendingIntent;
            }
        } else {
            uVar.f25859x.icon = R.drawable.stat_sys_warning;
            uVar.t(resources.getString(gh.c.common_google_play_services_notification_ticker));
            uVar.f25859x.when = System.currentTimeMillis();
            uVar.f25842g = pendingIntent;
            uVar.g(d2);
        }
        synchronized (f72256c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(gh.c.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        uVar.f25856u = "com.google.android.gms.availability";
        Notification b13 = uVar.b();
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            f.f72261a.set(false);
            i14 = 10436;
        } else {
            i14 = 39789;
        }
        notificationManager.notify(i14, b13);
    }

    public final void l(Activity activity, com.google.android.gms.common.api.internal.i iVar, int i13, com.google.android.gms.common.api.internal.u uVar) {
        AlertDialog i14 = i(activity, i13, jh.s.c(iVar, super.a(i13, activity, "d"), 2), uVar);
        if (i14 == null) {
            return;
        }
        j(activity, i14, "GooglePlayServicesErrorDialog", uVar);
    }
}
