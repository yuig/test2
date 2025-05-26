package ads_mobile_sdk;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f21 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f5013a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f5014b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5015c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f5016d;

    /* renamed from: e, reason: collision with root package name */
    public int f5017e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5018f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f5019g;

    /* renamed from: h, reason: collision with root package name */
    public int f5020h;

    /* renamed from: i, reason: collision with root package name */
    public long f5021i;

    public f21(ArrayList arrayList) {
        this.f5013a = arrayList.iterator();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f5015c++;
        }
        this.f5016d = -1;
        if (a()) {
            return;
        }
        this.f5014b = hw0.f6128c;
        this.f5016d = 0;
        this.f5017e = 0;
        this.f5021i = 0L;
    }

    public final boolean a() {
        ByteBuffer byteBuffer;
        do {
            this.f5016d++;
            if (!this.f5013a.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) this.f5013a.next();
            this.f5014b = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f5017e = this.f5014b.position();
        if (this.f5014b.hasArray()) {
            this.f5018f = true;
            this.f5019g = this.f5014b.array();
            this.f5020h = this.f5014b.arrayOffset();
        } else {
            this.f5018f = false;
            this.f5021i = mw2.f8408c.f(this.f5014b, mw2.f8412g);
            this.f5019g = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f5016d == this.f5015c) {
            return -1;
        }
        if (!this.f5018f) {
            int a13 = mw2.f8408c.a(this.f5017e + this.f5021i) & 255;
            int i13 = this.f5017e + 1;
            this.f5017e = i13;
            if (i13 == this.f5014b.limit()) {
                a();
            }
            return a13;
        }
        byte[] bArr = this.f5019g;
        int i14 = this.f5017e;
        int i15 = bArr[this.f5020h + i14] & 255;
        int i16 = i14 + 1;
        this.f5017e = i16;
        if (i16 == this.f5014b.limit()) {
            a();
        }
        return i15;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        if (this.f5016d == this.f5015c) {
            return -1;
        }
        int limit = this.f5014b.limit();
        int i15 = this.f5017e;
        int i16 = limit - i15;
        if (i14 > i16) {
            i14 = i16;
        }
        if (this.f5018f) {
            System.arraycopy(this.f5019g, i15 + this.f5020h, bArr, i13, i14);
            int i17 = this.f5017e + i14;
            this.f5017e = i17;
            if (i17 == this.f5014b.limit()) {
                a();
            }
        } else {
            int position = this.f5014b.position();
            this.f5014b.position(this.f5017e);
            this.f5014b.get(bArr, i13, i14);
            this.f5014b.position(position);
            int i18 = this.f5017e + i14;
            this.f5017e = i18;
            if (i18 == this.f5014b.limit()) {
                a();
            }
        }
        return i14;
    }
}
