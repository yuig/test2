package zy0;

import u50.r;

/* loaded from: classes5.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public d f143131r;

    /* renamed from: s, reason: collision with root package name */
    public r f143132s;

    /* renamed from: t, reason: collision with root package name */
    public kv1.c f143133t;

    /* renamed from: u, reason: collision with root package name */
    public int f143134u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f143135v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f143136w;

    /* renamed from: x, reason: collision with root package name */
    public int f143137x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, bl2.c cVar) {
        super(cVar);
        this.f143136w = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f143135v = obj;
        this.f143137x |= Integer.MIN_VALUE;
        return d.j(this.f143136w, 0, null, this);
    }
}
