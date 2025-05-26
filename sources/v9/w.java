package v9;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f124821a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f124822b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f124823c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f124824d;

    /* renamed from: e, reason: collision with root package name */
    public int f124825e;

    public w(int i13) {
        this.f124821a = i13;
        byte[] bArr = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL];
        this.f124824d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i13, int i14) {
        if (this.f124822b) {
            int i15 = i14 - i13;
            byte[] bArr2 = this.f124824d;
            int length = bArr2.length;
            int i16 = this.f124825e;
            if (length < i16 + i15) {
                this.f124824d = Arrays.copyOf(bArr2, (i16 + i15) * 2);
            }
            System.arraycopy(bArr, i13, this.f124824d, this.f124825e, i15);
            this.f124825e += i15;
        }
    }

    public final boolean b(int i13) {
        if (!this.f124822b) {
            return false;
        }
        this.f124825e -= i13;
        this.f124822b = false;
        this.f124823c = true;
        return true;
    }

    public final void c() {
        this.f124822b = false;
        this.f124823c = false;
    }

    public final void d(int i13) {
        bf.b.t(!this.f124822b);
        boolean z13 = i13 == this.f124821a;
        this.f124822b = z13;
        if (z13) {
            this.f124825e = 3;
            this.f124823c = false;
        }
    }
}
