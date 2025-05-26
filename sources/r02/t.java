package r02;

import android.view.View;
import com.pinterest.reportFlow.feature.rvc.view.RVCSectionItemView;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;

/* loaded from: classes4.dex */
public final /* synthetic */ class t implements o82.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f105821b;

    public /* synthetic */ t(Object obj, int i13) {
        this.f105820a = i13;
        this.f105821b = obj;
    }

    @Override // o82.b
    public final void d(View displayState, u50.o view, u50.r rVar) {
        int i13 = this.f105820a;
        Object obj = this.f105821b;
        switch (i13) {
            case 0:
                e0 this$0 = (e0) obj;
                RVCSectionItemView view2 = (RVCSectionItemView) displayState;
                s02.j displayState2 = (s02.j) view;
                int i14 = e0.P0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(displayState2, "displayState");
                Intrinsics.checkNotNullParameter(rVar, "<anonymous parameter 2>");
                view2.a(displayState2, new b0(this$0), this$0.d9(), new ex1.n(this$0, 23), new jq1.b(this$0, 6));
                break;
            default:
                o82.c displayStateBinder = (o82.c) obj;
                int i15 = b3.f93539l;
                Intrinsics.checkNotNullParameter(displayStateBinder, "$displayStateBinder");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(rVar, "<anonymous parameter 2>");
                displayStateBinder.e(displayState, view);
                break;
        }
    }
}
