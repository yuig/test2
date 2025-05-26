package u81;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.visual.lens.view.LensBottomControlsContainer;
import kotlin.jvm.internal.Intrinsics;
import lh0.o4;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LensBottomControlsContainer f120988b;

    public /* synthetic */ b(LensBottomControlsContainer lensBottomControlsContainer, int i13) {
        this.f120987a = i13;
        this.f120988b = lensBottomControlsContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ny1.n nVar;
        int i13 = this.f120987a;
        LensBottomControlsContainer this$0 = this.f120988b;
        switch (i13) {
            case 0:
                int i14 = LensBottomControlsContainer.f48045i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                m81.r rVar = this$0.f48046a;
                if (rVar != null) {
                    s81.p pVar = (s81.p) rVar;
                    rg0.n nVar2 = pVar.T;
                    if (nVar2 != null) {
                        nVar2.a(null, null);
                        ((r) ((m81.q) pVar.getView())).M9(false);
                    }
                    LensBottomControlsContainer lensBottomControlsContainer = ((r) ((m81.q) pVar.getView())).G1;
                    if (lensBottomControlsContainer == null) {
                        Intrinsics.r("bottomContainer");
                        throw null;
                    }
                    lensBottomControlsContainer.f48051f.setClickable(false);
                    if (pVar.f111941s == s81.h.ACTIVE_CAMERA) {
                        r rVar2 = (r) ((m81.q) pVar.getView());
                        i iVar = rVar2.I1;
                        if (iVar != null) {
                            iVar.j();
                        }
                        q81.a aVar = rVar2.J1;
                        if (aVar != null) {
                            aVar.g();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i15 = LensBottomControlsContainer.f48045i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                m81.r rVar3 = this$0.f48046a;
                if (rVar3 != null) {
                    s81.p pVar2 = (s81.p) rVar3;
                    if (pVar2.D3()) {
                        pVar2.X3();
                        return;
                    }
                    r rVar4 = (r) ((m81.q) pVar2.getView());
                    o4 o4Var = rVar4.S0;
                    if (o4Var == null) {
                        Intrinsics.r("visualSearchExperiments");
                        throw null;
                    }
                    o4Var.a();
                    if (rVar4.s9()) {
                        nVar = ny1.j.f92670f;
                        FragmentActivity requireActivity = rVar4.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        if (nVar.b(requireActivity, rVar4.o9(), false)) {
                            nVar = ny1.i.f92669f;
                        }
                    } else {
                        nVar = ny1.k.f92671f;
                    }
                    ny1.n nVar3 = nVar;
                    ny1.w o93 = rVar4.o9();
                    FragmentActivity requireActivity2 = rVar4.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                    o93.c(requireActivity2, nVar3, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : new n(rVar4, 7), (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : new n(rVar4, 8), (r23 & 1024) != 0 ? ny1.t.f92703n : null);
                    return;
                }
                return;
            default:
                int i16 = LensBottomControlsContainer.f48045i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                m81.r rVar5 = this$0.f48046a;
                if (rVar5 != null) {
                    s81.p pVar3 = (s81.p) rVar5;
                    pVar3.f111934l.a(new s81.n(pVar3, 0), null, c91.a.f26973a);
                    return;
                }
                return;
        }
    }
}
