package p91;

import android.content.Context;
import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99278i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f99279j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(1);
        this.f99278i = i13;
        this.f99279j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f99278i;
        f fVar = this.f99279j;
        switch (i13) {
            case 0:
                wy0 updatedUser = (wy0) obj;
                Intrinsics.checkNotNullParameter(updatedUser, "updatedUser");
                ((b60.d) fVar.f99282c).k(updatedUser);
                return Unit.f80348a;
            case 1:
                ((k91.e) ((l91.b) fVar.getView())).f7().d(new of0.a(new mf0.l()));
                return Unit.f80348a;
            case 2:
                l91.b bVar = (l91.b) fVar.getView();
                String userUid = com.bumptech.glide.d.Q(fVar.f99282c).getUid();
                Intrinsics.checkNotNullExpressionValue(userUid, "getUid(...)");
                k91.e eVar = (k91.e) bVar;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(userUid, "userUid");
                mo1.d dVar = eVar.f78823k0;
                if (dVar == null) {
                    Intrinsics.r("intentHelper");
                    throw null;
                }
                lu1.b bVar2 = eVar.f78824l0;
                if (bVar2 == null) {
                    Intrinsics.r("activityHelper");
                    throw null;
                }
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                mo1.d.a(dVar, false, ((lu1.c) bVar2).g(requireContext, u70.a.PROFILE, null), null, null, 13);
                return Unit.f80348a;
            default:
                k91.e eVar2 = (k91.e) ((l91.b) fVar.getView());
                int i14 = b52.c.revert_to_personal_account_error_message;
                i92.k kVar = eVar2.f78822j0;
                if (kVar != null) {
                    kVar.n(i14);
                    return Unit.f80348a;
                }
                Intrinsics.r("toastUtils");
                throw null;
        }
    }
}
