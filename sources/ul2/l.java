package ul2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends so.a {

    /* renamed from: b, reason: collision with root package name */
    public final xm2.e f122548b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122549c;

    public l(xm2.e signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f122548b = signature;
        this.f122549c = signature.a();
    }

    @Override // so.a
    public final String a() {
        return this.f122549c;
    }
}
