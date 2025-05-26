package com.pinterest.anket.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.base.LockableViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ql2.k;
import ql2.s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/anket/view/QuestionViewPager;", "Lcom/pinterest/base/LockableViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "anketLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class QuestionViewPager extends LockableViewPager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionViewPager(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        View focusedChild = getFocusedChild();
        int i15 = 0;
        if (focusedChild != null) {
            focusedChild.measure(i13, View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        Integer num = null;
        Integer valueOf = focusedChild != null ? Integer.valueOf(focusedChild.getMeasuredHeight()) : null;
        if (valueOf != null) {
            i15 = valueOf.intValue();
        } else {
            IntRange q13 = s.q(0, getChildCount());
            ArrayList arrayList = new ArrayList();
            Iterator it = q13.iterator();
            while (((k) it).hasNext()) {
                View childAt = getChildAt(((u0) it).b());
                if (childAt != null) {
                    arrayList.add(childAt);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                View view = (View) it2.next();
                view.measure(i13, View.MeasureSpec.makeMeasureSpec(0, 0));
                num = Integer.valueOf(view.getMeasuredHeight());
                while (it2.hasNext()) {
                    View view2 = (View) it2.next();
                    view2.measure(i13, View.MeasureSpec.makeMeasureSpec(0, 0));
                    Integer valueOf2 = Integer.valueOf(view2.getMeasuredHeight());
                    if (num.compareTo(valueOf2) < 0) {
                        num = valueOf2;
                    }
                }
            }
            if (num != null) {
                i15 = num.intValue();
            }
        }
        super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
    }
}
