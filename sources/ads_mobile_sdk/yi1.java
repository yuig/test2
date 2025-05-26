package ads_mobile_sdk;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class yi1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Collection f14265a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f14266b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj1 f14268d;

    /* renamed from: e, reason: collision with root package name */
    public int f14269e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi1(dj1 dj1Var, bl2.c cVar) {
        super(cVar);
        this.f14268d = dj1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14267c = obj;
        this.f14269e |= Integer.MIN_VALUE;
        return this.f14268d.a((nm.q) null, this);
    }
}
