package t52;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import rg0.k0;
import rg0.n;

/* loaded from: classes4.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116440i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f116441j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(0);
        this.f116440i = i13;
        this.f116441j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f116440i;
        d dVar = this.f116441j;
        switch (i13) {
            case 0:
                return (GestaltButton) dVar.requireView().findViewById(o52.c.board_preview_action_button);
            case 1:
                int i14 = d.f116443r0;
                n e83 = dVar.e8();
                ag2.e eVar = e83 != null ? e83.f108068j : null;
                k0 k0Var = eVar instanceof k0 ? (k0) eVar : null;
                String str = k0Var != null ? k0Var.f108047g : null;
                nx.d dVar2 = new nx.d();
                bs1.c.G1("destination_board_id", str, dVar2);
                return dVar2;
            case 2:
                switch (i13) {
                    case 2:
                        return (GestaltText) dVar.requireView().findViewById(o52.c.board_preview_prompt_modal_detailed_text);
                    default:
                        return (GestaltText) dVar.requireView().findViewById(o52.c.board_preview_prompt_modal_title_text);
                }
            case 3:
                Navigation navigation = dVar.I;
                Object i03 = navigation != null ? navigation.i0("EXPERIENCE_VALUE") : null;
                if (i03 instanceof n) {
                    return (n) i03;
                }
                return null;
            case 4:
                int i15 = d.f116443r0;
                n e84 = dVar.e8();
                if (e84 != null) {
                    e84.c(null, (nx.d) dVar.f116450m0.getValue());
                }
                dVar.d8();
                return Unit.f80348a;
            case 5:
                switch (i13) {
                    case 2:
                        return (GestaltText) dVar.requireView().findViewById(o52.c.board_preview_prompt_modal_detailed_text);
                    default:
                        return (GestaltText) dVar.requireView().findViewById(o52.c.board_preview_prompt_modal_title_text);
                }
            default:
                return (PinterestVideoView) dVar.requireView().findViewById(o52.c.board_preview_prompt_modal_video_view);
        }
    }
}
