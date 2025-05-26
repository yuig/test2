package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public final class b0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f33593a = new b0();

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final a1 a(Class cls) {
        if (!f0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (a1) f0.l(cls.asSubclass(f0.class)).k(e0.BUILD_MESSAGE_INFO);
        } catch (Exception e13) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e13);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final boolean b(Class cls) {
        return f0.class.isAssignableFrom(cls);
    }
}
