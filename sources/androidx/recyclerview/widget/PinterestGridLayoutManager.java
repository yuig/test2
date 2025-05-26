package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/recyclerview/widget/PinterestGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroidx/recyclerview/widget/u0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "framework-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class PinterestGridLayoutManager extends GridLayoutManager implements u0 {
    public final r0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinterestGridLayoutManager(g41.a debugTag, boolean z13) {
        super(1, 0, z13);
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        this.M = debugTag;
    }

    @Override // androidx.recyclerview.widget.u0
    /* renamed from: c */
    public final t0 getF19172p() {
        return this.M;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final void x0(q2 q2Var, w2 w2Var) {
        try {
            super.x0(q2Var, w2Var);
        } catch (Exception e13) {
            b(e13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinterestGridLayoutManager(r0 debugTag, int i13) {
        super(i13);
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        this.M = debugTag;
    }

    public PinterestGridLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.M = null;
    }
}
