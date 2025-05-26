package t3;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class s0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f116186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f116187c;

    public /* synthetic */ s0(int i13, Object obj, Object obj2) {
        this.f116185a = i13;
        this.f116186b = obj;
        this.f116187c = obj2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i13 = this.f116185a;
        Object obj3 = this.f116187c;
        Object obj4 = this.f116186b;
        switch (i13) {
            case 0:
                int compare = ((Comparator) obj4).compare(obj, obj2);
                return compare != 0 ? compare : ((Comparator) obj3).compare(((z3.q) obj).f140713c, ((z3.q) obj2).f140713c);
            default:
                com.google.android.gms.internal.measurement.n nVar = (com.google.android.gms.internal.measurement.n) obj;
                com.google.android.gms.internal.measurement.n nVar2 = (com.google.android.gms.internal.measurement.n) obj2;
                com.google.android.gms.internal.measurement.j jVar = (com.google.android.gms.internal.measurement.j) obj4;
                m.h hVar = (m.h) obj3;
                if (nVar instanceof com.google.android.gms.internal.measurement.t) {
                    return !(nVar2 instanceof com.google.android.gms.internal.measurement.t) ? 1 : 0;
                }
                if (nVar2 instanceof com.google.android.gms.internal.measurement.t) {
                    return -1;
                }
                return jVar == null ? nVar.zzf().compareTo(nVar2.zzf()) : (int) com.google.android.gms.internal.measurement.o0.a(jVar.a(hVar, Arrays.asList(nVar, nVar2)).zze().doubleValue());
        }
    }
}
