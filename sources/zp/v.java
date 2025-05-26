package zp;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f142516a;

    /* renamed from: b, reason: collision with root package name */
    public final k22.m f142517b;

    /* renamed from: c, reason: collision with root package name */
    public final b f142518c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f142519d;

    /* renamed from: e, reason: collision with root package name */
    public final y f142520e;

    /* renamed from: f, reason: collision with root package name */
    public x f142521f;

    public v(String userId, k22.m userService, b allPinsVisibility, boolean z13, y toggleItemViewListener) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(allPinsVisibility, "allPinsVisibility");
        Intrinsics.checkNotNullParameter(toggleItemViewListener, "toggleItemViewListener");
        this.f142516a = userId;
        this.f142517b = userService;
        this.f142518c = allPinsVisibility;
        this.f142519d = z13;
        this.f142520e = toggleItemViewListener;
    }

    @Override // jc0.b
    public final void applyInsetMode(yf0.h insetMode, ViewGroup modalViewWrapper) {
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        Intrinsics.checkNotNullParameter(modalViewWrapper, "modalViewWrapper");
        c3.n(modalViewWrapper, true);
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullExpressionValue(this.f142517b.w(this.f142516a, n00.b.a(n00.c.USER_BOARDS_MANAGE_VISIBILITY_FIELDS)).r(tk2.e.f118017c).l(wj2.c.a()).o(new jp.d(23, new z3.m(this, 15)), new jp.d(24, u.f142496j)), "subscribe(...)");
        x xVar = new x(context, this.f142520e, this.f142518c, this.f142519d);
        this.f142521f = xVar;
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        modalViewWrapper.x(xVar);
        modalViewWrapper.p(context.getResources().getString(d70.g.manage_visibility));
        return modalViewWrapper;
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -1;
    }

    @Override // jc0.b, jc0.a0
    public final String getSavedInstanceStateKey() {
        return v.class.getName();
    }
}
