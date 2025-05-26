package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class w7 {

    /* renamed from: a, reason: collision with root package name */
    public Unsafe f31687a;

    public final void a(int i13, long j13, Object obj) {
        this.f31687a.putInt(obj, j13, i13);
    }

    public final void b(long j13, Object obj, long j14) {
        this.f31687a.putLong(obj, j13, j14);
    }

    public final boolean c() {
        Unsafe unsafe = this.f31687a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th3) {
            Unsafe unsafe2 = x7.f31699a;
            Logger.getLogger(x7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th3)));
            return false;
        }
    }

    public final boolean d() {
        Field field;
        Field field2;
        Unsafe unsafe = this.f31687a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            Unsafe unsafe2 = x7.f31699a;
            Field field3 = null;
            try {
                field = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null) {
                field3 = field;
            } else {
                try {
                    field2 = Buffer.class.getDeclaredField("address");
                } catch (Throwable unused2) {
                    field2 = null;
                }
                if (field2 != null) {
                    if (field2.getType() == Long.TYPE) {
                        field3 = field2;
                    }
                }
            }
            return field3 != null;
        } catch (Throwable th3) {
            Unsafe unsafe3 = x7.f31699a;
            Logger.getLogger(x7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th3)));
            return false;
        }
    }

    public final int e(long j13, Object obj) {
        return this.f31687a.getInt(obj, j13);
    }

    public final long f(long j13, Object obj) {
        return this.f31687a.getLong(obj, j13);
    }
}
