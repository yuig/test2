package com.pinterest.feature.pear.ui.animatedpins;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.w2;
import bs1.c;
import dk0.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yh0.a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pear/ui/animatedpins/AnimatedPinVerticalCarouselView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vo/i", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AnimatedPinVerticalCarouselView extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f46872e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f46873a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f46874b;

    /* renamed from: c, reason: collision with root package name */
    public final b f46875c;

    /* renamed from: d, reason: collision with root package name */
    public float f46876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedPinVerticalCarouselView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46873a = c.W(this, eo1.c.space_200);
        this.f46876d = 1500.0f;
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        getContext();
        recyclerView.R2(new LinearLayoutManager() { // from class: com.pinterest.feature.pear.ui.animatedpins.AnimatedPinVerticalCarouselView$createLayoutManager$1
            {
                super(1, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
            public final void W0(RecyclerView recyclerView2, w2 w2Var, int i13) {
                AnimatedPinVerticalCarouselView animatedPinVerticalCarouselView = AnimatedPinVerticalCarouselView.this;
                m1 m1Var = new m1(6, animatedPinVerticalCarouselView.getContext(), animatedPinVerticalCarouselView);
                m1Var.f19651a = i13;
                X0(m1Var);
            }
        });
        recyclerView.m(new a(this, 2));
        addView(recyclerView);
        this.f46874b = recyclerView;
        b bVar = new b(2);
        recyclerView.H2(bVar);
        this.f46875c = bVar;
    }

    public final void a(List pins) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        b bVar = this.f46875c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pins, "pins");
        ((List) bVar.f55158e).clear();
        ((List) bVar.f55158e).addAll(pins);
        bVar.h();
    }

    public final void b(float f13) {
        this.f46876d = f13;
    }

    public final void c() {
        this.f46874b.post(new d01.a(this, 1));
    }

    public final void d() {
        this.f46874b.post(new d01.a(this, 0));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedPinVerticalCarouselView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46873a = c.W(this, eo1.c.space_200);
        this.f46876d = 1500.0f;
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        getContext();
        recyclerView.R2(new LinearLayoutManager() { // from class: com.pinterest.feature.pear.ui.animatedpins.AnimatedPinVerticalCarouselView$createLayoutManager$1
            {
                super(1, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
            public final void W0(RecyclerView recyclerView2, w2 w2Var, int i132) {
                AnimatedPinVerticalCarouselView animatedPinVerticalCarouselView = AnimatedPinVerticalCarouselView.this;
                m1 m1Var = new m1(6, animatedPinVerticalCarouselView.getContext(), animatedPinVerticalCarouselView);
                m1Var.f19651a = i132;
                X0(m1Var);
            }
        });
        recyclerView.m(new a(this, 2));
        addView(recyclerView);
        this.f46874b = recyclerView;
        b bVar = new b(2);
        recyclerView.H2(bVar);
        this.f46875c = bVar;
    }
}
