package ma;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class j extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f86762j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f86763k = new j(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f86764i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(1);
        this.f86764i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f86764i) {
            case 0:
                View view = (View) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Object tag = view2.getTag(a.view_tree_saved_state_registry_owner);
                if (tag instanceof i) {
                    return (i) tag;
                }
                return null;
        }
    }
}
