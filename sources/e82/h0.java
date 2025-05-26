package e82;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import com.pinterest.activity.sendapin.model.SendableObject;
import h32.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import lh0.a4;
import lh0.d4;
import lh0.g1;
import lh0.z3;
import m60.x0;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: i, reason: collision with root package name */
    public static final u0[] f57856i = {u0.PIN_SHARE_WHATSAPP, u0.PIN_SHARE_FB_MESSENGER, u0.PIN_SHARE_FACEBOOK_BUTTON, u0.PIN_SHARE_LINE_BUTTON, null, null, u0.PIN_SHARE_TWITTER_BUTTON, u0.PIN_SHARE_SMS_BUTTON, u0.PIN_SHARE_EMAIL_BUTTON, u0.PIN_SHARE_OTHER_APP_BUTTON, u0.PIN_SHARE_FACEBOOK_STORY_BUTTON, u0.PIN_SHARE_FACEBOOK_LITE_BUTTON, u0.PIN_SHARE_FACEBOOK_MESSENGER_LITE_BUTTON};

    /* renamed from: j, reason: collision with root package name */
    public static final u0[] f57857j = {u0.BOARD_SHARE_WHATSAPP_BUTTON, u0.BOARD_SHARE_FBMESSENGER_BUTTON, u0.BOARD_SHARE_FACEBOOK_BUTTON, u0.BOARD_SHARE_LINE_BUTTON, null, null, u0.BOARD_SHARE_TWITTER_BUTTON, u0.BOARD_SHARE_SMS_BUTTON, u0.BOARD_SHARE_EMAIL_BUTTON, u0.BOARD_SHARE_OTHER_APP_BUTTON, null, u0.BOARD_SHARE_FACEBOOK_LITE_BUTTON, u0.BOARD_SHARE_FACEBOOK_MESSENGER_LITE_BUTTON};

    /* renamed from: k, reason: collision with root package name */
    public static final u0[] f57858k = {u0.DID_IT_SHARE_WHATSAPP, u0.DID_IT_SHARE_FB_MESSENGER, u0.DID_IT_SHARE_FB_TIMELINE, u0.DID_IT_SHARE_LINE, u0.DID_IT_SHARE_KAKAO, u0.DID_IT_SHARE_WECHAT, u0.DID_IT_SHARE_TWITTER, u0.DID_IT_SHARE_SMS, u0.DID_IT_SHARE_EMAIL, u0.DID_IT_SHARE_THIRD_PARTY_EXTENSION, u0.DID_IT_SHARE_FB_LITE, u0.DID_IT_SHARE_FB_MESSENGER_LITE};

    /* renamed from: a, reason: collision with root package name */
    public final lb0.o f57859a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.e f57860b;

    /* renamed from: c, reason: collision with root package name */
    public final i92.k f57861c;

    /* renamed from: d, reason: collision with root package name */
    public final d4 f57862d;

    /* renamed from: e, reason: collision with root package name */
    public final vy.m f57863e;

    /* renamed from: f, reason: collision with root package name */
    public final u20.d f57864f;

    /* renamed from: g, reason: collision with root package name */
    public final tb0.h f57865g;

    /* renamed from: h, reason: collision with root package name */
    public final m60.w f57866h;

    public h0(lb0.o preferencesManager, m60.e applicationInfoProvider, i92.k toastUtils, d4 experiments, vy.m analyticsApi, u20.d sendShareServiceWrapper, tb0.h crashReporting, m60.w eventManager) {
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(sendShareServiceWrapper, "sendShareServiceWrapper");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f57859a = preferencesManager;
        this.f57860b = applicationInfoProvider;
        this.f57861c = toastUtils;
        this.f57862d = experiments;
        this.f57863e = analyticsApi;
        this.f57864f = sendShareServiceWrapper;
        this.f57865g = crashReporting;
        this.f57866h = eventManager;
    }

    public static Intent a(vd0.c cVar) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", cVar.o("message", ""));
        intent.putExtra("android.intent.extra.SUBJECT", cVar.o("title", ""));
        return intent;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() != 0 && !a0.f57816a.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
    
        if (r2.equals("com.google.android.babel") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        r2 = e82.e0.INDEX_SMS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005e, code lost:
    
        if (r2.equals("com.google.android.gm") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006a, code lost:
    
        if (r2.equals("com.samsung.android.messaging") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0073, code lost:
    
        if (r2.equals("com.android.mms") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:
    
        if (r2.equals("com.google.android.apps.messaging") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        if (r2.equals("com.android.messaging") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2.equals("com.android.email") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0061, code lost:
    
        r2 = e82.e0.INDEX_EMAIL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h32.u0 c(com.pinterest.activity.sendapin.model.SendableObject r1, java.lang.String r2) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e82.h0.c(com.pinterest.activity.sendapin.model.SendableObject, java.lang.String):h32.u0");
    }

    public static String g(Context context, SendableObject sendableObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (sendableObject == null) {
            return "";
        }
        Resources resources = context.getResources();
        switch (sendableObject.f35129c) {
            case 0:
                String string = resources.getString(x0.send_pin);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case 1:
                String string2 = resources.getString(x0.send_board);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = resources.getString(x0.send_user);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = resources.getString(x0.send_collection);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = resources.getString(x0.send_did_it);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = resources.getString(x0.today_tab_send_article);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 6:
                String string7 = resources.getString(x0.send_pins);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            default:
                return "";
        }
    }

    public static boolean n(Context context, SendableObject sendableObject) {
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        return sendableObject.g() && dl2.b.z1(context, "com.whatsapp");
    }

    public final kk2.m d(Context context, String str) {
        List split$default;
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        if (dl2.b.P1(context, "com.samsung.android.messaging")) {
            arrayList.add("com.samsung.android.messaging");
        }
        if (dl2.b.P1(context, "com.reddit.frontpage")) {
            arrayList.add("com.reddit.frontpage");
        }
        if (dl2.b.P1(context, "com.instagram.android")) {
            arrayList.add("com.instagram.android");
        }
        String j13 = ((lb0.b) this.f57859a).j("PREF_APP_PREFERENCES", "");
        String str2 = j13 != null ? j13 : "";
        split$default = StringsKt__StringsKt.split$default(str2, new String[]{","}, false, 0, 6, null);
        String[] strArr = (String[]) split$default.toArray(new String[0]);
        List j14 = kotlin.collections.f0.j(Arrays.copyOf(strArr, strArr.length));
        ArrayList arrayList2 = new ArrayList(t.f57892a);
        if (str2.length() > 0) {
            List list = j14;
            arrayList2.removeAll(list);
            arrayList2.addAll(0, list);
        }
        if (arrayList.contains("com.samsung.android.messaging") && !j14.contains("com.samsung.android.messaging")) {
            arrayList2.add(1, "com.samsung.android.messaging");
        }
        if (arrayList.contains("com.instagram.android") && !j14.contains("com.instagram.android")) {
            arrayList2.add(1, "com.instagram.android");
        }
        return e(context, b(arrayList2), str);
    }

    public final kk2.m e(Context context, ArrayList packageNames, String str) {
        Intrinsics.checkNotNullParameter(packageNames, "packageNames");
        kk2.k kVar = new kk2.k(new a.g0(21, packageNames, context), 1);
        Intrinsics.checkNotNullExpressionValue(kVar, "fromCallable(...)");
        kk2.m k13 = kVar.k(new b22.f(17, new fn1.k(context, this, str, 14)));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }

    public final ArrayList f() {
        List split$default;
        String j13 = ((lb0.b) this.f57859a).j("PREF_APP_PREFERENCES", "");
        String str = j13 != null ? j13 : "";
        if (str.length() == 0) {
            return new ArrayList();
        }
        split$default = StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null);
        return b(split$default);
    }

    public final kk2.t h(SendableObject sendableObject, p32.c cVar, p32.f fVar) {
        String d2 = sendableObject.d();
        Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
        p32.i b13 = sendableObject.b();
        Intrinsics.checkNotNullExpressionValue(b13, "getInviteObject(...)");
        return pk2.f.k(this.f57864f.b(d2, cVar, b13, fVar).r(tk2.e.f118017c), "observeOn(...)");
    }

    public final void i(SendableObject sendableObject, p32.c inviteCategory, p32.f inviteChannel, int i13, String inviteCode) {
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(inviteChannel, "inviteChannel");
        Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
        p32.i b13 = sendableObject.b();
        Intrinsics.checkNotNullExpressionValue(b13, "getInviteObject(...)");
        String d2 = sendableObject.d();
        Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
        this.f57864f.c(inviteCategory, b13, inviteChannel, d2, i13, inviteCode, sendableObject.a()).r(tk2.e.f118017c).o(new i91.h0(7), new b(14, new f0(this, 0)));
    }

    public final boolean j() {
        String str = Build.MANUFACTURER;
        Intrinsics.f(str);
        boolean E = StringsKt.E(str, "Google", false);
        d4 d4Var = this.f57862d;
        if (E) {
            d4Var.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) d4Var.f83332a;
            if (!g1Var.o("android_sg_native_sharesheet_google_v3", "enabled", z3Var) && !g1Var.l("android_sg_native_sharesheet_google_v3")) {
                return false;
            }
        } else if (StringsKt.E(str, "Samsung", false)) {
            d4Var.getClass();
            z3 z3Var2 = a4.f83297a;
            g1 g1Var2 = (g1) d4Var.f83332a;
            if (!g1Var2.o("android_sg_native_sharesheet_samsung_v3", "enabled", z3Var2) && !g1Var2.l("android_sg_native_sharesheet_samsung_v3")) {
                return false;
            }
        } else {
            d4Var.getClass();
            z3 z3Var3 = a4.f83297a;
            g1 g1Var3 = (g1) d4Var.f83332a;
            if (!g1Var3.o("android_sg_native_sharesheet_v2", "enabled", z3Var3) && !g1Var3.l("android_sg_native_sharesheet_v2")) {
                return false;
            }
        }
        return true;
    }

    public final void k(String packageName) {
        List split$default;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (packageName.length() == 0) {
            return;
        }
        lb0.b bVar = (lb0.b) this.f57859a;
        String j13 = bVar.j("PREF_APP_PREFERENCES", "");
        split$default = StringsKt__StringsKt.split$default(j13 != null ? j13 : "", new String[]{","}, false, 0, 6, null);
        ArrayList b13 = b(split$default);
        ArrayList arrayList = new ArrayList(b13.size());
        if (!a0.f57816a.contains(packageName)) {
            arrayList.add(packageName);
        }
        Iterator it = b13.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!Intrinsics.d(str, packageName)) {
                arrayList.add(str);
            }
        }
        bVar.n("PREF_APP_PREFERENCES", CollectionsKt.Z(arrayList.subList(0, Math.min(3, arrayList.size())), ",", null, null, 0, null, null, 62));
    }

    public final void l(Context context, SendableObject sendableObject, String str, p32.c cVar) {
        p32.f a13 = a0.a(str);
        Intrinsics.checkNotNullExpressionValue(a13, "getInviteChannelFromAppPackage(...)");
        h(sendableObject, cVar, a13).o(new b(12, new e.c((Object) this, str, (Object) context, (Object) sendableObject, (Object) cVar, 16)), new b(13, new f0(this, 1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r2.l("android_sg_native_sharesheet_google_v3") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        r0 = a(new vd0.c());
        r2 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
    
        r0 = r18.getPackageManager().queryIntentActivities(r0, 65536);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "queryIntentActivities(...)");
        r2.addAll(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b7, code lost:
    
        r17.f57865g.q(r0, "Error with queryIntentActivities.", tb0.p.SHARING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0076, code lost:
    
        if (r2.l("android_sg_native_sharesheet_samsung_v3") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x008f, code lost:
    
        if (r2.l("android_sg_native_sharesheet_v2") == false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(android.content.Context r18, com.pinterest.activity.sendapin.model.SendableObject r19, java.lang.String r20, p32.c r21) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e82.h0.m(android.content.Context, com.pinterest.activity.sendapin.model.SendableObject, java.lang.String, p32.c):void");
    }
}
