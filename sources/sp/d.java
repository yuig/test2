package sp;

import al1.n;
import android.view.View;
import com.pinterest.activity.pin.view.modules.PinCloseupVideoModule;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.um;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ls1.q;
import m60.w;
import oq.c0;
import rh1.k0;
import rh1.x;
import sl1.j;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f114851b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f114852c;

    public /* synthetic */ d(int i13, Object obj, Object obj2) {
        this.f114850a = i13;
        this.f114851b = obj;
        this.f114852c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        um umVar;
        boolean updatePin$lambda$14;
        int i13 = this.f114850a;
        Object obj = this.f114852c;
        Object obj2 = this.f114851b;
        switch (i13) {
            case 0:
                View.OnLongClickListener onLongClickListener = (View.OnLongClickListener) obj2;
                g this$0 = (g) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (onLongClickListener != null) {
                    return onLongClickListener.onLongClick(this$0);
                }
                return false;
            case 1:
                View.OnLongClickListener onLongClickListener2 = (View.OnLongClickListener) obj2;
                i this$02 = (i) obj;
                int i14 = i.f114873b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (onLongClickListener2 != null) {
                    return onLongClickListener2.onLongClick(this$02);
                }
                return false;
            case 2:
                c0 this$03 = (c0) obj2;
                String str = (String) obj;
                int i15 = c0.W;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (this$03.f97000y && (umVar = this$03.f96997v) != null) {
                    this$03.d().d(new q(null, umVar.f42584a, -1, -1, vn1.c.DEFAULT, false, str, true, -1, null, null, -1));
                }
                return true;
            case 3:
                updatePin$lambda$14 = PinCloseupVideoModule.updatePin$lambda$14((PinCloseupVideoModule) obj2, (f30) obj, view);
                return updatePin$lambda$14;
            case 4:
                CloseupCarouselView this_run = (CloseupCarouselView) obj2;
                BaseAdsScrollingModule this$04 = (BaseAdsScrollingModule) obj;
                int i16 = BaseAdsScrollingModule.D0;
                Intrinsics.checkNotNullParameter(this_run, "$this_run");
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                w wVar = this_run.A;
                if (wVar != null) {
                    wVar.d(new q(null, this$04.Y0()));
                    return true;
                }
                Intrinsics.r("eventManager");
                throw null;
            case 5:
                k0 this$05 = (k0) obj2;
                rp0.d comment = (rp0.d) obj;
                int i17 = k0.f108203k0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(comment, "$comment");
                this$05.f108222k.invoke(comment, x.TextLongPress);
                return true;
            case 6:
                GestaltAvatarGroup this$06 = (GestaltAvatarGroup) obj2;
                Function0 event = (Function0) obj;
                int i18 = j.f113184a;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(event, "$event");
                n nVar = GestaltAvatarGroup.f49251e;
                gm1.a aVar = (gm1.a) this$06.f49255a.f33804b;
                if (aVar != null) {
                    aVar.h3((gm1.c) event.invoke());
                }
                return true;
            default:
                ni0.f this$07 = (ni0.f) obj2;
                ba model = (ba) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(model, "$model");
                Function2 function2 = (Function2) this$07.f90591d;
                Intrinsics.f(view);
                function2.invoke(view, model);
                return true;
        }
    }
}
