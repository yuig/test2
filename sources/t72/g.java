package t72;

import java.util.List;

/* loaded from: classes4.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public List f116652r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f116653s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f116654t;

    /* renamed from: u, reason: collision with root package name */
    public int f116655u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, bl2.c cVar) {
        super(cVar);
        this.f116654t = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f116653s = obj;
        this.f116655u |= Integer.MIN_VALUE;
        return this.f116654t.c(null, this);
    }
}
