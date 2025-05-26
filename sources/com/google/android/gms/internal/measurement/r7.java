package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r7 extends j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31625c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final bh.b f31626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(bh.b bVar) {
        super("getValue");
        this.f31626d = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n a(m.h hVar, List list) {
        switch (this.f31625c) {
            case 0:
                return n.Fn;
            default:
                o0.u(2, "getValue", list);
                n P = hVar.P((n) list.get(0));
                n P2 = hVar.P((n) list.get(1));
                String zzf = P.zzf();
                bh.b bVar = this.f31626d;
                Map map = (Map) ((oi.k4) bVar.f22798b).f94895d.get((String) bVar.f22799c);
                String str = (map == null || !map.containsKey(zzf)) ? null : (String) map.get(zzf);
                return str != null ? new p(str) : P2;
        }
    }

    public r7(bh.b bVar, int i13) {
        super("internal.remoteConfig");
        this.f31626d = bVar;
        this.f31471b.put("getValue", new r7(bVar));
    }
}
