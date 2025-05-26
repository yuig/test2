package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static volatile u f33694b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f33695c = new u();

    /* renamed from: a, reason: collision with root package name */
    public final Map f33696a = Collections.emptyMap();

    public static u a() {
        u uVar = f33694b;
        if (uVar == null) {
            synchronized (u.class) {
                try {
                    uVar = f33694b;
                    if (uVar == null) {
                        Class cls = t.f33692a;
                        u uVar2 = null;
                        if (cls != null) {
                            try {
                                uVar2 = (u) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                        }
                        if (uVar2 == null) {
                            uVar2 = f33695c;
                        }
                        f33694b = uVar2;
                        uVar = uVar2;
                    }
                } finally {
                }
            }
        }
        return uVar;
    }
}
