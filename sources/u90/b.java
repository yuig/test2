package u90;

import android.os.Bundle;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import s90.x0;
import s90.y0;
import s90.z0;
import sa0.b0;
import sa0.z;

/* loaded from: classes5.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z0 f121173r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f121174s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z0 z0Var, c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f121173r = z0Var;
        this.f121174s = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f121173r, this.f121174s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        z0 z0Var = this.f121173r;
        boolean z13 = z0Var instanceof x0;
        c cVar = this.f121174s;
        if (z13) {
            ll.j jVar = cVar.f121175a;
            a aVar2 = a.f121170j;
            Bundle bundle = new Bundle();
            x0 x0Var = (x0) z0Var;
            bundle.putParcelable("CutoutPickerExtras.CUTOUT_SELECTION_RESULT_KEY", x0Var.f112041a);
            b0 b0Var = x0Var.f112042b;
            if (b0Var instanceof z) {
                bundle.putInt("com.pinterest.EXTRA_CUTOUT_LOCAL_IMAGE_SOURCE", ((z) b0Var).f112203c.getValue());
            }
            Unit unit = Unit.f80348a;
            jVar.D(aVar2, "CutoutPickerExtras.CUTOUT_SELECTION_RESULT_CODE", bundle);
        } else if (z0Var instanceof y0) {
            ll.j jVar2 = cVar.f121175a;
            a aVar3 = a.f121171k;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("CutoutPickerExtras.CUTOUT_MASK_RESULT_KEY", ((y0) z0Var).f112044a);
            Unit unit2 = Unit.f80348a;
            jVar2.D(aVar3, "CutoutPickerExtras.CUTOUT_MASK_RESULT_CODE", bundle2);
        }
        return Unit.f80348a;
    }
}
