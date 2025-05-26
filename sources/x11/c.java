package x11;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.feature.pin.PinFeatureModuleLocation;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.s;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import f02.g;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l11.p;
import m60.t0;
import m60.v0;
import m60.w;
import uk1.e;
import vb0.j;
import w01.e0;
import yk1.m;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx11/c;", "Lyq0/b0;", "", "Lv11/c;", "<init>", "()V", "pin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends a<Object> implements v11.c {
    public static final /* synthetic */ int E0 = 0;
    public q11.a A0;
    public v11.b B0;
    public final d4 C0 = d4.PIN_EDIT;
    public final a4 D0 = a4.BOARD_SECTION_PICKER;

    /* renamed from: z0, reason: collision with root package name */
    public e f131576z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new e0(this, 7));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(g.create_select_a_board_section);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        gestaltToolbarImpl.c(new GestaltButton.SmallSecondaryButton(6, requireContext, (AttributeSet) null).d(b.f131574k).e(new p(this, 2)));
    }

    public final String U8() {
        Navigation navigation = this.I;
        j.f125466a.N(navigation != null ? navigation.getF49940b() : null, "Board id not set as navigation id for pin edit section picker fragment", new Object[0]);
        Navigation navigation2 = this.I;
        String f49940b = navigation2 != null ? navigation2.getF49940b() : null;
        return f49940b == null ? "" : f49940b;
    }

    @Override // yk1.k
    public final m V7() {
        String U8 = U8();
        w f73 = f7();
        e eVar = this.f131576z0;
        if (eVar != null) {
            return new w11.b(U8, f73, ((uk1.a) eVar).d(U8()), p7());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        s sVar = this.f91293r;
        ScreenDescription w13 = sVar != null ? sVar.w(1) : null;
        if (!Intrinsics.d(w13 != null ? w13.getScreenClass() : null, PinFeatureModuleLocation.PIN_EDIT_PIN.getF50048a())) {
            q11.a aVar = this.A0;
            if (aVar == null) {
                Intrinsics.r("editPinLauncher");
                throw null;
            }
            aVar.a(null, true);
        }
        nl1.d.J7();
        return false;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getI0() {
        return this.D0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.C0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(v0.pinterest_recycler_container_with_toolbar, t0.p_recycler_view);
        eVar.b(t0.loading_container);
        return eVar;
    }
}
