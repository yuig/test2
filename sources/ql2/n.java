package ql2;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class n implements Iterable, ll2.a {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final m f104111d = new m(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f104112a;

    /* renamed from: b, reason: collision with root package name */
    public final long f104113b;

    /* renamed from: c, reason: collision with root package name */
    public final long f104114c;

    public n(long j13, long j14) {
        this.f104112a = j13;
        if (j13 < j14) {
            long j15 = j14 % 1;
            long j16 = j13 % 1;
            long j17 = ((j15 < 0 ? j15 + 1 : j15) - (j16 < 0 ? j16 + 1 : j16)) % 1;
            j14 -= j17 < 0 ? j17 + 1 : j17;
        }
        this.f104113b = j14;
        this.f104114c = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new o(this.f104112a, this.f104113b, this.f104114c);
    }
}
