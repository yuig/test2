package dn2;

import am2.d0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;

/* loaded from: classes4.dex */
public final class j extends g {

    /* renamed from: b, reason: collision with root package name */
    public final String f55627b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String message) {
        super(Unit.f80348a);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f55627b = message;
    }

    @Override // dn2.g
    public final b0 a(d0 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return rn2.m.d(rn2.l.ERROR_CONSTANT_VALUE, this.f55627b);
    }

    @Override // dn2.g
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override // dn2.g
    public final String toString() {
        return this.f55627b;
    }
}
