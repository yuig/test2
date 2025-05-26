package com.google.android.recaptcha.internal;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
class zzpe extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private boolean zzd;
    private volatile zzpc zze;
    private Map zzc = Collections.emptyMap();
    private Map zzf = Collections.emptyMap();

    private zzpe() {
    }

    private final int zzl(Comparable comparable) {
        int i13 = this.zzb;
        int i14 = i13 - 1;
        int i15 = 0;
        if (i14 >= 0) {
            int compareTo = comparable.compareTo(((zzpa) this.zza[i14]).zza());
            if (compareTo > 0) {
                return -(i13 + 1);
            }
            if (compareTo == 0) {
                return i14;
            }
        }
        while (i15 <= i14) {
            int i16 = (i15 + i14) / 2;
            int compareTo2 = comparable.compareTo(((zzpa) this.zza[i16]).zza());
            if (compareTo2 < 0) {
                i14 = i16 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i16;
                }
                i15 = i16 + 1;
            }
        }
        return -(i15 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzm(int i13) {
        zzo();
        Object value = ((zzpa) this.zza[i13]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i13 + 1, objArr, i13, (this.zzb - i13) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzn().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i14 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i14] = new zzpa(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzl(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzpc(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpe)) {
            return super.equals(obj);
        }
        zzpe zzpeVar = (zzpe) obj;
        int size = size();
        if (size != zzpeVar.size()) {
            return false;
        }
        int i13 = this.zzb;
        if (i13 != zzpeVar.zzb) {
            return entrySet().equals(zzpeVar.entrySet());
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (!zzg(i14).equals(zzpeVar.zzg(i14))) {
                return false;
            }
        }
        if (i13 != size) {
            return this.zzc.equals(zzpeVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        return zzl >= 0 ? ((zzpa) this.zza[zzl]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i13 = this.zzb;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            i14 += this.zza[i15].hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + i14 : i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzo();
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return zzm(zzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb;
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzo();
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((zzpa) this.zza[zzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i13 = -(zzl + 1);
        if (i13 >= 16) {
            return zzn().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zzpa zzpaVar = (zzpa) this.zza[15];
            this.zzb = 15;
            zzn().put(zzpaVar.zza(), zzpaVar.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i13, objArr, i13 + 1, 15 - i13);
        this.zza[i13] = new zzpa(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final Map.Entry zzg(int i13) {
        if (i13 < this.zzb) {
            return (zzpa) this.zza[i13];
        }
        throw new ArrayIndexOutOfBoundsException(i13);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    public /* synthetic */ zzpe(zzpd zzpdVar) {
    }
}
