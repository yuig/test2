package com.pinterest.feature.boardpreview.view;

import a.a;
import android.content.Context;
import android.util.AttributeSet;
import ao2.j0;
import ao2.k2;
import com.pinterest.design.widget.RoundedCornersLayout;
import java.util.concurrent.CancellationException;
import jn0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tb0.p;
import vb0.j;
import zc0.c;
import zc0.d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/boardpreview/view/ShareBoardThumbnailsView;", "Lcom/pinterest/design/widget/RoundedCornersLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "shareBoardVideoLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ShareBoardThumbnailsView extends RoundedCornersLayout {

    /* renamed from: f, reason: collision with root package name */
    public k2 f45344f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareBoardThumbnailsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [ao2.j0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, android.view.ViewGroup, com.pinterest.feature.boardpreview.view.ShareBoardThumbnailsView, java.lang.Object] */
    public final void i() {
        c cVar;
        if (getChildCount() == 0) {
            return;
        }
        int i13 = d.f141583a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int i14 = d.f141583a;
        Object tag = getTag(i14);
        if (tag == null || !(tag instanceof j0)) {
            if (!isAttachedToWindow()) {
                j.f125466a.F(a.k("Creating a CoroutineScope before ", ShareBoardThumbnailsView.class.getName(), " attaches to a window. Coroutine jobs won't be canceled if the view has never been attached to a window."), p.PLATFORM, new Object[0]);
            }
            c cVar2 = new c();
            setTag(i14, cVar2);
            addOnAttachStateChangeListener(cVar2);
            cVar = cVar2;
        } else {
            cVar = (j0) tag;
        }
        this.f45344f = kotlin.jvm.internal.j.z(cVar, null, null, new g(this, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k2 k2Var = this.f45344f;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        this.f45344f = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBoardThumbnailsView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int W = bs1.c.W(this, eo1.c.space_200);
        g(W, W, W, W);
    }
}
