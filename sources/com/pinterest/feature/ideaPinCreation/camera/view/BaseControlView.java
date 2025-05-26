package com.pinterest.feature.ideaPinCreation.camera.view;

import a71.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.pinterest.gestalt.text.GestaltText;
import d7.b;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kg.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import q5.w0;
import rn0.d;
import sh.f;
import xa0.m;
import yn2.c0;
import yn2.h0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/BaseControlView;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseControlView<T> extends ConstraintLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f45894e = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f45895a;

    /* renamed from: b, reason: collision with root package name */
    public Object f45896b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f45897c;

    /* renamed from: d, reason: collision with root package name */
    public final c f45898d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseControlView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        d0 a13 = f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        this.f45898d = new c(a13, 1);
    }

    public final void L(boolean z13) {
        if (z13) {
            a.s(this, 0L, null, 6);
        } else {
            a.u(this, 0, 0L, 6);
        }
    }

    public abstract String T(Object obj);

    public abstract void X(Object obj);

    public abstract void Z(GestaltText gestaltText, Object obj);

    public final void a0() {
        removeAllViews();
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_100);
        List list = this.f45895a;
        if (list == null) {
            Intrinsics.r("data");
            throw null;
        }
        for (T t13 : list) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            gestaltText.i(new kl0.c(T(t13), 26));
            Z(gestaltText, t13);
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setId(View.generateViewId());
            frameLayout.addView(gestaltText, new FrameLayout.LayoutParams(-2, -2, 17));
            frameLayout.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            frameLayout.setBackgroundResource(aq1.c.button_circular_white_states);
            frameLayout.setOnClickListener(new m(23, this, t13));
            Integer num = this.f45897c;
            if (num != null) {
                frameLayout.setTag(num.intValue(), t13);
            }
            addView(frameLayout);
        }
        Iterator it = b.O(this).iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            View view = (View) next;
            int id3 = i13 == 0 ? 0 : getChildAt(i13 - 1).getId();
            List list2 = this.f45895a;
            if (list2 == null) {
                Intrinsics.r("data");
                throw null;
            }
            int id4 = i13 == list2.size() + (-1) ? 0 : getChildAt(i14).getId();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -1;
            layoutParams2.G = "1:1";
            layoutParams2.E = 0.5f;
            layoutParams2.f17671i = 0;
            layoutParams2.f17677l = 0;
            if (id3 == 0) {
                layoutParams2.f17691t = id3;
            } else {
                layoutParams2.f17690s = id3;
            }
            if (id4 == 0) {
                layoutParams2.f17693v = id4;
            } else {
                layoutParams2.f17692u = id4;
            }
            view.setLayoutParams(layoutParams2);
            i13 = i14;
        }
    }

    public final void d0() {
        Unit unit;
        Integer num = this.f45897c;
        if (num != null) {
            int intValue = num.intValue();
            h0 p13 = c0.p(b.O(this), tt0.a.f119050j);
            Iterator it = p13.f139564a.iterator();
            while (it.hasNext()) {
                FrameLayout frameLayout = (FrameLayout) p13.f139565b.invoke(it.next());
                boolean d2 = Intrinsics.d(frameLayout.getTag(intValue), this.f45896b);
                frameLayout.setSelected(d2);
                w0 O = b.O(frameLayout);
                Intrinsics.checkNotNullParameter(O, "<this>");
                Iterator it2 = O.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException("Sequence is empty.");
                }
                Object next = it2.next();
                Intrinsics.g(next, "null cannot be cast to non-null type com.pinterest.gestalt.text.GestaltText");
                ((GestaltText) next).i(new d(d2, 21));
            }
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException();
        }
    }
}
