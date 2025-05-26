package ads_mobile_sdk;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class lj1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Collection f7858a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f7859b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7860c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj1 f7861d;

    /* renamed from: e, reason: collision with root package name */
    public int f7862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj1(oj1 oj1Var, bl2.c cVar) {
        super(cVar);
        this.f7861d = oj1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7860c = obj;
        this.f7862e |= Integer.MIN_VALUE;
        return this.f7861d.a((nm.u) null, (String) null, this);
    }
}
