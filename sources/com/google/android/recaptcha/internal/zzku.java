package com.google.android.recaptcha.internal;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
final class zzku {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i13, zzkt zzktVar) {
        int zzi = zzi(bArr, i13, zzktVar);
        int i14 = zzktVar.zza;
        if (i14 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i14 > bArr.length - zzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i14 == 0) {
            zzktVar.zzc = zzle.zzb;
            return zzi;
        }
        zzktVar.zzc = zzle.zzk(bArr, zzi, i14);
        return zzi + i14;
    }

    public static int zzb(byte[] bArr, int i13) {
        int i14 = bArr[i13] & 255;
        int i15 = bArr[i13 + 1] & 255;
        int i16 = bArr[i13 + 2] & 255;
        return ((bArr[i13 + 3] & 255) << 24) | (i15 << 8) | i14 | (i16 << 16);
    }

    public static int zzc(zzow zzowVar, byte[] bArr, int i13, int i14, int i15, zzkt zzktVar) {
        Object zze = zzowVar.zze();
        int zzm = zzm(zze, zzowVar, bArr, i13, i14, i15, zzktVar);
        zzowVar.zzf(zze);
        zzktVar.zzc = zze;
        return zzm;
    }

    public static int zzd(zzow zzowVar, byte[] bArr, int i13, int i14, zzkt zzktVar) {
        Object zze = zzowVar.zze();
        int zzn = zzn(zze, zzowVar, bArr, i13, i14, zzktVar);
        zzowVar.zzf(zze);
        zzktVar.zzc = zze;
        return zzn;
    }

    public static int zze(zzow zzowVar, int i13, byte[] bArr, int i14, int i15, zznk zznkVar, zzkt zzktVar) {
        int zzd = zzd(zzowVar, bArr, i14, i15, zzktVar);
        zznkVar.add(zzktVar.zzc);
        while (zzd < i15) {
            int zzi = zzi(bArr, zzd, zzktVar);
            if (i13 != zzktVar.zza) {
                break;
            }
            zzd = zzd(zzowVar, bArr, zzi, i15, zzktVar);
            zznkVar.add(zzktVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i13, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int zzi = zzi(bArr, i13, zzktVar);
        int i14 = zzktVar.zza + zzi;
        while (zzi < i14) {
            zzi = zzi(bArr, zzi, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        if (zzi == i14) {
            return zzi;
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(byte[] bArr, int i13, zzkt zzktVar) {
        int zzi = zzi(bArr, i13, zzktVar);
        int i14 = zzktVar.zza;
        if (i14 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i14 == 0) {
            zzktVar.zzc = "";
            return zzi;
        }
        zzktVar.zzc = new String(bArr, zzi, i14, zznl.zza);
        return zzi + i14;
    }

    public static int zzh(int i13, byte[] bArr, int i14, int i15, zzpm zzpmVar, zzkt zzktVar) {
        if ((i13 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            int zzl = zzl(bArr, i14, zzktVar);
            zzpmVar.zzj(i13, Long.valueOf(zzktVar.zzb));
            return zzl;
        }
        if (i16 == 1) {
            zzpmVar.zzj(i13, Long.valueOf(zzp(bArr, i14)));
            return i14 + 8;
        }
        if (i16 == 2) {
            int zzi = zzi(bArr, i14, zzktVar);
            int i17 = zzktVar.zza;
            if (i17 < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i17 > bArr.length - zzi) {
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i17 == 0) {
                zzpmVar.zzj(i13, zzle.zzb);
            } else {
                zzpmVar.zzj(i13, zzle.zzk(bArr, zzi, i17));
            }
            return zzi + i17;
        }
        if (i16 != 3) {
            if (i16 != 5) {
                throw new zznn("Protocol message contained an invalid tag (zero).");
            }
            zzpmVar.zzj(i13, Integer.valueOf(zzb(bArr, i14)));
            return i14 + 4;
        }
        int i18 = (i13 & (-8)) | 4;
        zzpm zzf = zzpm.zzf();
        int i19 = zzktVar.zze + 1;
        zzktVar.zze = i19;
        zzq(i19);
        int i23 = 0;
        while (true) {
            if (i14 >= i15) {
                break;
            }
            int zzi2 = zzi(bArr, i14, zzktVar);
            i23 = zzktVar.zza;
            if (i23 == i18) {
                i14 = zzi2;
                break;
            }
            i14 = zzh(i23, bArr, zzi2, i15, zzf, zzktVar);
        }
        zzktVar.zze--;
        if (i14 > i15 || i23 != i18) {
            throw new zznn("Failed to parse the message.");
        }
        zzpmVar.zzj(i13, zzf);
        return i14;
    }

    public static int zzi(byte[] bArr, int i13, zzkt zzktVar) {
        int i14 = i13 + 1;
        byte b13 = bArr[i13];
        if (b13 < 0) {
            return zzj(b13, bArr, i14, zzktVar);
        }
        zzktVar.zza = b13;
        return i14;
    }

    public static int zzj(int i13, byte[] bArr, int i14, zzkt zzktVar) {
        byte b13 = bArr[i14];
        int i15 = i14 + 1;
        int i16 = i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        if (b13 >= 0) {
            zzktVar.zza = i16 | (b13 << 7);
            return i15;
        }
        int i17 = i16 | ((b13 & Byte.MAX_VALUE) << 7);
        int i18 = i14 + 2;
        byte b14 = bArr[i15];
        if (b14 >= 0) {
            zzktVar.zza = i17 | (b14 << 14);
            return i18;
        }
        int i19 = i17 | ((b14 & Byte.MAX_VALUE) << 14);
        int i23 = i14 + 3;
        byte b15 = bArr[i18];
        if (b15 >= 0) {
            zzktVar.zza = i19 | (b15 << 21);
            return i23;
        }
        int i24 = i19 | ((b15 & Byte.MAX_VALUE) << 21);
        int i25 = i14 + 4;
        byte b16 = bArr[i23];
        if (b16 >= 0) {
            zzktVar.zza = i24 | (b16 << 28);
            return i25;
        }
        int i26 = i24 | ((b16 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i27 = i25 + 1;
            if (bArr[i25] >= 0) {
                zzktVar.zza = i26;
                return i27;
            }
            i25 = i27;
        }
    }

    public static int zzk(int i13, byte[] bArr, int i14, int i15, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int zzi = zzi(bArr, i14, zzktVar);
        zzneVar.zzh(zzktVar.zza);
        while (zzi < i15) {
            int zzi2 = zzi(bArr, zzi, zzktVar);
            if (i13 != zzktVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        return zzi;
    }

    public static int zzl(byte[] bArr, int i13, zzkt zzktVar) {
        long j13 = bArr[i13];
        int i14 = i13 + 1;
        if (j13 >= 0) {
            zzktVar.zzb = j13;
            return i14;
        }
        int i15 = i13 + 2;
        byte b13 = bArr[i14];
        long j14 = (j13 & 127) | ((b13 & Byte.MAX_VALUE) << 7);
        int i16 = 7;
        while (b13 < 0) {
            int i17 = i15 + 1;
            i16 += 7;
            j14 |= (r10 & Byte.MAX_VALUE) << i16;
            b13 = bArr[i15];
            i15 = i17;
        }
        zzktVar.zzb = j14;
        return i15;
    }

    public static int zzm(Object obj, zzow zzowVar, byte[] bArr, int i13, int i14, int i15, zzkt zzktVar) {
        zzol zzolVar = (zzol) zzowVar;
        int i16 = zzktVar.zze + 1;
        zzktVar.zze = i16;
        zzq(i16);
        int zzc = zzolVar.zzc(obj, bArr, i13, i14, i15, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return zzc;
    }

    public static int zzn(Object obj, zzow zzowVar, byte[] bArr, int i13, int i14, zzkt zzktVar) {
        int i15 = i13 + 1;
        int i16 = bArr[i13];
        if (i16 < 0) {
            i15 = zzj(i16, bArr, i15, zzktVar);
            i16 = zzktVar.zza;
        }
        int i17 = i15;
        if (i16 < 0 || i16 > i14 - i17) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i18 = zzktVar.zze + 1;
        zzktVar.zze = i18;
        zzq(i18);
        int i19 = i16 + i17;
        zzowVar.zzi(obj, bArr, i17, i19, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return i19;
    }

    public static int zzo(int i13, byte[] bArr, int i14, int i15, zzkt zzktVar) {
        if ((i13 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            return zzl(bArr, i14, zzktVar);
        }
        if (i16 == 1) {
            return i14 + 8;
        }
        if (i16 == 2) {
            return zzi(bArr, i14, zzktVar) + zzktVar.zza;
        }
        if (i16 != 3) {
            if (i16 == 5) {
                return i14 + 4;
            }
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i17 = (i13 & (-8)) | 4;
        int i18 = 0;
        while (i14 < i15) {
            i14 = zzi(bArr, i14, zzktVar);
            i18 = zzktVar.zza;
            if (i18 == i17) {
                break;
            }
            i14 = zzo(i18, bArr, i14, i15, zzktVar);
        }
        if (i14 > i15 || i18 != i17) {
            throw new zznn("Failed to parse the message.");
        }
        return i14;
    }

    public static long zzp(byte[] bArr, int i13) {
        return (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48) | ((bArr[i13 + 7] & 255) << 56);
    }

    private static void zzq(int i13) {
        if (i13 >= zzb) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
