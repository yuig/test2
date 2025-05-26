package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class b6 implements b7 {

    /* renamed from: a, reason: collision with root package name */
    public static final b6 f31305a = new b6();

    @Override // com.google.android.gms.internal.measurement.b7
    public final y6 zza(Class cls) {
        if (!a6.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (y6) a6.d(cls.asSubclass(a6.class)).g(3);
        } catch (Exception e13) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e13);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b7
    public final boolean zzb(Class cls) {
        return a6.class.isAssignableFrom(cls);
    }
}
