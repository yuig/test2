package t7;

import a7.o0;
import d7.d0;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;
import q8.j0;
import q8.k0;

/* loaded from: classes3.dex */
public final class r implements k0 {

    /* renamed from: g, reason: collision with root package name */
    public static final androidx.media3.common.b f116568g;

    /* renamed from: h, reason: collision with root package name */
    public static final androidx.media3.common.b f116569h;

    /* renamed from: a, reason: collision with root package name */
    public final a9.b f116570a = new a9.b();

    /* renamed from: b, reason: collision with root package name */
    public final k0 f116571b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.b f116572c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.media3.common.b f116573d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f116574e;

    /* renamed from: f, reason: collision with root package name */
    public int f116575f;

    static {
        a7.q qVar = new a7.q();
        qVar.f1181n = o0.r("application/id3");
        f116568g = qVar.a();
        a7.q qVar2 = new a7.q();
        qVar2.f1181n = o0.r("application/x-emsg");
        f116569h = qVar2.a();
    }

    public r(k0 k0Var, int i13) {
        this.f116571b = k0Var;
        if (i13 == 1) {
            this.f116572c = f116568g;
        } else {
            if (i13 != 3) {
                throw new IllegalArgumentException(a.a.d("Unknown metadataType: ", i13));
            }
            this.f116572c = f116569h;
        }
        this.f116574e = new byte[0];
        this.f116575f = 0;
    }

    @Override // q8.k0
    public final void a(long j13, int i13, int i14, int i15, j0 j0Var) {
        this.f116573d.getClass();
        int i16 = this.f116575f - i15;
        d0 d0Var = new d0(Arrays.copyOfRange(this.f116574e, i16 - i14, i16));
        byte[] bArr = this.f116574e;
        System.arraycopy(bArr, i16, bArr, 0, i15);
        this.f116575f = i15;
        String str = this.f116573d.f18765o;
        androidx.media3.common.b bVar = this.f116572c;
        if (!Objects.equals(str, bVar.f18765o)) {
            if (!"application/x-emsg".equals(this.f116573d.f18765o)) {
                d7.u.g("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f116573d.f18765o);
                return;
            }
            this.f116570a.getClass();
            a9.a c33 = a9.b.c3(d0Var);
            androidx.media3.common.b a13 = c33.a();
            String str2 = bVar.f18765o;
            if (a13 == null || !Objects.equals(str2, a13.f18765o)) {
                d7.u.g("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + c33.a());
                return;
            }
            byte[] c13 = c33.c();
            c13.getClass();
            d0Var = new d0(c13);
        }
        int a14 = d0Var.a();
        this.f116571b.d(a14, 0, d0Var);
        this.f116571b.a(j13, i13, a14, 0, j0Var);
    }

    @Override // q8.k0
    public final void b(androidx.media3.common.b bVar) {
        this.f116573d = bVar;
        this.f116571b.b(this.f116572c);
    }

    @Override // q8.k0
    public final void d(int i13, int i14, d0 d0Var) {
        int i15 = this.f116575f + i13;
        byte[] bArr = this.f116574e;
        if (bArr.length < i15) {
            this.f116574e = Arrays.copyOf(bArr, (i15 / 2) + i15);
        }
        d0Var.i(this.f116574e, this.f116575f, i13);
        this.f116575f += i13;
    }

    @Override // q8.k0
    public final int e(a7.k kVar, int i13, boolean z13) {
        int i14 = this.f116575f + i13;
        byte[] bArr = this.f116574e;
        if (bArr.length < i14) {
            this.f116574e = Arrays.copyOf(bArr, (i14 / 2) + i14);
        }
        int read = kVar.read(this.f116574e, this.f116575f, i13);
        if (read != -1) {
            this.f116575f += read;
            return read;
        }
        if (z13) {
            return -1;
        }
        throw new EOFException();
    }
}
