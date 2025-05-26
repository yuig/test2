package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public final class x1 extends v1 {
    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final w1 a(Object obj) {
        f0 f0Var = (f0) obj;
        w1 w1Var = f0Var.unknownFields;
        if (w1Var != w1.f33704f) {
            return w1Var;
        }
        w1 c13 = w1.c();
        f0Var.unknownFields = c13;
        return c13;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final void b(Object obj) {
        w1 w1Var = ((f0) obj).unknownFields;
        if (w1Var.f33709e) {
            w1Var.f33709e = false;
        }
    }
}
