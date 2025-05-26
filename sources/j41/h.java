package j41;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.profile.lego.header.view.LegoUserProfileHeader;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.i3;
import jc0.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;

/* loaded from: classes5.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74657i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoUserProfileHeader f74658j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(LegoUserProfileHeader legoUserProfileHeader, int i13) {
        super(0);
        this.f74657i = i13;
        this.f74658j = legoUserProfileHeader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f74657i;
        LegoUserProfileHeader legoUserProfileHeader = this.f74658j;
        switch (i13) {
            case 0:
                Context context = legoUserProfileHeader.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ll.j jVar = legoUserProfileHeader.I;
                if (jVar != null) {
                    return new y31.q(context, jVar);
                }
                Intrinsics.r("pincodesUtil");
                throw null;
            case 1:
                m160invoke();
                return Unit.f80348a;
            case 2:
                m160invoke();
                return Unit.f80348a;
            case 3:
                m160invoke();
                return Unit.f80348a;
            case 4:
                m160invoke();
                return Unit.f80348a;
            default:
                Context context2 = legoUserProfileHeader.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int i14 = sm1.b.ic_globe_checked_gestalt;
                int i15 = eo1.b.color_themed_text_default;
                Intrinsics.checkNotNullParameter(context2, "context");
                Object obj = d5.a.f53679a;
                Drawable drawable = context2.getDrawable(i14);
                Intrinsics.checkNotNullParameter(context2, "context");
                if (drawable == null) {
                    return null;
                }
                int color = i15 == 0 ? context2.getColor(df0.a.f54892a) : context2.getColor(i15);
                Intrinsics.checkNotNullParameter(context2, "context");
                if (color == 0) {
                    color = context2.getColor(df0.a.f54892a);
                }
                Drawable mutate = drawable.mutate();
                mutate.setTint(color);
                return mutate;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m160invoke() {
        i41.d dVar;
        wy0 wy0Var;
        int i13 = this.f74657i;
        LegoUserProfileHeader legoUserProfileHeader = this.f74658j;
        switch (i13) {
            case 1:
                h41.f fVar = legoUserProfileHeader.K;
                if (fVar != null) {
                    i41.d dVar2 = (i41.d) fVar;
                    h41.e eVar = (h41.e) dVar2.getView();
                    boolean w33 = dVar2.w3(dVar2.f71533p);
                    LegoUserProfileHeader legoUserProfileHeader2 = (LegoUserProfileHeader) eVar;
                    legoUserProfileHeader2.getClass();
                    int i14 = w33 ? nz1.f.your_private_profile_popup_title : nz1.f.private_profile_popup_title;
                    int i15 = w33 ? nz1.f.your_private_profile_popup_body : nz1.f.private_profile_popup_body;
                    se2.a aVar = legoUserProfileHeader2.F;
                    if (aVar != null) {
                        ((w) ((bf2.b) aVar).get()).d(new v(new l(i14, i15, new h(legoUserProfileHeader2, 3)), false, 0L, 30));
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                return;
            case 2:
                h41.f fVar2 = legoUserProfileHeader.K;
                if (fVar2 != null) {
                    ((i41.d) fVar2).z3();
                    return;
                }
                return;
            case 3:
                h41.f fVar3 = legoUserProfileHeader.K;
                if (fVar3 != null) {
                    LegoUserProfileHeader legoUserProfileHeader3 = (LegoUserProfileHeader) ((h41.e) ((i41.d) fVar3).getView());
                    se2.a aVar2 = legoUserProfileHeader3.F;
                    if (aVar2 != null) {
                        ((w) ((bf2.b) aVar2).get()).d(Navigation.z0((ScreenLocation) i3.f50972f.getValue(), legoUserProfileHeader3.getResources().getString(nz1.f.url_help_center_private_profile)));
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                return;
            default:
                h41.f fVar4 = legoUserProfileHeader.K;
                if (fVar4 == null || (wy0Var = (dVar = (i41.d) fVar4).f71533p) == null) {
                    return;
                }
                dVar.q3(wy0Var);
                return;
        }
    }
}
