package mk;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import jk.p;
import jk.s;
import m.n;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87306a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f87307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f87308c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f87309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f87310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f87311f;

    public /* synthetic */ d(a aVar, long j13, ArrayList arrayList, ArrayList arrayList2, List list) {
        this.f87307b = aVar;
        this.f87308c = j13;
        this.f87309d = arrayList;
        this.f87310e = arrayList2;
        this.f87311f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f87306a;
        a aVar = this.f87307b;
        switch (i13) {
            case 0:
                if (aVar.f87299n.get()) {
                    aVar.j(6, -6, null, null, null, null, null);
                    return;
                }
                s sVar = aVar.f87294i;
                p zza = sVar.zza();
                List list = this.f87310e;
                List list2 = this.f87311f;
                long j13 = this.f87308c;
                if (zza == null) {
                    aVar.f87297l.addAll(list);
                    aVar.f87298m.addAll(list2);
                    Long valueOf = Long.valueOf(j13);
                    aVar.j(5, 0, null, valueOf, valueOf, null, null);
                    return;
                }
                p zza2 = sVar.zza();
                List list3 = this.f87309d;
                n nVar = new n(j13, aVar, list, list2, list3, false);
                kk.d dVar = (kk.d) zza2;
                dVar.getClass();
                if (ik.a.f72383e.get() == null) {
                    throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
                }
                dVar.f79881d.execute(new s.f(dVar, list3, nVar, 19));
                return;
            default:
                int i14 = 0;
                long j14 = 0;
                while (true) {
                    long j15 = this.f87308c;
                    if (i14 >= 3) {
                        aVar.f87293h.execute(new d(aVar, this.f87309d, this.f87310e, this.f87311f, j15));
                        return;
                    }
                    aVar.getClass();
                    long min = Math.min(j15, (j15 / 3) + j14);
                    aVar.j(2, 0, null, Long.valueOf(min), Long.valueOf(j15), null, null);
                    SystemClock.sleep(a.f87284o);
                    int i15 = ((jk.d) aVar.f87296k.get()).f76321b;
                    if (i15 == 9 || i15 == 7 || i15 == 6) {
                        return;
                    }
                    i14++;
                    j14 = min;
                }
                break;
        }
    }

    public /* synthetic */ d(a aVar, List list, List list2, List list3, long j13) {
        this.f87307b = aVar;
        this.f87309d = list;
        this.f87310e = list2;
        this.f87311f = list3;
        this.f87308c = j13;
    }
}
