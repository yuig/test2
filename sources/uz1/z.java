package uz1;

import android.content.Context;
import android.net.Uri;
import com.google.gson.reflect.TypeToken;
import df.j1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.v2;
import lh0.z3;
import m60.f0;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final x92.b f123328a;

    /* renamed from: b, reason: collision with root package name */
    public final com.pinterest.pushnotification.l f123329b;

    /* renamed from: c, reason: collision with root package name */
    public final s50.a f123330c;

    /* renamed from: d, reason: collision with root package name */
    public final bv1.a f123331d;

    /* renamed from: e, reason: collision with root package name */
    public final x f123332e;

    /* renamed from: f, reason: collision with root package name */
    public final u f123333f;

    /* renamed from: g, reason: collision with root package name */
    public final v2 f123334g;

    /* renamed from: h, reason: collision with root package name */
    public final f0 f123335h;

    public z(x92.b pushNotificationRenderer, com.pinterest.pushnotification.l pushTokenRegistrationScheduler, s50.a appBadgeUtils, bv1.a newsHubBadgeInteractor, x notificationUtils, u pushNotificationLogger, v2 experiments, f0 devUtils) {
        Intrinsics.checkNotNullParameter(pushNotificationRenderer, "pushNotificationRenderer");
        Intrinsics.checkNotNullParameter(pushTokenRegistrationScheduler, "pushTokenRegistrationScheduler");
        Intrinsics.checkNotNullParameter(appBadgeUtils, "appBadgeUtils");
        Intrinsics.checkNotNullParameter(newsHubBadgeInteractor, "newsHubBadgeInteractor");
        Intrinsics.checkNotNullParameter(notificationUtils, "notificationUtils");
        Intrinsics.checkNotNullParameter(pushNotificationLogger, "pushNotificationLogger");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        this.f123328a = pushNotificationRenderer;
        this.f123329b = pushTokenRegistrationScheduler;
        this.f123330c = appBadgeUtils;
        this.f123331d = newsHubBadgeInteractor;
        this.f123332e = notificationUtils;
        this.f123333f = pushNotificationLogger;
        this.f123334g = experiments;
        this.f123335h = devUtils;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.util.ArrayList] */
    public final t a(Map map, Context context, d dVar) {
        List list;
        ?? r33;
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("PushNotificationV2: getContentView for " + dVar);
        String str = (String) map.get("media_urls");
        if (j1.U0(str)) {
            Object d2 = vd0.c.f125622b.d(str, new TypeToken<List<? extends String>>() { // from class: com.pinterest.pushnotification.v2.PushNotificationV2$getContentView$pinImageUrls$1
            }.f33847b);
            Intrinsics.f(d2);
            list = (List) d2;
        } else {
            list = q0.f80391a;
        }
        List list2 = list;
        int i13 = y.f123327a[dVar.ordinal()];
        v2 v2Var = this.f123334g;
        switch (i13) {
            case 1:
                return new r(this.f123332e.a(context, list2, pz1.a.notification_rich_one_icon_width, pz1.a.push_notification_expanded_image_height_148, 1));
            case 2:
            case 3:
                v2Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) v2Var.f83492a;
                boolean z13 = g1Var.o("android_push_notification_expanded_no_text", "enabled", z3Var) || g1Var.l("android_push_notification_expanded_no_text");
                ArrayList a13 = this.f123332e.a(context, list2, pz1.a.push_notification_expanded_image_width_103, z13 ? pz1.a.push_notification_expanded_image_height_150 : pz1.a.push_notification_expanded_image_height_100, 6);
                if (a13.size() >= 6) {
                    return z13 ? new q(a13) : new s(a13);
                }
                int size = a13.size();
                x xVar = this.f123332e;
                if (4 <= size && size < 6) {
                    int i14 = pz1.a.notification_rich_large_icon_width;
                    int i15 = pz1.a.push_notification_expanded_image_height_148;
                    xVar.getClass();
                    return new l(x.c(a13, i14, i15, context));
                }
                int size2 = a13.size();
                if (1 > size2 || size2 >= 4) {
                    return new r(q0.f80391a);
                }
                int i16 = pz1.a.notification_rich_one_icon_width;
                int i17 = pz1.a.push_notification_expanded_image_height_148;
                xVar.getClass();
                return new r(x.c(a13, i16, i17, context));
            case 4:
            case 5:
                nm.o oVar = vd0.c.f125622b;
                String str2 = (String) map.get("pin_count_per_board");
                if (str2 == null) {
                    str2 = "";
                }
                List list3 = (List) oVar.d(str2, new TypeToken<List<? extends String>>() { // from class: com.pinterest.pushnotification.v2.PushNotificationV2$getContentView$pinCountPerBoard$1
                }.f33847b);
                if (list3 != null) {
                    List list4 = list3;
                    r33 = new ArrayList(g0.q(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        r33.add(kh2.g0.e((String) it.next()));
                    }
                } else {
                    r33 = q0.f80391a;
                }
                List list5 = r33;
                if (dVar != d.MINI_BOARD_GRID_NOTIFICATION || list2.size() >= 8) {
                    ArrayList a14 = this.f123332e.a(context, list2.subList(0, 1), pz1.a.notification_rich_board_cover_expanded_width, pz1.a.push_notification_expanded_image_height_148, 1);
                    List subList = list2.subList(1, list2.size());
                    int i18 = pz1.a.notification_rich_board_pin_expanded_size;
                    return new p(CollectionsKt.l0(this.f123332e.a(context, subList, i18, i18, list2.size() - 1), a14), (String) list5.get(0));
                }
                ArrayList a15 = this.f123332e.a(context, list2.subList(0, 2), pz1.a.notification_rich_board_cover_width, pz1.a.push_notification_expanded_image_height_148, 2);
                List subList2 = list2.subList(2, list2.size());
                int i19 = pz1.a.notification_rich_board_pin_expanded_size;
                return new o(CollectionsKt.l0(this.f123332e.a(context, subList2, i19, i19, list2.size() - 2), a15), list5);
            case 6:
                Object d13 = vd0.c.f125622b.d((String) map.get("interest_names"), new TypeToken<List<? extends String>>() { // from class: com.pinterest.pushnotification.v2.PushNotificationV2$getContentView$interests$1
                }.f33847b);
                Intrinsics.checkNotNullExpressionValue(d13, "fromJson(...)");
                return new m(this.f123332e.a(context, list2, pz1.a.notification_rich_interest_width, pz1.a.push_notification_expanded_image_height_148, 3), (List) d13);
            case 7:
                ArrayList a16 = this.f123332e.a(context, list2, pz1.a.notification_rich_icon_width, pz1.a.notification_rich_icon_height, 1);
                v2Var.getClass();
                z3 z3Var2 = a4.f83298b;
                g1 g1Var2 = (g1) v2Var.f83492a;
                return (g1Var2.o("android_push_notif_left_image_collapsed_view", "enabled", z3Var2) || g1Var2.l("android_push_notif_left_image_collapsed_view")) ? new n(a16) : new k(a16);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int b(Map map) {
        Integer num;
        String link = (String) map.get("link");
        if (link != null) {
            this.f123332e.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            if (!kotlin.text.z.p(link, "http", false)) {
                link = "pinterest://".concat(link);
            }
            Uri parse = Uri.parse(link);
            if (parse.getPathSegments().contains("conversation")) {
                num = Integer.valueOf(parse.getPathSegments().size() > 1 ? parse.getPathSegments().get(1).hashCode() : 58902);
            } else {
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        String str = (String) map.get("push_id");
        if (str == null) {
            str = "";
        }
        return str.hashCode();
    }
}
