package zp;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb0.n f142461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f142462c;

    public /* synthetic */ o0(yb0.n nVar, View.OnClickListener onClickListener, int i13) {
        this.f142460a = i13;
        this.f142461b = nVar;
        this.f142462c = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f142460a;
        View.OnClickListener onConfirmClickListener = this.f142462c;
        yb0.n alert = this.f142461b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(alert, "$alert");
                Intrinsics.checkNotNullParameter(onConfirmClickListener, "$onConfirmClickListener");
                alert.h().a(u.f142502p);
                onConfirmClickListener.onClick(view);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(alert, "$this_apply");
                Intrinsics.checkNotNullParameter(onConfirmClickListener, "$onConfirmClickListener");
                alert.h().a(a11.j.f295r);
                onConfirmClickListener.onClick(view);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(alert, "$this_apply");
                Intrinsics.checkNotNullParameter(onConfirmClickListener, "$onConfirmClickListener");
                alert.h().a(a11.j.f294q);
                onConfirmClickListener.onClick(view);
                break;
            default:
                Intrinsics.checkNotNullParameter(alert, "$this_apply");
                Intrinsics.checkNotNullParameter(onConfirmClickListener, "$onConfirmClickListener");
                alert.h().a(a11.j.f293p);
                onConfirmClickListener.onClick(view);
                break;
        }
    }
}
