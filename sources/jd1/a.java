package jd1;

import android.content.Context;
import android.view.View;
import h32.u0;
import jc0.v;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f75503b;

    public /* synthetic */ a(d dVar, int i13) {
        this.f75502a = i13;
        this.f75503b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f75502a;
        d this$0 = this.f75503b;
        switch (i13) {
            case 0:
                int i14 = d.f75508b1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.s7().X(u0.FILTER_BUTTON);
                w f73 = this$0.f7();
                Context requireContext = this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                f73.f(new v(this$0.l9(requireContext), false, 0L, 30));
                break;
            default:
                int i15 = d.f75508b1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.s7().X(u0.FILTER_BUTTON);
                w f74 = this$0.f7();
                Context requireContext2 = this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                f74.f(new v(this$0.l9(requireContext2), false, 0L, 30));
                break;
        }
    }
}
