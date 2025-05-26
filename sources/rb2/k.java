package rb2;

import ac2.a1;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.y4;
import com.pinterest.video.view.SimplePlayerControlView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f107188b;

    public /* synthetic */ k(ViewGroup viewGroup, int i13) {
        this.f107187a = i13;
        this.f107188b = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wy0 f13;
        pc2.a aVar;
        int i13 = this.f107187a;
        ViewGroup viewGroup = this.f107188b;
        switch (i13) {
            case 0:
                n this$0 = (n) viewGroup;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i14 = m.f107189a[this$0.f107199j.ordinal()];
                if (i14 == 1) {
                    m60.w wVar = this$0.f107194e;
                    if (wVar != null) {
                        wVar.d(Navigation.w1((ScreenLocation) y4.f51624c.getValue()));
                        return;
                    } else {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                }
                if (i14 == 2 && (f13 = ((b60.d) com.bumptech.glide.d.E()).f()) != null) {
                    c2 c2Var = this$0.f107195f;
                    if (c2Var != null) {
                        c2Var.q(y32.f.PROFILE.getValue(), f13);
                        return;
                    } else {
                        Intrinsics.r("sharesheetUtils");
                        throw null;
                    }
                }
                return;
            case 1:
                SimplePlayerControlView this$02 = (SimplePlayerControlView) viewGroup;
                int i15 = SimplePlayerControlView.f52779q0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                int id3 = view.getId();
                if (id3 == a1.mute_toggle_button) {
                    pc2.a aVar2 = this$02.f52790m0;
                    if (aVar2 != null) {
                        aVar2.f();
                        return;
                    }
                    return;
                }
                if (id3 != a1.full_screen_toggle_button || this$02.f52781d0 == null || (aVar = this$02.f52790m0) == null) {
                    return;
                }
                aVar.e();
                return;
            default:
                dd2.g this$03 = (dd2.g) viewGroup;
                int i16 = dd2.g.f54459p;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.a(false);
                return;
        }
    }
}
