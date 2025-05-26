package k91;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f78804b;

    public /* synthetic */ a(c cVar, int i13) {
        this.f78803a = i13;
        this.f78804b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f78803a;
        c this$0 = this.f78804b;
        switch (i13) {
            case 0:
                int i14 = c.f78808v0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p91.d dVar = this$0.f78812m0;
                if (dVar != null) {
                    dVar.v3();
                    break;
                }
                break;
            case 1:
                int i15 = c.f78808v0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p91.d dVar2 = this$0.f78812m0;
                if (dVar2 != null) {
                    dVar2.r3();
                    break;
                }
                break;
            case 2:
                int i16 = c.f78808v0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p91.d dVar3 = this$0.f78812m0;
                if (dVar3 != null) {
                    dVar3.u3();
                    break;
                }
                break;
            default:
                int i17 = c.f78808v0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P7();
                break;
        }
    }
}
