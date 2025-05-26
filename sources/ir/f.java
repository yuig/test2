package ir;

import android.os.Build;
import android.os.Bundle;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.wy0;
import com.pinterest.service.DelayedStartupService;
import e82.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ow.p0;
import so.oa;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f73457b;

    public /* synthetic */ f(MainActivity mainActivity, int i13) {
        this.f73456a = i13;
        this.f73457b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f73456a;
        int i14 = 0;
        int i15 = 1;
        MainActivity this$0 = this.f73457b;
        switch (i13) {
            case 0:
                bk.f fVar = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                wk2.a aVar = this$0.W;
                if (aVar == null) {
                    Intrinsics.r("onDemandLibrariesInstallManagerProvider");
                    throw null;
                }
                c91.d dVar = (c91.d) aVar.get();
                boolean i03 = d7.b.i0(((b60.d) this$0.getActiveUserManager()).f());
                hp1.a aVar2 = c91.a.f26973a;
                boolean a13 = dVar.a(aVar2);
                ArrayList arrayList = new ArrayList();
                if (!i03) {
                    dVar.c();
                } else if (!a13) {
                    arrayList.add(aVar2);
                }
                dVar.b(this$0, true, this$0.getPinalytics(), null, arrayList);
                return;
            case 1:
                bk.f fVar2 = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                DelayedStartupService.e(this$0, "com.pinterest.action.UPLOAD_CONTACTS");
                DelayedStartupService.e(this$0, "com.pinterest.action.CACHE_SHARE_SUGGESTIONS");
                return;
            case 2:
                bk.f fVar3 = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                se2.a aVar3 = this$0.E;
                if (aVar3 != null) {
                    ((mc.i) ((bf2.b) aVar3).get()).a();
                    return;
                } else {
                    Intrinsics.r("closeupApiFieldsCache");
                    throw null;
                }
            case 3:
                bk.f fVar4 = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MainActivity.l0(this$0, 15, new i(i14));
                MainActivity.l0(this$0, 25, new i(i15));
                return;
            case 4:
                bk.f fVar5 = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                se2.a aVar4 = this$0.f35184k0;
                if (aVar4 == null) {
                    Intrinsics.r("lazyHandshakeManager");
                    throw null;
                }
                np1.j jVar = (np1.j) ((bf2.b) aVar4).get();
                if (jVar != null) {
                    np1.i iVar = (np1.i) jVar;
                    mp1.l lVar = iVar.f91792d;
                    lv.a aVar5 = iVar.f91791c;
                    aVar5.getClass();
                    try {
                        if (Build.VERSION.SDK_INT >= 28) {
                            if (!lv.a.a()) {
                                ((mp1.b) lVar).b("quarantine_failed_webview_disabled", "");
                                return;
                            }
                            z70.f r23 = ((oa) z70.i.a()).r2();
                            if (dl2.b.z1(aVar5.f84977a, "com.android.chrome") && r23.f140992a) {
                                kotlin.jvm.internal.j.z(iVar.f91794f, iVar.f91795g, null, new np1.g(iVar, null), 2);
                                return;
                            } else {
                                ((mp1.b) lVar).b("quarantine_failed_chrome_disabled", "");
                                return;
                            }
                        }
                    } catch (Exception unused) {
                    }
                    ((mp1.b) lVar).b("quarantine_failed_api_level", "");
                    return;
                }
                return;
            case 5:
                bk.f fVar6 = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    this$0.reportFullyDrawn();
                    return;
                } catch (SecurityException unused2) {
                    return;
                }
            case 6:
                bk.f fVar7 = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((p0) ((ow.a) ((bf2.b) this$0.F()).get())).m();
                return;
            case 7:
                bk.f fVar8 = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                se2.a aVar6 = this$0.E0;
                if (aVar6 == null) {
                    Intrinsics.r("preferredSharingAppTracker");
                    throw null;
                }
                i91.z zVar = (i91.z) ((bf2.b) aVar6).get();
                zVar.getClass();
                Intrinsics.checkNotNullParameter(this$0, "context");
                wy0 f13 = ((b60.d) zVar.f71923b).f();
                if (zVar.f71924c == null) {
                    ArrayList f14 = zVar.f71922a.f();
                    String str = f14.isEmpty() ^ true ? (String) f14.get(0) : null;
                    List<String> list = i91.z.f71921d;
                    if (str != null && list.contains(str) && dl2.b.P1(this$0, str)) {
                        zVar.a(str);
                        return;
                    }
                    if (f13 != null) {
                        List list2 = i0.f57872a;
                        Intrinsics.checkNotNullParameter(f13, "<this>");
                        if (Intrinsics.d("JP", f13.G2()) && dl2.b.P1(this$0, "jp.naver.line.android")) {
                            zVar.a("jp.naver.line.android");
                            return;
                        }
                    }
                    if (dl2.b.P1(this$0, "com.whatsapp")) {
                        zVar.a("com.whatsapp");
                        return;
                    }
                    for (String str2 : list) {
                        if (dl2.b.P1(this$0, str2)) {
                            zVar.a(str2);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                bk.f fVar9 = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                se2.a aVar7 = this$0.f35186l0;
                if (aVar7 == null) {
                    Intrinsics.r("lazyTargetHandshakeManager");
                    throw null;
                }
                z82.b bVar = (z82.b) ((bf2.b) aVar7).get();
                if (bVar != null) {
                    z82.j jVar2 = (z82.j) bVar;
                    y82.h hVar = jVar2.f141130d;
                    lv.a aVar8 = jVar2.f141129c;
                    aVar8.getClass();
                    try {
                        if (Build.VERSION.SDK_INT >= 28) {
                            if (!lv.a.a()) {
                                ((y82.i) hVar).b("quarantine_failed_webview_disabled", "");
                                return;
                            }
                            z70.f r24 = ((oa) z70.i.a()).r2();
                            if (dl2.b.z1(aVar8.f84977a, "com.android.chrome") && r24.f140992a) {
                                kotlin.jvm.internal.j.z(jVar2.f141132f, jVar2.f141133g, null, new z82.h(jVar2, null), 2);
                                return;
                            } else {
                                ((y82.i) hVar).b("quarantine_failed_chrome_disabled", "");
                                return;
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    ((y82.i) hVar).b("quarantine_failed_api_level", "");
                    return;
                }
                return;
            default:
                bk.f fVar10 = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                se2.a aVar9 = this$0.V;
                if (aVar9 == null) {
                    Intrinsics.r("locationUtils");
                    throw null;
                }
                is1.l lVar2 = (is1.l) ((bf2.b) aVar9).get();
                lVar2.a(this$0, this$0.getPinalytics());
                lVar2.b(this$0, this$0.Y());
                Bundle extras = this$0.getIntent().getExtras();
                if (extras != null && extras.getBoolean("com.pinterest.EXTRA_REQUEST_LOCATION_PERMISSION")) {
                    this$0.getIntent().removeExtra("com.pinterest.EXTRA_REQUEST_LOCATION_PERMISSION");
                    se2.a aVar10 = this$0.V;
                    if (aVar10 == null) {
                        Intrinsics.r("locationUtils");
                        throw null;
                    }
                    ((is1.l) ((bf2.b) aVar10).get()).c(this$0, this$0.getPinalytics(), this$0.Y());
                }
                this$0.f35210x0 = true;
                return;
        }
    }
}
