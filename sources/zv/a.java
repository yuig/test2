package zv;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f142829b;

    public /* synthetic */ a(e eVar, int i13) {
        this.f142828a = i13;
        this.f142829b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f142828a;
        e this$0 = this.f142829b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                View b13 = this$0.z().f32084a.b("3002");
                if (b13 != null) {
                    b13.performClick();
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                View b14 = this$0.z().f32084a.b("3002");
                if (b14 != null) {
                    b14.performClick();
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Y();
                break;
        }
    }
}
