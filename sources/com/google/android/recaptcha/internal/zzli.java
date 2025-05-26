package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public abstract class zzli {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzlj zzc;

    private zzli() {
    }

    public static int zzF(int i13) {
        return (i13 >>> 1) ^ (-(i13 & 1));
    }

    public static long zzG(long j13) {
        return (j13 >>> 1) ^ (-(1 & j13));
    }

    public static zzli zzH(byte[] bArr, int i13, int i14, boolean z13) {
        zzlf zzlfVar = new zzlf(bArr, 0, 0, false, null);
        try {
            zzlfVar.zze(0);
            return zzlfVar;
        } catch (zznn e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public abstract void zzA(int i13);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i13);

    public final void zzI() {
        int zzm;
        do {
            zzm = zzm();
            if (zzm == 0) {
                return;
            }
            int i13 = this.zza;
            if (i13 >= this.zzb) {
                throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.zza = i13 + 1;
            this.zza--;
        } while (zzE(zzm));
    }

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i13);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzle zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i13);

    public /* synthetic */ zzli(zzlh zzlhVar) {
    }
}
