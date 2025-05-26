package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* loaded from: classes3.dex */
public final class zzjj extends zzjn implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzjj(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(zzji.zza("maxSize (%s) must >= 0", Integer.valueOf(i13)));
        }
        this.zzb = new ArrayDeque(i13);
        this.zza = i13;
    }

    public static zzjj zza(int i13) {
        return new zzjj(i13);
    }

    @Override // com.google.android.recaptcha.internal.zzjl, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzjl, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.zza) {
            return zzjq.zza(this, collection.iterator());
        }
        clear();
        int i13 = size - this.zza;
        zzjf.zzb(i13 >= 0, "number to skip cannot be negative");
        return zzjq.zza(this, new zzjp(collection, i13).iterator());
    }

    @Override // com.google.android.recaptcha.internal.zzjn, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzjl, com.google.android.recaptcha.internal.zzjm
    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzjn, com.google.android.recaptcha.internal.zzjl
    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzjn
    public final Queue zzd() {
        return this.zzb;
    }
}
