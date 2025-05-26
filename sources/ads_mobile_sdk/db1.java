package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
public final class db1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4222a;

    /* renamed from: b, reason: collision with root package name */
    public final bt2 f4223b;

    /* renamed from: c, reason: collision with root package name */
    public final a f4224c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4225d;

    public db1(Context context, bt2 bt2Var, a aVar, i4 i4Var) {
        this.f4222a = context;
        this.f4223b = bt2Var;
        this.f4224c = aVar;
        this.f4225d = i4Var.A();
    }

    public final String a(long j13) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z13;
        int i19;
        int i23;
        int i24;
        a.z4 r13 = ic.r();
        String str = this.f4225d;
        r13.b();
        ic icVar = (ic) r13.f10110b;
        icVar.getClass();
        str.getClass();
        i13 = icVar.bitField0_;
        icVar.bitField0_ = i13 | 2;
        icVar.afmaVersion_ = str;
        r13.b();
        ic icVar2 = (ic) r13.f10110b;
        icVar2.getClass();
        i14 = icVar2.bitField0_;
        icVar2.bitField0_ = i14 | 1;
        icVar2.adshieldVersion_ = "0.751115858";
        String packageName = this.f4222a.getPackageName();
        r13.b();
        ic icVar3 = (ic) r13.f10110b;
        icVar3.getClass();
        packageName.getClass();
        i15 = icVar3.bitField0_;
        icVar3.bitField0_ = i15 | 8;
        icVar3.appIdSignal_ = packageName;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        r13.b();
        ic icVar4 = (ic) r13.f10110b;
        i16 = icVar4.bitField0_;
        icVar4.bitField0_ = i16 | 4;
        icVar4.evtTime_ = currentTimeMillis;
        long currentTimeMillis2 = (System.currentTimeMillis() - j13) / 1000;
        r13.b();
        ic icVar5 = (ic) r13.f10110b;
        i17 = icVar5.bitField0_;
        icVar5.bitField0_ = i17 | 32;
        icVar5.uptSignal_ = currentTimeMillis2;
        try {
            long j14 = this.f4222a.getPackageManager().getPackageInfo(this.f4222a.getPackageName(), 0).versionCode;
            r13.b();
            ic icVar6 = (ic) r13.f10110b;
            i24 = icVar6.bitField0_;
            icVar6.bitField0_ = i24 | 16;
            icVar6.vcdSignal_ = j14;
        } catch (PackageManager.NameNotFoundException unused) {
            r13.b();
            ic icVar7 = (ic) r13.f10110b;
            i18 = icVar7.bitField0_;
            icVar7.bitField0_ = i18 | 16;
            icVar7.vcdSignal_ = -1L;
        }
        a aVar = this.f4224c;
        synchronized (aVar) {
            z13 = aVar.f2124d;
        }
        if (!z13) {
            this.f4224c.a();
        }
        a.da a13 = this.f4224c.a((String) null, ((ic) r13.a()).a());
        a13.b();
        qc qcVar = (qc) a13.f10110b;
        qcVar.getClass();
        qcVar.protoName_ = 4;
        i19 = qcVar.bitField0_;
        qcVar.bitField0_ = i19 | 2;
        ec ecVar = ec.BITSLICER;
        a13.b();
        qc qcVar2 = (qc) a13.f10110b;
        qcVar2.getClass();
        qcVar2.encryptionMethod_ = ecVar.f4800a;
        i23 = qcVar2.bitField0_;
        qcVar2.bitField0_ = i23 | 4;
        byte[] a14 = ((qc) a13.a()).a();
        qk.c cVar = qk.d.f104038e;
        if (cVar.f104041b != null) {
            cVar = new qk.c(cVar.f104040a, (Character) null);
        }
        return cVar.c(a14);
    }
}
