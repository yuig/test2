package ns;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f91925r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f91926s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f91926s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f91926s, cVar);
        kVar.f91925r = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((c) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        c cVar = (c) this.f91925r;
        int i13 = r.f91954c1;
        r rVar = this.f91926s;
        rVar.getClass();
        if (cVar.f91899a) {
            RecyclerView g83 = rVar.g8();
            if (g83 != null) {
                g83.setPaddingRelative(g83.getPaddingStart(), 0, g83.getPaddingEnd(), g83.getPaddingBottom());
            }
            rVar.addScrollListener(rVar.Z0);
        }
        if (cVar.f91900b) {
            Context context = rVar.getContext();
            ViewGroup viewGroup = rVar.X0;
            if (viewGroup == null) {
                Intrinsics.r("searchBar");
                throw null;
            }
            kh2.m0.P0((ye2.m) context, viewGroup, cVar.f91901c, cVar.f91902d);
        }
        return Unit.f80348a;
    }
}
