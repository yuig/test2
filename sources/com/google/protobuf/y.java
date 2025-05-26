package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static volatile y f34011b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f34012c = new y();

    /* renamed from: a, reason: collision with root package name */
    public final Map f34013a = Collections.emptyMap();

    public static y a() {
        y yVar = f34011b;
        if (yVar == null) {
            synchronized (y.class) {
                try {
                    yVar = f34011b;
                    if (yVar == null) {
                        Class cls = x.f34010a;
                        y yVar2 = null;
                        if (cls != null) {
                            try {
                                yVar2 = (y) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                        }
                        if (yVar2 == null) {
                            yVar2 = f34012c;
                        }
                        f34011b = yVar2;
                        yVar = yVar2;
                    }
                } finally {
                }
            }
        }
        return yVar;
    }
}
