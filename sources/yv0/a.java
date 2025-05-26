package yv0;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.so;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.vn0;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import hv0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.k3;
import kh2.p2;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import tb0.p;
import zv0.j;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140195i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f140196j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(1);
        this.f140195i = i13;
        this.f140196j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f140195i;
        c cVar = this.f140196j;
        switch (i13) {
            case 0:
                ln0 ln0Var = (ln0) obj;
                cVar.f140212m = ln0Var;
                if (cVar.f140214o == null) {
                    tp y13 = ln0Var.y();
                    cVar.f140214o = y13;
                    vv0.c cVar2 = (vv0.c) cVar.getView();
                    so ratio = k3.a0(ln0Var);
                    j jVar = (j) cVar2;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(ratio, "ratio");
                    RoundedCornersLayout roundedCornersLayout = jVar.F0;
                    if (roundedCornersLayout == null) {
                        Intrinsics.r("playerViewContainer");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams = roundedCornersLayout.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.G = ratio.toString();
                    roundedCornersLayout.setLayoutParams(layoutParams2);
                    IdeaPinEditablePageLite ideaPinEditablePageLite = jVar.G0;
                    if (ideaPinEditablePageLite == null) {
                        Intrinsics.r("pageView");
                        throw null;
                    }
                    ideaPinEditablePageLite.Z(ratio);
                    if (p2.O0(y13.getMediaList())) {
                        vv0.c cVar3 = (vv0.c) cVar.getView();
                        String pageBackgroundColor = y13.getPageBackgroundColor();
                        IdeaPinEditablePageLite ideaPinEditablePageLite2 = ((j) cVar3).G0;
                        if (ideaPinEditablePageLite2 == null) {
                            Intrinsics.r("pageView");
                            throw null;
                        }
                        ideaPinEditablePageLite2.o0(pageBackgroundColor);
                        vv0.c cVar4 = (vv0.c) cVar.getView();
                        List pathList = y13.getDrawingPathList();
                        j jVar2 = (j) cVar4;
                        jVar2.getClass();
                        Intrinsics.checkNotNullParameter(pathList, "pathList");
                        IdeaPinEditablePageLite ideaPinEditablePageLite3 = jVar2.G0;
                        if (ideaPinEditablePageLite3 == null) {
                            Intrinsics.r("pageView");
                            throw null;
                        }
                        ideaPinEditablePageLite3.d0(pathList);
                        vv0.c cVar5 = (vv0.c) cVar.getView();
                        List overlayList = y13.getOverlayBlocks();
                        j jVar3 = (j) cVar5;
                        jVar3.getClass();
                        Intrinsics.checkNotNullParameter(overlayList, "overlayList");
                        List<qq> list = overlayList;
                        for (qq qqVar : list) {
                            jVar3.f142883e1.put(qqVar.getConfig().getId(), qqVar.getDurationConfig());
                        }
                        IdeaPinEditablePageLite ideaPinEditablePageLite4 = jVar3.G0;
                        if (ideaPinEditablePageLite4 == null) {
                            Intrinsics.r("pageView");
                            throw null;
                        }
                        ArrayList arrayList = new ArrayList(g0.q(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new g((qq) it.next(), null));
                        }
                        ideaPinEditablePageLite4.k0(arrayList);
                    }
                }
                cVar.f140213n = tp.e(ln0Var.y(), null, null, null, null, null, null, null, null, null, null, null, null, 4095);
                vn0 u33 = cVar.u3();
                if (u33 != null) {
                    List items = u33.getItems();
                    int i14 = cVar.f140215p;
                    if (i14 == -1) {
                        cVar.H3(u33);
                    } else {
                        if (i14 < 0 || i14 >= items.size()) {
                            throw new IllegalStateException("Invalid video clip index");
                        }
                        cVar.I3((bo0) items.get(cVar.f140215p));
                    }
                }
                return Unit.f80348a;
            default:
                cVar.f140204e.q((Throwable) obj, "StoryPinVideoTrimmingPresenter: failed to fetch storyPinLocalData", p.IDEA_PINS_CREATION);
                return Unit.f80348a;
        }
    }
}
