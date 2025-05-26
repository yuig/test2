package aw;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f20526b;

    public /* synthetic */ a(f fVar, int i13) {
        this.f20525a = i13;
        this.f20526b = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f20525a;
        f this$0 = this.f20526b;
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
                this$0.Y();
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Y();
                break;
        }
    }
}
