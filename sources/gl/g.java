package gl;

import il.o5;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import kg.t;
import uk.p;

/* loaded from: classes3.dex */
public final class g implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f65734d = {0};

    /* renamed from: a, reason: collision with root package name */
    public final p f65735a;

    /* renamed from: b, reason: collision with root package name */
    public final o5 f65736b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f65737c;

    public g(p pVar, o5 o5Var, byte[] bArr) {
        this.f65735a = pVar;
        this.f65736b = o5Var;
        this.f65737c = bArr;
    }

    @Override // uk.p
    public final void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        o5 o5Var = o5.LEGACY;
        o5 o5Var2 = this.f65736b;
        if (o5Var2.equals(o5Var)) {
            bArr2 = t.u(bArr2, f65734d);
        }
        byte[] bArr3 = new byte[0];
        if (!o5Var2.equals(o5.RAW)) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = copyOf;
        }
        if (!Arrays.equals(this.f65737c, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.f65735a.a(bArr, bArr2);
    }

    @Override // uk.p
    public final byte[] b(byte[] bArr) {
        if (this.f65736b.equals(o5.LEGACY)) {
            bArr = t.u(bArr, f65734d);
        }
        return t.u(this.f65737c, this.f65735a.b(bArr));
    }
}
