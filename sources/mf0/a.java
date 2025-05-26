package mf0;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f87090b;

    public /* synthetic */ a(f fVar, int i13) {
        this.f87089a = i13;
        this.f87090b = fVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f87089a;
        Unit unit = null;
        f this$0 = this.f87090b;
        switch (i13) {
            case 0:
                int i14 = f.f87095b0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                View.OnClickListener onClickListener = this$0.U;
                if (onClickListener != null) {
                    onClickListener.onClick(this$0.F);
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    this$0.N6(false, false);
                    break;
                }
                break;
            default:
                int i15 = f.f87095b0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                View.OnClickListener onClickListener2 = this$0.S;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(this$0.E);
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    this$0.N6(false, false);
                    break;
                }
                break;
        }
    }
}
