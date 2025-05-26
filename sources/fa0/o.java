package fa0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.collage.remix.closeup.components.RemixCollageView;
import com.pinterest.collage.remix.closeup.components.TemplateCollageView;
import kh2.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61517i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f61518j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(t tVar, int i13) {
        super(0);
        this.f61517i = i13;
        this.f61518j = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.pinterest.collage.remix.closeup.components.TemplateCollageView] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RemixCollageView remixCollageView;
        j jVar = j.f61492a;
        k kVar = k.f61498a;
        AttributeSet attributeSet = null;
        int i13 = this.f61517i;
        t tVar = this.f61518j;
        switch (i13) {
            case 0:
                return com.bumptech.glide.d.i0(null, null, tVar.U0, "");
            case 1:
                switch (i13) {
                    case 1:
                        int i14 = t.V0;
                        tVar.m9(jVar);
                        break;
                    default:
                        int i15 = t.V0;
                        tVar.m9(kVar);
                        break;
                }
                return Unit.f80348a;
            case 2:
                switch (i13) {
                    case 1:
                        int i16 = t.V0;
                        tVar.m9(jVar);
                        break;
                    default:
                        int i17 = t.V0;
                        tVar.m9(kVar);
                        break;
                }
                return Unit.f80348a;
            default:
                int i18 = t.V0;
                tVar.getClass();
                int i19 = 6;
                if (com.bumptech.glide.d.G(tVar, "RetrievalExtras.COLLAGE_IS_TEMPLATES", false)) {
                    Context requireContext = tVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    remixCollageView = new TemplateCollageView(i19, requireContext, attributeSet);
                } else {
                    Context requireContext2 = tVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    remixCollageView = new RemixCollageView(i19, requireContext2, attributeSet);
                }
                remixCollageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                remixCollageView.V0(new o(tVar, 1));
                remixCollageView.x1(new o(tVar, 2));
                tVar.S0.put(1000, remixCollageView);
                RecyclerView g83 = tVar.g8();
                if (g83 != null) {
                    j1.i1(g83, remixCollageView);
                }
                return remixCollageView;
        }
    }
}
