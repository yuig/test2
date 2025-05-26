package ri2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f108401a;

    /* renamed from: b, reason: collision with root package name */
    public int f108402b;

    public d(Object[] objArr) {
        this.f108401a = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r9.compare(r3, r4) <= 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(java.lang.Object[] r5, int r6, int r7, java.lang.Object[] r8, java.util.Comparator r9) {
        /*
            int r0 = r7 - r6
            r1 = 2
            if (r0 > r1) goto L6
            return
        L6:
            int r0 = r7 + r6
            int r0 = r0 / 4
            int r0 = r0 * r1
            d(r8, r6, r0, r5, r9)
            d(r8, r0, r7, r5, r9)
            r1 = r6
            r2 = r0
        L13:
            if (r6 >= r7) goto L4d
            int r3 = r0 + (-1)
            if (r1 >= r3) goto L3c
            int r3 = r7 + (-1)
            if (r2 >= r3) goto L2d
            r3 = r5[r1]
            r4 = r5[r2]
            if (r3 != 0) goto L24
            goto L2d
        L24:
            if (r4 != 0) goto L27
            goto L3c
        L27:
            int r3 = r9.compare(r3, r4)
            if (r3 > 0) goto L3c
        L2d:
            r3 = r5[r1]
            r8[r6] = r3
            int r3 = r6 + 1
            int r4 = r1 + 1
            r4 = r5[r4]
            r8[r3] = r4
            int r1 = r1 + 2
            goto L4a
        L3c:
            r3 = r5[r2]
            r8[r6] = r3
            int r3 = r6 + 1
            int r4 = r2 + 1
            r4 = r5[r4]
            r8[r3] = r4
            int r2 = r2 + 2
        L4a:
            int r6 = r6 + 2
            goto L13
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ri2.d.d(java.lang.Object[], int, int, java.lang.Object[], java.util.Comparator):void");
    }

    public final Map a() {
        List asList = Arrays.asList(this.f108401a);
        int i13 = j.f108414c;
        return asList.isEmpty() ? Collections.emptyMap() : new j(asList);
    }

    public final int c() {
        return this.f108401a.length / 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return Arrays.equals(this.f108401a, ((d) obj).f108401a);
        }
        return false;
    }

    public final void forEach(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return;
        }
        int i13 = 0;
        while (true) {
            Object[] objArr = this.f108401a;
            if (i13 >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i13], objArr[i13 + 1]);
            i13 += 2;
        }
    }

    public final int hashCode() {
        int i13 = this.f108402b;
        if (i13 != 0) {
            return i13;
        }
        int hashCode = Arrays.hashCode(this.f108401a) ^ 1000003;
        this.f108402b = hashCode;
        return hashCode;
    }

    public final boolean isEmpty() {
        return this.f108401a.length == 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("{");
        int i13 = 0;
        while (true) {
            Object[] objArr = this.f108401a;
            if (i13 >= objArr.length) {
                break;
            }
            Object obj = objArr[i13 + 1];
            String k13 = obj instanceof String ? ep.b.k(new StringBuilder("\""), (String) obj, '\"') : obj.toString();
            sb3.append(objArr[i13]);
            sb3.append("=");
            sb3.append(k13);
            sb3.append(", ");
            i13 += 2;
        }
        if (sb3.length() > 1) {
            sb3.setLength(sb3.length() - 2);
        }
        sb3.append("}");
        return sb3.toString();
    }
}
