package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzps {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzpr zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    static {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzps.<clinit>():void");
    }

    private zzps() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i13 = zzks.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(Buffer.class, "address");
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j13, byte b13) {
        zzpr zzprVar = zzf;
        long j14 = (-4) & j13;
        int i13 = zzprVar.zza.getInt(obj, j14);
        int i14 = ((~((int) j13)) & 3) << 3;
        zzprVar.zza.putInt(obj, j14, ((255 & b13) << i14) | (i13 & (~(255 << i14))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j13, byte b13) {
        zzpr zzprVar = zzf;
        long j14 = (-4) & j13;
        int i13 = (((int) j13) & 3) << 3;
        zzprVar.zza.putInt(obj, j14, ((255 & b13) << i13) | (zzprVar.zza.getInt(obj, j14) & (~(255 << i13))));
    }

    public static double zza(Object obj, long j13) {
        return zzf.zza(obj, j13);
    }

    public static float zzb(Object obj, long j13) {
        return zzf.zzb(obj, j13);
    }

    public static int zzc(Object obj, long j13) {
        return zzf.zza.getInt(obj, j13);
    }

    public static long zzd(Object obj, long j13) {
        return zzf.zza.getLong(obj, j13);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public static Object zzf(Object obj, long j13) {
        return zzf.zza.getObject(obj, j13);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzpo());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th3) {
        Logger.getLogger(zzps.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
    }

    public static void zzm(Object obj, long j13, boolean z13) {
        zzf.zzc(obj, j13, z13);
    }

    public static void zzn(byte[] bArr, long j13, byte b13) {
        zzf.zzd(bArr, zza + j13, b13);
    }

    public static void zzo(Object obj, long j13, double d2) {
        zzf.zze(obj, j13, d2);
    }

    public static void zzp(Object obj, long j13, float f13) {
        zzf.zzf(obj, j13, f13);
    }

    public static void zzq(Object obj, long j13, int i13) {
        zzf.zza.putInt(obj, j13, i13);
    }

    public static void zzr(Object obj, long j13, long j14) {
        zzf.zza.putLong(obj, j13, j14);
    }

    public static void zzs(Object obj, long j13, Object obj2) {
        zzf.zza.putObject(obj, j13, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j13) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j13) >>> ((int) (((~j13) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j13) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j13) >>> ((int) ((j13 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzv(Class cls) {
        int i13 = zzks.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzw(Object obj, long j13) {
        return zzf.zzg(obj, j13);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
