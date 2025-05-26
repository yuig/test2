package com.airbnb.lottie;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import c2.n2;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1gSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.bugsnag.android.AnrPlugin;
import com.bugsnag.android.ndk.NativeBridge;
import com.bugsnag.android.s1;
import com.facebook.login.DeviceAuthDialog;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views.YouTubePlayerSeekBar;
import com.pinterest.activity.conversation.view.PeopleFacetSearchBar;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.activity.user.UserSetImageActivity;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import com.pinterest.ui.imageview.WebImageView;
import df.i0;
import df.k0;
import df.n1;
import df.u0;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.ZipInputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import x02.x2;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28421b;

    public /* synthetic */ k(Object obj, int i13) {
        this.f28420a = i13;
        this.f28421b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0609 A[Catch: IOException -> 0x05ac, UnknownHostException -> 0x05af, TRY_LEAVE, TryCatch #9 {UnknownHostException -> 0x05af, IOException -> 0x05ac, blocks: (B:55:0x0576, B:57:0x0581, B:60:0x05b2, B:62:0x05bc, B:66:0x05cc, B:68:0x0609, B:76:0x0627, B:85:0x062e, B:86:0x0631, B:88:0x0632, B:91:0x0589, B:94:0x0590, B:95:0x0596, B:97:0x059c, B:99:0x0662, B:100:0x0669), top: B:54:0x0576 }] */
    /* JADX WARN: Type inference failed for: r0v137, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v139, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.k.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue;
        long j13;
        WebImageView webImageView;
        Locale locale = null;
        int i13 = 0;
        boolean z13 = true;
        boolean z14 = true;
        switch (this.f28420a) {
            case 0:
                jc.g.b((ZipInputStream) this.f28421b);
                return;
            case 1:
            case 15:
            default:
                UserSetImageActivity this$0 = (UserSetImageActivity) this.f28421b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i14 = UserSetImageActivity.f35226j;
                i92.k kVar = this$0.f35229d;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar.m(this$0.getString(nz1.f.user_picture_updated));
                String f39332b = com.bumptech.glide.d.Q(this$0.getActiveUserManager()).getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
                x2 x2Var = this$0.f35231f;
                if (x2Var != null) {
                    this$0.f35227b.a(x2Var.Q(f39332b).H(tk2.e.f118017c).A(wj2.c.a()).F(new ir.h(12, new nr.n(this$0, z14 ? 1 : 0)), new ir.h(13, nr.l.f91858l), ck2.i.f27923c, ck2.i.f27924d));
                    return;
                } else {
                    Intrinsics.r("userRepository");
                    throw null;
                }
            case 2:
                ((AFe1qSDK) this.f28421b).getCurrencyIso4217Code();
                return;
            case 3:
                AFb1tSDK.getRevenue((AFd1gSDK) this.f28421b);
                return;
            case 4:
                ((AnrPlugin) this.f28421b).initNativePlugin();
                return;
            case 5:
                ((s1) this.f28421b).a();
                return;
            case 6:
                ((NativeBridge) this.f28421b).refreshSymbolTable();
                return;
            case 7:
                a();
                return;
            case 8:
                String str = (String) this.f28421b;
                pe.d dVar = pe.d.f99893a;
                if (p001if.a.b(pe.d.class)) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    df.c q13 = wc.b.q(le.v.a());
                    JSONArray jSONArray = new JSONArray();
                    String str2 = Build.MODEL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONArray.put(str2);
                    if ((q13 == null ? null : q13.a()) != null) {
                        jSONArray.put(q13.a());
                    } else {
                        jSONArray.put("");
                    }
                    jSONArray.put("0");
                    jSONArray.put(ue.c.w() ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
                    try {
                        locale = le.v.a().getResources().getConfiguration().locale;
                    } catch (Exception unused) {
                    }
                    if (locale == null) {
                        locale = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                    }
                    jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
                    String jSONArray2 = jSONArray.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONArray2, "extInfoArray.toString()");
                    bundle.putString("device_session_id", pe.d.a());
                    bundle.putString("extinfo", jSONArray2);
                    String str3 = le.a0.f83002j;
                    String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                    JSONObject jSONObject = new le.a0(null, format, bundle, le.f0.POST, null).d().f83045b;
                    AtomicBoolean atomicBoolean = pe.d.f99899g;
                    if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                        z13 = false;
                    }
                    atomicBoolean.set(z13);
                    if (atomicBoolean.get()) {
                        pe.k kVar2 = pe.d.f99896d;
                        if (kVar2 != null) {
                            kVar2.c();
                        }
                    } else {
                        pe.d.f99897e = null;
                    }
                    pe.d.f99900h = false;
                    return;
                } catch (Throwable th3) {
                    p001if.a.a(pe.d.class, th3);
                    return;
                }
            case 9:
                pe.g this$02 = (pe.g) this.f28421b;
                me.f fVar = pe.g.f99907f;
                if (p001if.a.b(pe.g.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(this$02, "this$0");
                    this$02.b();
                    return;
                } catch (Throwable th4) {
                    p001if.a.a(pe.g.class, th4);
                    return;
                }
            case 10:
                ye.e this$03 = (ye.e) this.f28421b;
                me.f fVar2 = ye.e.f138829d;
                if (p001if.a.b(ye.e.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(this$03, "this$0");
                    try {
                        View v13 = ue.c.v((Activity) this$03.f138831a.get());
                        Activity activity = (Activity) this$03.f138831a.get();
                        if (v13 != null && activity != null) {
                            Iterator it = ye.c.a(v13).iterator();
                            while (it.hasNext()) {
                                View view = (View) it.next();
                                if (!qe.g.a(view)) {
                                    String d2 = ye.c.d(view);
                                    if (d2.length() > 0 && d2.length() <= 300) {
                                        HashSet hashSet = ye.f.f138834e;
                                        String localClassName = activity.getLocalClassName();
                                        Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
                                        me.f.d(view, v13, localClassName);
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                } catch (Throwable th5) {
                    p001if.a.a(ye.e.class, th5);
                    return;
                }
            case 11:
                df.r.g((df.r) this.f28421b);
                return;
            case 12:
                k0 this$04 = (k0) this.f28421b;
                String str4 = k0.f54779h;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Condition condition = this$04.f54786f;
                String str5 = k0.f54779h;
                ReentrantLock reentrantLock = this$04.f54785e;
                reentrantLock.lock();
                try {
                    this$04.f54784d = false;
                    Unit unit = Unit.f80348a;
                    reentrantLock.unlock();
                    try {
                        wc.b bVar = u0.f54860d;
                        wc.b.x(le.g0.CACHE, str5, "trim started");
                        PriorityQueue priorityQueue2 = new PriorityQueue();
                        File[] listFiles = this$04.f54783c.listFiles(df.l.f54790b);
                        long j14 = 0;
                        if (listFiles != null) {
                            int length = listFiles.length;
                            j13 = 0;
                            while (i13 < length) {
                                File file = listFiles[i13];
                                Intrinsics.checkNotNullExpressionValue(file, "file");
                                i0 i0Var = new i0(file);
                                priorityQueue2.add(i0Var);
                                wc.b bVar2 = u0.f54860d;
                                wc.b.x(le.g0.CACHE, str5, "  trim considering time=" + i0Var.f54762b + " name=" + ((Object) file.getName()));
                                j14 += file.length();
                                j13++;
                                i13++;
                                listFiles = listFiles;
                                priorityQueue2 = priorityQueue2;
                            }
                            priorityQueue = priorityQueue2;
                        } else {
                            priorityQueue = priorityQueue2;
                            j13 = 0;
                        }
                        while (true) {
                            n2 n2Var = this$04.f54782b;
                            if (j14 <= n2Var.f25001a && j13 <= n2Var.f25002b) {
                                reentrantLock.lock();
                                try {
                                    condition.signalAll();
                                    Unit unit2 = Unit.f80348a;
                                    return;
                                } finally {
                                }
                            }
                            File file2 = ((i0) priorityQueue.remove()).f54761a;
                            wc.b bVar3 = u0.f54860d;
                            wc.b.x(le.g0.CACHE, str5, Intrinsics.n(file2.getName(), "  trim removing "));
                            j14 -= file2.length();
                            j13--;
                            file2.delete();
                        }
                    } catch (Throwable th6) {
                        reentrantLock.lock();
                        try {
                            condition.signalAll();
                            Unit unit3 = Unit.f80348a;
                            throw th6;
                        } finally {
                        }
                    }
                } finally {
                }
                break;
            case 13:
                DeviceAuthDialog this$05 = (DeviceAuthDialog) this.f28421b;
                int i15 = DeviceAuthDialog.B;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                this$05.Z6();
                return;
            case 14:
                ((CarouselLayoutManager) this.f28421b).s1();
                return;
            case 16:
                ((vj.f) this.f28421b).a(true);
                return;
            case 17:
                kj.c cVar = (kj.c) this.f28421b;
                cVar.f79822c = false;
                y5.d dVar2 = ((SideSheetBehavior) cVar.f79824e).f33027i;
                if (dVar2 != null && dVar2.h()) {
                    cVar.a(cVar.f79821b);
                    return;
                }
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) cVar.f79824e;
                if (sideSheetBehavior.f33026h == 2) {
                    sideSheetBehavior.D(cVar.f79821b);
                    return;
                }
                return;
            case 18:
                ((com.google.android.material.textfield.e) this.f28421b).t(true);
                return;
            case 19:
                com.google.android.material.textfield.k kVar3 = (com.google.android.material.textfield.k) this.f28421b;
                boolean isPopupShowing = kVar3.f33237h.isPopupShowing();
                kVar3.t(isPopupShowing);
                kVar3.f33242m = isPopupShowing;
                return;
            case 20:
                com.google.android.gms.common.api.internal.b0 b0Var = (com.google.android.gms.common.api.internal.b0) this.f28421b;
                synchronized (((ArrayDeque) b0Var.f30792e)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) b0Var.f30789b).edit();
                    String str6 = (String) b0Var.f30790c;
                    StringBuilder sb3 = new StringBuilder();
                    Iterator it2 = ((ArrayDeque) b0Var.f30792e).iterator();
                    while (it2.hasNext()) {
                        sb3.append((String) it2.next());
                        sb3.append((String) b0Var.f30791d);
                    }
                    edit.putString(str6, sb3.toString()).commit();
                }
                return;
            case 21:
                YouTubePlayerSeekBar this$06 = (YouTubePlayerSeekBar) this.f28421b;
                int i16 = YouTubePlayerSeekBar.f34790h;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                this$06.f34796f.setText("");
                return;
            case 22:
                GestaltSearchField gestaltSearchField = ((cp.n) this.f28421b).f52948f0;
                if (gestaltSearchField != null) {
                    gestaltSearchField.B0();
                    return;
                }
                return;
            case 23:
                PeopleFacetSearchBar peopleFacetSearchBar = (PeopleFacetSearchBar) this.f28421b;
                int i17 = PeopleFacetSearchBar.f34884d;
                peopleFacetSearchBar.fullScroll(17);
                return;
            case 24:
                mq.u this$07 = (mq.u) this.f28421b;
                int i18 = mq.u.P0;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                this$07.k8();
                return;
            case 25:
                oq.j this$08 = (oq.j) this.f28421b;
                int i19 = n1.f54810c;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                oq.e0 e0Var = this$08.f97072r;
                if (e0Var != null) {
                    ((oq.c0) e0Var).b();
                }
                if (!this$08.b() && (webImageView = this$08.f97065k) != null) {
                    webImageView.setVisibility(8);
                }
                oq.j.a(this$08);
                return;
            case 26:
                GestaltTextComposer this_apply = (GestaltTextComposer) this.f28421b;
                int i23 = CommentComposerView.L;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.g0();
                return;
            case 27:
                Throwable th7 = (Throwable) this.f28421b;
                int i24 = dr.k.H;
                HashSet hashSet2 = tb0.h.f117076w;
                tb0.g.f117075a.q(th7, "SendShareService Fail: useCachedShareContactSuggestions", tb0.p.SHARING);
                return;
            case 28:
                MainActivity this$09 = (MainActivity) this.f28421b;
                bk.f fVar3 = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                ((ew.j) this$09.E()).c();
                return;
        }
    }
}
