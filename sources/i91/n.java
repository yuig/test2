package i91;

import a.cb;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.vg;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xo0;
import h32.d4;
import h32.f1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class n implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final i92.k f71871a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.w f71872b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f71873c;

    /* renamed from: d, reason: collision with root package name */
    public final oc.c f71874d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.e f71875e;

    /* renamed from: f, reason: collision with root package name */
    public final lb0.q f71876f;

    /* renamed from: g, reason: collision with root package name */
    public h f71877g;

    /* renamed from: h, reason: collision with root package name */
    public final nx.j0 f71878h;

    /* renamed from: i, reason: collision with root package name */
    public kk2.l f71879i;

    /* renamed from: j, reason: collision with root package name */
    public ek2.j f71880j;

    /* renamed from: k, reason: collision with root package name */
    public final uk2.f f71881k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.appcompat.app.i0 f71882l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f71883m;

    public n(i92.k toastUtils, m60.w eventManager, b60.b activeUserManager, oc.c apolloClient, nx.f0 pinalyticsFactory, m60.e applicationInfoProvider, lb0.q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f71871a = toastUtils;
        this.f71872b = eventManager;
        this.f71873c = activeUserManager;
        this.f71874d = apolloClient;
        this.f71875e = applicationInfoProvider;
        this.f71876f = prefsManagerPersisted;
        this.f71878h = ((nx.m) pinalyticsFactory).a(this);
        this.f71881k = cb.r("create(...)");
        this.f71882l = new androidx.appcompat.app.i0(this, 10);
        this.f71883m = xk2.m.b(m.f71870i);
    }

    public static boolean a(f30 pin) {
        List s13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        dl0 v63 = pin.v6();
        boolean z13 = false;
        if (v63 != null && (s13 = v63.s()) != null) {
            List list = s13;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Boolean t13 = ((uo0) it.next()).t();
                    Intrinsics.checkNotNullExpressionValue(t13, "getShouldMute(...)");
                    if (t13.booleanValue()) {
                        z13 = true;
                        break;
                    }
                }
            }
        }
        return !z13;
    }

    public final boolean b(f30 pin) {
        dl0 v63;
        List s13;
        Boolean bool;
        boolean z13;
        List s14;
        jo0 q13;
        List<uo0> s15;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Boolean q53 = pin.q5();
        Intrinsics.checkNotNullExpressionValue(q53, "getIsYearInPreview(...)");
        if (!q53.booleanValue()) {
            Set set = b40.f35967a;
            Intrinsics.checkNotNullParameter(pin, "<this>");
            if (b40.Q0(pin) && (v63 = pin.v6()) != null && (s13 = v63.s()) != null) {
                List<uo0> list = s13;
                Float f13 = null;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (uo0 uo0Var : list) {
                        Intrinsics.f(uo0Var);
                        Intrinsics.checkNotNullParameter(uo0Var, "<this>");
                        if (com.bumptech.glide.d.b0(uo0Var)) {
                            break;
                        }
                        if (!com.bumptech.glide.d.a0(uo0Var)) {
                            Intrinsics.checkNotNullParameter(uo0Var, "<this>");
                            List<ro0> o13 = uo0Var.o();
                            if (o13 != null) {
                                for (ro0 ro0Var : o13) {
                                }
                            }
                            xo0 xo0Var = new xo0();
                            List o14 = uo0Var.o();
                            if (o14 != null) {
                                ArrayList Q = CollectionsKt.Q(o14);
                                if (!Q.isEmpty()) {
                                    Iterator it = Q.iterator();
                                    while (it.hasNext()) {
                                        if (Intrinsics.d(((ro0) it.next()).a(xo0Var), Boolean.TRUE)) {
                                            z13 = true;
                                            break;
                                        }
                                    }
                                }
                                z13 = false;
                                bool = Boolean.valueOf(z13);
                            } else {
                                bool = null;
                            }
                            if (bool == null || !bool.booleanValue()) {
                                break;
                            }
                        }
                    }
                }
                dl0 v64 = pin.v6();
                if (v64 != null && (s15 = v64.s()) != null) {
                    for (uo0 uo0Var2 : s15) {
                        Intrinsics.f(uo0Var2);
                        List o15 = uo0Var2.o();
                        if (o15 != null) {
                            ArrayList Q2 = CollectionsKt.Q(o15);
                            if (Q2.isEmpty()) {
                                continue;
                            } else {
                                vg vgVar = (vg) this.f71883m.getValue();
                                if (Q2.isEmpty()) {
                                    continue;
                                } else {
                                    Iterator it2 = Q2.iterator();
                                    while (it2.hasNext()) {
                                        if (Intrinsics.d(((ro0) it2.next()).a(vgVar), Boolean.TRUE)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                dl0 v65 = pin.v6();
                if (v65 != null && (s14 = v65.s()) != null) {
                    List<uo0> list2 = s14;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (uo0 uo0Var3 : list2) {
                            Intrinsics.f(uo0Var3);
                            if (!com.bumptech.glide.d.c0(uo0Var3)) {
                            }
                        }
                    }
                    if (b40.P0(pin)) {
                        return false;
                    }
                    dl0 v66 = pin.v6();
                    if (v66 != null && (q13 = v66.q()) != null) {
                        f13 = Float.valueOf((float) q13.l().doubleValue());
                    }
                    if (f13 != null && !Intrinsics.c(f13, 0.5625f)) {
                        return false;
                    }
                    wy0 n13 = b40.n(pin);
                    if (n13 == null) {
                        n13 = bs1.c.O0(pin);
                    }
                    if (n13 != null) {
                        Boolean l23 = n13.l2();
                        Intrinsics.checkNotNullExpressionValue(l23, "getAllowIdeaPinDownloads(...)");
                        if (!l23.booleanValue()) {
                            return dl2.b.S1(com.bumptech.glide.d.Q(this.f71873c), n13.getId());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Context context, j jVar) {
        this.f71872b.d(new jc0.s());
        Activity k03 = bs1.c.k0(context);
        if (Build.VERSION.SDK_INT >= 29) {
            jVar.invoke();
            return;
        }
        qy1.d.b(this.f71876f, k03, "android.permission.WRITE_EXTERNAL_STORAGE", x0.storage_permission_explanation_save_image, new to0.t(1, context, jVar));
    }

    public final void d(Context context, boolean z13) {
        Long l13;
        kk2.l lVar = this.f71879i;
        if (lVar != null) {
            lVar.dispose();
        }
        ek2.j jVar = this.f71880j;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.f71872b.d(new jc0.s());
        if (z13) {
            try {
                h hVar = this.f71877g;
                if (hVar != null && (l13 = hVar.f71836c) != null) {
                    long longValue = l13.longValue();
                    Object systemService = context.getSystemService("download");
                    Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                    ((DownloadManager) systemService).remove(longValue);
                }
            } catch (Exception e13) {
                e13.getMessage();
                return;
            }
        }
        this.f71877g = null;
        context.unregisterReceiver(this.f71882l);
    }

    public final void f(Context context, o oVar, String str, String str2, int i13) {
        kk2.l lVar;
        uj2.b0 k13;
        h hVar = this.f71877g;
        uk2.f fVar = this.f71881k;
        if (hVar == null) {
            this.f71877g = new h(str, oVar);
            jc0.s sVar = new jc0.s();
            m60.w wVar = this.f71872b;
            wVar.d(sVar);
            jc0.v vVar = new jc0.v(new ji0.b(fVar, new l(this, context)), false, 0L, 30);
            if (wVar.b(jc0.v.class)) {
                wVar.d(vVar);
            } else {
                wVar.e(1L, vVar);
            }
        } else {
            fVar.c(Integer.valueOf(Math.min(33, i13)));
        }
        kk2.l lVar2 = this.f71879i;
        if ((lVar2 == null || !lVar2.isDisposed()) && (lVar = this.f71879i) != null) {
            lVar.dispose();
        }
        oc.c cVar = this.f71874d;
        if (str2 == null || kotlin.text.z.j(str2)) {
            oc.a c13 = cVar.c(new i50.h(str));
            d7.b.E(c13, vc.f.NetworkOnly);
            k13 = com.bumptech.glide.d.u0(c13).k(new t81.a(6, g.f71824k));
        } else {
            oc.a c14 = cVar.c(new i50.p(str, str2));
            d7.b.E(c14, vc.f.NetworkOnly);
            kk2.m k14 = com.bumptech.glide.d.u0(c14).k(new t81.a(7, g.f71825l));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            uj2.a0 a0Var = tk2.e.f118016b;
            ck2.i.b(timeUnit, "unit is null");
            ck2.i.b(a0Var, "scheduler is null");
            k13 = new kk2.e(k14, 1L, timeUnit, a0Var);
        }
        this.f71879i = (kk2.l) k13.r(tk2.e.f118017c).l(wj2.c.a()).o(new x81.h0(4, new ja.a(this, context, oVar, str, i13)), new x81.h0(5, new k(this, context, 0)));
    }

    @Override // nx.a
    public final h32.i0 generateLoggingContext() {
        return new h32.i0(d4.FEED, null, null, null, null, null);
    }

    public final void h(Context context) {
        f1 f1Var;
        h hVar = this.f71877g;
        if (hVar != null) {
            int i13 = i.f71839a[hVar.f71835b.ordinal()];
            if (i13 == 1) {
                f1Var = f1.SHARE_SHEET_DOWNLOAD_EXPORT_FAILED;
            } else if (i13 == 2) {
                f1Var = f1.SHARE_SHEET_IG_STORIES_EXPORT_FAILED;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f1Var = f1.SHARE_SHEET_FB_STORIES_EXPORT_FAILED;
            }
            nx.d0.v(this.f71878h, f1Var, hVar.f71834a, false, 12);
        }
        this.f71871a.i(context.getString(x0.oops_something_went_wrong));
        d(context, true);
    }

    public final void i(Context context, String str, Bundle bundle) {
        h hVar = this.f71877g;
        if (hVar != null) {
            File file = new File(hVar.a());
            Uri parse = Uri.parse(file.getPath());
            Intent intent = new Intent("android.intent.action.SEND");
            Uri B = kg.p.B(context, file, this.f71875e);
            intent.setFlags(1);
            intent.putExtras(bundle);
            intent.putExtra("android.intent.extra.STREAM", B);
            Intrinsics.f(parse);
            String type = context.getContentResolver().getType(parse);
            if (type == null) {
                type = "video/mp4";
            }
            intent.setDataAndType(parse, type);
            intent.setPackage(str);
            context.grantUriPermission(str, B, 1);
            try {
                context.startActivity(intent);
            } catch (Exception e13) {
                this.f71871a.i(e13.getMessage());
            }
        }
    }
}
