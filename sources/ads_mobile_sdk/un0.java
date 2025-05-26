package ads_mobile_sdk;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class un0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public a.ce f12125a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f12126b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vn0 f12128d;

    /* renamed from: e, reason: collision with root package name */
    public int f12129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(vn0 vn0Var, bl2.c cVar) {
        super(cVar);
        this.f12128d = vn0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12127c = obj;
        this.f12129e |= Integer.MIN_VALUE;
        return this.f12128d.a((a.ce) null, this);
    }
}
