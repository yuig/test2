package ads_mobile_sdk;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class ql2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f10166a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f10167b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10168c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj.t f10170e;

    /* renamed from: f, reason: collision with root package name */
    public int f10171f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql2(aj.t tVar, bl2.c cVar) {
        super(cVar);
        this.f10170e = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10169d = obj;
        this.f10171f |= Integer.MIN_VALUE;
        return aj.t.c(this.f10170e, this);
    }
}
