package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class b implements d1 {
    protected int memoizedHashCode;

    public abstract int a(q1 q1Var);

    public final String b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract c0 c();

    public final byte[] d() {
        try {
            byte[] bArr = new byte[((f0) this).a(null)];
            p p03 = r.p0(bArr);
            f(p03);
            p03.P();
            return bArr;
        } catch (IOException e13) {
            throw new RuntimeException(b("byte array"), e13);
        }
    }

    public final j e() {
        try {
            int a13 = ((f0) this).a(null);
            j jVar = k.f33636b;
            byte[] bArr = new byte[a13];
            Logger logger = r.f33683c;
            p pVar = new p(bArr, a13);
            f(pVar);
            pVar.P();
            return new j(bArr);
        } catch (IOException e13) {
            throw new RuntimeException(b("ByteString"), e13);
        }
    }

    public abstract void f(r rVar);
}
