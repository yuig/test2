package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class sb extends j {

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.k0 f31642c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f31643d;

    public sb(androidx.lifecycle.k0 k0Var) {
        super("require");
        this.f31643d = new HashMap();
        this.f31642c = k0Var;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n a(m.h hVar, List list) {
        n nVar;
        o0.u(1, "require", list);
        String zzf = hVar.P((n) list.get(0)).zzf();
        HashMap hashMap = this.f31643d;
        if (hashMap.containsKey(zzf)) {
            return (n) hashMap.get(zzf);
        }
        androidx.lifecycle.k0 k0Var = this.f31642c;
        if (k0Var.f18655a.containsKey(zzf)) {
            try {
                nVar = (n) ((Callable) k0Var.f18655a.get(zzf)).call();
            } catch (Exception unused) {
                throw new IllegalStateException(a.a.j("Failed to create API implementation: ", zzf));
            }
        } else {
            nVar = n.Fn;
        }
        if (nVar instanceof j) {
            hashMap.put(zzf, (j) nVar);
        }
        return nVar;
    }
}
