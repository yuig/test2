package lp;

import com.pinterest.activity.conversation.view.GroupUserImageViewV2;
import com.pinterest.activity.newshub.view.header.NewsHubMultiUserAvatar;
import com.pinterest.feature.boardsection.create.selectpins.view.CreateBoardSectionSelectPinsGridCell;
import com.pinterest.ui.listview.ListCellBasic;
import com.pinterest.ui.text.DescriptionEditView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rl1.q;
import u50.f0;
import u50.i0;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f84227b;

    public /* synthetic */ l(String str, int i13) {
        this.f84226a = i13;
        this.f84227b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f84226a;
        String str = this.f84227b;
        switch (i13) {
            case 0:
                q displayState = (q) obj;
                int i14 = GroupUserImageViewV2.f34882b;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                String str2 = displayState.f108647a;
                String imageUrl = this.f84227b;
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                rl1.e backgroundColor = new rl1.e("1111");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                return new q(imageUrl, displayState.f108648b, displayState.f108649c, displayState.f108650d, displayState.f108651e, displayState.f108652f, displayState.f108653g, displayState.f108654h, displayState.f108655i, backgroundColor, displayState.f108657k);
            case 1:
                q displayState2 = (q) obj;
                int i15 = NewsHubMultiUserAvatar.f34971d;
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                String str3 = displayState2.f108647a;
                String imageUrl2 = this.f84227b;
                Intrinsics.checkNotNullParameter(imageUrl2, "imageUrl");
                rl1.e backgroundColor2 = new rl1.e("1111");
                Intrinsics.checkNotNullParameter(backgroundColor2, "backgroundColor");
                return new q(imageUrl2, displayState2.f108648b, displayState2.f108649c, displayState2.f108650d, displayState2.f108651e, displayState2.f108652f, displayState2.f108653g, displayState2.f108654h, displayState2.f108655i, backgroundColor2, displayState2.f108657k);
            case 2:
                do1.d displayState3 = (do1.d) obj;
                Intrinsics.checkNotNullParameter(displayState3, "displayState");
                i0 i0Var = displayState3.f55665a;
                f0 text = bs1.c.h2(str);
                Intrinsics.checkNotNullParameter(text, "text");
                return new do1.d(text, displayState3.f55666b, displayState3.f55667c, displayState3.f55668d, displayState3.f55669e, displayState3.f55670f, displayState3.f55671g, displayState3.f55672h, displayState3.f55673i);
            case 3:
                yl1.b displayState4 = (yl1.b) obj;
                int i16 = qn0.d.f104450m1;
                Intrinsics.checkNotNullParameter(displayState4, "displayState");
                i0 i0Var2 = displayState4.f139300a;
                f0 text2 = bs1.c.h2(str);
                Intrinsics.checkNotNullParameter(text2, "text");
                int i17 = l70.a.board_section_action_button;
                return new yl1.b(text2, displayState4.f139301b, displayState4.f139302c, displayState4.f139303d, displayState4.f139304e, displayState4.f139305f, displayState4.f139306g, displayState4.f139307h, i17, displayState4.f139309j);
            case 4:
                rn1.a displayState5 = (rn1.a) obj;
                int i18 = CreateBoardSectionSelectPinsGridCell.f45360m;
                Intrinsics.checkNotNullParameter(displayState5, "displayState");
                i0 i0Var3 = displayState5.f108849g;
                fm1.c visibility = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                f0 text3 = bs1.c.h2(str);
                Intrinsics.checkNotNullParameter(text3, "text");
                return new rn1.a(text3, displayState5.f108850h, displayState5.f108851i, displayState5.f108852j, displayState5.f108853k, displayState5.f108854l, visibility, displayState5.f108856n, displayState5.f108857o, displayState5.f108858p, displayState5.f108859q, displayState5.f108860r, displayState5.f108861s, displayState5.f108862t, displayState5.f108863u, displayState5.f108864v, displayState5.f108865w, displayState5.f108866x, displayState5.f108867y, displayState5.f108868z, displayState5.A);
            case 5:
                rn1.a displayState6 = (rn1.a) obj;
                int i19 = oo0.c.f96805j;
                Intrinsics.checkNotNullParameter(displayState6, "displayState");
                i0 i0Var4 = displayState6.f108849g;
                f0 text4 = bs1.c.h2(str);
                Intrinsics.checkNotNullParameter(text4, "text");
                fm1.c visibility2 = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility2, "visibility");
                return new rn1.a(text4, displayState6.f108850h, displayState6.f108851i, displayState6.f108852j, displayState6.f108853k, displayState6.f108854l, visibility2, displayState6.f108856n, displayState6.f108857o, displayState6.f108858p, displayState6.f108859q, displayState6.f108860r, displayState6.f108861s, displayState6.f108862t, displayState6.f108863u, displayState6.f108864v, displayState6.f108865w, displayState6.f108866x, displayState6.f108867y, displayState6.f108868z, displayState6.A);
            case 6:
                em1.d displayState7 = (em1.d) obj;
                int i23 = oo0.c.f96805j;
                Intrinsics.checkNotNullParameter(displayState7, "displayState");
                em1.b bVar = displayState7.f59598a;
                f0 label = bs1.c.h2(str);
                Intrinsics.checkNotNullParameter(label, "label");
                return new em1.d(bVar, displayState7.f59599b, displayState7.f59600c, label, displayState7.f59602e, displayState7.f59603f, displayState7.f59604g, displayState7.f59605h, displayState7.f59606i, displayState7.f59607j);
            case 7:
                rn1.a displayState8 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(displayState8, "displayState");
                i0 i0Var5 = displayState8.f108849g;
                f0 text5 = bs1.c.h2(str);
                Intrinsics.checkNotNullParameter(text5, "text");
                Object[] objArr = {vn1.b.CENTER_VERTICAL};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                List alignment = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                return new rn1.a(text5, displayState8.f108850h, alignment, displayState8.f108852j, displayState8.f108853k, displayState8.f108854l, displayState8.f108855m, displayState8.f108856n, displayState8.f108857o, displayState8.f108858p, displayState8.f108859q, displayState8.f108860r, displayState8.f108861s, displayState8.f108862t, displayState8.f108863u, displayState8.f108864v, displayState8.f108865w, displayState8.f108866x, displayState8.f108867y, displayState8.f108868z, displayState8.A);
            case 8:
                rn1.a displayState9 = (rn1.a) obj;
                int i24 = l11.c.f81382p;
                Intrinsics.checkNotNullParameter(displayState9, "displayState");
                i0 i0Var6 = displayState9.f108849g;
                f0 text6 = bs1.c.h2(str);
                Intrinsics.checkNotNullParameter(text6, "text");
                fm1.c visibility3 = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility3, "visibility");
                return new rn1.a(text6, displayState9.f108850h, displayState9.f108851i, displayState9.f108852j, displayState9.f108853k, displayState9.f108854l, visibility3, displayState9.f108856n, displayState9.f108857o, displayState9.f108858p, displayState9.f108859q, displayState9.f108860r, displayState9.f108861s, displayState9.f108862t, displayState9.f108863u, displayState9.f108864v, displayState9.f108865w, displayState9.f108866x, displayState9.f108867y, displayState9.f108868z, displayState9.A);
            case 9:
                rn1.a displayState10 = (rn1.a) obj;
                int i25 = ListCellBasic.f52579g;
                Intrinsics.checkNotNullParameter(displayState10, "displayState");
                i0 i0Var7 = displayState10.f108849g;
                return new rn1.a(ep.b.x(str, "text", str), displayState10.f108850h, displayState10.f108851i, displayState10.f108852j, displayState10.f108853k, displayState10.f108854l, displayState10.f108855m, displayState10.f108856n, displayState10.f108857o, displayState10.f108858p, displayState10.f108859q, displayState10.f108860r, displayState10.f108861s, displayState10.f108862t, displayState10.f108863u, displayState10.f108864v, displayState10.f108865w, displayState10.f108866x, displayState10.f108867y, displayState10.f108868z, displayState10.A);
            case 10:
                ao1.b displayState11 = (ao1.b) obj;
                int i26 = DescriptionEditView.f52649e;
                Intrinsics.checkNotNullParameter(displayState11, "displayState");
                i0 i0Var8 = displayState11.f20030a;
                f0 text7 = bs1.c.h2(str);
                Intrinsics.checkNotNullParameter(text7, "text");
                return new ao1.b(text7, displayState11.f20031b, displayState11.f20032c, displayState11.f20033d, displayState11.f20034e, displayState11.f20035f, displayState11.f20036g, displayState11.f20037h, displayState11.f20038i, displayState11.f20039j, displayState11.f20040k, displayState11.f20041l, displayState11.f20042m, displayState11.f20043n, displayState11.f20044o, displayState11.f20045p, displayState11.f20046q, displayState11.f20047r, displayState11.f20048s, displayState11.f20049t, displayState11.f20050u, displayState11.f20051v);
            default:
                ao1.b displayState12 = (ao1.b) obj;
                int i27 = DescriptionEditView.f52649e;
                Intrinsics.checkNotNullParameter(displayState12, "displayState");
                i0 i0Var9 = displayState12.f20030a;
                f0 text8 = bs1.c.h2(str);
                Intrinsics.checkNotNullParameter(text8, "text");
                return new ao1.b(text8, displayState12.f20031b, displayState12.f20032c, displayState12.f20033d, displayState12.f20034e, displayState12.f20035f, displayState12.f20036g, displayState12.f20037h, displayState12.f20038i, displayState12.f20039j, displayState12.f20040k, displayState12.f20041l, displayState12.f20042m, displayState12.f20043n, displayState12.f20044o, displayState12.f20045p, displayState12.f20046q, displayState12.f20047r, displayState12.f20048s, displayState12.f20049t, displayState12.f20050u, displayState12.f20051v);
        }
    }
}
