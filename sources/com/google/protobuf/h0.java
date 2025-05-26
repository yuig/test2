package com.google.protobuf;

/* loaded from: classes.dex */
public final class h0 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f33901a = new h0();

    @Override // com.google.protobuf.m1
    public final l1 a(Class cls) {
        if (!n0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (l1) n0.getDefaultInstance(cls.asSubclass(n0.class)).buildMessageInfo();
        } catch (Exception e13) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e13);
        }
    }

    @Override // com.google.protobuf.m1
    public final boolean b(Class cls) {
        return n0.class.isAssignableFrom(cls);
    }
}
