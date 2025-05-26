package com.google.android.recaptcha.internal;

import android.content.Context;
import ao2.j0;
import bl2.c;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import ih.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzv extends zze {

    @NotNull
    private final zzek zza;

    @NotNull
    private final List zzb;
    private zzle zzc;

    @NotNull
    private final Map zzd;

    public zzv(Context context, zzek zzekVar, zzbi zzbiVar, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        zzab zzabVar = new zzab(zzekVar.zza());
        zzp zzpVar = new zzp(zzekVar.zza());
        zzm zzmVar = new zzm(zzekVar.zza(), context.getContentResolver());
        zzn zznVar = new zzn(zzekVar.zza());
        zzek zza = zzekVar.zza();
        j0 zzc = zzbiVar.zzc();
        List j13 = f0.j(zzabVar, zzpVar, zzmVar, zznVar, new zzae(zza, context, zzc, new zzan(context, zzc, zza, IntegrityManagerFactory.createStandard(context), 28800000L), new zzbs(d.f72259b)));
        this.zza = zzekVar;
        this.zzb = j13;
        this.zzd = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzsi zzq(String str) {
        Map d2;
        List list = (List) this.zzd.remove(str);
        if (list != null) {
            List<zzaa> list2 = list;
            int a13 = y0.a(g0.q(list2, 10));
            if (a13 < 16) {
                a13 = 16;
            }
            d2 = new LinkedHashMap(a13);
            for (zzaa zzaaVar : list2) {
                d2.put(Integer.valueOf(zzaaVar.zzb()), zzaaVar);
            }
        } else {
            d2 = z0.d();
        }
        zzsz zzs = zzs(d2, str);
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        zzsf zzf2 = zzsg.zzf();
        byte[] zzd = zzs.zzd();
        zzf2.zze(zzkh.zzh().zzi(zzd, 0, zzd.length));
        zzf.zzf(zzf2);
        return (zzsi) zzf.zzk();
    }

    private final zzsx zzr(zzaa zzaaVar) {
        zzle zzleVar;
        zzsv zzf = zzsx.zzf();
        zzf.zzq(3);
        if (zzaaVar instanceof zzx) {
            zzti zza = ((zzx) zzaaVar).zza();
            zzle zzleVar2 = this.zzc;
            zzleVar = zzleVar2 != null ? zzleVar2 : null;
            byte[] zzd = zza.zzd();
            zzf.zzf(zzcf.zza(zzkh.zzh().zzi(zzd, 0, zzd.length), zzleVar));
        } else {
            if (!(zzaaVar instanceof zzw)) {
                throw new NoWhenBranchMatchedException();
            }
            zzte zza2 = ((zzw) zzaaVar).zza();
            zzle zzleVar3 = this.zzc;
            zzleVar = zzleVar3 != null ? zzleVar3 : null;
            byte[] zzd2 = zza2.zzd();
            zzf.zze(zzcf.zza(zzkh.zzh().zzi(zzd2, 0, zzd2.length), zzleVar));
        }
        return (zzsx) zzf.zzk();
    }

    private final zzsz zzs(Map map, String str) {
        zzsy zzf = zzsz.zzf();
        zzf.zzq(str);
        List list = this.zzb;
        ArrayList<zzy> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzy) obj).zzf()) {
                arrayList.add(obj);
            }
        }
        for (zzy zzyVar : arrayList) {
            if (!map.containsKey(Integer.valueOf(zzyVar.zza()))) {
                int zza = zzyVar.zza();
                zztd zzf2 = zzte.zzf();
                zzf2.zzf(zza);
                zzf2.zzr(13);
                zzf2.zzq(27);
                zzf.zzf(zzr(new zzw(zza, (zzte) zzf2.zzk())));
            }
        }
        Collection values = map.values();
        ArrayList arrayList2 = new ArrayList(g0.q(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzr((zzaa) it.next()));
        }
        zzf.zze(arrayList2);
        return (zzsz) zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzen zza(@NotNull String str) {
        zzek zzekVar = this.zza;
        zzekVar.zzc(str);
        return zzekVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzen zzb() {
        zzek zzekVar = this.zza;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(@NotNull String str, @NotNull c cVar) {
        return zzq(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzf(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzq
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzq r0 = (com.google.android.recaptcha.internal.zzq) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzq r0 = new com.google.android.recaptcha.internal.zzq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ue.c.H(r6)
            com.google.android.recaptcha.internal.zzs r6 = new com.google.android.recaptcha.internal.zzs
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.zzc = r3
            java.lang.Object r6 = dl2.b.O(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            xk2.s r6 = (xk2.s) r6
            java.lang.Object r5 = r6.f135226a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzv.zzf(java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzh(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzsc r5, @org.jetbrains.annotations.NotNull bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzt
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzt r0 = (com.google.android.recaptcha.internal.zzt) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzt r0 = new com.google.android.recaptcha.internal.zzt
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ue.c.H(r6)
            com.google.android.recaptcha.internal.zzu r6 = new com.google.android.recaptcha.internal.zzu
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r6 = dl2.b.O(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            xk2.s r6 = (xk2.s) r6
            java.lang.Object r5 = r6.f135226a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzv.zzh(com.google.android.recaptcha.internal.zzsc, bl2.c):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final void zzk(@NotNull zzsr zzsrVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzy) it.next()).zze(zzsrVar);
        }
    }

    @NotNull
    public final Map zzo() {
        return this.zzd;
    }
}
