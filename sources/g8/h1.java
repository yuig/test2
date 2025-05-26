package g8;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class h1 implements l8.u {

    /* renamed from: a, reason: collision with root package name */
    public final long f64279a = v.f64440d.getAndIncrement();

    /* renamed from: b, reason: collision with root package name */
    public final g7.i f64280b;

    /* renamed from: c, reason: collision with root package name */
    public final g7.y f64281c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f64282d;

    public h1(g7.f fVar, g7.i iVar) {
        this.f64280b = iVar;
        this.f64281c = new g7.y(fVar);
    }

    @Override // l8.u
    public final void h() {
        int i13;
        byte[] bArr;
        g7.y yVar = this.f64281c;
        yVar.f63852b = 0L;
        try {
            yVar.d(this.f64280b);
            do {
                i13 = (int) yVar.f63852b;
                byte[] bArr2 = this.f64282d;
                if (bArr2 == null) {
                    this.f64282d = new byte[1024];
                } else if (i13 == bArr2.length) {
                    this.f64282d = Arrays.copyOf(bArr2, bArr2.length * 2);
                }
                bArr = this.f64282d;
            } while (yVar.read(bArr, i13, bArr.length - i13) != -1);
            lb.l0.H(yVar);
        } catch (Throwable th3) {
            lb.l0.H(yVar);
            throw th3;
        }
    }

    @Override // l8.u
    public final void o() {
    }
}
