package com.bugsnag.android;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29672a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29673b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29674c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29675d;

    public w0(boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f29672a = z13;
        this.f29673b = z14;
        this.f29674c = z15;
        this.f29675d = z16;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f29672a == w0Var.f29672a && this.f29673b == w0Var.f29673b && this.f29674c == w0Var.f29674c && this.f29675d == w0Var.f29675d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29675d) + ep.b.e(this.f29674c, ep.b.e(this.f29673b, Boolean.hashCode(this.f29672a) * 31, 31), 31);
    }
}
