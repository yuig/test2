package com.pinterest.feature.ideaPinCreation.metadata.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import hf0.b;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/metadata/view/MetadataRootView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MetadataRootView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f46546a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataRootView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46546a = new HashSet();
    }

    public final void L(int i13) {
        this.f46546a.add(Integer.valueOf(i13));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (ev2.getActionMasked() == 0) {
            Iterator it = this.f46546a.iterator();
            boolean z13 = true;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                Intrinsics.f(num);
                View findViewById = findViewById(num.intValue());
                if (findViewById != null) {
                    Rect rect = new Rect();
                    findViewById.getGlobalVisibleRect(rect);
                    if (rect.contains((int) ev2.getRawX(), (int) ev2.getRawY())) {
                        z13 = false;
                    }
                }
            }
            if (z13) {
                b.k(this);
            }
        }
        return super.dispatchTouchEvent(ev2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataRootView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46546a = new HashSet();
    }
}
