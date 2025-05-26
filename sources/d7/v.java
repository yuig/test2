package d7;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class v implements j9.d {

    /* renamed from: a, reason: collision with root package name */
    public int f53891a;

    /* renamed from: b, reason: collision with root package name */
    public int f53892b;

    /* renamed from: c, reason: collision with root package name */
    public int f53893c;

    /* renamed from: d, reason: collision with root package name */
    public int f53894d;

    /* renamed from: e, reason: collision with root package name */
    public Object f53895e;

    public v(int i13) {
        bf.b.i(i13 >= 0 && i13 <= 1073741824);
        i13 = i13 == 0 ? 1 : i13;
        i13 = Integer.bitCount(i13) != 1 ? Integer.highestOneBit(i13 - 1) << 1 : i13;
        this.f53891a = 0;
        this.f53892b = -1;
        this.f53893c = 0;
        this.f53895e = new long[i13];
        this.f53894d = i13 - 1;
    }

    @Override // j9.d
    public final int a() {
        int i13 = this.f53892b;
        if (i13 == 8) {
            return ((d0) this.f53895e).y();
        }
        if (i13 == 16) {
            return ((d0) this.f53895e).E();
        }
        int i14 = this.f53893c;
        this.f53893c = i14 + 1;
        if (i14 % 2 != 0) {
            return this.f53894d & 15;
        }
        int y13 = ((d0) this.f53895e).y();
        this.f53894d = y13;
        return (y13 & RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM) >> 4;
    }

    @Override // j9.d
    public final int b() {
        return -1;
    }

    @Override // j9.d
    public final int c() {
        return this.f53891a;
    }

    public final void d(long j13) {
        int i13 = this.f53893c;
        Object obj = this.f53895e;
        if (i13 == ((long[]) obj).length) {
            long[] jArr = (long[]) obj;
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i14 = this.f53891a;
            int i15 = length2 - i14;
            System.arraycopy(jArr, i14, jArr2, 0, i15);
            System.arraycopy((long[]) this.f53895e, 0, jArr2, i15, i14);
            this.f53891a = 0;
            this.f53892b = this.f53893c - 1;
            this.f53895e = jArr2;
            this.f53894d = length - 1;
        }
        int i16 = (this.f53892b + 1) & this.f53894d;
        this.f53892b = i16;
        ((long[]) this.f53895e)[i16] = j13;
        this.f53893c++;
    }

    public final long e() {
        int i13 = this.f53893c;
        if (i13 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f53895e;
        int i14 = this.f53891a;
        long j13 = jArr[i14];
        this.f53891a = this.f53894d & (i14 + 1);
        this.f53893c = i13 - 1;
        return j13;
    }
}
