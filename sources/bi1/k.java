package bi1;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f22851b;

    public /* synthetic */ k(p pVar, int i13) {
        this.f22850a = i13;
        this.f22851b = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f22850a;
        p this$0 = this.f22851b;
        switch (i13) {
            case 0:
                int i14 = p.f22869l0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Y7().f22835f.e().a(f.f22843a);
                this$0.Y7().f22835f.e().a(new g(true));
                break;
            case 1:
                int i15 = p.f22869l0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Y7().f22835f.e().a(i.f22849a);
                break;
            case 2:
                int i16 = p.f22869l0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P7();
                break;
            default:
                int i17 = p.f22869l0;
                this$0.Y7().f22835f.e().a(e.f22842a);
                break;
        }
    }
}
