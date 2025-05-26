package w72;

import ao2.j0;
import com.pinterest.video.view.BaseVideoView;
import dl2.j;
import do2.t2;
import do2.y1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import oc2.i;
import v72.r;
import v72.w;

/* loaded from: classes4.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128201r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y1 f128202s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f128203t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f128204u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y1 y1Var, w wVar, e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f128202s = y1Var;
        this.f128203t = wVar;
        this.f128204u = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f128202s, this.f128203t, this.f128204u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        boolean z13;
        Set set;
        long j13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128201r;
        if (i13 != 0 && i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ue.c.H(obj);
        do {
            r rVar = (r) this.f128203t;
            boolean z14 = rVar.f124449b;
            e eVar = this.f128204u;
            if (z14) {
                z13 = eVar.f128212c.a(rVar.f124448a);
            } else {
                v72.a aVar2 = eVar.f128212c;
                String sceneViewIdentityKey = rVar.f124448a;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(sceneViewIdentityKey, "sceneViewIdentityKey");
                Integer num = (Integer) aVar2.f124397c.get(sceneViewIdentityKey);
                if (num != null && (set = (Set) aVar2.f124395a.f2014q.get(num)) != null) {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            if (((BaseVideoView) ((i) it.next())).f18946k != null) {
                                break;
                            }
                        }
                    }
                }
                if (eVar.f128212c.a(rVar.f124448a)) {
                    z13 = true;
                }
                z13 = false;
            }
            ((t2) this.f128202s).i(Boolean.valueOf(z13));
            j13 = e.f128209f;
            this.f128201r = 1;
        } while (l0.T(j13, this) != aVar);
        return aVar;
    }
}
