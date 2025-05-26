package uk2;

import uj2.v;

/* loaded from: classes4.dex */
public final class a extends ek2.g {

    /* renamed from: c, reason: collision with root package name */
    public final b f122385c;

    public a(v vVar, b bVar) {
        super(vVar);
        this.f122385c = bVar;
    }

    @Override // ek2.g, xj2.c
    public final void dispose() {
        if (getAndSet(4) != 4) {
            this.f122385c.R(this);
        }
    }
}
