package ow1;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mw1.m;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f97931b;

    public /* synthetic */ a(g gVar, int i13) {
        this.f97930a = i13;
        this.f97931b = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f97930a;
        g this$0 = this.f97931b;
        switch (i13) {
            case 0:
                fy1.e eVar = g.O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((ku1.j) this$0.o7()).f();
                return;
            default:
                fy1.e eVar2 = g.O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                gw1.f fVar = this$0.f97943l0;
                if (fVar == null) {
                    Intrinsics.r("splitMetricsActionSheetHandler");
                    throw null;
                }
                List i83 = this$0.i8();
                Integer num = this$0.f97946o0;
                fVar.b((m) i83.get(num != null ? num.intValue() : 0), this$0.i8(), new f(this$0, 1));
                return;
        }
    }
}
