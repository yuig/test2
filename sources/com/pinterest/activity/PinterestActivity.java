package com.pinterest.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.a0;
import at1.h;
import com.android.installreferrer.api.InstallReferrerClient;
import com.pinterest.activity.PinterestActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dy.d;
import ey.b0;
import ey.j3;
import ey.t4;
import ey.x4;
import fl.q;
import hs1.r;
import hs1.t;
import java.util.HashMap;
import je0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lh0.g1;
import lh0.n1;
import lh0.y0;
import lh0.z0;
import lu1.c;
import m60.w;
import ny.o;
import ny.o0;
import rg0.s;
import s92.l;
import se2.a;
import vo.g;
import vo.k;
import vo.n;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/pinterest/activity/PinterestActivity;", "Lvo/g;", "Lat1/h;", "<init>", "()V", "com/facebook/login/z", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PinterestActivity extends g implements h {
    public static final /* synthetic */ int D = 0;
    public final v A;
    public boolean B;
    public final n C;

    /* renamed from: f, reason: collision with root package name */
    public n1 f34813f;

    /* renamed from: g, reason: collision with root package name */
    public a f34814g;

    /* renamed from: h, reason: collision with root package name */
    public w f34815h;

    /* renamed from: i, reason: collision with root package name */
    public g1 f34816i;

    /* renamed from: j, reason: collision with root package name */
    public b f34817j;

    /* renamed from: k, reason: collision with root package name */
    public a f34818k;

    /* renamed from: l, reason: collision with root package name */
    public dy.a f34819l;

    /* renamed from: m, reason: collision with root package name */
    public a f34820m;

    /* renamed from: n, reason: collision with root package name */
    public a f34821n;

    /* renamed from: o, reason: collision with root package name */
    public d f34822o;

    /* renamed from: p, reason: collision with root package name */
    public a f34823p;

    /* renamed from: q, reason: collision with root package name */
    public a f34824q;

    /* renamed from: r, reason: collision with root package name */
    public b60.b f34825r;

    /* renamed from: s, reason: collision with root package name */
    public s f34826s;

    /* renamed from: t, reason: collision with root package name */
    public a f34827t;

    /* renamed from: u, reason: collision with root package name */
    public a f34828u;

    /* renamed from: v, reason: collision with root package name */
    public a f34829v;

    /* renamed from: w, reason: collision with root package name */
    public g92.g f34830w;

    /* renamed from: x, reason: collision with root package name */
    public a f34831x;

    /* renamed from: y, reason: collision with root package name */
    public a f34832y;

    /* renamed from: z, reason: collision with root package name */
    public a f34833z;

    public PinterestActivity() {
        super(1);
        this.A = m.b(new a0(this, 28));
        this.C = new n(this);
        boolean z13 = !nl.b.j(getIntent());
        new o0(18, 0).i();
        if (z13) {
            new o(l.WARM_START, false).i();
            new ny.n(8, 0).i();
            if (j3.f60516g) {
                n1 c13 = n1.f83436b.c();
                Intrinsics.checkNotNullParameter("warmstartconnectionwarmup", "keyWord");
                z0.f83518a.getClass();
                String h10 = ((g1) c13.f83439a).h("android_cronet_client_for_images", y0.f83512b);
                if (h10 == null || !((z.p(h10, "enabled", false) || z.p(h10, "employee", false)) && StringsKt.E(h10, "warmstartconnectionwarmup", false))) {
                    ((r) t.a()).g(false);
                } else {
                    ((r) t.a()).g(true);
                }
            }
        }
    }

    public final w getEventManager() {
        w wVar = this.f34815h;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    public final void init() {
        new vo.o(this).b();
        int i13 = at1.d.f20439o;
        nl.b.f().a(1, this, false);
    }

    @Override // vo.g, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        inject();
        int i13 = 1;
        boolean z13 = !pk.a0.l1();
        g92.g gVar = this.f34830w;
        if (gVar == null) {
            Intrinsics.r("themeProvider");
            throw null;
        }
        int i14 = 0;
        g92.g.a(gVar, this, false, z13, 2);
        if (z13) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            n5.n mVar = Build.VERSION.SDK_INT >= 31 ? new n5.m(this) : new n5.n(this);
            mVar.a();
            q condition = new q(19);
            Intrinsics.checkNotNullParameter(condition, "condition");
            mVar.b(condition);
        }
        super.onCreate(bundle);
        if (nl.b.j(getIntent())) {
            startActivity(((c) ((lu1.b) ((bf2.b) q()).get())).d(this));
            finish();
            return;
        }
        dy.a aVar = this.f34819l;
        if (aVar == null) {
            Intrinsics.r("appsFlyerManager");
            throw null;
        }
        aVar.a(this, false);
        d dVar = this.f34822o;
        if (dVar == null) {
            Intrinsics.r("firebaseAnalyticsEvents");
            throw null;
        }
        dVar.a(this, false);
        if (dl2.b.y1()) {
            Object obj = ((bf2.b) v()).get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            wy.a.a((wy.a) obj, this);
        }
        this.B = getIntent().getBooleanExtra("com.pinterest.EXTRA_POST_SIGNED_UP", false);
        b bVar = this.f34817j;
        if (bVar == null) {
            Intrinsics.r("deepLinkManager");
            throw null;
        }
        je0.d dVar2 = new je0.d((vy.m) bVar.f75837c.get());
        if (((lb0.b) dVar2.f75839a).e("PREF_FIRST_LAUNCH", true)) {
            dVar2.b(null, "play_store_connection_init");
            InstallReferrerClient build = InstallReferrerClient.newBuilder(getApplicationContext()).build();
            dVar2.f75841c = build;
            build.startConnection(new je0.c(dVar2));
        }
        if (((lb0.b) bVar.f75836b).e("PREF_FIRST_LAUNCH", true)) {
            b.b(this);
        }
        a aVar2 = this.f34828u;
        if (aVar2 == null) {
            Intrinsics.r("prefsManagerPersisted");
            throw null;
        }
        if (((lb0.q) ((bf2.b) aVar2).get()).f("PREF_FIRST_LAUNCH", true)) {
            new vo.q(this).d(15000L);
        }
        new x4(new k(this, i14), b0.TAG_PINTEREST_ACTIVITY_CREATE_TASKS, true).c();
        if (((Boolean) this.A.getValue()).booleanValue()) {
            new t4(RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0L, b0.TAG_LOG_ENTRY_POINT, new k(this, i13), true, true, false, false).c();
        }
    }

    @Override // androidx.activity.o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // at1.h
    public final boolean onResourcesError(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return false;
    }

    @Override // at1.h
    public final void onResourcesReady(int i13) {
        new ny.q(9, 0).i();
        a aVar = this.f34821n;
        if (aVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        vy.m mVar = (vy.m) ((bf2.b) aVar).get();
        int i14 = 3;
        if (j3.f60516g) {
            Intrinsics.f(mVar);
            mVar.k("android.app_start.warm", vy.m.c(mVar, null, null, 3));
        } else {
            Intrinsics.f(mVar);
            mVar.k("android.app_start.cold", vy.m.c(mVar, null, null, 3));
        }
        b60.b bVar = this.f34825r;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        if (((b60.d) bVar).i()) {
            final long currentTimeMillis = System.currentTimeMillis();
            s sVar = this.f34826s;
            if (sVar == null) {
                Intrinsics.r("experiences");
                throw null;
            }
            HashMap hashMap = ((dh0.d) sVar).f54988g;
            a aVar2 = this.f34828u;
            if (aVar2 == null) {
                Intrinsics.r("prefsManagerPersisted");
                throw null;
            }
            Object obj = ((bf2.b) aVar2).get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            hashMap.putAll(dl2.b.k0(this, (lb0.q) obj));
            s sVar2 = this.f34826s;
            if (sVar2 == null) {
                Intrinsics.r("experiences");
                throw null;
            }
            ((dh0.d) sVar2).f();
            new x4(new Runnable() { // from class: vo.l
                @Override // java.lang.Runnable
                public final void run() {
                    int i15 = PinterestActivity.D;
                    PinterestActivity this$0 = PinterestActivity.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    se2.a aVar3 = this$0.f34831x;
                    if (aVar3 == null) {
                        Intrinsics.r("appBadgeUtils");
                        throw null;
                    }
                    s50.a aVar4 = (s50.a) ((bf2.b) aVar3).get();
                    Context baseContext = this$0.getBaseContext();
                    if (baseContext == null) {
                        aVar4.getClass();
                        throw new NullPointerException("the context cannot be null!");
                    }
                    aVar4.c(baseContext, 0);
                    String str = fp1.d.f62784a;
                    lb0.b bVar2 = (lb0.b) lb0.n.f82722a.a();
                    if (bVar2.e("ARater__DONT_SHOW", false)) {
                        return;
                    }
                    lb0.m c13 = bVar2.c();
                    c13.putLong("ARater__LAUNCHES", bVar2.g("ARater__LAUNCHES", 0L) + 1);
                    if (bVar2.g("ARater__LAUNCH_DATE", 0L) == 0) {
                        c13.putLong("ARater__LAUNCH_DATE", currentTimeMillis);
                    }
                    c13.apply();
                }
            }, b0.TAG_DELAYED_AUTHED_USER_STARTUP_TASKS, false).c();
            new t4(48, b0.TAG_RECAPTCHA_FOR_AUTH, new vo.m(0, new k(this, 2)), true, true).c();
            new t4(48, b0.TAG_INTEGRITY_CHECK_TASKS, new k(this, i14), false, true).c();
            if (this.B) {
                s sVar3 = this.f34826s;
                if (sVar3 == null) {
                    Intrinsics.r("experiences");
                    throw null;
                }
                ((m60.d) ((dh0.d) sVar3).f54987f).g();
            } else {
                ((c) ((lu1.b) ((bf2.b) q()).get())).k(this, false);
                finish();
            }
        } else {
            ((c) ((lu1.b) ((bf2.b) q()).get())).q(this, null);
            finish();
        }
        new ny.r(9, 0).i();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onStart() {
        /*
            r4 = this;
            super.onStart()
            boolean r0 = r4.isTaskRoot()
            r1 = 0
            if (r0 != 0) goto L26
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r2 = r0.getAction()
            java.lang.String r3 = "android.intent.category.LAUNCHER"
            boolean r0 = r0.hasCategory(r3)
            if (r0 == 0) goto L26
            java.lang.String r0 = "android.intent.action.MAIN"
            boolean r0 = kotlin.text.z.i(r2, r0, r1)
            if (r0 == 0) goto L26
            r4.finish()
            goto L29
        L26:
            r4.init()
        L29:
            boolean r0 = r4.B
            if (r0 == 0) goto L36
            m60.w r0 = r4.getEventManager()
            vo.n r2 = r4.C
            r0.h(r2)
        L36:
            android.content.res.Resources r0 = r4.getResources()
            as1.d.b(r0)
            r0 = 0
            as1.b.f20420j = r0
            ny.p0 r0 = new ny.p0
            r2 = 18
            r0.<init>(r2, r1)
            r0.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.PinterestActivity.onStart():void");
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (this.B) {
            getEventManager().j(this.C);
        }
    }

    public final a q() {
        a aVar = this.f34814g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("baseActivityHelper");
        throw null;
    }

    public final a t() {
        a aVar = this.f34833z;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("powerScoreManager");
        throw null;
    }

    public final a u() {
        a aVar = this.f34829v;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("prefsManagerUser");
        throw null;
    }

    public final a v() {
        a aVar = this.f34820m;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("samsungMAPSManager");
        throw null;
    }
}
