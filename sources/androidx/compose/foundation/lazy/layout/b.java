package androidx.compose.foundation.lazy.layout;

/* loaded from: classes2.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public bl2.c f17217r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17218s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f17219t;

    /* renamed from: u, reason: collision with root package name */
    public int f17220u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, bl2.c cVar2) {
        super(cVar2);
        this.f17219t = cVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f17218s = obj;
        this.f17220u |= Integer.MIN_VALUE;
        return this.f17219t.m(this);
    }
}
