package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzft implements zzfo {

    @NotNull
    private final j0 zza;

    @NotNull
    private final zzgf zzb;

    @NotNull
    private final zzhx zzc;

    @NotNull
    private final Map zzd;

    public zzft(@NotNull j0 j0Var, @NotNull zzgf zzgfVar, @NotNull zzhx zzhxVar, @NotNull Map map) {
        this.zza = j0Var;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) {
        zzjh zzb = zzjh.zzb();
        int zza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            throw new zzce(5, 2, null);
        }
        int zzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(zzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (zza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        int i13 = zzbk.zza;
        int zzk = zzufVar.zzk();
        if (zzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbk.zza(zzk - 2, zza2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, c cVar) {
        Object O = b.O(new zzfq(zzgdVar, list, this, null), cVar);
        return O == a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, c cVar) {
        Object O = b.O(new zzfr(exc, zzgdVar, this, null), cVar);
        return O == a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(@NotNull String str) {
        j.z(this.zza, null, null, new zzfs(new zzgd(this.zzb), this, str, null), 3);
    }
}
