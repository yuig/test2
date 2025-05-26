package ot1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final x f97584a;

    public j0(x bitWriter) {
        Intrinsics.checkNotNullParameter(bitWriter, "bitWriter");
        this.f97584a = bitWriter;
    }

    public final void a(int i13, long j13) {
        if (i13 > 64) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        while (true) {
            i13--;
            if (-1 >= i13) {
                return;
            }
            xk2.d0 d0Var = xk2.e0.f135207b;
            this.f97584a.a((int) (j13 >>> i13));
        }
    }
}
