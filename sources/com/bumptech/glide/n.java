package com.bumptech.glide;

import ae.s;

/* loaded from: classes.dex */
public final class n implements ae.a {

    /* renamed from: a, reason: collision with root package name */
    public final s f29826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f29827b;

    public n(o oVar, s sVar) {
        this.f29827b = oVar;
        this.f29826a = sVar;
    }

    @Override // ae.a
    public final void a(boolean z13) {
        if (z13) {
            synchronized (this.f29827b) {
                this.f29826a.k();
            }
        }
    }
}
