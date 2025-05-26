package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import bs1.c;
import i2.f2;
import i2.o;
import i2.s;
import i2.y3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import t3.d2;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f17460h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17461i;

    public ComposeView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void b(o oVar, int i13) {
        int i14;
        s sVar = (s) oVar;
        sVar.Y(420213850);
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            Function2 function2 = (Function2) this.f17460h.getValue();
            if (function2 == null) {
                sVar.W(358373017);
            } else {
                sVar.W(150107752);
                function2.invoke(sVar, 0);
            }
            sVar.r(false);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new d2(this, i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: j, reason: from getter */
    public final boolean getF17461i() {
        return this.f17461i;
    }

    public final void o(Function2 function2) {
        this.f17461i = true;
        this.f17460h.setValue(function2);
        if (isAttachedToWindow()) {
            if (this.f17450d == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
            }
            i();
        }
    }

    public /* synthetic */ ComposeView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    public ComposeView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17460h = c.u1(null, y3.f71400a);
    }
}
