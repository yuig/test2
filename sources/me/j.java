package me;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f86993a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(j.class.getName(), "AppEventStore::class.java.name");
    }

    public static final synchronized void a(b accessTokenAppIdPair, u appEvents) {
        synchronized (j.class) {
            if (p001if.a.b(j.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                Intrinsics.checkNotNullParameter(appEvents, "appEvents");
                t a13 = h.a();
                a13.a(accessTokenAppIdPair, appEvents.c());
                h.b(a13);
            } catch (Throwable th3) {
                p001if.a.a(j.class, th3);
            }
        }
    }

    public static final synchronized void b(rd.j eventsToPersist) {
        synchronized (j.class) {
            if (p001if.a.b(j.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
                t a13 = h.a();
                for (b bVar : eventsToPersist.m()) {
                    u i13 = eventsToPersist.i(bVar);
                    if (i13 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    a13.a(bVar, i13.c());
                }
                h.b(a13);
            } catch (Throwable th3) {
                p001if.a.a(j.class, th3);
            }
        }
    }
}
