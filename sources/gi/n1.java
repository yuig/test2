package gi;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class n1 extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final z f65100a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65101b;

    public n1(k0 k0Var) {
        k0Var.getClass();
        this.f65100a = k0Var;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            z zVar = this.f65100a;
            if (i13 >= zVar.size()) {
                break;
            }
            int a13 = ((t1) zVar.get(i13)).a();
            if (i14 < a13) {
                i14 = a13;
            }
            i13++;
        }
        int i15 = i14 + 1;
        this.f65101b = i15;
        if (i15 > 8) {
            throw new zzhf();
        }
    }

    @Override // gi.t1
    public final int a() {
        return this.f65101b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        t1 t1Var = (t1) obj;
        int zza = t1Var.zza();
        int c13 = t1.c(Byte.MIN_VALUE);
        if (c13 != zza) {
            return c13 - t1Var.zza();
        }
        z zVar = this.f65100a;
        int size = zVar.size();
        z zVar2 = ((n1) t1Var).f65100a;
        if (size != zVar2.size()) {
            return zVar.size() - zVar2.size();
        }
        for (int i13 = 0; i13 < zVar.size(); i13++) {
            int compareTo = ((t1) zVar.get(i13)).compareTo((t1) zVar2.get(i13));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            return this.f65100a.equals(((n1) obj).f65100a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(t1.c(Byte.MIN_VALUE)), this.f65100a});
    }

    public final String toString() {
        z zVar = this.f65100a;
        if (zVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = zVar.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(((t1) zVar.get(i13)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb3 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb3.append(z.a.o(it.next()));
                while (it.hasNext()) {
                    sb3.append((CharSequence) ",\n  ");
                    sb3.append(z.a.o(it.next()));
                }
            }
            sb3.append("\n]");
            return sb3.toString();
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }

    @Override // gi.t1
    public final int zza() {
        return t1.c(Byte.MIN_VALUE);
    }
}
