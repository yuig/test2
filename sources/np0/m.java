package np0;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import rq.r1;
import xk2.v;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final View f91760a;

    /* renamed from: b, reason: collision with root package name */
    public final View f91761b;

    /* renamed from: c, reason: collision with root package name */
    public final v f91762c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f91763d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f91764e;

    public m(LinearLayout bottomNavigationBar, r1 mediaModule) {
        Intrinsics.checkNotNullParameter(bottomNavigationBar, "bottomNavigationBar");
        Intrinsics.checkNotNullParameter(mediaModule, "mediaModule");
        this.f91760a = bottomNavigationBar;
        this.f91761b = mediaModule;
        this.f91762c = xk2.m.b(l.f91758k);
        this.f91764e = new int[2];
    }

    public final void a() {
        boolean z13;
        View view = this.f91761b;
        if (view.isShown()) {
            int[] iArr = this.f91764e;
            view.getLocationOnScreen(iArr);
            if (iArr[1] + 400 > 0) {
                z13 = false;
                if (z13 == bs1.c.o1(this.f91760a) && this.f91763d) {
                    Object value = this.f91762c.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((w) value).d(new r70.h(z13, true));
                }
                return;
            }
        }
        z13 = true;
        if (z13 == bs1.c.o1(this.f91760a)) {
            return;
        }
        Object value2 = this.f91762c.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((w) value2).d(new r70.h(z13, true));
    }

    public final void b(boolean z13) {
        this.f91763d = z13;
        if (z13) {
            a();
        }
    }
}
