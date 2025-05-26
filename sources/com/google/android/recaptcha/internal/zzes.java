package com.google.android.recaptcha.internal;

import android.content.Context;
import ao2.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzes implements zzeo {
    private static Timer zza;

    @NotNull
    private final Context zzb;

    @NotNull
    private final zzet zzc;

    @NotNull
    private final j0 zzd;
    private final zzei zze;

    public zzes(@NotNull Context context, @NotNull zzet zzetVar, @NotNull j0 j0Var) {
        zzei zzeiVar;
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = j0Var;
        zzei zzeiVar2 = null;
        byte b13 = 0;
        try {
            zzeiVar = zzei.zzd;
            zzeiVar = zzeiVar == null ? new zzei(context, b13 == true ? 1 : 0) : zzeiVar;
            zzei.zzd = zzeiVar;
            zzeiVar2 = zzeiVar;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar2;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzei zzeiVar;
        zztx zzk;
        int zzN;
        int i13;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            for (List<zzej> list : CollectionsKt.L0(zzeiVar2.zzd(), 20, 20, true)) {
                zzrd zzi = zzrf.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzej zzejVar : list) {
                    try {
                        zzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        zzN = zzk.zzN();
                        i13 = zzN - 1;
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                    if (zzN == 0) {
                        throw null;
                    }
                    if (i13 == 0) {
                        zzi.zzq(zzk.zzf());
                    } else if (i13 == 1) {
                        zzi.zzr(zzk.zzg());
                    } else {
                        if (i13 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Unit unit = Unit.f80348a;
                    }
                    arrayList.add(zzejVar);
                }
                if (zzi.zzf() + zzi.zze() != 0) {
                    if (this.zzc.zza(((zzrf) zzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(@NotNull zztx zztxVar) {
        j.z(this.zzd, null, null, new zzer(this, zztxVar, null), 3);
        zzh();
    }
}
