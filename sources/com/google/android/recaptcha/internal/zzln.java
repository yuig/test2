package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzln extends zzkw {
    private static final Logger zzb = Logger.getLogger(zzln.class.getName());
    private static final boolean zzc = zzps.zzx();
    zzlo zza;

    private zzln() {
        throw null;
    }

    public static int zzA(int i13) {
        return (352 - (Integer.numberOfLeadingZeros(i13) * 9)) >>> 6;
    }

    public static int zzB(long j13) {
        return (640 - (Long.numberOfLeadingZeros(j13) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i13, zzoi zzoiVar, zzow zzowVar) {
        int zzA = zzA(i13 << 3);
        return ((zzko) zzoiVar).zza(zzowVar) + zzA + zzA;
    }

    public static int zzx(zzoi zzoiVar) {
        int zzo = zzoiVar.zzo();
        return zzA(zzo) + zzo;
    }

    public static int zzy(zzoi zzoiVar, zzow zzowVar) {
        int zza = ((zzko) zzoiVar).zza(zzowVar);
        return zzA(zza) + zza;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzpv.zzc(str);
        } catch (zzpu unused) {
            length = str.getBytes(zznl.zza).length;
        }
        return zzA(length) + length;
    }

    public final void zzC() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzD(String str, zzpu zzpuVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzpuVar);
        byte[] bytes = str.getBytes(zznl.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e13) {
            throw new zzll(e13);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b13);

    public abstract void zzd(int i13, boolean z13);

    public abstract void zze(int i13, zzle zzleVar);

    public abstract void zzf(int i13, int i14);

    public abstract void zzg(int i13);

    public abstract void zzh(int i13, long j13);

    public abstract void zzi(long j13);

    public abstract void zzj(int i13, int i14);

    public abstract void zzk(int i13);

    public abstract void zzl(byte[] bArr, int i13, int i14);

    public abstract void zzm(int i13, zzoi zzoiVar, zzow zzowVar);

    public abstract void zzn(int i13, zzoi zzoiVar);

    public abstract void zzo(int i13, zzle zzleVar);

    public abstract void zzp(int i13, String str);

    public abstract void zzr(int i13, int i14);

    public abstract void zzs(int i13, int i14);

    public abstract void zzt(int i13);

    public abstract void zzu(int i13, long j13);

    public abstract void zzv(long j13);

    public /* synthetic */ zzln(zzlm zzlmVar) {
    }
}
