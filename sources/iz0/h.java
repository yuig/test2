package iz0;

import android.view.View;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f73914r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f73915s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view, bl2.c cVar) {
        super(2, cVar);
        this.f73915s = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f73915s, cVar);
        hVar.f73914r = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f73914r;
        GestaltSpinner gestaltSpinner = (GestaltSpinner) this.f73915s.findViewById(iy1.d.loading_indicator);
        Intrinsics.f(gestaltSpinner);
        dl2.b.X2(gestaltSpinner, dl2.b.T2(bVar.f73898b));
        return Unit.f80348a;
    }
}
