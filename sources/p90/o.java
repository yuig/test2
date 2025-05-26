package p90;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.collage.cutoutpicker.closeup.components.CloseupMetadataSectionView;
import com.pinterest.collage.cutoutpicker.closeup.components.CutoutEditorView;
import com.pinterest.gestalt.text.GestaltText;
import kh2.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.n5;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99206i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f99207j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(w wVar, int i13) {
        super(0);
        this.f99206i = i13;
        this.f99207j = wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = 6;
        AttributeSet attributeSet = null;
        int i14 = this.f99206i;
        w wVar = this.f99207j;
        switch (i14) {
            case 0:
                m230invoke();
                return Unit.f80348a;
            case 1:
                m230invoke();
                return Unit.f80348a;
            case 2:
                m230invoke();
                return Unit.f80348a;
            case 3:
                m230invoke();
                return Unit.f80348a;
            case 4:
                qa2.e v13 = kh2.r.v1(y.a(), new a.z0(wVar, 2));
                n5 n5Var = wVar.L0;
                if (n5Var == null) {
                    Intrinsics.r("gridViewsHelperFactory");
                    throw null;
                }
                FragmentActivity requireActivity = wVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return n5Var.a(requireActivity, wVar, v13.a(), (h32.i0) wVar.P0.getValue());
            case 5:
                return com.bumptech.glide.d.i0(wVar.X0, wVar.W0, wVar.V0, "");
            case 6:
                Context requireContext = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                CutoutEditorView cutoutEditorView = new CutoutEditorView(requireContext);
                wVar.Q0.put(1000, cutoutEditorView);
                return cutoutEditorView;
            case 7:
                Context requireContext2 = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                CloseupMetadataSectionView closeupMetadataSectionView = new CloseupMetadataSectionView(i13, requireContext2, attributeSet);
                wVar.Q0.put(1001, closeupMetadataSectionView);
                RecyclerView g83 = wVar.g8();
                if (g83 != null) {
                    j1.i1(g83, closeupMetadataSectionView);
                }
                return closeupMetadataSectionView;
            default:
                Context requireContext3 = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                GestaltText gestaltText = new GestaltText(6, requireContext3, (AttributeSet) null);
                int i15 = r80.f.related_pins_divider;
                gestaltText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                int W = bs1.c.W(gestaltText, eo1.c.space_400);
                gestaltText.setPaddingRelative(W, bs1.c.W(gestaltText, eo1.c.space_600), W, W);
                gestaltText.i(new r1.j0(i15, 12));
                return gestaltText;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m230invoke() {
        int i13 = this.f99206i;
        w wVar = this.f99207j;
        switch (i13) {
            case 0:
                c cVar = c.f99177a;
                int i14 = w.Y0;
                kh2.j.x2(wVar.m9(), cVar);
                break;
            case 1:
                i iVar = i.f99193a;
                int i15 = w.Y0;
                kh2.j.x2(wVar.m9(), iVar);
                break;
            case 2:
                j jVar = j.f99194a;
                int i16 = w.Y0;
                kh2.j.x2(wVar.m9(), jVar);
                break;
            default:
                h hVar = h.f99191a;
                int i17 = w.Y0;
                kh2.j.x2(wVar.m9(), hVar);
                break;
        }
    }
}
