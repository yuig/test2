package oi;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.measurement.internal.zzad;
import com.google.android.gms.measurement.internal.zzam;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class w4 extends com.google.android.gms.internal.measurement.i0 implements t3 {

    /* renamed from: a, reason: collision with root package name */
    public final a7 f95246a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f95247b;

    /* renamed from: c, reason: collision with root package name */
    public String f95248c;

    public w4(a7 a7Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        com.bumptech.glide.d.t(a7Var);
        this.f95246a = a7Var;
        this.f95248c = null;
    }

    @Override // oi.t3
    public final void A(zznc zzncVar, zzo zzoVar) {
        com.bumptech.glide.d.t(zzncVar);
        F(zzoVar);
        D(new s.f(this, zzncVar, zzoVar, 13));
    }

    public final void B(zzad zzadVar) {
        com.bumptech.glide.d.t(zzadVar);
        com.bumptech.glide.d.t(zzadVar.f32019h);
        com.bumptech.glide.d.o(zzadVar.f32017f);
        E(zzadVar.f32017f, true);
        D(new androidx.appcompat.widget.j(22, this, new zzad(zzadVar)));
    }

    public final void C(zzbg zzbgVar, String str, String str2) {
        com.bumptech.glide.d.t(zzbgVar);
        com.bumptech.glide.d.o(str);
        E(str, true);
        D(new s.f((Object) this, (Object) zzbgVar, str, 11));
    }

    public final void D(Runnable runnable) {
        a7 a7Var = this.f95246a;
        if (a7Var.zzl().A()) {
            runnable.run();
        } else {
            a7Var.zzl().y(runnable);
        }
    }

    public final void E(String str, boolean z13) {
        boolean z14;
        boolean isEmpty = TextUtils.isEmpty(str);
        a7 a7Var = this.f95246a;
        if (isEmpty) {
            a7Var.zzj().f95268f.c("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z13) {
            try {
                if (this.f95247b == null) {
                    if (!"com.google.android.gms".equals(this.f95248c) && !kh2.g3.e2(a7Var.f94666l.f95197a, Binder.getCallingUid()) && !ih.g.b(a7Var.f94666l.f95197a).c(Binder.getCallingUid())) {
                        z14 = false;
                        this.f95247b = Boolean.valueOf(z14);
                    }
                    z14 = true;
                    this.f95247b = Boolean.valueOf(z14);
                }
                if (this.f95247b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e13) {
                a7Var.zzj().f95268f.b(y3.v(str), "Measurement Service called with invalid calling package. appId");
                throw e13;
            }
        }
        if (this.f95248c == null) {
            Context context = a7Var.f94666l.f95197a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = ih.f.f72261a;
            if (kh2.g3.C2(callingUid, context, str)) {
                this.f95248c = str;
            }
        }
        if (str.equals(this.f95248c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void F(zzo zzoVar) {
        com.bumptech.glide.d.t(zzoVar);
        String str = zzoVar.f32044f;
        com.bumptech.glide.d.o(str);
        E(str, false);
        this.f95246a.L().Z(zzoVar.f32045g, zzoVar.f32060v);
    }

    public final void G(zzbg zzbgVar, zzo zzoVar) {
        a7 a7Var = this.f95246a;
        a7Var.M();
        a7Var.j(zzbgVar, zzoVar);
    }

    @Override // oi.t3
    public final List a(Bundle bundle, zzo zzoVar) {
        F(zzoVar);
        String str = zzoVar.f32044f;
        com.bumptech.glide.d.t(str);
        a7 a7Var = this.f95246a;
        try {
            return (List) a7Var.zzl().u(new a5(this, zzoVar, bundle, 1)).get();
        } catch (InterruptedException | ExecutionException e13) {
            y3 zzj = a7Var.zzj();
            zzj.f95268f.a(y3.v(str), e13, "Failed to get trigger URIs. appId");
            return Collections.emptyList();
        }
    }

    @Override // oi.t3
    public final List b(String str, String str2, zzo zzoVar) {
        F(zzoVar);
        String str3 = zzoVar.f32044f;
        com.bumptech.glide.d.t(str3);
        a7 a7Var = this.f95246a;
        try {
            return (List) a7Var.zzl().u(new z4(this, str3, str, str2, 1)).get();
        } catch (InterruptedException | ExecutionException e13) {
            a7Var.zzj().f95268f.b(e13, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // oi.t3
    public final List d(String str, String str2, String str3, boolean z13) {
        E(str, true);
        a7 a7Var = this.f95246a;
        try {
            List<g7> list = (List) a7Var.zzl().u(new z4(this, str, str2, str3, 2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (g7 g7Var : list) {
                if (!z13 && f7.s0(g7Var.f94799c)) {
                }
                arrayList.add(new zznc(g7Var));
            }
            return arrayList;
        } catch (InterruptedException e13) {
            e = e13;
            y3 zzj = a7Var.zzj();
            zzj.f95268f.a(y3.v(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        } catch (ExecutionException e14) {
            e = e14;
            y3 zzj2 = a7Var.zzj();
            zzj2.f95268f.a(y3.v(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        }
    }

    @Override // oi.t3
    public final void g(long j13, String str, String str2, String str3) {
        D(new y4(this, str2, str3, str, j13, 0));
    }

    @Override // oi.t3
    public final List h(String str, String str2, String str3) {
        E(str, true);
        a7 a7Var = this.f95246a;
        try {
            return (List) a7Var.zzl().u(new z4(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e13) {
            a7Var.zzj().f95268f.b(e13, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // oi.t3
    public final zzam i(zzo zzoVar) {
        F(zzoVar);
        String str = zzoVar.f32044f;
        com.bumptech.glide.d.o(str);
        r8.a();
        a7 a7Var = this.f95246a;
        try {
            return (zzam) a7Var.zzl().x(new f0.e(1, this, zzoVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e13) {
            y3 zzj = a7Var.zzj();
            zzj.f95268f.a(y3.v(str), e13, "Failed to get consent. appId");
            return new zzam(null);
        }
    }

    @Override // com.google.android.gms.internal.measurement.i0
    public final boolean j(int i13, Parcel parcel, Parcel parcel2) {
        boolean z13;
        ArrayList arrayList;
        switch (i13) {
            case 1:
                zzbg zzbgVar = (zzbg) com.google.android.gms.internal.measurement.h0.a(parcel, zzbg.CREATOR);
                zzo zzoVar = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                r(zzbgVar, zzoVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zznc zzncVar = (zznc) com.google.android.gms.internal.measurement.h0.a(parcel, zznc.CREATOR);
                zzo zzoVar2 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                A(zzncVar, zzoVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                zzo zzoVar3 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                t(zzoVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbg zzbgVar2 = (zzbg) com.google.android.gms.internal.measurement.h0.a(parcel, zzbg.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.h0.d(parcel);
                C(zzbgVar2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo zzoVar4 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                p(zzoVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzo zzoVar5 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                z13 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.h0.d(parcel);
                F(zzoVar5);
                String str = zzoVar5.f32044f;
                com.bumptech.glide.d.t(str);
                a7 a7Var = this.f95246a;
                try {
                    List<g7> list = (List) a7Var.zzl().u(new f0.e(2, this, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (g7 g7Var : list) {
                        if (!z13 && f7.s0(g7Var.f94799c)) {
                        }
                        arrayList.add(new zznc(g7Var));
                    }
                } catch (InterruptedException e13) {
                    e = e13;
                    a7Var.zzj().f95268f.a(y3.v(str), e, "Failed to get user properties. appId");
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e14) {
                    e = e14;
                    a7Var.zzj().f95268f.a(y3.v(str), e, "Failed to get user properties. appId");
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbg zzbgVar3 = (zzbg) com.google.android.gms.internal.measurement.h0.a(parcel, zzbg.CREATOR);
                String readString3 = parcel.readString();
                com.google.android.gms.internal.measurement.h0.d(parcel);
                byte[] s13 = s(zzbgVar3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(s13);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                com.google.android.gms.internal.measurement.h0.d(parcel);
                g(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzo zzoVar6 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                String q13 = q(zzoVar6);
                parcel2.writeNoException();
                parcel2.writeString(q13);
                return true;
            case 12:
                zzad zzadVar = (zzad) com.google.android.gms.internal.measurement.h0.a(parcel, zzad.CREATOR);
                zzo zzoVar7 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                z(zzadVar, zzoVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzad zzadVar2 = (zzad) com.google.android.gms.internal.measurement.h0.a(parcel, zzad.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                B(zzadVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.h0.f31413a;
                z13 = parcel.readInt() != 0;
                zzo zzoVar8 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                List w13 = w(readString7, readString8, z13, zzoVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(w13);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.h0.f31413a;
                z13 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.h0.d(parcel);
                List d2 = d(readString9, readString10, readString11, z13);
                parcel2.writeNoException();
                parcel2.writeTypedList(d2);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzo zzoVar9 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                List b13 = b(readString12, readString13, zzoVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(b13);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                com.google.android.gms.internal.measurement.h0.d(parcel);
                List h10 = h(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(h10);
                return true;
            case 18:
                zzo zzoVar10 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                n(zzoVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.h0.a(parcel, Bundle.CREATOR);
                zzo zzoVar11 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                mo198a(bundle, zzoVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzo zzoVar12 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                o(zzoVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzo zzoVar13 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                zzam i14 = i(zzoVar13);
                parcel2.writeNoException();
                if (i14 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                i14.writeToParcel(parcel2, 1);
                return true;
            case 24:
                zzo zzoVar14 = (zzo) com.google.android.gms.internal.measurement.h0.a(parcel, zzo.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.h0.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.h0.d(parcel);
                List a13 = a(bundle2, zzoVar14);
                parcel2.writeNoException();
                parcel2.writeTypedList(a13);
                return true;
        }
    }

    @Override // oi.t3
    public final void n(zzo zzoVar) {
        com.bumptech.glide.d.o(zzoVar.f32044f);
        E(zzoVar.f32044f, false);
        D(new x4(this, zzoVar, 2));
    }

    @Override // oi.t3
    public final void o(zzo zzoVar) {
        com.bumptech.glide.d.o(zzoVar.f32044f);
        com.bumptech.glide.d.t(zzoVar.A);
        x4 x4Var = new x4(this, zzoVar, 3);
        a7 a7Var = this.f95246a;
        if (a7Var.zzl().A()) {
            x4Var.run();
        } else {
            a7Var.zzl().z(x4Var);
        }
    }

    @Override // oi.t3
    public final void p(zzo zzoVar) {
        F(zzoVar);
        D(new x4(this, zzoVar, 1));
    }

    @Override // oi.t3
    public final String q(zzo zzoVar) {
        F(zzoVar);
        a7 a7Var = this.f95246a;
        try {
            return (String) a7Var.zzl().u(new f0.e(3, a7Var, zzoVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e13) {
            y3 zzj = a7Var.zzj();
            zzj.f95268f.a(y3.v(zzoVar.f32044f), e13, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // oi.t3
    public final void r(zzbg zzbgVar, zzo zzoVar) {
        com.bumptech.glide.d.t(zzbgVar);
        F(zzoVar);
        D(new s.f(this, zzbgVar, zzoVar, 12));
    }

    @Override // oi.t3
    public final byte[] s(zzbg zzbgVar, String str) {
        com.bumptech.glide.d.o(str);
        com.bumptech.glide.d.t(zzbgVar);
        E(str, true);
        a7 a7Var = this.f95246a;
        y3 zzj = a7Var.zzj();
        u4 u4Var = a7Var.f94666l;
        x3 x3Var = u4Var.f95209m;
        String str2 = zzbgVar.f32030f;
        zzj.f95275m.b(x3Var.c(str2), "Log and bundle. event");
        ((oh.b) a7Var.zzb()).getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) a7Var.zzl().x(new a5(this, zzbgVar, str, 0)).get();
            if (bArr == null) {
                a7Var.zzj().f95268f.b(y3.v(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((oh.b) a7Var.zzb()).getClass();
            a7Var.zzj().f95275m.d("Log and bundle processed. event, size, time_ms", u4Var.f95209m.c(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e13) {
            e = e13;
            y3 zzj2 = a7Var.zzj();
            zzj2.f95268f.d("Failed to log and bundle. appId, event, error", y3.v(str), u4Var.f95209m.c(str2), e);
            return null;
        } catch (ExecutionException e14) {
            e = e14;
            y3 zzj22 = a7Var.zzj();
            zzj22.f95268f.d("Failed to log and bundle. appId, event, error", y3.v(str), u4Var.f95209m.c(str2), e);
            return null;
        }
    }

    @Override // oi.t3
    public final void t(zzo zzoVar) {
        F(zzoVar);
        D(new x4(this, zzoVar, 0));
    }

    @Override // oi.t3
    public final List w(String str, String str2, boolean z13, zzo zzoVar) {
        F(zzoVar);
        String str3 = zzoVar.f32044f;
        com.bumptech.glide.d.t(str3);
        a7 a7Var = this.f95246a;
        try {
            List<g7> list = (List) a7Var.zzl().u(new z4(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (g7 g7Var : list) {
                if (!z13 && f7.s0(g7Var.f94799c)) {
                }
                arrayList.add(new zznc(g7Var));
            }
            return arrayList;
        } catch (InterruptedException e13) {
            e = e13;
            y3 zzj = a7Var.zzj();
            zzj.f95268f.a(y3.v(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        } catch (ExecutionException e14) {
            e = e14;
            y3 zzj2 = a7Var.zzj();
            zzj2.f95268f.a(y3.v(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        }
    }

    @Override // oi.t3
    public final void z(zzad zzadVar, zzo zzoVar) {
        com.bumptech.glide.d.t(zzadVar);
        com.bumptech.glide.d.t(zzadVar.f32019h);
        F(zzoVar);
        zzad zzadVar2 = new zzad(zzadVar);
        zzadVar2.f32017f = zzoVar.f32044f;
        D(new s.f(this, zzadVar2, zzoVar, 10));
    }

    @Override // oi.t3
    /* renamed from: a */
    public final void mo198a(Bundle bundle, zzo zzoVar) {
        F(zzoVar);
        String str = zzoVar.f32044f;
        com.bumptech.glide.d.t(str);
        D(new s.f(this, str, bundle, 9));
    }
}
