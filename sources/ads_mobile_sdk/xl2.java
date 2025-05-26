package ads_mobile_sdk;

import java.util.Map;

/* loaded from: classes2.dex */
public final class xl2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public yl2 f13716a;

    /* renamed from: b, reason: collision with root package name */
    public Map f13717b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13718c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yl2 f13719d;

    /* renamed from: e, reason: collision with root package name */
    public int f13720e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl2(yl2 yl2Var, bl2.c cVar) {
        super(cVar);
        this.f13719d = yl2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13718c = obj;
        this.f13720e |= Integer.MIN_VALUE;
        return this.f13719d.a(null, null, this);
    }
}
