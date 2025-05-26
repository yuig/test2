package ul2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m extends so.a {

    /* renamed from: b, reason: collision with root package name */
    public final xm2.e f122553b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122554c;

    public m(xm2.e signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f122553b = signature;
        this.f122554c = signature.a();
    }

    @Override // so.a
    public final String a() {
        return this.f122554c;
    }
}
