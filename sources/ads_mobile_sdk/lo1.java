package ads_mobile_sdk;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class lo1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f7905a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7906b;

    /* renamed from: c, reason: collision with root package name */
    public Closeable f7907c;

    /* renamed from: d, reason: collision with root package name */
    public cs2 f7908d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1 f7910f;

    /* renamed from: g, reason: collision with root package name */
    public int f7911g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo1(qo1 qo1Var, bl2.c cVar) {
        super(cVar);
        this.f7910f = qo1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7909e = obj;
        this.f7911g |= Integer.MIN_VALUE;
        return this.f7910f.a(null, this);
    }
}
