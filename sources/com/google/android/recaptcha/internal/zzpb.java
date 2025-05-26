package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzpb implements Iterator {
    final /* synthetic */ zzpe zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzpb(zzpe zzpeVar, zzpd zzpdVar) {
        this.zza = zzpeVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13;
        Map map;
        int i14 = this.zzb + 1;
        zzpe zzpeVar = this.zza;
        i13 = zzpeVar.zzb;
        if (i14 < i13) {
            return true;
        }
        map = zzpeVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i13;
        Object[] objArr;
        this.zzc = true;
        int i14 = this.zzb + 1;
        this.zzb = i14;
        zzpe zzpeVar = this.zza;
        i13 = zzpeVar.zzb;
        if (i14 >= i13) {
            return (Map.Entry) zza().next();
        }
        objArr = zzpeVar.zza;
        return (zzpa) objArr[i14];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i13;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i14 = this.zzb;
        zzpe zzpeVar = this.zza;
        i13 = zzpeVar.zzb;
        if (i14 >= i13) {
            zza().remove();
        } else {
            this.zzb = i14 - 1;
            zzpeVar.zzm(i14);
        }
    }
}
