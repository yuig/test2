package eq2;

import java.math.BigInteger;
import yp2.i;

/* loaded from: classes4.dex */
public final class d extends yp2.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f59936g = BigInteger.valueOf(1);

    /* renamed from: a, reason: collision with root package name */
    public final f f59937a;

    /* renamed from: b, reason: collision with root package name */
    public final hq2.f f59938b;

    /* renamed from: c, reason: collision with root package name */
    public final c f59939c;

    /* renamed from: d, reason: collision with root package name */
    public final BigInteger f59940d;

    /* renamed from: e, reason: collision with root package name */
    public final BigInteger f59941e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f59942f;

    public d(hq2.f fVar, c cVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        int[] iArr;
        this.f59938b = fVar;
        this.f59939c = cVar;
        this.f59940d = bigInteger;
        this.f59941e = bigInteger2;
        this.f59942f = bArr;
        boolean z13 = fVar.f69944a.a() == 1;
        mq2.a aVar = fVar.f69944a;
        if (z13) {
            BigInteger b13 = aVar.b();
            f fVar2 = new f();
            fVar2.f59944a = g.Rn;
            fVar2.f59945b = new yp2.a(b13);
            this.f59937a = fVar2;
            return;
        }
        if (aVar.a() <= 1 || !aVar.b().equals(hq2.a.f69935c) || !(aVar instanceof mq2.d)) {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        }
        int[] iArr2 = ((mq2.d) aVar).f88072b.f88070a;
        if (iArr2 == null) {
            iArr = null;
        } else {
            int[] iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr = iArr3;
        }
        if (iArr.length == 3) {
            this.f59937a = new f(iArr[2], iArr[1], 0, 0);
        } else {
            if (iArr.length != 5) {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
            this.f59937a = new f(iArr[4], iArr[1], iArr[2], iArr[3]);
        }
    }

    @Override // yp2.b
    public final yp2.e b() {
        yp2.d dVar = new yp2.d();
        dVar.a(new yp2.a(f59936g));
        dVar.a(this.f59937a);
        dVar.a(new c(this.f59938b, this.f59942f, 0));
        dVar.a(this.f59939c);
        dVar.a(new yp2.a(this.f59940d));
        BigInteger bigInteger = this.f59941e;
        if (bigInteger != null) {
            dVar.a(new yp2.a(bigInteger));
        }
        return new i(dVar);
    }
}
