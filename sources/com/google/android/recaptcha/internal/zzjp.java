package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class zzjp extends zzjk {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    public zzjp(Iterable iterable, int i13) {
        this.zza = iterable;
        this.zzb = i13;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i13 = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        zzjf.zzb(i13 >= 0, "numberToAdvance must be nonnegative");
        for (int i14 = 0; i14 < i13 && it.hasNext(); i14++) {
            it.next();
        }
        return new zzjo(this, it);
    }
}
