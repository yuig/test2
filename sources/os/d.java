package os;

import ao2.f0;
import ao2.h1;
import com.pinterest.design.brio.widget.voice.PinterestVoiceMessage;
import com.pinterest.dialog.view.DialogTitleView;
import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ int f97478a;

    public /* synthetic */ d(int i13) {
        this.f97478a = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f97478a) {
            case 0:
                ln1.d displayState = (ln1.d) obj;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                ln1.f fVar = displayState.f83999a;
                yk1.i loadState = yk1.i.LOADING;
                Intrinsics.checkNotNullParameter(loadState, "loadState");
                return new ln1.d(fVar, displayState.f84000b, dl2.b.T2(loadState), displayState.f84002d, displayState.f84003e, displayState.f84004f);
            case 1:
                rn1.a displayState2 = (rn1.a) obj;
                int i13 = PinterestVoiceMessage.f44914j;
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                i0 i0Var = displayState2.f108849g;
                vn1.c color = vn1.c.INVERSE;
                Intrinsics.checkNotNullParameter(color, "color");
                Object[] objArr = {vn1.e.BOLD};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                List style = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNullParameter(style, "style");
                return new rn1.a(i0Var, color, displayState2.f108851i, style, displayState2.f108853k, 8, displayState2.f108855m, displayState2.f108856n, displayState2.f108857o, displayState2.f108858p, displayState2.f108859q, displayState2.f108860r, displayState2.f108861s, displayState2.f108862t, displayState2.f108863u, displayState2.f108864v, displayState2.f108865w, displayState2.f108866x, displayState2.f108867y, displayState2.f108868z, displayState2.A);
            case 2:
                rn1.a displayState3 = (rn1.a) obj;
                int i14 = DialogTitleView.f44945e;
                Intrinsics.checkNotNullParameter(displayState3, "displayState");
                i0 i0Var2 = displayState3.f108849g;
                List alignment = jq.b.m(vn1.b.CENTER_HORIZONTAL);
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                return new rn1.a(i0Var2, displayState3.f108850h, alignment, displayState3.f108852j, displayState3.f108853k, displayState3.f108854l, displayState3.f108855m, displayState3.f108856n, displayState3.f108857o, displayState3.f108858p, displayState3.f108859q, displayState3.f108860r, displayState3.f108861s, displayState3.f108862t, displayState3.f108863u, displayState3.f108864v, displayState3.f108865w, displayState3.f108866x, displayState3.f108867y, displayState3.f108868z, displayState3.A);
            case 3:
                ln1.d displayState4 = (ln1.d) obj;
                int i15 = InitialLoadSwipeRefreshLayout.L;
                Intrinsics.checkNotNullParameter(displayState4, "displayState");
                ln1.f fVar2 = displayState4.f83999a;
                yk1.i loadState2 = yk1.i.LOADED;
                Intrinsics.checkNotNullParameter(loadState2, "loadState");
                return new ln1.d(fVar2, displayState4.f84000b, dl2.b.T2(loadState2), displayState4.f84002d, displayState4.f84003e, displayState4.f84004f);
            case 4:
                ln1.d displayState5 = (ln1.d) obj;
                int i16 = InitialLoadSwipeRefreshLayout.L;
                Intrinsics.checkNotNullParameter(displayState5, "displayState");
                ln1.f fVar3 = displayState5.f83999a;
                yk1.i loadState3 = yk1.i.LOADING;
                Intrinsics.checkNotNullParameter(loadState3, "loadState");
                return new ln1.d(fVar3, displayState5.f84000b, dl2.b.T2(loadState3), displayState5.f84002d, displayState5.f84003e, displayState5.f84004f);
            case 5:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof f0) {
                    return (f0) element;
                }
                return null;
            case 6:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj;
                if (element2 instanceof h1) {
                    return (h1) element2;
                }
                return null;
            default:
                return obj;
        }
    }
}
