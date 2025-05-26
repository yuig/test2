package qd1;

import ao2.j0;
import com.pinterest.analytics.TrackingParamKeyBuilder;
import com.pinterest.api.model.f30;
import dl2.j;
import g31.f;
import gx.e;
import h32.d4;
import h32.i0;
import is1.t;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import od1.x;
import od1.y;
import od1.z;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z f103578r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f103579s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z zVar, e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f103578r = zVar;
        this.f103579s = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f103578r, this.f103579s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        i0 i0Var;
        d4 viewType;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        x xVar = x.f94180a;
        z zVar = this.f103578r;
        boolean d2 = Intrinsics.d(zVar, xVar);
        e eVar = this.f103579s;
        if (d2) {
            ((ll.j) eVar.f66246b).B();
        } else if ((zVar instanceof y) && (viewType = (i0Var = ((y) zVar).f94183c).f67081a) != null) {
            a aVar2 = (a) eVar.f66247c;
            y yVar = (y) zVar;
            f30 pin = yVar.f94181a;
            List feed = yVar.f94182b;
            String str = yVar.f94184d;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(pin, "pin");
            Intrinsics.checkNotNullParameter(feed, "feed");
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            TrackingParamKeyBuilder trackingParamKeyBuilder = new TrackingParamKeyBuilder(i0Var.f67082b, viewType, str);
            np0.e eVar2 = new np0.e(aVar2.f103574b);
            eVar2.f91749b = new f(aVar2, trackingParamKeyBuilder, 1);
            eVar2.a(pin, feed, null, ((t) aVar2.f103575c).a(pin));
        }
        return Unit.f80348a;
    }
}
