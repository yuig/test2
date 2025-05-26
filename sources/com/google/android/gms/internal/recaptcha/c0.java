package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public final class c0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f31740a = new c0();

    @Override // com.google.android.gms.internal.recaptcha.p0
    public final boolean zza(Class cls) {
        return b0.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.recaptcha.p0
    public final q0 zzb(Class cls) {
        if (!b0.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (q0) b0.a(cls.asSubclass(b0.class)).b(3);
        } catch (Exception e13) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e13);
        }
    }
}
