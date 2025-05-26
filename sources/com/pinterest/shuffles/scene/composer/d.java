package com.pinterest.shuffles.scene.composer;

import r72.z1;

/* loaded from: classes4.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f f52024r;

    /* renamed from: s, reason: collision with root package name */
    public z1 f52025s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f52026t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f52027u;

    /* renamed from: v, reason: collision with root package name */
    public int f52028v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, bl2.c cVar) {
        super(cVar);
        this.f52027u = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f52026t = obj;
        this.f52028v |= Integer.MIN_VALUE;
        return this.f52027u.b(null, this);
    }
}
