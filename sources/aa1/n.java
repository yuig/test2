package aa1;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1659b;

    public /* synthetic */ n(q qVar, int i13) {
        this.f1658a = i13;
        this.f1659b = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f1658a;
        q this$0 = this.f1659b;
        switch (i13) {
            case 0:
                int i14 = q.f1664j0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                kh2.j.x2(this$0.Y7(), h.f1653a);
                break;
            case 1:
                int i15 = q.f1664j0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                kh2.j.x2(this$0.Y7(), j.f1655a);
                break;
            default:
                int i16 = q.f1664j0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                kh2.j.x2(this$0.Y7(), i.f1654a);
                break;
        }
    }
}
