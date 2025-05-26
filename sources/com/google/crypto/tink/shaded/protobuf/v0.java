package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public final class v0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public b1[] f33699a;

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final a1 a(Class cls) {
        for (b1 b1Var : this.f33699a) {
            if (b1Var.b(cls)) {
                return b1Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final boolean b(Class cls) {
        for (b1 b1Var : this.f33699a) {
            if (b1Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
