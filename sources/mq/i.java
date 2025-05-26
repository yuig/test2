package mq;

import ao2.v0;
import com.pinterest.api.model.PinFeed;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f87993r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kq.c f87994s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f87995t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f87996u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kq.c cVar, u uVar, String str, bl2.c cVar2) {
        super(2, cVar2);
        this.f87994s = cVar;
        this.f87995t = uVar;
        this.f87996u = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f87994s, this.f87995t, this.f87996u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f87993r;
        u uVar = this.f87995t;
        kq.c cVar = this.f87994s;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                cVar.f80634s = true;
                ko2.f fVar = v0.f20219a;
                ko2.e eVar = ko2.e.f80326c;
                h hVar = new h(uVar, this.f87996u, null);
                this.f87993r = 1;
                obj = kotlin.jvm.internal.j.M(this, eVar, hVar);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            PinFeed pinFeed = (PinFeed) obj;
            PinFeed pinFeed2 = uVar.f88019g0;
            if (pinFeed2 != null) {
                pinFeed2.j(pinFeed);
            }
            cVar.f80634s = false;
            Intrinsics.f(pinFeed);
            cVar.I(a11.w.e(pinFeed, null, uVar.g8().I()));
            cVar.g();
        } catch (Exception e13) {
            int i14 = u.P0;
            uVar.j8("Swipe and load more pins from API is not working", e13);
            cVar.f80634s = false;
        }
        return Unit.f80348a;
    }
}
