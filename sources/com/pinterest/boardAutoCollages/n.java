package com.pinterest.boardAutoCollages;

/* loaded from: classes5.dex */
public final class n extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f44589r;

    /* renamed from: s, reason: collision with root package name */
    public int f44590s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f44591t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f44591t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f44589r = obj;
        this.f44590s |= Integer.MIN_VALUE;
        return this.f44591t.emit(null, this);
    }
}
