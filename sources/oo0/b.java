package oo0;

import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import com.pinterest.feature.pin.create.view.BoardSectionCell;
import com.pinterest.feature.search.results.view.g0;
import com.pinterest.feature.search.typeahead.view.TypeaheadLegacySearchBarContainer;
import com.pinterest.toast.view.TextToastView;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.AdapterFooterView;
import com.pinterest.ui.text.DescriptionEditView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ln1.f;
import m60.x0;
import to0.g;
import u50.i0;
import vn1.e;
import yk1.i;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96804a;

    public /* synthetic */ b(int i13) {
        this.f96804a = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f96804a) {
            case 0:
                yl1.b bVar = (yl1.b) obj;
                return yl1.b.e(bs1.c.j2(new String[0], x0.next), true, fm1.c.VISIBLE, bVar.f139303d, bVar.f139304e, bVar.f139305f, bVar.f139306g, bVar.f139307h, bVar.f139308i, bVar.f139309j);
            case 1:
                yl1.b displayState = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                return new yl1.b(displayState.f139300a, true, displayState.f139302c, displayState.f139303d, displayState.f139304e, displayState.f139305f, displayState.f139306g, displayState.f139307h, displayState.f139308i, displayState.f139309j);
            case 2:
                yl1.b displayState2 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                return new yl1.b(displayState2.f139300a, false, displayState2.f139302c, displayState2.f139303d, displayState2.f139304e, displayState2.f139305f, displayState2.f139306g, displayState2.f139307h, displayState2.f139308i, displayState2.f139309j);
            case 3:
                em1.d displayState3 = (em1.d) obj;
                Intrinsics.checkNotNullParameter(displayState3, "displayState");
                em1.b bVar2 = displayState3.f59598a;
                em1.b checkedState = em1.b.UNCHECKED;
                Intrinsics.checkNotNullParameter(checkedState, "checkedState");
                return new em1.d(checkedState, displayState3.f59599b, displayState3.f59600c, displayState3.f59601d, displayState3.f59602e, displayState3.f59603f, displayState3.f59604g, displayState3.f59605h, displayState3.f59606i, displayState3.f59607j);
            case 4:
                yl1.b displayState4 = (yl1.b) obj;
                int i13 = g.G0;
                Intrinsics.checkNotNullParameter(displayState4, "displayState");
                i0 i0Var = displayState4.f139300a;
                fm1.c visibility = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                return new yl1.b(i0Var, displayState4.f139301b, visibility, displayState4.f139303d, displayState4.f139304e, displayState4.f139305f, displayState4.f139306g, displayState4.f139307h, displayState4.f139308i, displayState4.f139309j);
            case 5:
                ln1.d displayState5 = (ln1.d) obj;
                int i14 = InitialLoadSwipeRefreshLayout.L;
                Intrinsics.checkNotNullParameter(displayState5, "displayState");
                f fVar = displayState5.f83999a;
                i loadState = i.LOADED;
                Intrinsics.checkNotNullParameter(loadState, "loadState");
                return new ln1.d(fVar, displayState5.f84000b, dl2.b.T2(loadState), displayState5.f84002d, displayState5.f84003e, displayState5.f84004f);
            case 6:
                rn1.a displayState6 = (rn1.a) obj;
                int i15 = l11.c.f81382p;
                Intrinsics.checkNotNullParameter(displayState6, "displayState");
                i0 i0Var2 = displayState6.f108849g;
                rn1.b ellipsize = rn1.b.END;
                Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
                return new rn1.a(i0Var2, displayState6.f108850h, displayState6.f108851i, displayState6.f108852j, displayState6.f108853k, displayState6.f108854l, displayState6.f108855m, ellipsize, displayState6.f108857o, displayState6.f108858p, displayState6.f108859q, displayState6.f108860r, displayState6.f108861s, displayState6.f108862t, displayState6.f108863u, displayState6.f108864v, displayState6.f108865w, displayState6.f108866x, displayState6.f108867y, displayState6.f108868z, displayState6.A);
            case 7:
                rn1.a displayState7 = (rn1.a) obj;
                int i16 = l11.c.f81382p;
                Intrinsics.checkNotNullParameter(displayState7, "displayState");
                i0 i0Var3 = displayState7.f108849g;
                vn1.c color = vn1.c.DISABLED;
                Intrinsics.checkNotNullParameter(color, "color");
                return new rn1.a(i0Var3, color, displayState7.f108851i, displayState7.f108852j, displayState7.f108853k, displayState7.f108854l, displayState7.f108855m, displayState7.f108856n, displayState7.f108857o, displayState7.f108858p, displayState7.f108859q, displayState7.f108860r, displayState7.f108861s, displayState7.f108862t, displayState7.f108863u, displayState7.f108864v, displayState7.f108865w, displayState7.f108866x, displayState7.f108867y, displayState7.f108868z, displayState7.A);
            case 8:
                rm1.d displayState8 = (rm1.d) obj;
                int i17 = l11.c.f81382p;
                Intrinsics.checkNotNullParameter(displayState8, "displayState");
                rm1.g gVar = displayState8.f108695a;
                rm1.c color2 = rm1.c.DISABLED;
                Intrinsics.checkNotNullParameter(color2, "color");
                return new rm1.d(gVar, color2, displayState8.f108697c, displayState8.f108698d, displayState8.f108699e);
            case 9:
                rm1.d displayState9 = (rm1.d) obj;
                int i18 = l11.c.f81382p;
                Intrinsics.checkNotNullParameter(displayState9, "displayState");
                rm1.g gVar2 = displayState9.f108695a;
                rm1.c color3 = rm1.c.DISABLED;
                Intrinsics.checkNotNullParameter(color3, "color");
                return new rm1.d(gVar2, color3, displayState9.f108697c, displayState9.f108698d, displayState9.f108699e);
            case 10:
                rn1.a displayState10 = (rn1.a) obj;
                int i19 = l11.c.f81382p;
                Intrinsics.checkNotNullParameter(displayState10, "displayState");
                i0 i0Var4 = displayState10.f108849g;
                vn1.c color4 = vn1.c.DEFAULT;
                Intrinsics.checkNotNullParameter(color4, "color");
                return new rn1.a(i0Var4, color4, displayState10.f108851i, displayState10.f108852j, displayState10.f108853k, displayState10.f108854l, displayState10.f108855m, displayState10.f108856n, displayState10.f108857o, displayState10.f108858p, displayState10.f108859q, displayState10.f108860r, displayState10.f108861s, displayState10.f108862t, displayState10.f108863u, displayState10.f108864v, displayState10.f108865w, displayState10.f108866x, displayState10.f108867y, displayState10.f108868z, displayState10.A);
            case 11:
                rm1.d displayState11 = (rm1.d) obj;
                int i23 = l11.c.f81382p;
                Intrinsics.checkNotNullParameter(displayState11, "displayState");
                rm1.g gVar3 = displayState11.f108695a;
                rm1.c color5 = rm1.c.DEFAULT;
                Intrinsics.checkNotNullParameter(color5, "color");
                return new rm1.d(gVar3, color5, displayState11.f108697c, displayState11.f108698d, displayState11.f108699e);
            case 12:
                rm1.d displayState12 = (rm1.d) obj;
                int i24 = l11.c.f81382p;
                Intrinsics.checkNotNullParameter(displayState12, "displayState");
                rm1.g gVar4 = displayState12.f108695a;
                rm1.c color6 = rm1.c.DEFAULT;
                Intrinsics.checkNotNullParameter(color6, "color");
                return new rm1.d(gVar4, color6, displayState12.f108697c, displayState12.f108698d, displayState12.f108699e);
            case 13:
                rn1.a displayState13 = (rn1.a) obj;
                int i25 = l11.c.f81382p;
                Intrinsics.checkNotNullParameter(displayState13, "displayState");
                i0 i0Var5 = displayState13.f108849g;
                fm1.c visibility2 = fm1.c.GONE;
                Intrinsics.checkNotNullParameter(visibility2, "visibility");
                return new rn1.a(i0Var5, displayState13.f108850h, displayState13.f108851i, displayState13.f108852j, displayState13.f108853k, displayState13.f108854l, visibility2, displayState13.f108856n, displayState13.f108857o, displayState13.f108858p, displayState13.f108859q, displayState13.f108860r, displayState13.f108861s, displayState13.f108862t, displayState13.f108863u, displayState13.f108864v, displayState13.f108865w, displayState13.f108866x, displayState13.f108867y, displayState13.f108868z, displayState13.A);
            case 14:
                rn1.a displayState14 = (rn1.a) obj;
                int i26 = BoardSectionCell.f47065c;
                Intrinsics.checkNotNullParameter(displayState14, "displayState");
                i0 i0Var6 = displayState14.f108849g;
                rn1.b ellipsize2 = rn1.b.END;
                Intrinsics.checkNotNullParameter(ellipsize2, "ellipsize");
                return new rn1.a(i0Var6, displayState14.f108850h, displayState14.f108851i, displayState14.f108852j, displayState14.f108853k, displayState14.f108854l, displayState14.f108855m, ellipsize2, displayState14.f108857o, displayState14.f108858p, displayState14.f108859q, displayState14.f108860r, displayState14.f108861s, displayState14.f108862t, displayState14.f108863u, displayState14.f108864v, displayState14.f108865w, displayState14.f108866x, displayState14.f108867y, displayState14.f108868z, displayState14.A);
            case 15:
                rn1.a displayState15 = (rn1.a) obj;
                int i27 = g0.f47786l;
                Intrinsics.checkNotNullParameter(displayState15, "displayState");
                i0 i0Var7 = displayState15.f108849g;
                fm1.c visibility3 = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility3, "visibility");
                return new rn1.a(i0Var7, displayState15.f108850h, displayState15.f108851i, displayState15.f108852j, displayState15.f108853k, displayState15.f108854l, visibility3, displayState15.f108856n, displayState15.f108857o, displayState15.f108858p, displayState15.f108859q, displayState15.f108860r, displayState15.f108861s, displayState15.f108862t, displayState15.f108863u, displayState15.f108864v, displayState15.f108865w, displayState15.f108866x, displayState15.f108867y, displayState15.f108868z, displayState15.A);
            case 16:
                rn1.a displayState16 = (rn1.a) obj;
                int i28 = TypeaheadLegacySearchBarContainer.f47914f;
                Intrinsics.checkNotNullParameter(displayState16, "displayState");
                i0 i0Var8 = displayState16.f108849g;
                fm1.c visibility4 = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility4, "visibility");
                return new rn1.a(i0Var8, displayState16.f108850h, displayState16.f108851i, displayState16.f108852j, displayState16.f108853k, displayState16.f108854l, visibility4, displayState16.f108856n, displayState16.f108857o, displayState16.f108858p, displayState16.f108859q, displayState16.f108860r, displayState16.f108861s, displayState16.f108862t, displayState16.f108863u, displayState16.f108864v, displayState16.f108865w, displayState16.f108866x, displayState16.f108867y, displayState16.f108868z, displayState16.A);
            case 17:
                rn1.a displayState17 = (rn1.a) obj;
                int i29 = TextToastView.f52194b;
                Intrinsics.checkNotNullParameter(displayState17, "displayState");
                i0 i0Var9 = displayState17.f108849g;
                Object[] objArr = {vn1.b.CENTER};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                List alignment = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                Object[] objArr2 = {e.REGULAR};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj3 = objArr2[0];
                Objects.requireNonNull(obj3);
                arrayList2.add(obj3);
                List style = Collections.unmodifiableList(arrayList2);
                Intrinsics.checkNotNullParameter(style, "style");
                return new rn1.a(i0Var9, displayState17.f108850h, alignment, style, displayState17.f108853k, displayState17.f108854l, displayState17.f108855m, displayState17.f108856n, displayState17.f108857o, displayState17.f108858p, displayState17.f108859q, displayState17.f108860r, displayState17.f108861s, displayState17.f108862t, displayState17.f108863u, displayState17.f108864v, displayState17.f108865w, displayState17.f108866x, displayState17.f108867y, displayState17.f108868z, displayState17.A);
            case 18:
                ln1.d displayState18 = (ln1.d) obj;
                int i33 = AdapterEmptyView.f52367e;
                Intrinsics.checkNotNullParameter(displayState18, "displayState");
                f fVar2 = displayState18.f83999a;
                ln1.e loadingState = ln1.e.NONE;
                Intrinsics.checkNotNullParameter(loadingState, "loadingState");
                return new ln1.d(fVar2, displayState18.f84000b, loadingState, displayState18.f84002d, displayState18.f84003e, displayState18.f84004f);
            case 19:
                ln1.d displayState19 = (ln1.d) obj;
                int i34 = AdapterEmptyView.f52367e;
                Intrinsics.checkNotNullParameter(displayState19, "displayState");
                f fVar3 = displayState19.f83999a;
                ln1.e loadingState2 = ln1.e.LOADING;
                Intrinsics.checkNotNullParameter(loadingState2, "loadingState");
                fm1.c visibility5 = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility5, "visibility");
                return new ln1.d(fVar3, displayState19.f84000b, loadingState2, displayState19.f84002d, visibility5, displayState19.f84004f);
            case 20:
                ln1.d displayState20 = (ln1.d) obj;
                int i35 = AdapterEmptyView.f52367e;
                Intrinsics.checkNotNullParameter(displayState20, "displayState");
                f fVar4 = displayState20.f83999a;
                ln1.e loadingState3 = ln1.e.NONE;
                Intrinsics.checkNotNullParameter(loadingState3, "loadingState");
                return new ln1.d(fVar4, displayState20.f84000b, loadingState3, displayState20.f84002d, displayState20.f84003e, displayState20.f84004f);
            case 21:
                ln1.d displayState21 = (ln1.d) obj;
                int i36 = AdapterFooterView.f52372e;
                Intrinsics.checkNotNullParameter(displayState21, "displayState");
                f fVar5 = displayState21.f83999a;
                i loadState2 = i.LOADING;
                Intrinsics.checkNotNullParameter(loadState2, "loadState");
                return new ln1.d(fVar5, displayState21.f84000b, dl2.b.T2(loadState2), displayState21.f84002d, displayState21.f84003e, displayState21.f84004f);
            case 22:
                ln1.d displayState22 = (ln1.d) obj;
                int i37 = AdapterFooterView.f52372e;
                Intrinsics.checkNotNullParameter(displayState22, "displayState");
                f fVar6 = displayState22.f83999a;
                i loadState3 = i.LOADED;
                Intrinsics.checkNotNullParameter(loadState3, "loadState");
                return new ln1.d(fVar6, displayState22.f84000b, dl2.b.T2(loadState3), displayState22.f84002d, displayState22.f84003e, displayState22.f84004f);
            case 23:
                ln1.d displayState23 = (ln1.d) obj;
                int i38 = AdapterFooterView.f52372e;
                Intrinsics.checkNotNullParameter(displayState23, "displayState");
                f fVar7 = displayState23.f83999a;
                i loadState4 = i.LOADED;
                Intrinsics.checkNotNullParameter(loadState4, "loadState");
                return new ln1.d(fVar7, displayState23.f84000b, dl2.b.T2(loadState4), displayState23.f84002d, displayState23.f84003e, displayState23.f84004f);
            default:
                ao1.b displayState24 = (ao1.b) obj;
                int i39 = DescriptionEditView.f52649e;
                Intrinsics.checkNotNullParameter(displayState24, "displayState");
                i0 i0Var10 = displayState24.f20030a;
                fm1.c visibility6 = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility6, "visibility");
                return new ao1.b(i0Var10, displayState24.f20031b, displayState24.f20032c, displayState24.f20033d, displayState24.f20034e, displayState24.f20035f, displayState24.f20036g, displayState24.f20037h, displayState24.f20038i, displayState24.f20039j, displayState24.f20040k, displayState24.f20041l, displayState24.f20042m, visibility6, displayState24.f20044o, displayState24.f20045p, displayState24.f20046q, displayState24.f20047r, displayState24.f20048s, displayState24.f20049t, displayState24.f20050u, displayState24.f20051v);
        }
    }
}
