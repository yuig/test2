package androidx.activity;

import android.content.res.Resources;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final m0 f15914j = new m0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final m0 f15915k = new m0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final m0 f15916l = new m0(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15917i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i13) {
        super(1);
        this.f15917i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15917i) {
            case 0:
                Resources resources = (Resources) obj;
                Intrinsics.checkNotNullParameter(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View it2 = (View) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                Object tag = it2.getTag(l0.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof k0) {
                    return (k0) tag;
                }
                return null;
        }
    }
}
