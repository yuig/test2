package y31;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.profile.header.UserProfileHeader;
import com.pinterest.feature.profile.lego.header.view.LegoUserProfileHeader;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.i3;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends cf0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f136804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f136805c;

    public j(ConstraintLayout constraintLayout, Object obj, int i13) {
        this.f136803a = i13;
        this.f136804b = constraintLayout;
        this.f136805c = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        int i13 = this.f136803a;
        Object obj = this.f136805c;
        ConstraintLayout constraintLayout = this.f136804b;
        switch (i13) {
            case 0:
                kg.n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                u50.r rVar = ((UserProfileHeader) constraintLayout).f47531q;
                if (rVar != null) {
                    rVar.a(new x((c) obj));
                    break;
                }
                break;
            default:
                kg.n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "text");
                h41.f fVar = ((LegoUserProfileHeader) constraintLayout).K;
                if (fVar != null) {
                    String url = (String) obj;
                    i41.d dVar = (i41.d) fVar;
                    Intrinsics.checkNotNullParameter(url, "url");
                    nx.d0 d0Var = (nx.d0) dVar.f71534q.getValue();
                    f1 f1Var = f1.TAP;
                    u0 u0Var = u0.BUSINESS_PROFILE_WEBSITE_LINK;
                    h32.g0 g0Var = h32.g0.PROFILE_HEADER;
                    HashMap hashMap = new HashMap();
                    wy0 wy0Var = dVar.f71533p;
                    bs1.c.G1("website_link", wy0Var != null ? wy0Var.E4() : null, hashMap);
                    Unit unit = Unit.f80348a;
                    d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    dVar.f71526i.d(Navigation.z0((ScreenLocation) i3.f50972f.getValue(), url));
                    break;
                }
                break;
        }
    }
}
