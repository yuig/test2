package ir;

import ao2.j0;
import ao2.v0;
import com.pinterest.activity.task.activity.MainActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f73472r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f73473s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MainActivity mainActivity, bl2.c cVar) {
        super(2, cVar);
        this.f73473s = mainActivity;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f73473s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f73472r;
        if (i13 == 0) {
            ue.c.H(obj);
            MainActivity mainActivity = this.f73473s;
            if (mainActivity.D0 == null) {
                Intrinsics.r("shortcutsHelper");
                throw null;
            }
            this.f73472r = 1;
            boolean T1 = dl2.b.T1(mainActivity);
            ArrayList arrayList = new ArrayList();
            arrayList.add(vo.x.a(mainActivity, x0.saved, T1 ? tr.a.ic_vr_angled_pin_gestalt : tr.a.ic_angled_pin_gestalt));
            arrayList.add(vo.x.a(mainActivity, x0.search, T1 ? tr.a.ic_vr_search_gestalt : tr.a.ic_search_gestalt));
            arrayList.add(vo.x.a(mainActivity, x0.lens_feature, T1 ? tr.a.ic_vr_camera_gestalt : tr.a.ic_camera_gestalt));
            ko2.f fVar = v0.f20219a;
            Object M = kotlin.jvm.internal.j.M(this, ko2.e.f80326c, new vo.w(mainActivity, arrayList, null));
            if (M != obj2) {
                M = Unit.f80348a;
            }
            if (M == obj2) {
                return obj2;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
