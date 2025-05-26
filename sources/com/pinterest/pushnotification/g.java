package com.pinterest.pushnotification;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import c5.u;
import hs1.m;
import hs1.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.v2;
import lh0.z0;
import lh0.z3;
import nx.d0;
import pk.a0;
import tb0.p;
import uz1.x;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f50276a;

    /* renamed from: b, reason: collision with root package name */
    public final q f50277b;

    /* renamed from: c, reason: collision with root package name */
    public final s50.a f50278c;

    /* renamed from: d, reason: collision with root package name */
    public final lu1.b f50279d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.messaging.q f50280e;

    /* renamed from: f, reason: collision with root package name */
    public final bv1.a f50281f;

    /* renamed from: g, reason: collision with root package name */
    public final v2 f50282g;

    /* renamed from: h, reason: collision with root package name */
    public final gv1.f f50283h;

    /* renamed from: i, reason: collision with root package name */
    public final d f50284i;

    /* renamed from: j, reason: collision with root package name */
    public final l f50285j;

    /* renamed from: k, reason: collision with root package name */
    public final x f50286k;

    public g(com.google.firebase.messaging.q qVar, d0 d0Var, s50.a aVar, v2 v2Var, q qVar2, lu1.b bVar, bv1.a aVar2, gv1.f fVar, b20.c cVar, l lVar, x xVar) {
        this.f50276a = d0Var;
        this.f50277b = qVar2;
        this.f50278c = aVar;
        this.f50279d = bVar;
        this.f50280e = qVar;
        this.f50281f = aVar2;
        this.f50282g = v2Var;
        this.f50283h = fVar;
        this.f50284i = cVar;
        this.f50285j = lVar;
        this.f50286k = xVar;
    }

    public static PendingIntent c(Context context, Intent intent) {
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Building Pending Intent");
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }

    public static String e(String str) {
        int parseDouble = ((int) Double.parseDouble(str)) - 4;
        return parseDouble <= 0 ? "" : parseDouble >= 100 ? "+100" : a.a.d("+", parseDouble);
    }

    public static Bitmap f(q qVar, String str, int i13, int i14) {
        Bitmap bitmap = null;
        if (!a0.s0(str)) {
            try {
                bitmap = ((m) qVar).l(Integer.valueOf(i13), Integer.valueOf(i14), str);
                if (bitmap == null) {
                    kh2.d.O0("ImageLoadException", "Pin Image Bitmap is NULL");
                }
            } catch (Exception e13) {
                kh2.d.O0("ImageLoadException", e13.getMessage() != null ? e13.getMessage() : "");
            }
        }
        return bitmap;
    }

    public static void j(Context context, RemoteViews remoteViews, String str, String str2) {
        if (a0.D0(str)) {
            remoteViews.setTextViewText(pz1.c.richNotifTitle, str);
            remoteViews.setViewVisibility(pz1.c.richNotifTitle, 0);
        }
        if (a0.D0(str2)) {
            remoteViews.setTextViewText(pz1.c.richNotifTextBody, str2);
        } else {
            remoteViews.setViewVisibility(pz1.c.richNotifTextBody, 8);
        }
        m(remoteViews, context);
    }

    public static i l(Context context, f fVar, u uVar, u uVar2) {
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Trying Notification with fallback");
        int a13 = d5.a.a(context, "android.permission.POST_NOTIFICATIONS");
        h hVar = h.f50287a;
        if (a13 != 0) {
            return hVar;
        }
        int k13 = fVar.k();
        if (uVar2 != null) {
            try {
                tz1.b.c().a(Integer.valueOf(fVar.f50258b).intValue(), uVar2.b());
            } catch (Exception e13) {
                tb0.g.f117075a.q(e13, "Failed to build Group Summary Notification", p.PUSH_NOTIFICATIONS);
                uVar.f25848m = null;
            }
        }
        try {
            tz1.b.c().a(k13, uVar.b());
        } catch (Exception e14) {
            tb0.g.f117075a.q(e14, "Failed to notify with NotificationManager", p.PUSH_NOTIFICATIONS);
            uVar.s(null);
            try {
                tz1.b.c().a(k13, uVar.b());
            } catch (Exception e15) {
                tb0.g.f117075a.q(e15, "Failed to notify with NotificationManager fallback", p.PUSH_NOTIFICATIONS);
                return hVar;
            }
        }
        return h.f50288b;
    }

    public static void m(RemoteViews remoteViews, Context context) {
        if (Build.VERSION.SDK_INT == 28) {
            int i13 = eo1.b.color_themed_text_default;
            Object obj = d5.a.f53679a;
            int color = context.getColor(i13);
            remoteViews.setTextColor(pz1.c.richNotifTitle, color);
            remoteViews.setTextColor(pz1.c.richNotifTextBody, color);
        }
    }

    public final void a(u uVar, Context context, PendingIntent pendingIntent) {
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Adding action buttons");
        uVar.a(le0.c.p_logo, context.getString(pz1.e.notification_view), pendingIntent);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x06d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c5.u b(android.content.Context r37, com.pinterest.pushnotification.f r38, java.lang.String r39, java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 1816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.pushnotification.g.b(android.content.Context, com.pinterest.pushnotification.f, java.lang.String, java.lang.String):c5.u");
    }

    public final Intent d(Context context, f fVar, Uri uri) {
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Building Webhook Intent");
        Intent j13 = ((lu1.c) this.f50279d).j(context);
        j13.putExtras(fVar.o());
        j13.putExtra("com.pinterest.EXTRA_SOURCE", "PUSH_NOTIF");
        j13.putExtra("com.pinterest.EXTRA_NOTIFICATION_ID", fVar.k());
        if (uri != null) {
            j13.setData(uri);
        } else {
            j13.setData(fVar.i());
        }
        return j13;
    }

    public final RemoteViews g(Context context, Resources resources, List list, String str, String str2, Intent intent) {
        RemoteViews remoteViews;
        Bitmap f13;
        char c13;
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Inflating notif_rich_pins_collapsed");
        v2 v2Var = this.f50282g;
        if (list != null && list.size() >= 4) {
            v2Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) v2Var.f83492a;
            if (g1Var.o("android_push_collapsed_stacked_images", "enabled", z3Var) || g1Var.l("android_push_collapsed_stacked_images")) {
                int dimensionPixelSize = resources.getDimensionPixelSize(pz1.a.notification_rich_icon_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(pz1.a.notification_rich_icon_height);
                if (v2Var.a("four_images")) {
                    c13 = 4;
                    remoteViews = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_pins_collapsed_four_stack);
                } else if (v2Var.a("two_images")) {
                    remoteViews = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_pins_collapsed_two_stack);
                    c13 = 2;
                } else {
                    remoteViews = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_pins_collapsed_stacked);
                    c13 = 3;
                }
                if (v2Var.a("small_text")) {
                    remoteViews.setViewVisibility(pz1.c.richNotifTitleSmall, 0);
                    remoteViews.setTextViewText(pz1.c.richNotifTitleSmall, str);
                    remoteViews.setViewVisibility(pz1.c.richNotifTitle, 8);
                } else {
                    remoteViews.setViewVisibility(pz1.c.richNotifTitle, 0);
                    remoteViews.setTextViewText(pz1.c.richNotifTitle, str);
                    remoteViews.setViewVisibility(pz1.c.richNotifTitleSmall, 8);
                }
                m(remoteViews, context);
                RemoteViews remoteViews2 = remoteViews;
                k(remoteViews2, pz1.c.richNotifStack1, (String) list.get(0), dimensionPixelSize, dimensionPixelSize2);
                k(remoteViews2, pz1.c.richNotifStack2, (String) list.get(1), dimensionPixelSize, dimensionPixelSize2);
                if (c13 > 2) {
                    k(remoteViews, pz1.c.richNotifStack3, (String) list.get(2), dimensionPixelSize, dimensionPixelSize2);
                    if (c13 > 3) {
                        k(remoteViews, pz1.c.richNotifStack4, (String) list.get(3), dimensionPixelSize, dimensionPixelSize2);
                    }
                }
                remoteViews.setOnClickPendingIntent(pz1.c.collapsed_view_root, c(context, intent));
                return remoteViews;
            }
        }
        v2Var.getClass();
        z3 z3Var2 = a4.f83298b;
        z0 z0Var = v2Var.f83492a;
        g1 g1Var2 = (g1) z0Var;
        remoteViews = (g1Var2.o("android_push_notif_left_image_collapsed_view", "enabled", z3Var2) || g1Var2.l("android_push_notif_left_image_collapsed_view")) ? new RemoteViews(context.getPackageName(), pz1.d.collapsed_view_left_image) : new RemoteViews(context.getPackageName(), pz1.d.notif_rich_pins_collapsed_bold);
        int i13 = pz1.c.richNotifTitleLarge;
        int i14 = pz1.c.richNotifTextBody;
        if (a0.D0(str2)) {
            if (!((Boolean) this.f50283h.a("2025-03-14", "android_collapsed_body_text_formatting").f80346a).booleanValue()) {
                i14 = pz1.c.richNotifTextBodySingleLine;
            }
            remoteViews.setTextViewText(i14, str2);
            remoteViews.setViewVisibility(i14, 0);
            i13 = pz1.c.richNotifTitle;
        }
        if (a0.D0(str)) {
            remoteViews.setTextViewText(i13, str);
            remoteViews.setViewVisibility(i13, 0);
        }
        m(remoteViews, context);
        if (list != null && !list.isEmpty()) {
            int dimensionPixelSize3 = resources.getDimensionPixelSize(pz1.a.notification_rich_icon_width);
            int dimensionPixelSize4 = resources.getDimensionPixelSize(pz1.a.notification_rich_icon_height);
            remoteViews.setViewVisibility(pz1.c.richNotifPinLargeIcon, 0);
            g1 g1Var3 = (g1) z0Var;
            boolean z13 = g1Var3.o("android_push_image_fallback", "enabled", z3Var2) || g1Var3.l("android_push_image_fallback");
            q qVar = this.f50277b;
            if (z13) {
                ArrayList X0 = u2.X0(list, 1, qVar, dimensionPixelSize3, dimensionPixelSize4);
                f13 = !X0.isEmpty() ? (Bitmap) X0.get(0) : null;
            } else {
                f13 = f(qVar, (String) list.get(0), dimensionPixelSize3, dimensionPixelSize4);
            }
            if (f13 != null) {
                remoteViews.setImageViewBitmap(pz1.c.richNotifPinLargeIcon, f13);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                remoteViews.setBoolean(pz1.c.richNotifPinLargeIcon, "setClipToOutline", true);
            }
        }
        remoteViews.setOnClickPendingIntent(pz1.c.collapsed_view_root, c(context, intent));
        return remoteViews;
    }

    public final RemoteViews h(Context context, Resources resources, List list, String str, String str2, Intent intent, Boolean bool) {
        RemoteViews remoteViews;
        try {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.h("Inflating notif_rich_single_image_expanded");
            remoteViews = new RemoteViews(context.getPackageName(), pz1.d.notif_rich_single_image_expanded_bold);
        } catch (Exception e13) {
            kh2.d.O0("NotificationRemoteViewException", e13.getMessage() != null ? e13.getMessage() : "");
            remoteViews = null;
        }
        if (remoteViews == null) {
            return null;
        }
        if (bool.booleanValue()) {
            v2 v2Var = this.f50282g;
            v2Var.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) v2Var.f83492a;
            if ((g1Var.o("android_board_invite_with_image_notification", "enabled", z3Var) || g1Var.l("android_board_invite_with_image_notification")) && Build.VERSION.SDK_INT >= 31) {
                remoteViews.setViewLayoutMarginDimen(pz1.c.richNotifPinGrid, 1, eo1.c.space_400);
            }
        }
        j(context, remoteViews, str, str2);
        int size = list.size();
        int dimensionPixelSize = resources.getDimensionPixelSize(pz1.a.notification_rich_one_icon_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(pz1.a.push_notification_expanded_image_height_148);
        if (size < 1 || a0.s0((CharSequence) list.get(0))) {
            remoteViews.setViewVisibility(pz1.c.richNotifSingleImage, 8);
            kh2.d.O0("ImageUrlFailed", "EmptyUrl");
        } else {
            u2.F(remoteViews, f(this.f50277b, (String) list.get(0), dimensionPixelSize, dimensionPixelSize2));
        }
        remoteViews.setOnClickPendingIntent(pz1.c.expanded_view_root, c(context, intent));
        return remoteViews;
    }

    public final Bitmap i(Resources resources, f fVar) {
        String g13 = fVar.g();
        if (a0.s0(g13)) {
            return null;
        }
        try {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_large_icon_height);
            return ((m) this.f50277b).l(Integer.valueOf(dimensionPixelSize), Integer.valueOf(dimensionPixelSize2), g13);
        } catch (Exception throwable) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.h hVar = tb0.g.f117075a;
            tb0.k kVar = new tb0.k();
            kVar.c("Event", "GetUserBitmap");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            kVar.a(null, null, throwable);
            hVar.k("PushNotificationExceptions", kVar.f117102a);
            return null;
        }
    }

    public final void k(RemoteViews remoteViews, int i13, String str, int i14, int i15) {
        Bitmap f13 = f(this.f50277b, str, i14, i15);
        if (f13 == null) {
            remoteViews.setViewVisibility(i13, 8);
            return;
        }
        remoteViews.setImageViewBitmap(i13, f13);
        remoteViews.setViewVisibility(i13, 0);
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setBoolean(i13, "setClipToOutline", true);
        }
    }
}
