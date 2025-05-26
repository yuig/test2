package y52;

import android.net.Uri;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f137827i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0 f137828j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(x0 x0Var, int i13) {
        super(0);
        this.f137827i = i13;
        this.f137828j = x0Var;
    }

    public final String b() {
        String v03;
        int i13 = this.f137827i;
        x0 x0Var = this.f137828j;
        switch (i13) {
            case 0:
                Navigation navigation = x0Var.I;
                v03 = navigation != null ? navigation.v0("ARG_SHARE_APP") : null;
                return v03 == null ? "" : v03;
            default:
                Navigation navigation2 = x0Var.I;
                v03 = navigation2 != null ? navigation2.v0("ARG_URI_STRING") : null;
                if (v03 != null) {
                    return v03;
                }
                String uri = Uri.EMPTY.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                return uri;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object Z0;
        g gVar = g.f137797a;
        int i13 = this.f137827i;
        x0 x0Var = this.f137828j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                Navigation navigation = x0Var.I;
                Z0 = navigation != null ? navigation.Z0("ARG_PREVIEW_STATE", i91.b.f71797d) : null;
                Intrinsics.g(Z0, "null cannot be cast to non-null type com.pinterest.feature.sendshare.util.BoardPreviewState");
                return (i91.b) Z0;
            case 2:
                switch (i13) {
                    case 2:
                        int i14 = x0.f137870v0;
                        x0Var.e8().f137820l.e().a(gVar);
                        break;
                    default:
                        x0Var.f137883s0.d();
                        break;
                }
                return Unit.f80348a;
            case 3:
                Navigation navigation2 = x0Var.I;
                Serializable Z02 = navigation2 != null ? navigation2.Z0("ARG_INVITE_CATEGORY", Integer.valueOf(p32.c.NONE.getValue())) : null;
                Z0 = Z02 instanceof p32.c ? (p32.c) Z02 : null;
                return Z0 == null ? p32.c.NONE : Z0;
            case 4:
                Navigation navigation3 = x0Var.I;
                return Boolean.valueOf(navigation3 != null ? navigation3.S("ARG_IS_STATIC_PREVIEW", false) : false);
            case 5:
                return (GestaltText) x0Var.requireView().findViewById(o52.c.share_board_video_link);
            case 6:
                Navigation navigation4 = x0Var.I;
                Z0 = navigation4 != null ? navigation4.b2("ARG_SENDABLE_OBJECT") : null;
                Intrinsics.g(Z0, "null cannot be cast to non-null type com.pinterest.activity.sendapin.model.SendableObject");
                return (SendableObject) Z0;
            case 7:
                switch (i13) {
                    case 2:
                        int i15 = x0.f137870v0;
                        x0Var.e8().f137820l.e().a(gVar);
                        break;
                    default:
                        x0Var.f137883s0.d();
                        break;
                }
                return Unit.f80348a;
            case 8:
                Navigation navigation5 = x0Var.I;
                int J1 = navigation5 != null ? navigation5.J1("ARG_TITLE_STRING_RES") : 0;
                if (J1 == 0) {
                    J1 = o52.e.share_board_video_header;
                }
                return Integer.valueOf(J1);
            default:
                return b();
        }
    }
}
