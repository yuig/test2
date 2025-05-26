package oi;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzad;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zznc;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f94970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k5 f94971c;

    public /* synthetic */ n5(k5 k5Var, Bundle bundle, int i13) {
        this.f94969a = i13;
        this.f94971c = k5Var;
        this.f94970b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = this.f94970b;
        k5 k5Var = this.f94971c;
        switch (this.f94969a) {
            case 0:
                if (bundle != null) {
                    Bundle N = k5Var.n().f94789x.N();
                    Iterator<String> it = bundle.keySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        bb.p pVar = k5Var.f94920q;
                        if (!hasNext) {
                            k5Var.o();
                            int i13 = k5Var.l().o().e0(201500000) ? 100 : 25;
                            if (N.size() > i13) {
                                Iterator it2 = new TreeSet(N.keySet()).iterator();
                                int i14 = 0;
                                while (it2.hasNext()) {
                                    String str = (String) it2.next();
                                    i14++;
                                    if (i14 > i13) {
                                        N.remove(str);
                                    }
                                }
                                k5Var.o();
                                f7.S(pVar, null, 26, null, null, 0);
                                k5Var.zzj().f95273k.c("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                            k5Var.n().f94789x.T(N);
                            d6 u13 = k5Var.u();
                            u13.p();
                            u13.w();
                            u13.A(new s.f(u13, u13.L(false), N, 16));
                            break;
                        } else {
                            String next = it.next();
                            Object obj = bundle.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                k5Var.o();
                                if (f7.X(obj)) {
                                    k5Var.o();
                                    f7.S(pVar, null, 27, null, null, 0);
                                }
                                k5Var.zzj().f95273k.a(next, obj, "Invalid default event parameter type. Name, value");
                            } else if (f7.s0(next)) {
                                k5Var.zzj().f95273k.b(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                N.remove(next);
                            } else if (k5Var.o().Y("param", k5Var.l().t(((u4) k5Var.f24333a).k().z()), next, obj)) {
                                k5Var.o().H(N, next, obj);
                            }
                        }
                    }
                } else {
                    k5Var.n().f94789x.T(new Bundle());
                    break;
                }
                break;
            case 1:
                k5Var.p();
                k5Var.w();
                com.bumptech.glide.d.t(bundle);
                String string = bundle.getString("name");
                com.bumptech.glide.d.o(string);
                if (!((u4) k5Var.f24333a).e()) {
                    k5Var.zzj().f95276n.c("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    zznc zzncVar = new zznc(0L, null, string, "");
                    try {
                        f7 o13 = k5Var.o();
                        bundle.getString("app_id");
                        k5Var.u().z(new zzad(bundle.getString("app_id"), "", zzncVar, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), o13.B(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            default:
                k5Var.p();
                k5Var.w();
                com.bumptech.glide.d.t(bundle);
                String string2 = bundle.getString("name");
                String string3 = bundle.getString("origin");
                com.bumptech.glide.d.o(string2);
                com.bumptech.glide.d.o(string3);
                com.bumptech.glide.d.t(bundle.get("value"));
                if (!((u4) k5Var.f24333a).e()) {
                    k5Var.zzj().f95276n.c("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    zznc zzncVar2 = new zznc(bundle.getLong("triggered_timestamp"), bundle.get("value"), string2, string3);
                    try {
                        f7 o14 = k5Var.o();
                        bundle.getString("app_id");
                        zzbg B = o14.B(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string3, 0L, true);
                        f7 o15 = k5Var.o();
                        bundle.getString("app_id");
                        zzbg B2 = o15.B(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string3, 0L, true);
                        f7 o16 = k5Var.o();
                        bundle.getString("app_id");
                        k5Var.u().z(new zzad(bundle.getString("app_id"), string3, zzncVar2, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), B2, bundle.getLong("trigger_timeout"), B, bundle.getLong("time_to_live"), o16.B(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string3, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
        }
    }
}
