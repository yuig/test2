package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f33555a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final String f33556b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f33557c;

    public b0(Class cls) {
        this.f33556b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f33557c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f33555a) {
            try {
                Logger logger2 = this.f33557c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f33556b);
                this.f33557c = logger3;
                return logger3;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
