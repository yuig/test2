package i91;

import android.content.Context;
import android.os.Build;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final /* synthetic */ class e0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f71819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f71820c;

    public /* synthetic */ e0(String str, int i13, Object obj) {
        this.f71818a = i13;
        this.f71820c = obj;
        this.f71819b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f71818a;
        String str = this.f71819b;
        Object obj = this.f71820c;
        switch (i13) {
            case 0:
                i0 i0Var = (i0) obj;
                i0Var.getClass();
                yq.k onComplete = new yq.k(7, i0Var, str);
                f0 onError = new f0(i0Var, 1);
                x52.n nVar = i0Var.f71854o;
                nVar.getClass();
                Context context = i0Var.f71840a;
                Intrinsics.checkNotNullParameter(context, "context");
                nx.d0 pinalytics = i0Var.f71844e;
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                Intrinsics.checkNotNullParameter(onError, "onError");
                an0.g gVar = nVar.f133897g;
                if (gVar == null) {
                    onError.invoke(new IllegalStateException("BoardPreviewConfig is not initialized"));
                    return null;
                }
                q4.h action = new q4.h(nVar, gVar, pinalytics, onComplete, onError, 10);
                Intrinsics.checkNotNullParameter(context, "context");
                ny1.w permissionsManager = nVar.f133894d;
                Intrinsics.checkNotNullParameter(permissionsManager, "permissionsManager");
                Intrinsics.checkNotNullParameter(action, "action");
                if (Build.VERSION.SDK_INT > 29) {
                    action.invoke();
                    return null;
                }
                permissionsManager.c(bs1.c.k0(context), ny1.e.f92665f, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : x52.a.f133837i, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : null, (r23 & 1024) != 0 ? ny1.t.f92703n : action);
                return null;
            default:
                return ((qh2.g) obj).f103930a.getHeaderField(str);
        }
    }
}
