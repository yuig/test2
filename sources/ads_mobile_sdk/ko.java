package ads_mobile_sdk;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public abstract class ko extends oo {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f7417d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7418e;

    /* renamed from: f, reason: collision with root package name */
    public int f7419f;

    public ko(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i13, 20);
        this.f7417d = new byte[max];
        this.f7418e = max;
    }

    public final void e(long j13) {
        int i13 = this.f7419f;
        byte[] bArr = this.f7417d;
        bArr[i13] = (byte) j13;
        bArr[i13 + 1] = (byte) (j13 >> 8);
        bArr[i13 + 2] = (byte) (j13 >> 16);
        bArr[i13 + 3] = (byte) (j13 >> 24);
        bArr[i13 + 4] = (byte) (j13 >> 32);
        bArr[i13 + 5] = (byte) (j13 >> 40);
        bArr[i13 + 6] = (byte) (j13 >> 48);
        bArr[i13 + 7] = (byte) (j13 >> 56);
        this.f7419f = i13 + 8;
    }

    public final void f(long j13) {
        if (!oo.f9380c) {
            while ((j13 & (-128)) != 0) {
                byte[] bArr = this.f7417d;
                int i13 = this.f7419f;
                this.f7419f = i13 + 1;
                bArr[i13] = (byte) (((int) j13) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                j13 >>>= 7;
            }
            byte[] bArr2 = this.f7417d;
            int i14 = this.f7419f;
            this.f7419f = i14 + 1;
            bArr2[i14] = (byte) j13;
            return;
        }
        while ((j13 & (-128)) != 0) {
            byte[] bArr3 = this.f7417d;
            int i15 = this.f7419f;
            this.f7419f = i15 + 1;
            mw2.f8408c.a((Object) bArr3, mw2.f8411f + i15, (byte) (((int) j13) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
            j13 >>>= 7;
        }
        byte[] bArr4 = this.f7417d;
        int i16 = this.f7419f;
        this.f7419f = i16 + 1;
        mw2.f8408c.a((Object) bArr4, mw2.f8411f + i16, (byte) j13);
    }

    public final void i(int i13, int i14) {
        o((i13 << 3) | i14);
    }

    public final void n(int i13) {
        int i14 = this.f7419f;
        byte[] bArr = this.f7417d;
        bArr[i14] = (byte) i13;
        bArr[i14 + 1] = (byte) (i13 >> 8);
        bArr[i14 + 2] = (byte) (i13 >> 16);
        bArr[i14 + 3] = (byte) (i13 >> 24);
        this.f7419f = i14 + 4;
    }

    public final void o(int i13) {
        if (!oo.f9380c) {
            while ((i13 & (-128)) != 0) {
                byte[] bArr = this.f7417d;
                int i14 = this.f7419f;
                this.f7419f = i14 + 1;
                bArr[i14] = (byte) (i13 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                i13 >>>= 7;
            }
            byte[] bArr2 = this.f7417d;
            int i15 = this.f7419f;
            this.f7419f = i15 + 1;
            bArr2[i15] = (byte) i13;
            return;
        }
        while ((i13 & (-128)) != 0) {
            byte[] bArr3 = this.f7417d;
            int i16 = this.f7419f;
            this.f7419f = i16 + 1;
            mw2.f8408c.a((Object) bArr3, mw2.f8411f + i16, (byte) (i13 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
            i13 >>>= 7;
        }
        byte[] bArr4 = this.f7417d;
        int i17 = this.f7419f;
        this.f7419f = i17 + 1;
        mw2.f8408c.a((Object) bArr4, mw2.f8411f + i17, (byte) i13);
    }
}
