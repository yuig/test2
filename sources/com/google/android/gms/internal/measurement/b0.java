package com.google.android.gms.internal.measurement;

import java.util.Map;

/* loaded from: classes3.dex */
public final class b0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31289a;

    /* renamed from: b, reason: collision with root package name */
    public final m.h f31290b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31291c;

    public /* synthetic */ b0(m.h hVar, String str, int i13) {
        this.f31289a = i13;
        this.f31290b = hVar;
        this.f31291c = str;
    }

    @Override // com.google.android.gms.internal.measurement.d0
    public final m.h b(n nVar) {
        int i13 = this.f31289a;
        m.h hVar = this.f31290b;
        String str = this.f31291c;
        switch (i13) {
            case 0:
                m.h S = hVar.S();
                S.U(str, nVar);
                ((Map) S.f85200e).put(str, Boolean.TRUE);
                return S;
            default:
                hVar.U(str, nVar);
                return hVar;
        }
    }
}
