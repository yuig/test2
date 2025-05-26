package g1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f63295a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f63296b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f63297c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f63298d;

    public p() {
        this((Object) null);
    }

    public final void a() {
        int i13 = this.f63298d;
        Object[] objArr = this.f63297c;
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = null;
        }
        this.f63298d = 0;
        this.f63295a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p clone() {
        Object clone = super.clone();
        Intrinsics.g(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        p pVar = (p) clone;
        pVar.f63296b = (long[]) this.f63296b.clone();
        pVar.f63297c = (Object[]) this.f63297c.clone();
        return pVar;
    }

    public final Object c(long j13) {
        Object obj;
        int b13 = h1.a.b(this.f63298d, j13, this.f63296b);
        if (b13 < 0 || (obj = this.f63297c[b13]) == q.f63303a) {
            return null;
        }
        return obj;
    }

    public final int g(long j13) {
        if (this.f63295a) {
            int i13 = this.f63298d;
            long[] jArr = this.f63296b;
            Object[] objArr = this.f63297c;
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                Object obj = objArr[i15];
                if (obj != q.f63303a) {
                    if (i15 != i14) {
                        jArr[i14] = jArr[i15];
                        objArr[i14] = obj;
                        objArr[i15] = null;
                    }
                    i14++;
                }
            }
            this.f63295a = false;
            this.f63298d = i14;
        }
        return h1.a.b(this.f63298d, j13, this.f63296b);
    }

    public final boolean h() {
        return m() == 0;
    }

    public final long i(int i13) {
        if (!(i13 >= 0 && i13 < this.f63298d)) {
            kh2.n.h0("Expected index to be within 0..size()-1, but was " + i13);
            throw null;
        }
        if (this.f63295a) {
            int i14 = this.f63298d;
            long[] jArr = this.f63296b;
            Object[] objArr = this.f63297c;
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                Object obj = objArr[i16];
                if (obj != q.f63303a) {
                    if (i16 != i15) {
                        jArr[i15] = jArr[i16];
                        objArr[i15] = obj;
                        objArr[i16] = null;
                    }
                    i15++;
                }
            }
            this.f63295a = false;
            this.f63298d = i15;
        }
        return this.f63296b[i13];
    }

    public final void j(long j13, Object obj) {
        int b13 = h1.a.b(this.f63298d, j13, this.f63296b);
        if (b13 >= 0) {
            this.f63297c[b13] = obj;
            return;
        }
        int i13 = ~b13;
        int i14 = this.f63298d;
        if (i13 < i14) {
            Object[] objArr = this.f63297c;
            if (objArr[i13] == q.f63303a) {
                this.f63296b[i13] = j13;
                objArr[i13] = obj;
                return;
            }
        }
        if (this.f63295a) {
            long[] jArr = this.f63296b;
            if (i14 >= jArr.length) {
                Object[] objArr2 = this.f63297c;
                int i15 = 0;
                for (int i16 = 0; i16 < i14; i16++) {
                    Object obj2 = objArr2[i16];
                    if (obj2 != q.f63303a) {
                        if (i16 != i15) {
                            jArr[i15] = jArr[i16];
                            objArr2[i15] = obj2;
                            objArr2[i16] = null;
                        }
                        i15++;
                    }
                }
                this.f63295a = false;
                this.f63298d = i15;
                i13 = ~h1.a.b(i15, j13, this.f63296b);
            }
        }
        int i17 = this.f63298d;
        if (i17 >= this.f63296b.length) {
            int i18 = (i17 + 1) * 8;
            int i19 = 4;
            while (true) {
                if (i19 >= 32) {
                    break;
                }
                int i23 = (1 << i19) - 12;
                if (i18 <= i23) {
                    i18 = i23;
                    break;
                }
                i19++;
            }
            int i24 = i18 / 8;
            long[] copyOf = Arrays.copyOf(this.f63296b, i24);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f63296b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f63297c, i24);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f63297c = copyOf2;
        }
        int i25 = this.f63298d - i13;
        if (i25 != 0) {
            long[] destination = this.f63296b;
            int i26 = i13 + 1;
            Intrinsics.checkNotNullParameter(destination, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(destination, i13, destination, i26, i25);
            Object[] objArr3 = this.f63297c;
            kotlin.collections.z.h(i26, i13, this.f63298d, objArr3, objArr3);
        }
        this.f63296b[i13] = j13;
        this.f63297c[i13] = obj;
        this.f63298d++;
    }

    public final void k(long j13) {
        int b13 = h1.a.b(this.f63298d, j13, this.f63296b);
        if (b13 >= 0) {
            Object[] objArr = this.f63297c;
            Object obj = objArr[b13];
            Object obj2 = q.f63303a;
            if (obj != obj2) {
                objArr[b13] = obj2;
                this.f63295a = true;
            }
        }
    }

    public final void l(int i13) {
        Object[] objArr = this.f63297c;
        Object obj = objArr[i13];
        Object obj2 = q.f63303a;
        if (obj != obj2) {
            objArr[i13] = obj2;
            this.f63295a = true;
        }
    }

    public final int m() {
        if (this.f63295a) {
            int i13 = this.f63298d;
            long[] jArr = this.f63296b;
            Object[] objArr = this.f63297c;
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                Object obj = objArr[i15];
                if (obj != q.f63303a) {
                    if (i15 != i14) {
                        jArr[i14] = jArr[i15];
                        objArr[i14] = obj;
                        objArr[i15] = null;
                    }
                    i14++;
                }
            }
            this.f63295a = false;
            this.f63298d = i14;
        }
        return this.f63298d;
    }

    public final Object n(int i13) {
        if (!(i13 >= 0 && i13 < this.f63298d)) {
            kh2.n.h0("Expected index to be within 0..size()-1, but was " + i13);
            throw null;
        }
        if (this.f63295a) {
            int i14 = this.f63298d;
            long[] jArr = this.f63296b;
            Object[] objArr = this.f63297c;
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                Object obj = objArr[i16];
                if (obj != q.f63303a) {
                    if (i16 != i15) {
                        jArr[i15] = jArr[i16];
                        objArr[i15] = obj;
                        objArr[i16] = null;
                    }
                    i15++;
                }
            }
            this.f63295a = false;
            this.f63298d = i15;
        }
        return this.f63297c[i13];
    }

    public final String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(this.f63298d * 28);
        sb3.append('{');
        int i13 = this.f63298d;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb3.append(", ");
            }
            sb3.append(i(i14));
            sb3.append('=');
            Object n13 = n(i14);
            if (n13 != sb3) {
                sb3.append(n13);
            } else {
                sb3.append("(this Map)");
            }
        }
        sb3.append('}');
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder(capacity).…builderAction).toString()");
        return sb4;
    }

    public /* synthetic */ p(Object obj) {
        this(10);
    }

    public p(int i13) {
        if (i13 == 0) {
            this.f63296b = h1.a.f66446b;
            this.f63297c = h1.a.f66447c;
            return;
        }
        int i14 = i13 * 8;
        int i15 = 4;
        while (true) {
            if (i15 >= 32) {
                break;
            }
            int i16 = (1 << i15) - 12;
            if (i14 <= i16) {
                i14 = i16;
                break;
            }
            i15++;
        }
        int i17 = i14 / 8;
        this.f63296b = new long[i17];
        this.f63297c = new Object[i17];
    }
}
