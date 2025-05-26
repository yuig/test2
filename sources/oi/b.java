package oi;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f94682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f94683c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f94684d;

    public /* synthetic */ b(o oVar, String str, long j13, int i13) {
        this.f94681a = i13;
        this.f94684d = oVar;
        this.f94682b = str;
        this.f94683c = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f94681a;
        long j13 = this.f94683c;
        String str = this.f94682b;
        o oVar = this.f94684d;
        switch (i13) {
            case 0:
                oVar.p();
                com.bumptech.glide.d.o(str);
                g1.g gVar = oVar.f94979c;
                if (gVar.isEmpty()) {
                    oVar.f94980d = j13;
                }
                Integer num = (Integer) gVar.get(str);
                if (num == null) {
                    if (gVar.f63294c < 100) {
                        gVar.put(str, 1);
                        oVar.f94978b.put(str, Long.valueOf(j13));
                        break;
                    } else {
                        oVar.zzj().f95271i.c("Too many ads visible");
                        break;
                    }
                } else {
                    gVar.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            default:
                oVar.p();
                com.bumptech.glide.d.o(str);
                g1.g gVar2 = oVar.f94979c;
                Integer num2 = (Integer) gVar2.get(str);
                if (num2 == null) {
                    oVar.zzj().f95268f.b(str, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    b6 A = oVar.t().A(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue != 0) {
                        gVar2.put(str, Integer.valueOf(intValue));
                        break;
                    } else {
                        gVar2.remove(str);
                        g1.g gVar3 = oVar.f94978b;
                        Long l13 = (Long) gVar3.get(str);
                        if (l13 == null) {
                            oVar.zzj().f95268f.c("First ad unit exposure time was never set");
                        } else {
                            long longValue = j13 - l13.longValue();
                            gVar3.remove(str);
                            oVar.z(str, longValue, A);
                        }
                        if (gVar2.isEmpty()) {
                            long j14 = oVar.f94980d;
                            if (j14 != 0) {
                                oVar.y(j13 - j14, A);
                                oVar.f94980d = 0L;
                                break;
                            } else {
                                oVar.zzj().f95268f.c("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
