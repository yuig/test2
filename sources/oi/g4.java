package oi;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class g4 extends c5 {

    /* renamed from: y, reason: collision with root package name */
    public static final Pair f94767y = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f94768c;

    /* renamed from: d, reason: collision with root package name */
    public a1.d f94769d;

    /* renamed from: e, reason: collision with root package name */
    public final h4 f94770e;

    /* renamed from: f, reason: collision with root package name */
    public final e2.g0 f94771f;

    /* renamed from: g, reason: collision with root package name */
    public String f94772g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f94773h;

    /* renamed from: i, reason: collision with root package name */
    public long f94774i;

    /* renamed from: j, reason: collision with root package name */
    public final h4 f94775j;

    /* renamed from: k, reason: collision with root package name */
    public final qr1.u f94776k;

    /* renamed from: l, reason: collision with root package name */
    public final e2.g0 f94777l;

    /* renamed from: m, reason: collision with root package name */
    public final m.h f94778m;

    /* renamed from: n, reason: collision with root package name */
    public final qr1.u f94779n;

    /* renamed from: o, reason: collision with root package name */
    public final h4 f94780o;

    /* renamed from: p, reason: collision with root package name */
    public final h4 f94781p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f94782q;

    /* renamed from: r, reason: collision with root package name */
    public final qr1.u f94783r;

    /* renamed from: s, reason: collision with root package name */
    public final qr1.u f94784s;

    /* renamed from: t, reason: collision with root package name */
    public final h4 f94785t;

    /* renamed from: u, reason: collision with root package name */
    public final e2.g0 f94786u;

    /* renamed from: v, reason: collision with root package name */
    public final e2.g0 f94787v;

    /* renamed from: w, reason: collision with root package name */
    public final h4 f94788w;

    /* renamed from: x, reason: collision with root package name */
    public final m.h f94789x;

    public g4(u4 u4Var) {
        super(u4Var);
        this.f94775j = new h4(this, "session_timeout", 1800000L);
        this.f94776k = new qr1.u(this, "start_new_session", true);
        this.f94780o = new h4(this, "last_pause_time", 0L);
        this.f94781p = new h4(this, "session_id", 0L);
        this.f94777l = new e2.g0(this, "non_personalized_ads");
        this.f94778m = new m.h(this, "last_received_uri_timestamps_by_source");
        this.f94779n = new qr1.u(this, "allow_remote_dynamite", false);
        this.f94770e = new h4(this, "first_open_time", 0L);
        com.bumptech.glide.d.o("app_install_time");
        this.f94771f = new e2.g0(this, "app_instance_id");
        this.f94783r = new qr1.u(this, "app_backgrounded", false);
        this.f94784s = new qr1.u(this, "deep_link_retrieval_complete", false);
        this.f94785t = new h4(this, "deep_link_retrieval_attempts", 0L);
        this.f94786u = new e2.g0(this, "firebase_feature_rollouts");
        this.f94787v = new e2.g0(this, "deferred_attribution_cache");
        this.f94788w = new h4(this, "deferred_attribution_cache_timestamp", 0L);
        this.f94789x = new m.h(this, "default_event_parameters");
    }

    @Override // oi.c5
    public final boolean s() {
        return true;
    }

    public final boolean t(int i13) {
        int i14 = w().getInt("consent_source", 100);
        g5 g5Var = g5.f94790c;
        return i13 <= i14;
    }

    public final boolean u(long j13) {
        return j13 - this.f94775j.a() > this.f94780o.a();
    }

    public final void v(boolean z13) {
        p();
        y3 zzj = zzj();
        zzj.f95276n.b(Boolean.valueOf(z13), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = w().edit();
        edit.putBoolean("deferred_analytics_collection", z13);
        edit.apply();
    }

    public final SharedPreferences w() {
        p();
        q();
        com.bumptech.glide.d.t(this.f94768c);
        return this.f94768c;
    }

    public final SparseArray x() {
        Bundle N = this.f94778m.N();
        if (N == null) {
            return new SparseArray();
        }
        int[] intArray = N.getIntArray("uriSources");
        long[] longArray = N.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            zzj().f95268f.c("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i13 = 0; i13 < intArray.length; i13++) {
            sparseArray.put(intArray[i13], Long.valueOf(longArray[i13]));
        }
        return sparseArray;
    }

    public final g5 y() {
        p();
        return g5.c(w().getInt("consent_source", 100), w().getString("consent_settings", "G1"));
    }

    public final void z() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f94768c = sharedPreferences;
        boolean z13 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f94782q = z13;
        if (!z13) {
            SharedPreferences.Editor edit = this.f94768c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f94769d = new a1.d(this, Math.max(0L, ((Long) s.f95093d.a(null)).longValue()));
    }
}
