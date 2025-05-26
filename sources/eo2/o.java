package eo2;

import ao2.o1;

/* loaded from: classes2.dex */
public final class o extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public p f59802r;

    /* renamed from: s, reason: collision with root package name */
    public Object f59803s;

    /* renamed from: t, reason: collision with root package name */
    public o1 f59804t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f59805u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f59806v;

    /* renamed from: w, reason: collision with root package name */
    public int f59807w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, bl2.c cVar) {
        super(cVar);
        this.f59806v = pVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f59805u = obj;
        this.f59807w |= Integer.MIN_VALUE;
        return this.f59806v.emit(null, this);
    }
}
