package com.pinterest.shuffles.scene.composer;

/* loaded from: classes4.dex */
public final class e0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public n0 f52031r;

    /* renamed from: s, reason: collision with root package name */
    public u f52032s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f52033t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n0 f52034u;

    /* renamed from: v, reason: collision with root package name */
    public int f52035v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(n0 n0Var, bl2.c cVar) {
        super(cVar);
        this.f52034u = n0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f52033t = obj;
        this.f52035v |= Integer.MIN_VALUE;
        return this.f52034u.a(null, null, 0, null, this);
    }
}
