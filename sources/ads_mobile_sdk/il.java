package ads_mobile_sdk;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.FileInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kp.n;

/* loaded from: classes2.dex */
public abstract class il implements Iterable, Serializable {

    /* renamed from: b */
    public static final gl f6431b = new gl(hw0.f6127b);

    /* renamed from: c */
    public static final a.t1 f6432c;

    /* renamed from: a */
    public int f6433a = 0;

    static {
        f6432c = vc.b() ? new n(7) : new n(3);
    }

    public static il a(Iterator it, int i13) {
        if (i13 < 1) {
            throw new IllegalArgumentException(a.a.e("length (", i13, ") must be >= 1"));
        }
        if (i13 == 1) {
            return (il) it.next();
        }
        int i14 = i13 >>> 1;
        return a(it, i14).a(a(it, i13 - i14));
    }

    public abstract ByteBuffer a();

    public abstract void a(int i13, int i14, int i15, byte[] bArr);

    public abstract void a(a.lg lgVar);

    public abstract byte b(int i13);

    public abstract int b();

    public abstract int b(int i13, int i14, int i15);

    public abstract il b(int i13, int i14);

    public abstract byte c(int i13);

    public abstract boolean c();

    public abstract io d();

    public final byte[] e() {
        int size = size();
        if (size == 0) {
            return hw0.f6127b;
        }
        byte[] bArr = new byte[size];
        a(0, 0, size, bArr);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public final String f() {
        return size() <= 50 ? kh2.d.c(this) : a.a.C(kh2.d.c(b(0, 47)), "...");
    }

    public final int hashCode() {
        int i13 = this.f6433a;
        if (i13 == 0) {
            int size = size();
            i13 = b(size, 0, size);
            if (i13 == 0) {
                i13 = 1;
            }
            this.f6433a = i13;
        }
        return i13;
    }

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        return a.a.p(a.a.v("<ByteString@", hexString, " size=", size, " contents=\""), f(), "\">");
    }

    public static void a(int i13, int i14) {
        if (((i14 - (i13 + 1)) | i13) < 0) {
            if (i13 < 0) {
                throw new ArrayIndexOutOfBoundsException(a.a.d("Index < 0: ", i13));
            }
            throw new ArrayIndexOutOfBoundsException(a.a.f("Index > length: ", i13, ", ", i14));
        }
    }

    public static int a(int i13, int i14, int i15) {
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

    public final il a(il ilVar) {
        if (Integer.MAX_VALUE - size() >= ilVar.size()) {
            return xb2.a(this, ilVar);
        }
        throw new IllegalArgumentException(a.a.f("ByteString would be too long: ", size(), "+", ilVar.size()));
    }

    public static gl a(byte[] bArr) {
        int length = bArr.length;
        a(0, length, bArr.length);
        return new gl(((n) f6432c).I(bArr, 0, length));
    }

    public static il a(FileInputStream fileInputStream) {
        gl glVar;
        ArrayList arrayList = new ArrayList();
        int i13 = RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        while (true) {
            byte[] bArr = new byte[i13];
            int i14 = 0;
            while (i14 < i13) {
                int read = fileInputStream.read(bArr, i14, i13 - i14);
                if (read == -1) {
                    break;
                }
                i14 += read;
            }
            if (i14 == 0) {
                glVar = null;
            } else {
                a(0, i14, i13);
                glVar = new gl(((n) f6432c).I(bArr, 0, i14));
            }
            if (glVar == null) {
                break;
            }
            arrayList.add(glVar);
            i13 = Math.min(i13 * 2, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f6431b;
        }
        return a(arrayList.iterator(), size);
    }

    public static gl a(String str) {
        return new gl(str.getBytes(hw0.f6126a));
    }
}
