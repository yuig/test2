package ly;

import ey.b2;
import ey.o0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends o0 implements b2 {

    /* renamed from: d, reason: collision with root package name */
    public final String f85095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String endPoint) {
        super(6, 0);
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        this.f85095d = endPoint;
    }

    public final String l() {
        return this.f85095d;
    }
}
