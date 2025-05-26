package ads_mobile_sdk;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class ml1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ol1 f8278a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f8279b;

    /* renamed from: c, reason: collision with root package name */
    public Closeable f8280c;

    /* renamed from: d, reason: collision with root package name */
    public ym0 f8281d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ol1 f8283f;

    /* renamed from: g, reason: collision with root package name */
    public int f8284g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(ol1 ol1Var, bl2.c cVar) {
        super(cVar);
        this.f8283f = ol1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8282e = obj;
        this.f8284g |= Integer.MIN_VALUE;
        return ol1.a(this.f8283f, this);
    }
}
