package ads_mobile_sdk;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class sl2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f11137a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11138b;

    /* renamed from: c, reason: collision with root package name */
    public aj.r f11139c;

    /* renamed from: d, reason: collision with root package name */
    public List f11140d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f11141e;

    /* renamed from: f, reason: collision with root package name */
    public ul f11142f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f11143g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aj.t f11144h;

    /* renamed from: i, reason: collision with root package name */
    public int f11145i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl2(aj.t tVar, bl2.c cVar) {
        super(cVar);
        this.f11144h = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11143g = obj;
        this.f11145i |= Integer.MIN_VALUE;
        return aj.t.b(this.f11144h, this);
    }
}
