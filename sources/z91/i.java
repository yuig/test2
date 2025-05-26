package z91;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f141376b;

    public /* synthetic */ i(m mVar, int i13) {
        this.f141375a = i13;
        this.f141376b = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f141375a;
        m this$0 = this.f141376b;
        switch (i13) {
            case 0:
                int i14 = m.f141383j0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                kh2.j.x2(this$0.Y7(), f.f141370c);
                break;
            case 1:
                int i15 = m.f141383j0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                kh2.j.x2(this$0.Y7(), f.f141372e);
                break;
            default:
                int i16 = m.f141383j0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                kh2.j.x2(this$0.Y7(), f.f141371d);
                break;
        }
    }
}
