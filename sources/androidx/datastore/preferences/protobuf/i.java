package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i implements Iterable, Serializable {

    /* renamed from: b */
    public static final j f18075b = new j(j0.f18081b);

    /* renamed from: c */
    public static final h f18076c;

    /* renamed from: a */
    public int f18077a;

    static {
        f18076c = d.a() ? new k() : new v5.x();
    }

    public static int c(int i13, int i14, int i15) {
        int i16 = i14 - i13;
        if ((i13 | i14 | i16 | (i15 - i14)) >= 0) {
            return i16;
        }
        if (i13 < 0) {
            throw new IndexOutOfBoundsException(a.a.e("Beginning index: ", i13, " < 0"));
        }
        if (i14 < i13) {
            throw new IndexOutOfBoundsException(a.a.f("Beginning index larger than ending index: ", i13, ", ", i14));
        }
        throw new IndexOutOfBoundsException(a.a.f("End index: ", i14, " >= ", i15));
    }

    public static j d(byte[] bArr, int i13, int i14) {
        c(i13, i13 + i14, bArr.length);
        return new j(f18076c.a(bArr, i13, i14));
    }

    public abstract byte b(int i13);

    /* renamed from: e */
    public final int hashCode() {
        int i13 = this.f18077a;
        if (i13 == 0) {
            int size = size();
            j jVar = (j) this;
            int j13 = jVar.j();
            int i14 = size;
            for (int i15 = j13; i15 < j13 + size; i15++) {
                i14 = (i14 * 31) + jVar.f18079d[i15];
            }
            i13 = i14 == 0 ? 1 : i14;
            this.f18077a = i13;
        }
        return i13;
    }

    public abstract byte f(int i13);

    /* renamed from: i */
    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this);
    }

    public abstract int size();
}
