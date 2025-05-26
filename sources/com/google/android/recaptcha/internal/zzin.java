package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzin extends j implements Function2 {
    int zza;
    final /* synthetic */ zzja zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(zzja zzjaVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzjaVar;
        this.zzc = str;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzin(this.zzb, this.zzc, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        if (r4 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        return kotlin.Unit.f80348a;
     */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r3.zza
            r2 = 1
            ue.c.H(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L2a
        Ld:
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            r3.zza = r2
            java.lang.Object r4 = r4.zzw(r3)
            if (r4 == r0) goto L2d
        L17:
            android.webkit.WebView r4 = (android.webkit.WebView) r4
            r4.clearCache(r2)
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            java.lang.String r1 = r3.zzc
            r2 = 2
            r3.zza = r2
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzja.zzu(r4, r1, r3)
            if (r4 != r0) goto L2a
            goto L2d
        L2a:
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzin.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
