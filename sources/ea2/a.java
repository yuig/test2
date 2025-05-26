package ea2;

import com.pinterest.ui.brio.reps.pinner.PinnerGridCell;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import u50.f0;
import u50.i0;
import vn1.g;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharSequence f58176b;

    public /* synthetic */ a(int i13, CharSequence charSequence) {
        this.f58175a = i13;
        this.f58176b = charSequence;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f58175a;
        CharSequence charSequence = this.f58176b;
        switch (i13) {
            case 0:
                rn1.a displayState = (rn1.a) obj;
                int i14 = PinnerGridCell.f52214n;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var = displayState.f108849g;
                f0 text = bs1.c.h2(charSequence != null ? charSequence : "");
                Intrinsics.checkNotNullParameter(text, "text");
                fm1.c visibility = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                return new rn1.a(text, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, visibility, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
            default:
                rn1.a displayState2 = (rn1.a) obj;
                int i15 = PinnerGridCell.f52214n;
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                i0 i0Var2 = displayState2.f108849g;
                f0 text2 = bs1.c.h2(charSequence != null ? charSequence : "");
                Intrinsics.checkNotNullParameter(text2, "text");
                fm1.c visibility2 = d7.b.Z(!a0.x0(charSequence));
                Intrinsics.checkNotNullParameter(visibility2, "visibility");
                rn1.b ellipsize = rn1.b.END;
                Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
                return new rn1.a(text2, displayState2.f108850h, displayState2.f108851i, displayState2.f108852j, displayState2.f108853k, 1, visibility2, ellipsize, displayState2.f108857o, displayState2.f108858p, displayState2.f108859q, displayState2.f108860r, displayState2.f108861s, g.BODY_100, g.BODY_300, displayState2.f108864v, displayState2.f108865w, displayState2.f108866x, displayState2.f108867y, displayState2.f108868z, displayState2.A);
        }
    }
}
