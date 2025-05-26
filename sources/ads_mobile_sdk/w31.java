package ads_mobile_sdk;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class w31 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f12843a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f12844b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12845c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x31 f12846d;

    /* renamed from: e, reason: collision with root package name */
    public int f12847e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w31(x31 x31Var, bl2.c cVar) {
        super(cVar);
        this.f12846d = x31Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12845c = obj;
        this.f12847e |= Integer.MIN_VALUE;
        return this.f12846d.a(null, this);
    }
}
