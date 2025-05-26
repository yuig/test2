package bw;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f23959b;

    public /* synthetic */ a(d dVar, int i13) {
        this.f23958a = i13;
        this.f23959b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f23958a;
        d this$0 = this.f23959b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Y();
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                View b13 = this$0.z().f32084a.b("3002");
                if (b13 != null) {
                    b13.performClick();
                    break;
                }
                break;
        }
    }
}
