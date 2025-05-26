package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final w1 f18718j = new w1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final w1 f18719k = new w1(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18720i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(int i13) {
        super(1);
        this.f18720i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18720i) {
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
                Object tag = view2.getTag(u6.f.view_tree_view_model_store_owner);
                if (tag instanceof u1) {
                    return (u1) tag;
                }
                return null;
        }
    }
}
