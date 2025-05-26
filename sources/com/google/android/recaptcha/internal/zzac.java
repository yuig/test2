package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import com.google.android.play.core.integrity.StandardIntegrityException;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzac extends j implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzae zzaeVar, String str, c cVar) {
        super(2, cVar);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzac(this.zzc, this.zzd, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zzy zzyVar;
        zzan zzanVar;
        String str;
        a aVar = a.COROUTINE_SUSPENDED;
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e13) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e13.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i13 = 2;
            this.zzb = 2;
            if (e13 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e13).getErrorCode();
                if (errorCode == -100) {
                    i13 = 44;
                } else if (errorCode == -12) {
                    i13 = 39;
                } else if (errorCode == -3) {
                    i13 = 30;
                } else if (errorCode == -2) {
                    i13 = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case -19:
                            i13 = 54;
                            break;
                        case -18:
                            i13 = 53;
                            break;
                        case -17:
                            i13 = 52;
                            break;
                        case -16:
                            i13 = 43;
                            break;
                        case -15:
                            i13 = 42;
                            break;
                        case -14:
                            i13 = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i13 = 36;
                                    break;
                                case -8:
                                    i13 = 35;
                                    break;
                                case -7:
                                    i13 = 34;
                                    break;
                                case -6:
                                    i13 = 33;
                                    break;
                                case -5:
                                    i13 = 32;
                                    break;
                            }
                    }
                } else {
                    i13 = 28;
                }
            } else {
                i13 = 45;
            }
            zztd zzf = zzte.zzf();
            zzf.zzq(i13);
            zzf.zzr(15);
            obj = zzf.zzk();
            if (obj == aVar) {
                return aVar;
            }
            zzyVar = zzaeVar;
        }
        if (zzenVar == 0) {
            ue.c.H(obj);
            zzen zzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzanVar = zzaeVar2.zzc;
            str = zzaeVar2.zze;
            this.zza = zzb;
            this.zzb = 1;
            obj = zzanVar.zzc(str, this);
            zzenVar = zzb;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                ue.c.H(obj);
                int zza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(zza, (zzte) zztdVar.zzk());
            }
            zzen zzenVar2 = (zzen) this.zza;
            ue.c.H(obj);
            zzenVar = zzenVar2;
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zzf2 = zzti.zzf();
        zztg zzf3 = zzth.zzf();
        zzf3.zzw((String) obj);
        zzf2.zzf((zzth) zzf3.zzk());
        return zzz.zza(zzaeVar3, (zzti) zzf2.zzk());
    }
}
