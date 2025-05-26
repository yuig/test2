package com.pinterest.nav.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.widget.x;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.u0;
import androidx.fragment.app.w0;
import at1.h;
import bu1.c;
import com.google.firebase.messaging.q;
import df.j1;
import dy.a;
import dy.d;
import h32.d4;
import he0.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.FutureTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import mf0.k;
import qr.e;
import rd.j;
import rg0.y;
import rr.c0;
import rr.d0;
import rr.s0;
import vy.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/nav/fragment/DeepLinkFragment;", "Lnl1/d;", "Lrr/c0;", "Lhe0/b;", "Lat1/h;", "Lnf0/c;", "<init>", "()V", "deepLink_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeepLinkFragment extends c implements c0, b, h, nf0.c {

    /* renamed from: d0, reason: collision with root package name */
    public q f49893d0;

    /* renamed from: e0, reason: collision with root package name */
    public x f49894e0;

    /* renamed from: f0, reason: collision with root package name */
    public tb0.h f49895f0;

    /* renamed from: g0, reason: collision with root package name */
    public x f49896g0;

    /* renamed from: h0, reason: collision with root package name */
    public m f49897h0;

    /* renamed from: i0, reason: collision with root package name */
    public e f49898i0;

    /* renamed from: j0, reason: collision with root package name */
    public j f49899j0;

    /* renamed from: k0, reason: collision with root package name */
    public lu1.b f49900k0;

    /* renamed from: l0, reason: collision with root package name */
    public qr.m f49901l0;

    /* renamed from: m0, reason: collision with root package name */
    public a f49902m0;

    /* renamed from: n0, reason: collision with root package name */
    public d f49903n0;

    /* renamed from: o0, reason: collision with root package name */
    public se2.a f49904o0;

    /* renamed from: p0, reason: collision with root package name */
    public nf0.b f49905p0;

    /* renamed from: q0, reason: collision with root package name */
    public lb0.q f49906q0;

    /* renamed from: r0, reason: collision with root package name */
    public com.pinterest.pushnotification.d f49907r0;

    /* renamed from: s0, reason: collision with root package name */
    public tz1.a f49908s0;

    /* renamed from: t0, reason: collision with root package name */
    public k f49909t0;

    /* renamed from: v0, reason: collision with root package name */
    public Uri f49911v0;

    /* renamed from: w0, reason: collision with root package name */
    public qr.h f49912w0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f49892c0 = d4.DEEP_LINKING;

    /* renamed from: u0, reason: collision with root package name */
    public final bu1.a f49910u0 = new bu1.a(this);

    @Override // he0.b
    public final q R2() {
        q qVar = this.f49893d0;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("graphQLAnalyticsDataSource");
        throw null;
    }

    public final void Y7() {
        x xVar = this.f49896g0;
        if (xVar == null) {
            Intrinsics.r("deepLinkLogging");
            throw null;
        }
        xVar.v("home");
        lu1.b bVar = this.f49900k0;
        if (bVar == null) {
            Intrinsics.r("baseActivityHelper");
            throw null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((lu1.c) bVar).k(requireActivity, false);
        w0 supportFragmentManager = requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.y(new u0(supportFragmentManager, null, -1, 0), false);
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
            tb0.h hVar = this.f49895f0;
            if (hVar != null) {
                hVar.p(e13);
                return null;
            }
            Intrinsics.r("localCrashReporting");
            throw null;
        }
    }

    @Override // he0.b
    public final m getAnalyticsApi() {
        m mVar = this.f49897h0;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.r("analyticsApi");
        throw null;
    }

    @Override // he0.b
    public final Context getApplicationContext() {
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @Override // nf0.c
    public final FragmentActivity getHostActivity() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        return requireActivity;
    }

    @Override // he0.b
    public final Intent getIntent() {
        return requireActivity().getIntent();
    }

    @Override // he0.b
    public final Uri getReferrer() {
        return requireActivity().getReferrer();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF49892c0() {
        return this.f49892c0;
    }

    @Override // bu1.c, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nf0.b bVar = this.f49905p0;
        Unit unit = null;
        if (bVar == null) {
            Intrinsics.r("dialogContainerFactory");
            throw null;
        }
        tb.c cVar = (tb.c) bVar;
        Intrinsics.checkNotNullParameter(this, "dialogHost");
        this.f49909t0 = new k(this, (w) cVar.f116959a, (tb0.h) cVar.f116960b);
        LayoutInflater.Factory requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        if (!(requireActivity instanceof us1.a)) {
            throw new IllegalStateException("DeepLinkFragment must be attached to a DeeplinkActivity");
        }
        us1.a aVar = (us1.a) requireActivity;
        Intent intent = getIntent();
        if (intent != null) {
            if (nl.b.j(intent)) {
                lu1.b bVar2 = this.f49900k0;
                if (bVar2 == null) {
                    Intrinsics.r("baseActivityHelper");
                    throw null;
                }
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                Intent d2 = ((lu1.c) bVar2).d(requireContext);
                d2.putExtra("destination_intent", intent);
                startActivity(d2);
                w0 supportFragmentManager = requireActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                supportFragmentManager.y(new u0(supportFragmentManager, null, -1, 0), false);
                return;
            }
            a aVar2 = this.f49902m0;
            if (aVar2 == null) {
                Intrinsics.r("appsFlyerManager");
                throw null;
            }
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            aVar2.a(requireContext2, true);
            d dVar = this.f49903n0;
            if (dVar == null) {
                Intrinsics.r("firebaseAnalyticsEvents");
                throw null;
            }
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            dVar.a(requireContext3, true);
            if (dl2.b.y1()) {
                se2.a aVar3 = this.f49904o0;
                if (aVar3 == null) {
                    Intrinsics.r("samsungMAPSManager");
                    throw null;
                }
                Object obj = ((bf2.b) aVar3).get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Context requireContext4 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                wy.a.a((wy.a) obj, requireContext4);
            }
            qr.m mVar = this.f49901l0;
            if (mVar == null) {
                Intrinsics.r("factory");
                throw null;
            }
            this.f49912w0 = mVar.a(aVar, this);
            int intExtra = intent.getIntExtra("com.pinterest.EXTRA_NOTIFICATION_ID", 0);
            if (intExtra != 0) {
                tz1.a aVar4 = this.f49908s0;
                if (aVar4 == null) {
                    Intrinsics.r("localNotificationHelper");
                    throw null;
                }
                aVar4.a(intExtra);
            }
            Uri data = intent.getData();
            if (data != null) {
                s(data, intent.getExtras());
                unit = Unit.f80348a;
            }
            if (unit == null) {
                Y7();
            }
        }
    }

    @Override // at1.h
    public final boolean onResourcesError(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return false;
    }

    @Override // at1.h
    public final void onResourcesReady(int i13) {
        Uri uri = this.f49911v0;
        if (uri == null) {
            Intrinsics.r("uriProcessed");
            throw null;
        }
        qr.h hVar = this.f49912w0;
        if (hVar == null) {
            Intrinsics.r("webhookDeepLinkUtil");
            throw null;
        }
        j jVar = this.f49899j0;
        if (jVar == null) {
            Intrinsics.r("inviteCodeRedeemer");
            throw null;
        }
        s0 s0Var = new s0(hVar, jVar, getAnalyticsApi());
        if (s0Var.e(uri)) {
            s0Var.d(uri);
        }
        e eVar = this.f49898i0;
        if (eVar == null) {
            Intrinsics.r("deeplinkHandlersInitializer");
            throw null;
        }
        qr.h hVar2 = this.f49912w0;
        if (hVar2 == null) {
            Intrinsics.r("webhookDeepLinkUtil");
            throw null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Iterator it = eVar.a(hVar2, requireActivity).iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            if (d0Var.f(uri)) {
                Intent intent = getIntent();
                d0Var.f109726d = intent != null ? intent.getStringExtra("analytics_extra") : null;
                Intent intent2 = getIntent();
                Serializable serializableExtra = intent2 != null ? intent2.getSerializableExtra("analytics_map_extra") : null;
                d0Var.f109727e = serializableExtra instanceof HashMap ? (HashMap) serializableExtra : null;
                d0Var.d(uri);
                tb0.h hVar3 = this.f49895f0;
                if (hVar3 == null) {
                    Intrinsics.r("localCrashReporting");
                    throw null;
                }
                String str = Intrinsics.d(b(), "PUSH_NOTIF") ? "push_surface_type" : "deeplink_surface_type";
                tb0.k kVar = new tb0.k();
                String simpleName = d0Var.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                kVar.c("handler", simpleName);
                hVar3.k(str, kVar.f117102a);
                return;
            }
        }
        dh0.d dVar = (dh0.d) y.a();
        HashMap hashMap = dVar.f54988g;
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
        lb0.q qVar = this.f49906q0;
        if (qVar == null) {
            Intrinsics.r("prefsManagerPersisted");
            throw null;
        }
        hashMap.putAll(dl2.b.k0(requireActivity2, qVar));
        dVar.f();
        if (uri.getPathSegments().isEmpty()) {
            d7.b.C(this, uri);
        }
        if (j1.f1(uri)) {
            s(dl2.b.M(uri), null);
        } else {
            Y7();
        }
        x xVar = this.f49896g0;
        if (xVar != null) {
            xVar.v("others");
        } else {
            Intrinsics.r("deepLinkLogging");
            throw null;
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
    }

    @Override // he0.b
    public final he0.a p3() {
        return this.f49910u0;
    }

    @Override // rr.c0
    public final void s(Uri uri, Bundle bundle) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!v5()) {
            x xVar = this.f49896g0;
            if (xVar == null) {
                Intrinsics.r("deepLinkLogging");
                throw null;
            }
            FragmentActivity requireActivity = requireActivity();
            new Thread(new FutureTask(new je0.a(xVar, requireActivity, b(), requireActivity.getIntent().getData(), ((b60.d) getActiveUserManager()).i()))).start();
            xVar.v("start");
            String b13 = b();
            com.pinterest.pushnotification.d dVar = this.f49907r0;
            if (dVar == null) {
                Intrinsics.r("gcmRegistrationPreferences");
                throw null;
            }
            d7.b.u0(this, b13, ((b20.c) dVar).n());
            qr.h hVar = this.f49912w0;
            if (hVar == null) {
                Intrinsics.r("webhookDeepLinkUtil");
                throw null;
            }
            hVar.f104945f.f115050b.b();
        }
        k kVar = this.f49909t0;
        if (kVar == null) {
            Intrinsics.r("dialogContainer");
            throw null;
        }
        kVar.b();
        if (!j1.H0(true, uri)) {
            w0 supportFragmentManager = requireActivity().getSupportFragmentManager();
            supportFragmentManager.getClass();
            supportFragmentManager.y(new u0(supportFragmentManager, null, -1, 0), false);
            return;
        }
        d7.b.o0(this, uri, String.valueOf(b()));
        x xVar2 = this.f49894e0;
        if (xVar2 == null) {
            Intrinsics.r("socialConnectManager");
            throw null;
        }
        xVar2.q(uri);
        x xVar3 = this.f49894e0;
        if (xVar3 == null) {
            Intrinsics.r("socialConnectManager");
            throw null;
        }
        xVar3.p(uri);
        this.f49911v0 = uri;
        int i13 = at1.d.f20439o;
        nl.b.f().a(1, this, false);
    }
}
