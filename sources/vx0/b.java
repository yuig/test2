package vx0;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rl1.q;
import rl1.r;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f126818j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f126819k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f126820l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f126821m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f126822n = new b(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126823i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f126823i = i13;
    }

    public final q b(q it) {
        switch (this.f126823i) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, null, true, r.MD, null, false, false, null, 0, null, null, 2035);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, null, null, true, r.XL, null, false, false, null, 0, null, null, 2035);
        }
    }

    public final void e(FrameLayout.LayoutParams lparamsFrame) {
        switch (this.f126823i) {
            case 1:
                Intrinsics.checkNotNullParameter(lparamsFrame, "$this$lparamsFrame");
                lparamsFrame.width = -1;
                lparamsFrame.height = -1;
                lparamsFrame.gravity = 17;
                break;
            default:
                Intrinsics.checkNotNullParameter(lparamsFrame, "$this$lparamsFrame");
                lparamsFrame.width = -1;
                lparamsFrame.height = -2;
                lparamsFrame.gravity = 17;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f126823i) {
            case 0:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                e((FrameLayout.LayoutParams) obj);
                break;
            case 2:
                e((FrameLayout.LayoutParams) obj);
                break;
        }
        return b((q) obj);
    }
}
