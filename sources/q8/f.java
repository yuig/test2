package q8;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f102901a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102902b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102903c;

    /* renamed from: d, reason: collision with root package name */
    public final int f102904d;

    /* renamed from: e, reason: collision with root package name */
    public final int f102905e;

    /* renamed from: f, reason: collision with root package name */
    public final int f102906f;

    /* renamed from: g, reason: collision with root package name */
    public final int f102907g;

    /* renamed from: h, reason: collision with root package name */
    public final int f102908h;

    /* renamed from: i, reason: collision with root package name */
    public final int f102909i;

    /* renamed from: j, reason: collision with root package name */
    public final int f102910j;

    /* renamed from: k, reason: collision with root package name */
    public final float f102911k;

    /* renamed from: l, reason: collision with root package name */
    public final String f102912l;

    public f(ArrayList arrayList, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24, float f13, String str) {
        this.f102901a = arrayList;
        this.f102902b = i13;
        this.f102903c = i14;
        this.f102904d = i15;
        this.f102905e = i16;
        this.f102906f = i17;
        this.f102907g = i18;
        this.f102908h = i19;
        this.f102909i = i23;
        this.f102910j = i24;
        this.f102911k = f13;
        this.f102912l = str;
    }

    public static f a(d7.d0 d0Var) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f13;
        String str;
        int i23;
        try {
            d0Var.L(4);
            int y13 = (d0Var.y() & 3) + 1;
            if (y13 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int y14 = d0Var.y() & 31;
            for (int i24 = 0; i24 < y14; i24++) {
                int E = d0Var.E();
                int i25 = d0Var.f53807b;
                d0Var.L(E);
                byte[] bArr = d0Var.f53806a;
                byte[] bArr2 = d7.f.f53817a;
                byte[] bArr3 = new byte[E + 4];
                System.arraycopy(d7.f.f53817a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i25, bArr3, 4, E);
                arrayList.add(bArr3);
            }
            int y15 = d0Var.y();
            for (int i26 = 0; i26 < y15; i26++) {
                int E2 = d0Var.E();
                int i27 = d0Var.f53807b;
                d0Var.L(E2);
                byte[] bArr4 = d0Var.f53806a;
                byte[] bArr5 = d7.f.f53817a;
                byte[] bArr6 = new byte[E2 + 4];
                System.arraycopy(d7.f.f53817a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i27, bArr6, 4, E2);
                arrayList.add(bArr6);
            }
            if (y14 > 0) {
                byte[] bArr7 = (byte[]) arrayList.get(0);
                byte[] bArr8 = (byte[]) arrayList.get(0);
                byte[] bArr9 = e7.q.f57591a;
                e7.p l13 = e7.q.l(bArr8, 4, bArr7.length);
                int i28 = l13.f57576e;
                int i29 = l13.f57577f;
                int i33 = l13.f57579h + 8;
                int i34 = l13.f57580i + 8;
                int i35 = l13.f57587p;
                int i36 = l13.f57588q;
                int i37 = l13.f57589r;
                int i38 = l13.f57590s;
                float f14 = l13.f57578g;
                str = d7.f.a(l13.f57572a, l13.f57573b, l13.f57574c);
                i18 = i36;
                i19 = i37;
                i23 = i38;
                f13 = f14;
                i14 = i29;
                i15 = i33;
                i16 = i34;
                i17 = i35;
                i13 = i28;
            } else {
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                i17 = -1;
                i18 = -1;
                i19 = -1;
                f13 = 1.0f;
                str = null;
                i23 = 16;
            }
            return new f(arrayList, y13, i13, i14, i15, i16, i17, i18, i19, i23, f13, str);
        } catch (ArrayIndexOutOfBoundsException e13) {
            throw ParserException.a("Error parsing AVC config", e13);
        }
    }
}
