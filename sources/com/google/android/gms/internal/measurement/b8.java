package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class b8 extends m {

    /* renamed from: b, reason: collision with root package name */
    public final gi.m f31306b;

    public b8(gi.m mVar) {
        this.f31306b = mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.m, com.google.android.gms.internal.measurement.n
    public final n d(String str, m.h hVar, ArrayList arrayList) {
        char c13;
        b8 b8Var;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c13 = 0;
                    b8Var = this;
                    break;
                }
                b8Var = this;
                c13 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    b8Var = this;
                    c13 = 1;
                    break;
                }
                b8Var = this;
                c13 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    b8Var = this;
                    c13 = 2;
                    break;
                }
                b8Var = this;
                c13 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    b8Var = this;
                    c13 = 3;
                    break;
                }
                b8Var = this;
                c13 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    b8Var = this;
                    c13 = 4;
                    break;
                }
                b8Var = this;
                c13 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c13 = 5;
                    b8Var = this;
                    break;
                }
                b8Var = this;
                c13 = 65535;
                break;
            default:
                b8Var = this;
                c13 = 65535;
                break;
        }
        gi.m mVar = b8Var.f31306b;
        if (c13 == 0) {
            o0.u(0, "getEventName", arrayList);
            return new p(((c) mVar.f65095d).f31311a);
        }
        if (c13 == 1) {
            o0.u(0, "getTimestamp", arrayList);
            return new g(Double.valueOf(((c) mVar.f65095d).f31312b));
        }
        if (c13 == 2) {
            o0.u(1, "getParamValue", arrayList);
            String zzf = hVar.P((n) arrayList.get(0)).zzf();
            HashMap hashMap = ((c) mVar.f65095d).f31313c;
            return o0.p(hashMap.containsKey(zzf) ? hashMap.get(zzf) : null);
        }
        if (c13 == 3) {
            o0.u(0, "getParams", arrayList);
            HashMap hashMap2 = ((c) mVar.f65095d).f31313c;
            m mVar2 = new m();
            for (String str2 : hashMap2.keySet()) {
                mVar2.c(str2, o0.p(hashMap2.get(str2)));
            }
            return mVar2;
        }
        if (c13 != 4) {
            if (c13 != 5) {
                return super.d(str, hVar, arrayList);
            }
            o0.u(1, "setEventName", arrayList);
            n P = hVar.P((n) arrayList.get(0));
            if (n.Fn.equals(P) || n.Gn.equals(P)) {
                throw new IllegalArgumentException("Illegal event name");
            }
            ((c) mVar.f65095d).f31311a = P.zzf();
            return new p(P.zzf());
        }
        o0.u(2, "setParamValue", arrayList);
        String zzf2 = hVar.P((n) arrayList.get(0)).zzf();
        n P2 = hVar.P((n) arrayList.get(1));
        c cVar = (c) mVar.f65095d;
        Object r13 = o0.r(P2);
        HashMap hashMap3 = cVar.f31313c;
        if (r13 == null) {
            hashMap3.remove(zzf2);
        } else {
            hashMap3.put(zzf2, c.a(hashMap3.get(zzf2), r13, zzf2));
        }
        return P2;
    }
}
