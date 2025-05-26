package wa0;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import ao2.j0;
import ao2.m0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128621r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Fragment f128622s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f128623t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Fragment fragment, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f128622s = fragment;
        this.f128623t = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f128622s, this.f128623t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128621r;
        if (i13 == 0) {
            ue.c.H(obj);
            z viewLifecycleOwner = this.f128622s.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            r rVar = r.STARTED;
            a aVar2 = new a(this.f128623t, null);
            this.f128621r = 1;
            if (m0.f0(viewLifecycleOwner, rVar, aVar2, this) == aVar) {
                return aVar;
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
