package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class t6 extends j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31646c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f31647d;

    public t6(bb.p pVar) {
        super("internal.logger");
        this.f31647d = pVar;
        HashMap hashMap = this.f31471b;
        hashMap.put("log", new rb(this, false, true));
        hashMap.put("silent", new b("silent", 1));
        ((j) hashMap.get("silent")).c("log", new rb(this, true, true));
        hashMap.put("unmonitored", new b("unmonitored", 2));
        ((j) hashMap.get("unmonitored")).c("log", new rb(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n a(m.h hVar, List list) {
        TreeMap treeMap;
        t tVar = n.Fn;
        int i13 = this.f31646c;
        String str = this.f31470a;
        switch (i13) {
            case 0:
                o0.u(3, str, list);
                String zzf = hVar.P((n) list.get(0)).zzf();
                long a13 = (long) o0.a(hVar.P((n) list.get(1)).zze().doubleValue());
                n P = hVar.P((n) list.get(2));
                HashMap t13 = P instanceof m ? o0.t((m) P) : new HashMap();
                gi.m mVar = (gi.m) this.f31647d;
                mVar.getClass();
                HashMap hashMap = new HashMap();
                for (String str2 : t13.keySet()) {
                    HashMap hashMap2 = ((c) mVar.f65093b).f31313c;
                    hashMap.put(str2, c.a(hashMap2.containsKey(str2) ? hashMap2.get(str2) : null, t13.get(str2), str2));
                }
                ((List) mVar.f65094c).add(new c(zzf, a13, hashMap));
                return tVar;
            case 1:
                return tVar;
            case 2:
                o0.u(3, str, list);
                hVar.P((n) list.get(0)).zzf();
                n P2 = hVar.P((n) list.get(1));
                if (!(P2 instanceof o)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                n P3 = hVar.P((n) list.get(2));
                if (!(P3 instanceof m)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                m mVar2 = (m) P3;
                if (!mVar2.f31516a.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String zzf2 = mVar2.zza("type").zzf();
                int A = mVar2.f31516a.containsKey("priority") ? o0.A(mVar2.zza("priority").zze().doubleValue()) : 1000;
                bh.b bVar = (bh.b) this.f31647d;
                o oVar = (o) P2;
                bVar.getClass();
                if ("create".equals(zzf2)) {
                    treeMap = (TreeMap) bVar.f22799c;
                } else {
                    if (!"edit".equals(zzf2)) {
                        throw new IllegalStateException(a.a.j("Unknown callback type: ", zzf2));
                    }
                    treeMap = (TreeMap) bVar.f22798b;
                }
                if (treeMap.containsKey(Integer.valueOf(A))) {
                    A = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(A), oVar);
                return tVar;
            default:
                try {
                    return o0.p(((Callable) this.f31647d).call());
                } catch (Exception unused) {
                    return tVar;
                }
        }
    }

    public t6(bh.b bVar) {
        super("internal.registerCallback");
        this.f31647d = bVar;
    }

    public t6(gi.m mVar) {
        super("internal.eventLogger");
        this.f31647d = mVar;
    }

    public t6(oi.l4 l4Var) {
        super("internal.appMetadata");
        this.f31647d = l4Var;
    }
}
