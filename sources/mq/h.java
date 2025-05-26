package mq;

import com.pinterest.api.model.PinFeed;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f87981r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f87982s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f87983t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u uVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f87982s = uVar;
        this.f87983t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f87982s, this.f87983t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f87981r;
        if (i13 == 0) {
            ue.c.H(obj);
            se2.a aVar2 = this.f87982s.A0;
            if (aVar2 == null) {
                Intrinsics.r("pinFeedPagingServiceV2");
                throw null;
            }
            uj2.b0<PinFeed> a13 = ((z12.c) ((bf2.b) aVar2).get()).a(this.f87983t);
            this.f87981r = 1;
            obj = kh2.j.p(a13, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
