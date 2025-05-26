package pn;

import gk2.f2;
import uj2.h;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: b, reason: collision with root package name */
    public final h f100712b;

    /* renamed from: c, reason: collision with root package name */
    public final a f100713c;

    public b(f2 f2Var, a aVar) {
        this.f100712b = f2Var;
        this.f100713c = aVar;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        this.f100712b.b(new e(bVar, this.f100713c));
    }
}
