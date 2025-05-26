package hs;

import android.util.LruCache;
import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes3.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f70019r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f70020s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f70021t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f70022u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f70023v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j13, c cVar, Object obj, Object obj2, bl2.c cVar2) {
        super(2, cVar2);
        this.f70020s = j13;
        this.f70021t = cVar;
        this.f70022u = obj;
        this.f70023v = obj2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f70020s, this.f70021t, this.f70022u, this.f70023v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f70019r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f70019r = 1;
            if (l0.T(this.f70020s, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        LruCache lruCache = this.f70021t.f70027d;
        Object obj2 = this.f70022u;
        if (obj2 != null) {
            lruCache.put(obj2, this.f70023v);
        }
        return Unit.f80348a;
    }
}
