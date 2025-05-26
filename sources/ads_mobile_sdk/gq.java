package ads_mobile_sdk;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class gq extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public zr f5656a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f5657b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr f5659d;

    /* renamed from: e, reason: collision with root package name */
    public int f5660e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f5659d = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5658c = obj;
        this.f5660e |= Integer.MIN_VALUE;
        return this.f5659d.f(this);
    }
}
