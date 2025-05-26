package ads_mobile_sdk;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class mt2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public qt2 f8378a;

    /* renamed from: b, reason: collision with root package name */
    public String f8379b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f8380c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f8381d;

    /* renamed from: e, reason: collision with root package name */
    public Collection f8382e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f8383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qt2 f8384g;

    /* renamed from: h, reason: collision with root package name */
    public int f8385h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt2(qt2 qt2Var, bl2.c cVar) {
        super(cVar);
        this.f8384g = qt2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8383f = obj;
        this.f8385h |= Integer.MIN_VALUE;
        return this.f8384g.o(this);
    }
}
