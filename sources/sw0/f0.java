package sw0;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.screens.p2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115438i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f115439j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(j0 j0Var, int i13) {
        super(0);
        this.f115438i = i13;
        this.f115439j = j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f115438i) {
            case 0:
                m260invoke();
                break;
            case 1:
                m260invoke();
                break;
            case 2:
                m260invoke();
                break;
            case 3:
                m260invoke();
                break;
            case 4:
                m260invoke();
                break;
            default:
                m260invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m260invoke() {
        Context context;
        Context context2;
        int i13 = 6;
        int i14 = this.f115438i;
        j0 j0Var = this.f115439j;
        switch (i14) {
            case 0:
                int i15 = j0.H1;
                lu1.d a73 = j0Var.a7();
                Context requireContext = j0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                Intent b13 = a73.b(requireContext, lu1.a.CAMERA_ACTIVITY);
                b13.putExtra("com.pinterest.EXTRA_IS_COMMENT_PHOTO", j0Var.j9() == pw0.x.CommentAddPhoto);
                FragmentActivity E4 = j0Var.E4();
                if (E4 != null) {
                    E4.startActivityForResult(b13, RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL);
                    return;
                }
                return;
            case 1:
                int i16 = j0.H1;
                j0Var.t9();
                return;
            case 2:
                int i17 = j0.H1;
                j0Var.getClass();
                ny1.f fVar = ny1.f.f92666f;
                Context requireContext2 = j0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                if (!fVar.a(requireContext2) && (Build.VERSION.SDK_INT < 34 || (context = j0Var.getContext()) == null || !ny1.m.f92673f.a(context))) {
                    j0Var.t9();
                    return;
                }
                j0Var.l9();
                pw0.d0 d0Var = j0Var.f115493x1;
                if (d0Var != null) {
                    ((qw0.j) d0Var).J3();
                }
                j0Var.Z8();
                return;
            case 3:
                int i18 = j0.H1;
                ag1.h hVar = j0Var.M0;
                if (hVar != null) {
                    hVar.d(b.f115406l, false);
                    j0Var.M1(j0.V8(j0Var, p2.e(), 0, 6));
                    return;
                } else {
                    Intrinsics.r("ideaPinSessionDataManager");
                    throw null;
                }
            case 4:
                int i19 = j0.H1;
                j0Var.getClass();
                ny1.f fVar2 = ny1.f.f92666f;
                Context requireContext3 = j0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                if (!fVar2.a(requireContext3) && (Build.VERSION.SDK_INT < 34 || (context2 = j0Var.getContext()) == null || !ny1.m.f92673f.a(context2))) {
                    j0Var.t9();
                    return;
                }
                j0Var.l9();
                pw0.d0 d0Var2 = j0Var.f115493x1;
                if (d0Var2 != null) {
                    ((qw0.j) d0Var2).J3();
                }
                j0Var.Z8();
                return;
            default:
                pw0.d0 d0Var3 = j0Var.f115493x1;
                if (d0Var3 != null) {
                    qw0.j jVar = (qw0.j) d0Var3;
                    xj2.c o13 = jVar.f105284f.n("empty", null, null).r(tk2.e.f118017c).l(wj2.c.a()).o(new gw0.a(14, new qw0.g(jVar, i13)), new gw0.a(15, qw0.i.f105278i));
                    Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                    jVar.addDisposable(o13);
                    return;
                }
                return;
        }
    }
}
