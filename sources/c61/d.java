package c61;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f26527r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f26528s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f26528s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f26528s, cVar);
        dVar.f26527r = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((k) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        k kVar = (k) this.f26527r;
        int i13 = i.f26565m1;
        i iVar = this.f26528s;
        iVar.getClass();
        if (kVar.f26584b) {
            RecyclerView g83 = iVar.g8();
            if (g83 != null) {
                g83.setPaddingRelative(g83.getPaddingStart(), 0, g83.getPaddingEnd(), g83.getPaddingBottom());
            }
            iVar.addScrollListener(new kx0.m(iVar));
        }
        if (kVar.f26586d) {
            Context context = iVar.getContext();
            ViewGroup viewGroup = iVar.f26570e1;
            if (viewGroup == null) {
                Intrinsics.r("searchBar");
                throw null;
            }
            kh2.m0.P0((ye2.m) context, viewGroup, kVar.f26587e, kVar.f26588f);
        }
        if (kVar.f26590h) {
            vg1.a aVar2 = iVar.I0;
            if (aVar2 == null) {
                Intrinsics.r("spotlightPinImpressionManager");
                throw null;
            }
            aVar2.f125786b = 0;
            kh2.j.x2(iVar.c9(), q.f26634a);
        }
        if (kVar.f26591i) {
            boolean booleanValue = ((Boolean) iVar.f26573h1.getValue()).booleanValue();
            n nVar = n.f26627a;
            if (booleanValue) {
                ur0.g.d(i32.y0.ANDROID_SEARCH_TAB_LANDING_TAKEOVER, iVar, null);
                kh2.j.x2(iVar.c9(), nVar);
            } else {
                ur0.g.d(i32.y0.ANDROID_SEARCH_TAB_LANDING_TAKEOVER, iVar, null);
                kh2.j.x2(iVar.c9(), nVar);
            }
        }
        return Unit.f80348a;
    }
}
