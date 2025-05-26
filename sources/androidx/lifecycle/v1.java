package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final v1 f18705j = new v1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final v1 f18706k = new v1(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18707i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(int i13) {
        super(1);
        this.f18707i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18707i) {
            case 0:
                View currentView = (View) obj;
                Intrinsics.checkNotNullParameter(currentView, "currentView");
                Object parent = currentView.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View viewParent = (View) obj;
                Intrinsics.checkNotNullParameter(viewParent, "viewParent");
                Object tag = viewParent.getTag(t6.a.view_tree_lifecycle_owner);
                if (tag instanceof z) {
                    return (z) tag;
                }
                return null;
        }
    }
}
