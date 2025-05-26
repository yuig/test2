package com.pinterest.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import ck2.i;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import ff0.j;
import g92.a;
import g92.d;
import g92.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kh2.s0;
import kk2.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import m60.t0;
import m60.v0;
import m60.w;
import nm.p;
import uj2.a0;
import vo.b;
import vo.c;
import vo.g;
import vy.m;
import xj2.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/pinterest/activity/ExperimentsReloaderActivity;", "Landroidx/appcompat/app/n;", "<init>", "()V", "kp/n", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ExperimentsReloaderActivity extends g {

    /* renamed from: k, reason: collision with root package name */
    public static final long f34799k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f34800l = 0;

    /* renamed from: f, reason: collision with root package name */
    public g1 f34801f;

    /* renamed from: g, reason: collision with root package name */
    public w f34802g;

    /* renamed from: h, reason: collision with root package name */
    public m f34803h;

    /* renamed from: i, reason: collision with root package name */
    public final b f34804i;

    /* renamed from: j, reason: collision with root package name */
    public AtomicReference f34805j;

    static {
        f34799k = j.f62104b ? 10L : 5L;
    }

    public ExperimentsReloaderActivity() {
        super(0);
        this.f34804i = new b(this);
        e eVar = new e(i.f27922b);
        Intrinsics.checkNotNullExpressionValue(eVar, "empty(...)");
        this.f34805j = eVar;
    }

    public static final void q(ExperimentsReloaderActivity experimentsReloaderActivity) {
        Intent intent = experimentsReloaderActivity.getIntent();
        Intent intent2 = intent != null ? (Intent) intent.getParcelableExtra("destination_intent") : null;
        Intent intent3 = intent2 instanceof Intent ? intent2 : null;
        if (intent3 == null) {
            intent3 = new Intent(experimentsReloaderActivity, (Class<?>) PinterestActivity.class);
        }
        intent3.putExtra("experiments_reload_attempted", true);
        experimentsReloaderActivity.startActivity(intent3);
        experimentsReloaderActivity.finish();
    }

    @Override // vo.g, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h.a(this, d.VR, a.MAIN, false);
        setContentView(v0.activity_experiments_reloader);
        GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById(t0.activity_experiments_reloader_spinner);
        Intrinsics.f(gestaltSpinner);
        s0.w(gestaltSpinner, c.f126355i);
        w wVar = this.f34802g;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.h(this.f34804i);
        g1 g1Var = this.f34801f;
        if (g1Var == null) {
            Intrinsics.r("experimentsManager");
            throw null;
        }
        g1Var.n();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a0 a0Var = tk2.e.f118016b;
        i.b(timeUnit, "unit is null");
        i.b(a0Var, "scheduler is null");
        Object o13 = new y(f34799k, timeUnit, a0Var).l(wj2.c.a()).o(new vo.a(0, new vo.d(this, 0)), new vo.a(1, new vo.d(this, 1)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        this.f34805j = (AtomicReference) o13;
        nl.b.f91207a = true;
        Pair pair = new Pair("app", hf0.b.a().name());
        ((m60.d) m60.d.a()).b();
        HashMap f13 = z0.f(pair, new Pair("app_version", String.valueOf(13198010)), new Pair("os_version", Build.VERSION.RELEASE));
        HashMap hashMap = new HashMap();
        hashMap.put("aux_data", new p().a().k(z0.f(new Pair("tags", f13))));
        m mVar = this.f34803h;
        if (mVar == null) {
            Intrinsics.r("_analyticsApi");
            throw null;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        mVar.l("android.app_launch_delayed", unmodifiableMap);
        new ny.c(8, 0).i();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    @Override // vo.g, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        w wVar = this.f34802g;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.f34804i);
        this.f34805j.dispose();
        super.onDestroy();
    }
}
