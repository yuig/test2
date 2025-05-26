package gi;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r1 extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65111a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f65112b;

    public r1(e0 e0Var) {
        e0Var.getClass();
        this.f65112b = e0Var;
        r0 e13 = e0Var.entrySet().e();
        int i13 = 0;
        while (e13.hasNext()) {
            Map.Entry entry = (Map.Entry) e13.next();
            int a13 = ((t1) entry.getKey()).a();
            i13 = i13 < a13 ? a13 : i13;
            int a14 = ((t1) entry.getValue()).a();
            if (i13 < a14) {
                i13 = a14;
            }
        }
        int i14 = i13 + 1;
        this.f65111a = i14;
        if (i14 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // gi.t1
    public final int a() {
        return this.f65111a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        t1 t1Var = (t1) obj;
        int zza = t1Var.zza();
        int c13 = t1.c((byte) -96);
        if (c13 != zza) {
            return c13 - t1Var.zza();
        }
        e0 e0Var = this.f65112b;
        int size = e0Var.f65063d.size();
        e0 e0Var2 = ((r1) t1Var).f65112b;
        if (size != e0Var2.f65063d.size()) {
            return e0Var.f65063d.size() - e0Var2.f65063d.size();
        }
        r0 e13 = e0Var.entrySet().e();
        r0 e14 = e0Var2.entrySet().e();
        do {
            if (!e13.hasNext() && !e14.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) e13.next();
            Map.Entry entry2 = (Map.Entry) e14.next();
            int compareTo2 = ((t1) entry.getKey()).compareTo((t1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((t1) entry.getValue()).compareTo((t1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            return this.f65112b.equals(((r1) obj).f65112b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(t1.c((byte) -96)), this.f65112b});
    }

    public final String toString() {
        e0 e0Var = this.f65112b;
        if (e0Var.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r0 e13 = e0Var.entrySet().e();
        while (e13.hasNext()) {
            Map.Entry entry = (Map.Entry) e13.next();
            linkedHashMap.put(((t1) entry.getKey()).toString().replace("\n", "\n  "), ((t1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        z.a aVar = new z.a(",\n  ", 5);
        StringBuilder sb3 = new StringBuilder("{\n  ");
        try {
            kh2.d.o1(sb3, linkedHashMap.entrySet().iterator(), aVar);
            sb3.append("\n}");
            return sb3.toString();
        } catch (IOException e14) {
            throw new AssertionError(e14);
        }
    }

    @Override // gi.t1
    public final int zza() {
        return t1.c((byte) -96);
    }
}
