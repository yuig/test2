package d61;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends q5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f53772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f53773e;

    public /* synthetic */ f(RecyclerView recyclerView, int i13) {
        this.f53772d = i13;
        this.f53773e = recyclerView;
    }

    @Override // q5.b
    public final void d(View host, r5.e info2) {
        AccessibilityNodeInfo accessibilityNodeInfo = info2.f106231a;
        int i13 = this.f53772d;
        View.AccessibilityDelegate accessibilityDelegate = this.f102402a;
        RecyclerView recyclerView = this.f53773e;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info2, "info");
                info2.I(recyclerView);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfo);
                break;
            default:
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info2, "info");
                info2.I(recyclerView);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfo);
                break;
        }
    }
}
