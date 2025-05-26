package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class e implements i, n, Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f31364a;

    /* renamed from: b, reason: collision with root package name */
    public final TreeMap f31365b;

    public e() {
        this.f31364a = new TreeMap();
        this.f31365b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final boolean b(String str) {
        return "length".equals(str) || this.f31365b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final void c(String str, n nVar) {
        TreeMap treeMap = this.f31365b;
        if (nVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, nVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03d0, code lost:
    
        if (com.google.android.gms.internal.measurement.o0.l(r26, r28, (com.google.android.gms.internal.measurement.o) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).i() != i()) goto L205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c2  */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.measurement.e] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, java.lang.String] */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n d(java.lang.String r27, m.h r28, java.util.ArrayList r29) {
        /*
            Method dump skipped, instructions count: 2346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e.d(java.lang.String, m.h, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final n e(int i13) {
        n nVar;
        if (i13 < i()) {
            return (!p(i13) || (nVar = (n) this.f31364a.get(Integer.valueOf(i13))) == null) ? n.Fn : nVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (i() != eVar.i()) {
            return false;
        }
        TreeMap treeMap = this.f31364a;
        if (treeMap.isEmpty()) {
            return eVar.f31364a.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!e(intValue).equals(eVar.e(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final void f(n nVar) {
        n(i(), nVar);
    }

    public final int hashCode() {
        return this.f31364a.hashCode() * 31;
    }

    public final int i() {
        TreeMap treeMap = this.f31364a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r(this, 2);
    }

    public final String j(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb3 = new StringBuilder();
        if (!this.f31364a.isEmpty()) {
            for (int i13 = 0; i13 < i(); i13++) {
                n e13 = e(i13);
                sb3.append(str);
                if (!(e13 instanceof t) && !(e13 instanceof l)) {
                    sb3.append(e13.zzf());
                }
            }
            sb3.delete(0, str.length());
        }
        return sb3.toString();
    }

    public final void l(int i13) {
        TreeMap treeMap = this.f31364a;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i13 > intValue || i13 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i13));
        if (i13 == intValue) {
            int i14 = i13 - 1;
            if (treeMap.containsKey(Integer.valueOf(i14)) || i14 < 0) {
                return;
            }
            treeMap.put(Integer.valueOf(i14), n.Fn);
            return;
        }
        while (true) {
            i13++;
            if (i13 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            n nVar = (n) treeMap.get(Integer.valueOf(i13));
            if (nVar != null) {
                treeMap.put(Integer.valueOf(i13 - 1), nVar);
                treeMap.remove(Integer.valueOf(i13));
            }
        }
    }

    public final void n(int i13, n nVar) {
        if (i13 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i13 < 0) {
            throw new IndexOutOfBoundsException(a.a.d("Out of bounds index: ", i13));
        }
        TreeMap treeMap = this.f31364a;
        if (nVar == null) {
            treeMap.remove(Integer.valueOf(i13));
        } else {
            treeMap.put(Integer.valueOf(i13), nVar);
        }
    }

    public final boolean p(int i13) {
        if (i13 >= 0) {
            TreeMap treeMap = this.f31364a;
            if (i13 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i13));
            }
        }
        throw new IndexOutOfBoundsException(a.a.d("Out of bounds index: ", i13));
    }

    public final Iterator r() {
        return this.f31364a.keySet().iterator();
    }

    public final ArrayList s() {
        ArrayList arrayList = new ArrayList(i());
        for (int i13 = 0; i13 < i(); i13++) {
            arrayList.add(e(i13));
        }
        return arrayList;
    }

    public final String toString() {
        return j(",");
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final n zza(String str) {
        n nVar;
        return "length".equals(str) ? new g(Double.valueOf(i())) : (!b(str) || (nVar = (n) this.f31365b.get(str)) == null) ? n.Fn : nVar;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n zzc() {
        e eVar = new e();
        for (Map.Entry entry : this.f31364a.entrySet()) {
            boolean z13 = entry.getValue() instanceof i;
            TreeMap treeMap = eVar.f31364a;
            if (z13) {
                treeMap.put((Integer) entry.getKey(), (n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((n) entry.getValue()).zzc());
            }
        }
        return eVar;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double zze() {
        TreeMap treeMap = this.f31364a;
        return treeMap.size() == 1 ? e(0).zze() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzf() {
        return j(",");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator zzh() {
        return new d(this.f31364a.keySet().iterator(), this.f31365b.keySet().iterator());
    }

    public e(List list) {
        this();
        if (list != null) {
            for (int i13 = 0; i13 < list.size(); i13++) {
                n(i13, (n) list.get(i13));
            }
        }
    }

    public e(n... nVarArr) {
        this(Arrays.asList(nVarArr));
    }
}
