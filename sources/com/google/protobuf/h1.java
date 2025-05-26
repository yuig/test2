package com.google.protobuf;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a */
    public final com.google.firebase.messaging.q f33902a;

    /* renamed from: b */
    public final Object f33903b;

    /* renamed from: c */
    public final Object f33904c;

    public h1(z2 z2Var, z2 z2Var2, Object obj) {
        this.f33902a = new com.google.firebase.messaging.q(z2Var, "", z2Var2, obj);
        this.f33904c = obj;
    }

    public static int b(com.google.firebase.messaging.q qVar, Object obj, Object obj2) {
        return c0.a((z2) qVar.f33805c, 2, obj2) + c0.a((z2) qVar.f33803a, 1, obj);
    }

    public final int a(int i13, Object obj, Object obj2) {
        int B = u.B(i13);
        int b13 = b(this.f33902a, obj, obj2);
        return u.D(b13) + b13 + B;
    }
}
