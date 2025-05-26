package com.google.protobuf;

/* loaded from: classes.dex */
public final class k2 extends i2 {
    @Override // com.google.protobuf.i2
    public final j2 a(Object obj) {
        n0 n0Var = (n0) obj;
        j2 j2Var = n0Var.unknownFields;
        if (j2Var != j2.f33911f) {
            return j2Var;
        }
        j2 j2Var2 = new j2();
        n0Var.unknownFields = j2Var2;
        return j2Var2;
    }

    @Override // com.google.protobuf.i2
    public final void b(Object obj) {
        ((n0) obj).unknownFields.f33916e = false;
    }
}
