package com.facebook.login;

/* loaded from: classes3.dex */
public final class g extends x {

    /* renamed from: n, reason: collision with root package name */
    public static volatile g f30012n;

    public static g h() {
        if (p001if.a.b(g.class)) {
            return null;
        }
        try {
            if (f30012n == null) {
                synchronized (g.class) {
                    try {
                        if (f30012n == null) {
                            f30012n = new g();
                        }
                    } finally {
                    }
                }
            }
            return f30012n;
        } catch (Throwable th3) {
            p001if.a.a(g.class, th3);
            return null;
        }
    }
}
