package eq;

import bs1.c;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toast.GestaltToast;
import do1.d;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lr.l;
import lr.y;
import m60.x0;
import u50.f0;
import u50.i0;
import ub.r;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f59902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f59903c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f59904d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i13) {
        this.f59901a = i13;
        this.f59902b = obj;
        this.f59903c = obj2;
        this.f59904d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f59901a;
        Object obj2 = this.f59904d;
        Object obj3 = this.f59903c;
        Object obj4 = this.f59902b;
        switch (i13) {
            case 0:
                rn1.a displayState = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var = displayState.f108849g;
                f0 text = c.p2(b.a(((GestaltText) obj4).getContext(), (String) obj3, (Map) obj2));
                Intrinsics.checkNotNullParameter(text, "text");
                return new rn1.a(text, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, true, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
            case 1:
                y yVar = (y) obj4;
                PinterestToastContainer pinterestToastContainer = (PinterestToastContainer) obj3;
                GestaltToast gestaltToast = (GestaltToast) obj2;
                d displayState2 = (d) obj;
                yVar.getClass();
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                i0 i0Var2 = displayState2.f55665a;
                String str = yVar.f84568e;
                if (str == null) {
                    str = "";
                }
                f0 text2 = c.h2(str);
                Intrinsics.checkNotNullParameter(text2, "text");
                return new d(text2, displayState2.f55666b, new do1.b(c.j2(new String[0], x0.undo), new r(yVar, pinterestToastContainer, gestaltToast, 1)), displayState2.f55668d, displayState2.f55669e, displayState2.f55670f, displayState2.f55671g, displayState2.f55672h, displayState2.f55673i);
            default:
                l lVar = (l) obj4;
                d displayState3 = (d) obj;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(displayState3, "displayState");
                i0 i0Var3 = displayState3.f55665a;
                f0 text3 = c.h2(lVar.f84522g);
                Intrinsics.checkNotNullParameter(text3, "text");
                return new d(text3, displayState3.f55666b, new do1.b(c.j2(new String[0], x0.undo), new r(lVar, (PinterestToastContainer) obj3, (GestaltToast) obj2, 2)), displayState3.f55668d, displayState3.f55669e, displayState3.f55670f, displayState3.f55671g, displayState3.f55672h, displayState3.f55673i);
        }
    }
}
