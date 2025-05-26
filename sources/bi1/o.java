package bi1;

import android.view.View;
import ao2.j0;
import ao2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f22865r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f22866s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f22867t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f22868u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(View view, p pVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f22866s = pVar;
        this.f22867t = view;
        this.f22868u = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f22867t, this.f22866s, this.f22868u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f22865r;
        if (i13 == 0) {
            ue.c.H(obj);
            p pVar = this.f22866s;
            androidx.lifecycle.z viewLifecycleOwner = pVar.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            n nVar = new n(this.f22867t, pVar, this.f22868u, null);
            this.f22865r = 1;
            if (m0.f0(viewLifecycleOwner, rVar, nVar, this) == aVar) {
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
