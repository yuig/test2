package com.pinterest.share.board.video.templategallery.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import d7.b;
import java.util.Iterator;
import kh2.d;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/share/board/video/templategallery/view/DotsIndicatorView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shareBoardVideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DotsIndicatorView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f51852a;

    /* renamed from: b, reason: collision with root package name */
    public int f51853b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51854c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51855d;

    /* renamed from: e, reason: collision with root package name */
    public final int f51856e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotsIndicatorView(Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void a(int i13) {
        this.f51852a = i13;
        if (i13 < 0 || i13 >= this.f51853b) {
            return;
        }
        Iterator it = b.O(this).iterator();
        int i14 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                f0.p();
                throw null;
            }
            ((View) next).setBackgroundResource(i14 == i13 ? o52.b.dot_indicator_selected : o52.b.dot_indicator_unselected);
            i14 = i15;
        }
    }

    public final void b(int i13) {
        this.f51853b = i13;
        removeAllViews();
        int i14 = 0;
        while (i14 < i13) {
            View view = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f51855d, this.f51854c);
            int i15 = this.f51856e / 2;
            layoutParams.setMarginStart(i15);
            layoutParams.setMarginEnd(i15);
            layoutParams.gravity = 1;
            view.setLayoutParams(layoutParams);
            view.setBackgroundResource(i14 == this.f51852a ? o52.b.dot_indicator_selected : o52.b.dot_indicator_unselected);
            addView(view);
            i14++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsIndicatorView(Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f51852a = -1;
        this.f51854c = d.p(8);
        this.f51855d = d.p(8);
        this.f51856e = d.p(8);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setGravity(17);
    }
}
