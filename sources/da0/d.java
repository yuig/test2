package da0;

import android.net.Uri;
import ao2.j0;
import ca0.g1;
import ca0.i1;
import ca0.j1;
import ca0.r0;
import ca0.t0;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import dl2.j;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.r;

/* loaded from: classes5.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t0 f54209r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f54210s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f54211t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t0 t0Var, f fVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f54209r = t0Var;
        this.f54210s = fVar;
        this.f54211t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f54209r, this.f54210s, this.f54211t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        r0 r0Var = (r0) this.f54209r;
        ca0.c cVar = r0Var.f27160g;
        f fVar = this.f54210s;
        if (cVar == null) {
            fVar.getClass();
            NavigationImpl L = Navigation.L((ScreenLocation) com.pinterest.screens.j0.f50998a.getValue(), "", ml1.b.MODAL_TRANSITION.getValue());
            PinnableImage pinnableImage = new PinnableImage();
            j1 j1Var = r0Var.f27155b;
            if (j1Var instanceof g1) {
                pinnableImage.f35571h = Uri.fromFile(((g1) j1Var).f27117a);
            } else if (j1Var instanceof i1) {
                pinnableImage.f35569f = ((i1) j1Var).f27130a;
            }
            pinnableImage.f35567d = r0Var.f27156c;
            pinnableImage.f35568e = r0Var.f27157d;
            pinnableImage.f35576m = r0Var.f27158e;
            L.a(f0.d(pinnableImage));
            L.m0("com.pinterest.EXTRA_SHUFFLE_ID", r0Var.f27154a);
            L.m0("com.pinterest.EXTRA_PIN_CREATE_TYPE", g.Collage.getValue());
            L.Y1("com.pinterest.EXTRA_ALLOW_PROFILE_SAVE_OPTION", false);
            L.Y1("com.pinterest.EXTRA_IS_SHUFFLE_REMIXABLE", r0Var.f27159f);
            fVar.f54215c.f(L);
        } else if (cVar instanceof ca0.b) {
            String string = fVar.f54213a.getString(x0.profile);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fVar.j(r0Var, this.f54211t, null, string, null);
        } else if (cVar instanceof ca0.a) {
            fVar.getClass();
            ca0.c cVar2 = r0Var.f27160g;
            ca0.a aVar2 = cVar2 instanceof ca0.a ? (ca0.a) cVar2 : null;
            if (aVar2 != null) {
                fVar.j(r0Var, this.f54211t, aVar2.f27060a, aVar2.f27061b.a(fVar.f54213a).toString(), aVar2.f27063d);
            }
        }
        return Unit.f80348a;
    }
}
