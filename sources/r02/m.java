package r02;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f105775b;

    public /* synthetic */ m(r rVar, int i13) {
        this.f105774a = i13;
        this.f105775b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f105774a;
        r this$0 = this.f105775b;
        switch (i13) {
            case 0:
                int i14 = r.f105790l0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                kh2.j.x2((s02.i) this$0.f105797i0.getValue(), new s02.c(this$0.f105796h0));
                break;
            default:
                int i15 = r.f105790l0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P7();
                break;
        }
    }
}
