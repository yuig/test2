package com.google.android.recaptcha.internal;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzen {
    private static zzqk zza;

    @NotNull
    private final String zzb;

    @NotNull
    private final String zzc;

    @NotNull
    private final String zzd;
    private final String zze;

    @NotNull
    private final zzeo zzf;

    @NotNull
    private final Context zzg;
    private final Integer zzh;

    @NotNull
    private final String zzi = zzqb.zzc(zzqb.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();

    @NotNull
    private final int zzk;

    @NotNull
    private final int zzl;

    public zzen(@NotNull int i13, @NotNull String str, @NotNull int i14, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull zzeo zzeoVar, @NotNull zzcc zzccVar, @NotNull Context context, Integer num) {
        this.zzk = i13;
        this.zzb = str;
        this.zzl = i14;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzeoVar;
        this.zzg = context;
        this.zzh = num;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:35:0x00df
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private final void zzc(int r12, com.google.android.recaptcha.internal.zzqq r13) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzen.zzc(int, com.google.android.recaptcha.internal.zzqq):void");
    }

    public final void zza() {
        zzc(3, null);
    }

    public final void zzb(@NotNull zzbd zzbdVar) {
        zzqo zzg = zzqq.zzg();
        zzg.zzr(String.valueOf(zzbdVar.zzb().zza()));
        zzg.zze(zzbdVar.zza().zza());
        zzg.zzq(zzbdVar.zzc().getErrorCode().getErrorCode());
        String zzd = zzbdVar.zzd();
        if (zzd != null) {
            zzg.zzf(zzd);
        }
        zzc(4, (zzqq) zzg.zzk());
    }
}
