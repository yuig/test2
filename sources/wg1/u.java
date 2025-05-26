package wg1;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f129848b;

    public /* synthetic */ u(z zVar, int i13) {
        this.f129847a = i13;
        this.f129848b = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f129847a;
        z this$0 = this.f129848b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.x();
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.x();
                break;
        }
    }
}
