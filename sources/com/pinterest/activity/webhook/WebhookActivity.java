package com.pinterest.activity.webhook;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.x;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.q;
import com.pinterest.pushnotification.d;
import df.j1;
import h32.a4;
import h32.d4;
import he0.b;
import he0.c;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.FutureTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import me.o;
import qr.e;
import qr.h;
import qr.i;
import qr.m;
import rd.j;
import rg0.y;
import rr.c0;
import rr.d0;
import rr.s0;
import tb0.k;
import us1.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/pinterest/activity/webhook/WebhookActivity;", "Lqr/i;", "Lrr/c0;", "Lhe0/b;", "Lus1/a;", "<init>", "()V", "deepLink_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GoogleAppIndexingApiWarning"})
/* loaded from: classes.dex */
public final class WebhookActivity extends i implements c0, b, a {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f35241v = 0;

    /* renamed from: b, reason: collision with root package name */
    public Uri f35242b;

    /* renamed from: c, reason: collision with root package name */
    public so1.a f35243c;

    /* renamed from: d, reason: collision with root package name */
    public h f35244d;

    /* renamed from: e, reason: collision with root package name */
    public q f35245e;

    /* renamed from: f, reason: collision with root package name */
    public lu1.b f35246f;

    /* renamed from: g, reason: collision with root package name */
    public x f35247g;

    /* renamed from: h, reason: collision with root package name */
    public dy.a f35248h;

    /* renamed from: i, reason: collision with root package name */
    public m f35249i;

    /* renamed from: j, reason: collision with root package name */
    public x f35250j;

    /* renamed from: k, reason: collision with root package name */
    public tb0.h f35251k;

    /* renamed from: l, reason: collision with root package name */
    public e f35252l;

    /* renamed from: m, reason: collision with root package name */
    public se2.a f35253m;

    /* renamed from: n, reason: collision with root package name */
    public j f35254n;

    /* renamed from: o, reason: collision with root package name */
    public lb0.q f35255o;

    /* renamed from: p, reason: collision with root package name */
    public d f35256p;

    /* renamed from: q, reason: collision with root package name */
    public tz1.a f35257q;

    /* renamed from: r, reason: collision with root package name */
    public se2.a f35258r;

    /* renamed from: s, reason: collision with root package name */
    public final d4 f35259s = d4.DEEP_LINKING;

    /* renamed from: t, reason: collision with root package name */
    public final a4 f35260t = a4.DEEP_LINKING_APP;

    /* renamed from: u, reason: collision with root package name */
    public final qr.j f35261u = new qr.j(this);

    @Override // he0.b
    public final q R2() {
        q qVar = this.f35245e;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("graphQLAnalyticsDataSource");
        throw null;
    }

    @Override // he0.b
    public final String b() {
        try {
            Intent intent = getIntent();
            if (intent != null) {
                return intent.getStringExtra("com.pinterest.EXTRA_SOURCE");
            }
            return null;
        } catch (Exception e13) {
            b6().p(e13);
            return null;
        }
    }

    @Override // he0.b
    public final tb0.h b6() {
        tb0.h hVar = this.f35251k;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("crashReporting");
        throw null;
    }

    @Override // cp1.p, uo1.a
    public final so1.a getBaseActivityComponent() {
        so1.a aVar = this.f35243c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    public final lu1.b getBaseActivityHelper() {
        lu1.b bVar = this.f35246f;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("baseActivityHelper");
        throw null;
    }

    @Override // us1.a
    public final Activity getContext() {
        return this;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return getSupportFragmentManager().E(c.fragment_wrapper);
    }

    @Override // cp1.p, uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF35260t() {
        return this.f35260t;
    }

    @Override // uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF35259s() {
        return this.f35259s;
    }

    @Override // us1.a
    public final boolean i() {
        return b() != null;
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Unit unit;
        inject();
        super.onCreate(bundle);
        if (l0.f82618a) {
            tk2.e.f118017c.b(new androidx.activity.d(this, 25));
        }
        Intent intent = getIntent();
        if (intent != null) {
            if (nl.b.j(intent)) {
                Intent d2 = ((lu1.c) getBaseActivityHelper()).d(this);
                d2.putExtra("destination_intent", intent);
                startActivity(d2);
                finish();
                return;
            }
            dy.a aVar = this.f35248h;
            if (aVar == null) {
                Intrinsics.r("appsFlyerManager");
                throw null;
            }
            aVar.a(this, true);
            if (dl2.b.y1()) {
                Object obj = ((bf2.b) y()).get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                wy.a.a((wy.a) obj, this);
            }
            m mVar = this.f35249i;
            if (mVar == null) {
                Intrinsics.r("factory");
                throw null;
            }
            this.f35244d = mVar.a(this, this);
            int intExtra = intent.getIntExtra("com.pinterest.EXTRA_NOTIFICATION_ID", 0);
            if (intExtra != 0) {
                x().a(intExtra);
            }
            Uri data = intent.getData();
            if (data != null) {
                s(data, null);
                unit = Unit.f80348a;
            } else {
                unit = null;
            }
            if (unit == null) {
                Intrinsics.checkNotNullParameter(this, "<this>");
                x xVar = this.f35247g;
                if (xVar == null) {
                    Intrinsics.r("deepLinkLogging");
                    throw null;
                }
                xVar.v("home");
                ((lu1.c) getBaseActivityHelper()).k(this, false);
                finish();
            }
            if (intent.getBooleanExtra("force_finish_after_create", false)) {
                finish();
            }
        }
    }

    @Override // cp1.p, cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        h hVar = this.f35244d;
        if (hVar != null) {
            if (hVar != null) {
                hVar.clear();
            } else {
                Intrinsics.r("webhookDeepLinkUtil");
                throw null;
            }
        }
    }

    @Override // androidx.activity.o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // cp1.p, at1.h
    public final void onResourcesReady(int i13) {
        Uri uri = this.f35242b;
        if (uri == null) {
            Intrinsics.r("uriProcessed");
            throw null;
        }
        h hVar = this.f35244d;
        if (hVar == null) {
            Intrinsics.r("webhookDeepLinkUtil");
            throw null;
        }
        j jVar = this.f35254n;
        if (jVar == null) {
            Intrinsics.r("inviteCodeRedeemer");
            throw null;
        }
        s0 s0Var = new s0(hVar, jVar, getAnalyticsApi());
        if (s0Var.e(uri)) {
            s0Var.d(uri);
        }
        e eVar = this.f35252l;
        if (eVar == null) {
            Intrinsics.r("deeplinkHandlersInitializer");
            throw null;
        }
        h hVar2 = this.f35244d;
        if (hVar2 == null) {
            Intrinsics.r("webhookDeepLinkUtil");
            throw null;
        }
        Iterator it = eVar.a(hVar2, this).iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            if (d0Var.f(uri)) {
                Intent intent = getIntent();
                d0Var.f109726d = intent != null ? intent.getStringExtra("analytics_extra") : null;
                Intent intent2 = getIntent();
                Serializable serializableExtra = intent2 != null ? intent2.getSerializableExtra("analytics_map_extra") : null;
                d0Var.f109727e = serializableExtra instanceof HashMap ? (HashMap) serializableExtra : null;
                d0Var.d(uri);
                tb0.h b63 = b6();
                String str = Intrinsics.d(b(), "PUSH_NOTIF") ? "push_surface_type" : "deeplink_surface_type";
                k kVar = new k();
                String simpleName = d0Var.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                kVar.c("handler", simpleName);
                b63.k(str, kVar.f117102a);
                return;
            }
        }
        dh0.d dVar = (dh0.d) y.a();
        HashMap hashMap = dVar.f54988g;
        lb0.q qVar = this.f35255o;
        if (qVar == null) {
            Intrinsics.r("prefsManagerPersisted");
            throw null;
        }
        hashMap.putAll(dl2.b.k0(this, qVar));
        dVar.f();
        if (uri.getPathSegments().isEmpty()) {
            d7.b.C(this, uri);
        }
        if (j1.f1(uri)) {
            s(dl2.b.M(uri), null);
        } else {
            Intrinsics.checkNotNullParameter(this, "<this>");
            x xVar = this.f35247g;
            if (xVar == null) {
                Intrinsics.r("deepLinkLogging");
                throw null;
            }
            xVar.v("home");
            ((lu1.c) getBaseActivityHelper()).k(this, false);
            finish();
        }
        x xVar2 = this.f35247g;
        if (xVar2 != null) {
            xVar2.v("others");
        } else {
            Intrinsics.r("deepLinkLogging");
            throw null;
        }
    }

    @Override // he0.b
    public final he0.a p3() {
        return this.f35261u;
    }

    @Override // rr.c0
    public final void s(Uri uri, Bundle bundle) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!v5()) {
            x xVar = this.f35247g;
            if (xVar == null) {
                Intrinsics.r("deepLinkLogging");
                throw null;
            }
            new Thread(new FutureTask(new je0.a(xVar, this, b(), getIntent().getData(), ((b60.d) getActiveUserManager()).i()))).start();
            xVar.v("start");
            String b13 = b();
            d dVar = this.f35256p;
            if (dVar == null) {
                Intrinsics.r("gcmRegistrationPreferences");
                throw null;
            }
            d7.b.u0(this, b13, ((b20.c) dVar).n());
            h hVar = this.f35244d;
            if (hVar == null) {
                Intrinsics.r("webhookDeepLinkUtil");
                throw null;
            }
            hVar.f104945f.f115050b.b();
        }
        ((mf0.k) getDialogContainer()).b();
        if (!j1.H0(true, uri)) {
            finish();
            return;
        }
        d7.b.o0(this, uri, String.valueOf(b()));
        x xVar2 = this.f35250j;
        if (xVar2 == null) {
            Intrinsics.r("socialConnectManager");
            throw null;
        }
        xVar2.q(uri);
        x xVar3 = this.f35250j;
        if (xVar3 == null) {
            Intrinsics.r("socialConnectManager");
            throw null;
        }
        xVar3.p(uri);
        this.f35242b = uri;
        ensureResources(1);
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        this.f35243c = (so1.a) o.a(this, so1.a.class);
    }

    public final tz1.a x() {
        tz1.a aVar = this.f35257q;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("localNotificationHelper");
        throw null;
    }

    public final se2.a y() {
        se2.a aVar = this.f35253m;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("samsungMAPSManager");
        throw null;
    }
}
