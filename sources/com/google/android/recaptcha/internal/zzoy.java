package com.google.android.recaptcha.internal;

import a.c;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzoy {
    public static final /* synthetic */ int zza = 0;
    private static final zzpl zzb;

    static {
        int i13 = zzos.zza;
        zzb = new zzpn();
    }

    public static void zzA(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzA(i13, list, z13);
    }

    public static void zzB(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzC(i13, list, z13);
    }

    public static void zzC(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzE(i13, list, z13);
    }

    public static void zzD(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzJ(i13, list, z13);
    }

    public static void zzE(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzL(i13, list, z13);
    }

    public static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            i13 = 0;
            while (i14 < size) {
                i13 += zzln.zzB(zzneVar.zze(i14));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += zzln.zzB(((Integer) list.get(i14)).intValue());
                i14++;
            }
        }
        return i13;
    }

    public static int zzb(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzln.zzA(i13 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzln.zzA(i13 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            i13 = 0;
            while (i14 < size) {
                i13 += zzln.zzB(zzneVar.zze(i14));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += zzln.zzB(((Integer) list.get(i14)).intValue());
                i14++;
            }
        }
        return i13;
    }

    public static int zzg(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            i13 = 0;
            while (i14 < size) {
                i13 += zzln.zzB(zznxVar.zze(i14));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += zzln.zzB(((Long) list.get(i14)).longValue());
                i14++;
            }
        }
        return i13;
    }

    public static int zzh(int i13, Object obj, zzow zzowVar) {
        int i14 = i13 << 3;
        if (!(obj instanceof zznt)) {
            return zzln.zzy((zzoi) obj, zzowVar) + zzln.zzA(i14);
        }
        int zzA = zzln.zzA(i14);
        int zza2 = ((zznt) obj).zza();
        return c.b(zza2, zza2, zzA);
    }

    public static int zzi(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            i13 = 0;
            while (i14 < size) {
                int zze = zzneVar.zze(i14);
                i13 += zzln.zzA((zze >> 31) ^ (zze + zze));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                int intValue = ((Integer) list.get(i14)).intValue();
                i13 += zzln.zzA((intValue >> 31) ^ (intValue + intValue));
                i14++;
            }
        }
        return i13;
    }

    public static int zzj(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            i13 = 0;
            while (i14 < size) {
                long zze = zznxVar.zze(i14);
                i13 += zzln.zzB((zze >> 63) ^ (zze + zze));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                long longValue = ((Long) list.get(i14)).longValue();
                i13 += zzln.zzB((longValue >> 63) ^ (longValue + longValue));
                i14++;
            }
        }
        return i13;
    }

    public static int zzk(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            i13 = 0;
            while (i14 < size) {
                i13 += zzln.zzA(zzneVar.zze(i14));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += zzln.zzA(((Integer) list.get(i14)).intValue());
                i14++;
            }
        }
        return i13;
    }

    public static int zzl(List list) {
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            i13 = 0;
            while (i14 < size) {
                i13 += zzln.zzB(zznxVar.zze(i14));
                i14++;
            }
        } else {
            i13 = 0;
            while (i14 < size) {
                i13 += zzln.zzB(((Long) list.get(i14)).longValue());
                i14++;
            }
        }
        return i13;
    }

    public static zzpl zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i13, List list, zznh zznhVar, Object obj2, zzpl zzplVar) {
        if (zznhVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                Integer num = (Integer) list.get(i15);
                int intValue = num.intValue();
                if (zznhVar.zza(intValue)) {
                    if (i15 != i14) {
                        list.set(i14, num);
                    }
                    i14++;
                } else {
                    obj2 = zzo(obj, i13, intValue, obj2, zzplVar);
                }
            }
            if (i14 != size) {
                list.subList(i14, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zznhVar.zza(intValue2)) {
                    obj2 = zzo(obj, i13, intValue2, obj2, zzplVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i13, int i14, Object obj2, zzpl zzplVar) {
        if (obj2 == null) {
            obj2 = zzplVar.zza(obj);
        }
        zzplVar.zzh(obj2, i13, i14);
        return obj2;
    }

    public static void zzp(zzmp zzmpVar, Object obj, Object obj2) {
        zzmt zzmtVar = ((zzna) obj2).zzb;
        if (zzmtVar.zza.isEmpty()) {
            return;
        }
        ((zzna) obj).zzi().zzh(zzmtVar);
    }

    public static void zzq(zzpl zzplVar, Object obj, Object obj2) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        zzpm zzpmVar2 = ((zznd) obj2).zzc;
        if (!zzpm.zzc().equals(zzpmVar2)) {
            if (zzpm.zzc().equals(zzpmVar)) {
                zzpmVar = zzpm.zze(zzpmVar, zzpmVar2);
            } else {
                zzpmVar.zzd(zzpmVar2);
            }
        }
        zzndVar.zzc = zzpmVar;
    }

    public static void zzr(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzc(i13, list, z13);
    }

    public static void zzs(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzg(i13, list, z13);
    }

    public static void zzt(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzj(i13, list, z13);
    }

    public static void zzu(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzl(i13, list, z13);
    }

    public static void zzv(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzn(i13, list, z13);
    }

    public static void zzw(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzp(i13, list, z13);
    }

    public static void zzx(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzs(i13, list, z13);
    }

    public static void zzy(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzu(i13, list, z13);
    }

    public static void zzz(int i13, List list, zzpy zzpyVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzy(i13, list, z13);
    }
}
