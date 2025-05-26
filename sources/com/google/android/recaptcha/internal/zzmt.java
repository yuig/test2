package com.google.android.recaptcha.internal;

import a.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzmt {
    private static final zzmt zzb = new zzmt(true);
    final zzpe zza = new zzoz();
    private boolean zzc;
    private boolean zzd;

    private zzmt() {
    }

    public static int zza(zzms zzmsVar, Object obj) {
        int zzd;
        int zzA;
        zzpw zzd2 = zzmsVar.zzd();
        int zza = zzmsVar.zza();
        zzmsVar.zzg();
        int zzA2 = zzln.zzA(zza << 3);
        if (zzd2 == zzpw.zzj) {
            zzoi zzoiVar = (zzoi) obj;
            byte[] bArr = zznl.zzb;
            if (zzoiVar instanceof zzkp) {
                throw null;
            }
            zzA2 += zzA2;
        }
        zzpx zzpxVar = zzpx.INT;
        int i13 = 4;
        switch (zzd2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i13 = 8;
                return zzA2 + i13;
            case 1:
                ((Float) obj).getClass();
                return zzA2 + i13;
            case 2:
                i13 = zzln.zzB(((Long) obj).longValue());
                return zzA2 + i13;
            case 3:
                i13 = zzln.zzB(((Long) obj).longValue());
                return zzA2 + i13;
            case 4:
                i13 = zzln.zzB(((Integer) obj).intValue());
                return zzA2 + i13;
            case 5:
                ((Long) obj).getClass();
                i13 = 8;
                return zzA2 + i13;
            case 6:
                ((Integer) obj).getClass();
                return zzA2 + i13;
            case 7:
                ((Boolean) obj).getClass();
                i13 = 1;
                return zzA2 + i13;
            case 8:
                if (!(obj instanceof zzle)) {
                    i13 = zzln.zzz((String) obj);
                    return zzA2 + i13;
                }
                zzd = ((zzle) obj).zzd();
                zzA = zzln.zzA(zzd);
                i13 = zzA + zzd;
                return zzA2 + i13;
            case 9:
                i13 = ((zzoi) obj).zzo();
                return zzA2 + i13;
            case 10:
                if (!(obj instanceof zzns)) {
                    i13 = zzln.zzx((zzoi) obj);
                    return zzA2 + i13;
                }
                zzd = ((zzns) obj).zza();
                zzA = zzln.zzA(zzd);
                i13 = zzA + zzd;
                return zzA2 + i13;
            case 11:
                if (obj instanceof zzle) {
                    zzd = ((zzle) obj).zzd();
                    zzA = zzln.zzA(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzA = zzln.zzA(zzd);
                }
                i13 = zzA + zzd;
                return zzA2 + i13;
            case 12:
                i13 = zzln.zzA(((Integer) obj).intValue());
                return zzA2 + i13;
            case 13:
                i13 = obj instanceof zznf ? zzln.zzB(((zznf) obj).zza()) : zzln.zzB(((Integer) obj).intValue());
                return zzA2 + i13;
            case 14:
                ((Integer) obj).getClass();
                return zzA2 + i13;
            case 15:
                ((Long) obj).getClass();
                i13 = 8;
                return zzA2 + i13;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i13 = zzln.zzA((intValue >> 31) ^ (intValue + intValue));
                return zzA2 + i13;
            case 17:
                long longValue = ((Long) obj).longValue();
                i13 = zzln.zzB((longValue >> 63) ^ (longValue + longValue));
                return zzA2 + i13;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzmt zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzon) {
            return ((zzon) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        boolean z13 = value instanceof zzns;
        zzmsVar.zzg();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            if (z13) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzmsVar, zzl(value));
            return;
        }
        Object zze = zze(zzmsVar);
        if (zze == null) {
            this.zza.put(zzmsVar, zzl(value));
            if (z13) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z13) {
            throw null;
        }
        this.zza.put(zzmsVar, zze instanceof zzon ? zzmsVar.zzc((zzon) zze, (zzon) value) : zzmsVar.zzb(((zzoi) zze).zzae(), (zzoi) value).zzk());
    }

    private static boolean zzn(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return true;
        }
        zzmsVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzoj) {
            return ((zzoj) value).zzp();
        }
        if (value instanceof zzns) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i13;
        int zzA;
        int zzx;
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return zza(zzmsVar, value);
        }
        zzmsVar.zzg();
        zzmsVar.zzf();
        if (value instanceof zzns) {
            int zza = ((zzms) entry.getKey()).zza();
            int zzA2 = zzln.zzA(8);
            i13 = zzA2 + zzA2;
            zzA = zzln.zzA(zza) + zzln.zzA(16);
            int zzA3 = zzln.zzA(24);
            int zza2 = ((zzns) value).zza();
            zzx = c.b(zza2, zza2, zzA3);
        } else {
            int zza3 = ((zzms) entry.getKey()).zza();
            int zzA4 = zzln.zzA(8);
            i13 = zzA4 + zzA4;
            zzA = zzln.zzA(zza3) + zzln.zzA(16);
            zzx = zzln.zzx((zzoi) value) + zzln.zzA(24);
        }
        return i13 + zzA + zzx;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmt) {
            return this.zza.equals(((zzmt) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int zzc = this.zza.zzc();
        int i13 = 0;
        for (int i14 = 0; i14 < zzc; i14++) {
            i13 += zzo(this.zza.zzg(i14));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            i13 += zzo((Map.Entry) it.next());
        }
        return i13;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzmt clone() {
        zzmt zzmtVar = new zzmt();
        int zzc = this.zza.zzc();
        for (int i13 = 0; i13 < zzc; i13++) {
            Map.Entry zzg = this.zza.zzg(i13);
            zzmtVar.zzi((zzms) ((zzpa) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzmtVar.zzi((zzms) entry.getKey(), entry.getValue());
        }
        zzmtVar.zzd = this.zzd;
        return zzmtVar;
    }

    public final Object zze(zzms zzmsVar) {
        Object obj = this.zza.get(zzmsVar);
        if (!(obj instanceof zzns)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zznq(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int zzc = this.zza.zzc();
        for (int i13 = 0; i13 < zzc; i13++) {
            Object value = this.zza.zzg(i13).getValue();
            if (value instanceof zznd) {
                ((zznd) value).zzG();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zznd) {
                ((zznd) value2).zzG();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzmt zzmtVar) {
        int zzc = zzmtVar.zza.zzc();
        for (int i13 = 0; i13 < zzc; i13++) {
            zzm(zzmtVar.zza.zzg(i13));
        }
        Iterator it = zzmtVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zznf) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzns) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.recaptcha.internal.zzms r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.zzg()
            com.google.android.recaptcha.internal.zzpw r0 = r3.zzd()
            byte[] r1 = com.google.android.recaptcha.internal.zznl.zzb
            r4.getClass()
            com.google.android.recaptcha.internal.zzpw r1 = com.google.android.recaptcha.internal.zzpw.zza
            com.google.android.recaptcha.internal.zzpx r1 = com.google.android.recaptcha.internal.zzpx.INT
            com.google.android.recaptcha.internal.zzpx r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L46;
                case 1: goto L43;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L37;
                case 6: goto L2e;
                case 7: goto L25;
                case 8: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L57
        L1c:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzoi
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzns
            if (r0 == 0) goto L57
            goto L4a
        L25:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zznf
            if (r0 == 0) goto L57
            goto L4a
        L2e:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzle
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4a
        L37:
            boolean r0 = r4 instanceof java.lang.String
            goto L48
        L3a:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L48
        L3d:
            boolean r0 = r4 instanceof java.lang.Double
            goto L48
        L40:
            boolean r0 = r4 instanceof java.lang.Float
            goto L48
        L43:
            boolean r0 = r4 instanceof java.lang.Long
            goto L48
        L46:
            boolean r0 = r4 instanceof java.lang.Integer
        L48:
            if (r0 == 0) goto L57
        L4a:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzns
            if (r0 == 0) goto L51
            r0 = 1
            r2.zzd = r0
        L51:
            com.google.android.recaptcha.internal.zzpe r0 = r2.zza
            r0.put(r3, r4)
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.recaptcha.internal.zzpw r3 = r3.zzd()
            com.google.android.recaptcha.internal.zzpx r3 = r3.zza()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmt.zzi(com.google.android.recaptcha.internal.zzms, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        int zzc = this.zza.zzc();
        for (int i13 = 0; i13 < zzc; i13++) {
            if (!zzn(this.zza.zzg(i13))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzmt(boolean z13) {
        zzg();
        zzg();
    }
}
