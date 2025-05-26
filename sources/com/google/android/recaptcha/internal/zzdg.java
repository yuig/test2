package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes3.dex */
final class zzdg extends j implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j13, zzsp zzspVar, c cVar) {
        super(2, cVar);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j13;
        this.zzf = zzspVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zzek zzu;
        zzen zzenVar;
        Exception e13;
        TimeoutCancellationException e14;
        zzbd e15;
        zzbd zzs;
        zzbd zzs2;
        zzbd zzs3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                ue.c.H(obj);
            } catch (zzbd e16) {
                e15 = e16;
                zzs3 = this.zzc.zzs(e15, e15);
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (TimeoutCancellationException e17) {
                e14 = e17;
                zzs2 = this.zzc.zzs(e14, new zzbd(zzbb.zzc, zzba.zzb, e14.getMessage()));
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e18) {
                e13 = e18;
                zzs = this.zzc.zzs(e13, new zzbd(zzbb.zzc, zzba.zzZ, e13.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        } else {
            ue.c.H(obj);
            zzu = this.zzc.zzu(this.zzd);
            zzen zzf = zzu.zzf(28);
            try {
                long j13 = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzf, null);
                this.zza = zzf;
                this.zzb = 1;
                Object w23 = bs1.c.w2(j13, zzdfVar, this);
                if (w23 == aVar) {
                    return aVar;
                }
                zzenVar = zzf;
                obj = w23;
            } catch (zzbd e19) {
                zzenVar = zzf;
                e15 = e19;
                zzs3 = this.zzc.zzs(e15, e15);
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (TimeoutCancellationException e23) {
                zzenVar = zzf;
                e14 = e23;
                zzs2 = this.zzc.zzs(e14, new zzbd(zzbb.zzc, zzba.zzb, e14.getMessage()));
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e24) {
                zzenVar = zzf;
                e13 = e24;
                zzs = this.zzc.zzs(e13, new zzbd(zzbb.zzc, zzba.zzZ, e13.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        }
        return (zzsr) obj;
    }
}
