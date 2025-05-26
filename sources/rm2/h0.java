package rm2;

import am2.x0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h0 implements nn2.l {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f108734b;

    public h0(f0 binaryClass, nn2.k abiStability) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.f108734b = binaryClass;
    }

    @Override // nn2.l
    public final String a() {
        return "Class '" + gm2.d.a(((fm2.c) this.f108734b).f62576a).b().b() + '\'';
    }

    @Override // am2.w0
    public final void b() {
        org.chromium.net.y NO_SOURCE_FILE = x0.Tm;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    public final String toString() {
        return h0.class.getSimpleName() + ": " + this.f108734b;
    }
}
