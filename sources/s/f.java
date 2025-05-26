package s;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.a2;
import com.bugsnag.android.d0;
import com.bugsnag.android.e0;
import com.bugsnag.android.u1;
import com.bugsnag.android.x0;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.internal.measurement.g3;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.h3;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.k0;
import com.google.android.gms.internal.measurement.k3;
import com.google.android.gms.internal.measurement.l3;
import com.google.android.gms.internal.measurement.s2;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.measurement.internal.zzad;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zzo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kh2.a1;
import oi.a4;
import oi.a7;
import oi.c7;
import oi.f7;
import oi.h5;
import oi.i4;
import oi.k4;
import oi.o4;
import oi.u4;
import oi.w4;
import oi.y3;

/* loaded from: classes2.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110254a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f110255b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f110256c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f110257d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i13) {
        this.f110254a = i13;
        this.f110257d = obj;
        this.f110255b = obj2;
        this.f110256c = obj3;
    }

    private void a() {
        ((j) this.f110257d).f110276b.onPostMessage((String) this.f110255b, (Bundle) this.f110256c);
    }

    private void b() {
        ((a1) this.f110255b).m0((Typeface) this.f110256c);
    }

    private void c() {
        Object obj;
        try {
            obj = ((Callable) this.f110255b).call();
        } catch (Exception unused) {
            obj = null;
        }
        ((Handler) this.f110257d).post(new f(this, (p5.a) this.f110256c, obj, 2));
    }

    private void d() {
        ((p5.a) this.f110255b).accept(this.f110256c);
    }

    private void e() {
        e0 e0Var = (e0) this.f110257d;
        com.bugsnag.android.a1 a1Var = (com.bugsnag.android.a1) this.f110255b;
        x0 x0Var = (x0) this.f110256c;
        u1 u1Var = e0Var.f29204a;
        u1Var.i("DeliveryDelegate#deliverPayloadInternal() - attempting event delivery");
        hd.h hVar = e0Var.f29206c;
        int i13 = d0.f29185a[hVar.f68822n.a(a1Var, hVar.a(a1Var)).ordinal()];
        if (i13 == 1) {
            u1Var.c("Sent 1 new event to Bugsnag");
            return;
        }
        if (i13 == 2) {
            u1Var.f("Could not send event(s) to Bugsnag, saving to disk to send later");
            e0Var.f29205b.h(x0Var);
        } else {
            if (i13 != 3) {
                return;
            }
            u1Var.f("Problem sending event to Bugsnag");
        }
    }

    private final void f() {
        Object obj = this.f110257d;
        v0 v0Var = (v0) obj;
        int i13 = v0Var.f30890b;
        Object obj2 = this.f110256c;
        if (i13 > 0) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) obj2;
            Bundle bundle = v0Var.f30891c;
            lifecycleCallback.onCreate(bundle != null ? bundle.getBundle((String) this.f110255b) : null);
        }
        if (((v0) obj).f30890b >= 2) {
            ((LifecycleCallback) obj2).onStart();
        }
        if (((v0) obj).f30890b >= 3) {
            ((LifecycleCallback) obj2).onResume();
        }
        if (((v0) obj).f30890b >= 4) {
            ((LifecycleCallback) obj2).onStop();
        }
        if (((v0) obj).f30890b >= 5) {
            ((LifecycleCallback) obj2).onDestroy();
        }
    }

    private final void g() {
        Object obj = this.f110257d;
        w0 w0Var = (w0) obj;
        int i13 = w0Var.f30895b;
        Object obj2 = this.f110256c;
        if (i13 > 0) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) obj2;
            Bundle bundle = w0Var.f30896c;
            lifecycleCallback.onCreate(bundle != null ? bundle.getBundle((String) this.f110255b) : null);
        }
        if (((w0) obj).f30895b >= 2) {
            ((LifecycleCallback) obj2).onStart();
        }
        if (((w0) obj).f30895b >= 3) {
            ((LifecycleCallback) obj2).onResume();
        }
        if (((w0) obj).f30895b >= 4) {
            ((LifecycleCallback) obj2).onStop();
        }
        if (((w0) obj).f30895b >= 5) {
            ((LifecycleCallback) obj2).onDestroy();
        }
    }

    private final void h() {
        df.b bVar = (df.b) this.f110257d;
        i4 i4Var = (i4) bVar.f54714c;
        String str = (String) bVar.f54713b;
        j0 j0Var = (j0) this.f110255b;
        u4 u4Var = i4Var.f94843a;
        o4 o4Var = u4Var.f95206j;
        u4.d(o4Var);
        o4Var.p();
        y3 y3Var = u4Var.f95205i;
        if (j0Var != null) {
            Bundle a13 = n60.o.a("package_name", str);
            try {
                k0 k0Var = (k0) j0Var;
                Parcel j13 = k0Var.j();
                h0.c(j13, a13);
                Parcel G = k0Var.G(j13, 1);
                Bundle bundle = (Bundle) h0.a(G, Bundle.CREATOR);
                G.recycle();
                if (bundle == null) {
                    u4.d(y3Var);
                    y3Var.f95268f.c("Install Referrer Service returned a null response");
                }
            } catch (Exception e13) {
                u4.d(y3Var);
                y3Var.f95268f.b(e13.getMessage(), "Exception occurred while retrieving the Install Referrer");
            }
        } else {
            u4.d(y3Var);
            y3Var.f95271i.c("Attempting to use Install Referrer Service while it is not initialized");
        }
        o4 o4Var2 = i4Var.f94843a.f95206j;
        u4.d(o4Var2);
        o4Var2.p();
        throw new IllegalStateException("Unexpected call on client side");
    }

    private final void i() {
        zzbb zzbbVar;
        w4 w4Var = (w4) this.f110257d;
        String str = (String) this.f110255b;
        Bundle bundle = (Bundle) this.f110256c;
        oi.i iVar = w4Var.f95246a.f94657c;
        a7.p(iVar);
        iVar.p();
        iVar.t();
        u4 u4Var = (u4) iVar.f24333a;
        com.bumptech.glide.d.o(str);
        com.bumptech.glide.d.o("dep");
        TextUtils.isEmpty("");
        if (bundle == null || bundle.isEmpty()) {
            zzbbVar = new zzbb(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    y3 y3Var = u4Var.f95205i;
                    u4.d(y3Var);
                    y3Var.f95268f.c("Param name can't be null");
                    it.remove();
                } else {
                    f7 f7Var = u4Var.f95208l;
                    u4.c(f7Var);
                    Object h03 = f7Var.h0(bundle2.get(next), next);
                    if (h03 == null) {
                        y3 y3Var2 = u4Var.f95205i;
                        u4.d(y3Var2);
                        y3Var2.f95271i.b(u4Var.f95209m.f(next), "Param value can't be null");
                        it.remove();
                    } else {
                        f7 f7Var2 = u4Var.f95208l;
                        u4.c(f7Var2);
                        f7Var2.H(bundle2, next, h03);
                    }
                }
            }
            zzbbVar = new zzbb(bundle2);
        }
        c7 q13 = iVar.q();
        g3 E = h3.E();
        E.g();
        h3.B(0L, (h3) E.f31718b);
        a2 a2Var = new a2(zzbbVar);
        while (a2Var.hasNext()) {
            String str2 = (String) a2Var.next();
            k3 F = l3.F();
            F.j(str2);
            Object obj = zzbbVar.f32029f.get(str2);
            com.bumptech.glide.d.t(obj);
            q13.N(F, obj);
            E.i(F);
        }
        byte[] c13 = ((h3) E.b()).c();
        y3 zzj = iVar.zzj();
        zzj.f95276n.a(iVar.m().c(str), Integer.valueOf(c13.length), "Saving default event parameters, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", c13);
        try {
            if (iVar.w().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                iVar.zzj().f95268f.b(y3.v(str), "Failed to insert default event parameters (got -1). appId");
            }
        } catch (SQLiteException e13) {
            y3 zzj2 = iVar.zzj();
            zzj2.f95268f.a(y3.v(str), e13, "Error storing default event parameters. appId");
        }
    }

    private final void j() {
        Object obj = this.f110257d;
        ((w4) obj).f95246a.M();
        Object obj2 = this.f110255b;
        Object e13 = ((zzad) obj2).f32019h.e();
        Object obj3 = this.f110256c;
        if (e13 == null) {
            ((w4) obj).f95246a.i((zzad) obj2, (zzo) obj3);
        } else {
            ((w4) obj).f95246a.y((zzad) obj2, (zzo) obj3);
        }
    }

    private final void k() {
        s2 s2Var;
        zzbb zzbbVar;
        w4 w4Var = (w4) this.f110257d;
        zzbg zzbgVar = (zzbg) this.f110255b;
        w4Var.getClass();
        if ("_cmp".equals(zzbgVar.f32030f) && (zzbbVar = zzbgVar.f32031g) != null) {
            Bundle bundle = zzbbVar.f32029f;
            if (bundle.size() != 0) {
                String string = bundle.getString("_cis");
                if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                    w4Var.f95246a.zzj().f95274l.b(zzbgVar.toString(), "Event has been filtered ");
                    zzbgVar = new zzbg("_cmpx", zzbgVar.f32031g, zzbgVar.f32032h, zzbgVar.f32033i);
                }
            }
        }
        String str = zzbgVar.f32030f;
        zzo zzoVar = (zzo) this.f110256c;
        a7 a7Var = w4Var.f95246a;
        k4 k4Var = a7Var.f94655a;
        c7 c7Var = a7Var.f94661g;
        a7.p(k4Var);
        String str2 = zzoVar.f32044f;
        if (TextUtils.isEmpty(str2) || (s2Var = (s2) k4Var.f94899h.get(str2)) == null || s2Var.r() == 0) {
            w4Var.G(zzbgVar, zzoVar);
            return;
        }
        a4 a4Var = a7Var.zzj().f95276n;
        String str3 = zzoVar.f32044f;
        a4Var.b(str3, "EES config found for");
        k4 k4Var2 = a7Var.f94655a;
        a7.p(k4Var2);
        w wVar = TextUtils.isEmpty(str3) ? null : (w) k4Var2.f94901j.c(str3);
        if (wVar == null) {
            a7Var.zzj().f95276n.b(str3, "EES not loaded for");
            w4Var.G(zzbgVar, zzoVar);
            return;
        }
        try {
            a7.p(c7Var);
            HashMap H = c7.H(zzbgVar.f32031g.f(), true);
            String I0 = a1.I0(str, h5.f94813c, h5.f94811a);
            if (I0 == null) {
                I0 = str;
            }
            if (wVar.b(new com.google.android.gms.internal.measurement.c(I0, zzbgVar.f32033i, H))) {
                gi.m mVar = wVar.f31680c;
                boolean z13 = !((com.google.android.gms.internal.measurement.c) mVar.f65095d).equals((com.google.android.gms.internal.measurement.c) mVar.f65093b);
                gi.m mVar2 = wVar.f31680c;
                if (z13) {
                    a7Var.zzj().f95276n.b(str, "EES edited event");
                    a7.p(c7Var);
                    w4Var.G(c7.C((com.google.android.gms.internal.measurement.c) mVar2.f65095d), zzoVar);
                } else {
                    w4Var.G(zzbgVar, zzoVar);
                }
                if (!((List) wVar.f31680c.f65094c).isEmpty()) {
                    for (com.google.android.gms.internal.measurement.c cVar : (List) mVar2.f65094c) {
                        a7Var.zzj().f95276n.b(cVar.f31311a, "EES logging created event");
                        a7.p(c7Var);
                        w4Var.G(c7.C(cVar), zzoVar);
                    }
                    return;
                }
                return;
            }
        } catch (zzc unused) {
            a7Var.zzj().f95268f.a(zzoVar.f32045g, str, "EES error. appId, eventName");
        }
        a7Var.zzj().f95276n.b(str, "EES was not applied to event");
        w4Var.G(zzbgVar, zzoVar);
    }

    private final void l() {
        Object obj = this.f110257d;
        ((w4) obj).f95246a.M();
        Object obj2 = this.f110255b;
        Object e13 = ((zznc) obj2).e();
        Object obj3 = this.f110256c;
        if (e13 == null) {
            ((w4) obj).f95246a.n(((zznc) obj2).f32038g, (zzo) obj3);
        } else {
            ((w4) obj).f95246a.l((zznc) obj2, (zzo) obj3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x02dc, code lost:
    
        if (r4.exists() == false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e8 A[Catch: Exception -> 0x03e2, TRY_LEAVE, TryCatch #12 {Exception -> 0x03e2, blocks: (B:91:0x0256, B:97:0x03e8, B:210:0x03e4, B:217:0x03de, B:93:0x0270, B:107:0x027c, B:108:0x0285, B:110:0x028b, B:155:0x0327, B:171:0x033b, B:170:0x0338, B:174:0x033c, B:176:0x0341, B:178:0x0354, B:180:0x035a, B:183:0x0360, B:184:0x0377, B:186:0x037b, B:188:0x03a3, B:189:0x03ce, B:192:0x03a9, B:195:0x03b3, B:199:0x03bb, B:202:0x03c2, B:204:0x03c8, B:212:0x03d8), top: B:90:0x0256, inners: #9, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03fa  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.f.run():void");
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i13, int i14) {
        this.f110254a = i13;
        this.f110255b = obj;
        this.f110256c = obj2;
        this.f110257d = obj3;
    }

    public /* synthetic */ f(Object obj, Object obj2, String str, int i13) {
        this.f110254a = i13;
        this.f110257d = obj;
        this.f110256c = obj2;
        this.f110255b = str;
    }
}
