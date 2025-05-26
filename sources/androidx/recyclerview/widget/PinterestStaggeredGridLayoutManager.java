package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/recyclerview/widget/PinterestStaggeredGridLayoutManager;", "Landroidx/recyclerview/widget/l2;", "Landroidx/recyclerview/widget/u0;", "<init>", "()V", "androidx/lifecycle/n1", "LayoutParams", "framework-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class PinterestStaggeredGridLayoutManager extends l2 implements u0 {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/recyclerview/widget/PinterestStaggeredGridLayoutManager$LayoutParams;", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "Landroid/content/Context;", "c", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "framework-ui_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class LayoutParams extends RecyclerView.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public abstract int b();

        public abstract int c();

        /* renamed from: d */
        public abstract int getF19199m();

        public abstract int e();

        public abstract View f();

        /* renamed from: g */
        public abstract int getF19194h();

        /* renamed from: h */
        public abstract int getF19193g();

        public abstract int i();

        /* renamed from: j */
        public abstract boolean getF19192f();

        public abstract void k();

        public abstract void l(int i13);
    }

    public abstract void Z0();

    public abstract void a1();

    public abstract int[] b1(int[] iArr);

    public abstract int[] c1(int[] iArr);

    /* renamed from: d1 */
    public abstract int getF19177u();

    public abstract void e1(int i13, int i14);

    public abstract void f1(int i13);

    public abstract void g1();

    public abstract void h1(int i13);
}
