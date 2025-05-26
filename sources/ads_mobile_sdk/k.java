package ads_mobile_sdk;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class k extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public l f7025a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f7026b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7027c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f7028d;

    /* renamed from: e, reason: collision with root package name */
    public int f7029e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, bl2.c cVar) {
        super(cVar);
        this.f7028d = lVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7027c = obj;
        this.f7029e |= Integer.MIN_VALUE;
        return this.f7028d.a(null, this);
    }
}
