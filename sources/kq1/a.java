package kq1;

import ad2.l;
import android.view.View;
import com.pinterest.ideaPinDisplay.feature.bottomsheet.details.view.ads.AdsIdeaPinCreatorAndSponsorView;
import com.pinterest.ideaPinDisplay.feature.bottomsheet.details.view.ads.AdsIdeaPinUserView;
import com.pinterest.ui.components.users.LegoUserRep;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ny1.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f80662b;

    public /* synthetic */ a(int i13, Function0 function0) {
        this.f80661a = i13;
        this.f80662b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f80661a;
        Function0 action = this.f80662b;
        switch (i13) {
            case 0:
                int i14 = AdsIdeaPinCreatorAndSponsorView.A;
                Intrinsics.checkNotNullParameter(action, "$action");
                action.invoke();
                break;
            case 1:
                int i15 = AdsIdeaPinUserView.f49736f;
                Intrinsics.checkNotNullParameter(action, "$action");
                action.invoke();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(action, "$onClick");
                action.invoke();
                break;
            case 3:
                List list = p.f92683a;
                Intrinsics.checkNotNullParameter(action, "$onExplanationAccepted");
                action.invoke();
                break;
            case 4:
                List list2 = p.f92683a;
                Intrinsics.checkNotNullParameter(action, "$onExplanationRejected");
                action.invoke();
                break;
            case 5:
                int i16 = LegoUserRep.A;
                Intrinsics.checkNotNullParameter(action, "$action");
                action.invoke();
                break;
            default:
                int i17 = l.f2106a;
                Intrinsics.checkNotNullParameter(action, "$onClick");
                action.invoke();
                break;
        }
    }
}
