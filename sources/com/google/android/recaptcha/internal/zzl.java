package com.google.android.recaptcha.internal;

import bl2.c;
import dl2.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.k0;
import kotlin.collections.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzl {

    @NotNull
    private final List zza;
    private zzek zzb;

    public zzl() {
        this(null, 1, null);
    }

    private final void zzh(zze... zzeVarArr) {
        k0.v(this.zza, zzeVarArr);
    }

    public final Object zzb(@NotNull String str, long j13, @NotNull c cVar) {
        return b.O(new zzh(this, str, j13, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(long r13, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzsc r15, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzek r16, @org.jetbrains.annotations.NotNull bl2.c r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzi
            if (r1 == 0) goto L16
            r1 = r0
            com.google.android.recaptcha.internal.zzi r1 = (com.google.android.recaptcha.internal.zzi) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.zzc = r2
            r9 = r12
            goto L1c
        L16:
            com.google.android.recaptcha.internal.zzi r1 = new com.google.android.recaptcha.internal.zzi
            r9 = r12
            r1.<init>(r12, r0)
        L1c:
            java.lang.Object r0 = r1.zza
            cl2.a r10 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r1.zzc
            r11 = 1
            if (r2 == 0) goto L33
            if (r2 != r11) goto L2b
            ue.c.H(r0)
            goto L4b
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            ue.c.H(r0)
            com.google.android.recaptcha.internal.zzk r0 = new com.google.android.recaptcha.internal.zzk
            r8 = 0
            r2 = r0
            r3 = r12
            r4 = r16
            r5 = r13
            r7 = r15
            r2.<init>(r3, r4, r5, r7, r8)
            r1.zzc = r11
            java.lang.Object r0 = dl2.b.O(r0, r1)
            if (r0 != r10) goto L4b
            return r10
        L4b:
            xk2.s r0 = (xk2.s) r0
            java.lang.Object r0 = r0.f135226a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzl.zzc(long, com.google.android.recaptcha.internal.zzsc, com.google.android.recaptcha.internal.zzek, bl2.c):java.lang.Object");
    }

    @NotNull
    public final List zzd() {
        return this.zza;
    }

    public final void zzf(@NotNull zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(@NotNull zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public zzl(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        q0 q0Var = q0.f80391a;
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) q0Var.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
