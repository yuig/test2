package so;

import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes3.dex */
public final class i1 implements wx1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bf2.d f113456b;

    public /* synthetic */ i1(bf2.d dVar, int i13) {
        this.f113455a = i13;
        this.f113456b = dVar;
    }

    public final wx1.b a(Date date, Date date2, ArrayList arrayList, int i13, int i14, boolean z13, boolean z14, long j13) {
        int i15 = this.f113455a;
        bf2.d dVar = this.f113456b;
        switch (i15) {
            case 0:
                return new wx1.b(((r8) dVar).f114090a.j2(), date, date2, arrayList, i13, i14, z13, z14, j13);
            default:
                return new wx1.b(((qb) dVar).f114076a.j2(), date, date2, arrayList, i13, i14, z13, z14, j13);
        }
    }
}
