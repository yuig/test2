package com.google.android.recaptcha.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
final class zzgr extends s implements Function2 {
    final /* synthetic */ zzgd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgr(zzgd zzgdVar, String str, int i13) {
        super(2);
        this.zza = zzgdVar;
        this.zzb = str;
        this.zzc = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i13 = this.zzc;
        if (i13 != -1) {
            this.zza.zzc().zze(i13, objArr);
        }
        return Unit.f80348a;
    }
}
