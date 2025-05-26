package com.github.mustachejava;

import bg.l;

/* loaded from: classes3.dex */
public class MustacheException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public l f30177a;

    public MustacheException() {
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        if (this.f30177a == null) {
            return super.getMessage();
        }
        return super.getMessage() + " @" + this.f30177a;
    }

    public MustacheException(String str, Throwable th3, l lVar) {
        super(str, th3);
        this.f30177a = lVar;
    }

    public MustacheException(l lVar, String str) {
        super(str);
        this.f30177a = lVar;
    }

    public MustacheException(Exception exc, l lVar) {
        super(exc);
        this.f30177a = lVar;
    }
}
