package gq2;

import hq2.f;
import hq2.l;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes4.dex */
public final class a implements AlgorithmParameterSpec {

    /* renamed from: a, reason: collision with root package name */
    public f f65981a;

    /* renamed from: b, reason: collision with root package name */
    public l f65982b;

    /* renamed from: c, reason: collision with root package name */
    public BigInteger f65983c;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f65981a.g(aVar.f65981a) && this.f65982b.b(aVar.f65982b);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        return this.f65981a.hashCode() ^ this.f65982b.hashCode();
    }
}
