package zm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f extends OutputStream {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f142201f = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public int f142204c;

    /* renamed from: e, reason: collision with root package name */
    public int f142206e;

    /* renamed from: a, reason: collision with root package name */
    public final int f142202a = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f142203b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public byte[] f142205d = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];

    public final void a(int i13) {
        this.f142203b.add(new z(this.f142205d));
        int length = this.f142204c + this.f142205d.length;
        this.f142204c = length;
        this.f142205d = new byte[Math.max(this.f142202a, Math.max(i13, length >>> 1))];
        this.f142206e = 0;
    }

    public final void c() {
        int i13 = this.f142206e;
        byte[] bArr = this.f142205d;
        int length = bArr.length;
        ArrayList arrayList = this.f142203b;
        if (i13 >= length) {
            arrayList.add(new z(this.f142205d));
            this.f142205d = f142201f;
        } else if (i13 > 0) {
            byte[] bArr2 = new byte[i13];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i13));
            arrayList.add(new z(bArr2));
        }
        this.f142204c += this.f142206e;
        this.f142206e = 0;
    }

    public final synchronized g d() {
        ArrayList arrayList;
        c();
        arrayList = this.f142203b;
        if (!(arrayList instanceof Collection)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((g) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? g.f142207a : g.b(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i13;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i13 = this.f142204c + this.f142206e;
        }
        objArr[1] = Integer.valueOf(i13);
        return String.format("<ByteString.Output@%s size=%d>", objArr);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i13) {
        try {
            if (this.f142206e == this.f142205d.length) {
                a(1);
            }
            byte[] bArr = this.f142205d;
            int i14 = this.f142206e;
            this.f142206e = i14 + 1;
            bArr[i14] = (byte) i13;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i13, int i14) {
        try {
            byte[] bArr2 = this.f142205d;
            int length = bArr2.length;
            int i15 = this.f142206e;
            if (i14 <= length - i15) {
                System.arraycopy(bArr, i13, bArr2, i15, i14);
                this.f142206e += i14;
            } else {
                int length2 = bArr2.length - i15;
                System.arraycopy(bArr, i13, bArr2, i15, length2);
                int i16 = i14 - length2;
                a(i16);
                System.arraycopy(bArr, i13 + length2, this.f142205d, 0, i16);
                this.f142206e = i16;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
