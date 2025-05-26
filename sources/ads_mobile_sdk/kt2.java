package ads_mobile_sdk;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class kt2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public qt2 f7502a;

    /* renamed from: b, reason: collision with root package name */
    public String f7503b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f7504c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f7505d;

    /* renamed from: e, reason: collision with root package name */
    public Collection f7506e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f7507f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qt2 f7508g;

    /* renamed from: h, reason: collision with root package name */
    public int f7509h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt2(qt2 qt2Var, bl2.c cVar) {
        super(cVar);
        this.f7508g = qt2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7507f = obj;
        this.f7509h |= Integer.MIN_VALUE;
        return this.f7508g.l(this);
    }
}
