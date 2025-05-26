package w8;

import a7.o0;
import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import c0.s0;
import d7.d0;
import e7.q;
import q8.f;
import q8.k0;

/* loaded from: classes3.dex */
public final class d extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final d0 f128238b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f128239c;

    /* renamed from: d, reason: collision with root package name */
    public int f128240d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f128241e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f128242f;

    /* renamed from: g, reason: collision with root package name */
    public int f128243g;

    public d(k0 k0Var) {
        super(k0Var);
        this.f128238b = new d0(q.f57591a);
        this.f128239c = new d0(4);
    }

    public final boolean q(d0 d0Var) {
        int y13 = d0Var.y();
        int i13 = (y13 >> 4) & 15;
        int i14 = y13 & 15;
        if (i14 != 7) {
            throw new TagPayloadReader$UnsupportedFormatException(a.a.d("Video format not supported: ", i14));
        }
        this.f128243g = i13;
        return i13 != 5;
    }

    public final boolean r(long j13, d0 d0Var) {
        int y13 = d0Var.y();
        byte[] bArr = d0Var.f53806a;
        int i13 = d0Var.f53807b;
        int i14 = ((bArr[i13 + 1] & 255) << 8) | (((bArr[i13] & 255) << 24) >> 8);
        d0Var.f53807b = i13 + 3;
        long j14 = (((bArr[i13 + 2] & 255) | i14) * 1000) + j13;
        if (y13 == 0 && !this.f128241e) {
            byte[] bArr2 = new byte[d0Var.a()];
            d0 d0Var2 = new d0(bArr2);
            d0Var.i(bArr2, 0, d0Var.a());
            f a13 = f.a(d0Var2);
            this.f128240d = a13.f102902b;
            a7.q qVar = new a7.q();
            qVar.f1180m = o0.r("video/x-flv");
            qVar.f1181n = o0.r("video/avc");
            qVar.f1177j = a13.f102912l;
            qVar.f1188u = a13.f102903c;
            qVar.f1189v = a13.f102904d;
            qVar.f1192y = a13.f102911k;
            qVar.f1184q = a13.f102901a;
            ((k0) this.f24333a).b(qVar.a());
            this.f128241e = true;
            return false;
        }
        if (y13 != 1 || !this.f128241e) {
            return false;
        }
        int i15 = this.f128243g == 1 ? 1 : 0;
        if (!this.f128242f && i15 == 0) {
            return false;
        }
        d0 d0Var3 = this.f128239c;
        byte[] bArr3 = d0Var3.f53806a;
        bArr3[0] = 0;
        bArr3[1] = 0;
        bArr3[2] = 0;
        int i16 = 4 - this.f128240d;
        int i17 = 0;
        while (d0Var.a() > 0) {
            d0Var.i(d0Var3.f53806a, i16, this.f128240d);
            d0Var3.K(0);
            int C = d0Var3.C();
            d0 d0Var4 = this.f128238b;
            d0Var4.K(0);
            ((k0) this.f24333a).d(4, 0, d0Var4);
            ((k0) this.f24333a).d(C, 0, d0Var);
            i17 = i17 + 4 + C;
        }
        ((k0) this.f24333a).a(j14, i15, i17, 0, null);
        this.f128242f = true;
        return true;
    }
}
