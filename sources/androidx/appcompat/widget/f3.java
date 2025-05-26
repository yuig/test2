package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class f3 implements n.a0 {

    /* renamed from: a, reason: collision with root package name */
    public n.o f16561a;

    /* renamed from: b, reason: collision with root package name */
    public n.q f16562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f16563c;

    public f3(Toolbar toolbar) {
        this.f16563c = toolbar;
    }

    @Override // n.a0
    public final void b(n.o oVar, boolean z13) {
    }

    @Override // n.a0
    public final boolean c(n.g0 g0Var) {
        return false;
    }

    @Override // n.a0
    public final void d(Parcelable parcelable) {
    }

    @Override // n.a0
    public final boolean e(n.q qVar) {
        Toolbar toolbar = this.f16563c;
        if (toolbar.f16476h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(toolbar.getContext(), null, i.a.toolbarNavigationButtonStyle);
            toolbar.f16476h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(toolbar.f16474f);
            toolbar.f16476h.setContentDescription(toolbar.f16475g);
            Toolbar.LayoutParams g13 = Toolbar.g();
            g13.f15945a = (toolbar.f16482n & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8388611;
            g13.f16495b = 2;
            toolbar.f16476h.setLayoutParams(g13);
            toolbar.f16476h.setOnClickListener(new d3(toolbar));
        }
        ViewParent parent = toolbar.f16476h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f16476h);
            }
            toolbar.addView(toolbar.f16476h);
        }
        View actionView = qVar.getActionView();
        toolbar.f16477i = actionView;
        this.f16562b = qVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f16477i);
            }
            Toolbar.LayoutParams g14 = Toolbar.g();
            g14.f15945a = 8388611 | (toolbar.f16482n & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
            g14.f16495b = 2;
            toolbar.f16477i.setLayoutParams(g14);
            toolbar.addView(toolbar.f16477i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Toolbar.LayoutParams) childAt.getLayoutParams()).f16495b != 2 && childAt != toolbar.f16469a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        qVar.C = true;
        qVar.f88688n.q(false);
        KeyEvent.Callback callback = toolbar.f16477i;
        if (callback instanceof m.d) {
            ((m.d) callback).c();
        }
        toolbar.G();
        return true;
    }

    @Override // n.a0
    public final Parcelable f() {
        return null;
    }

    @Override // n.a0
    public final boolean g(n.q qVar) {
        Toolbar toolbar = this.f16563c;
        KeyEvent.Callback callback = toolbar.f16477i;
        if (callback instanceof m.d) {
            ((m.d) callback).d();
        }
        toolbar.removeView(toolbar.f16477i);
        toolbar.removeView(toolbar.f16476h);
        toolbar.f16477i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f16562b = null;
        toolbar.requestLayout();
        qVar.C = false;
        qVar.f88688n.q(false);
        toolbar.G();
        return true;
    }

    @Override // n.a0
    public final int getId() {
        return 0;
    }

    @Override // n.a0
    public final void h(boolean z13) {
        if (this.f16562b != null) {
            n.o oVar = this.f16561a;
            if (oVar != null) {
                int size = oVar.f88653f.size();
                for (int i13 = 0; i13 < size; i13++) {
                    if (this.f16561a.getItem(i13) == this.f16562b) {
                        return;
                    }
                }
            }
            g(this.f16562b);
        }
    }

    @Override // n.a0
    public final void i(Context context, n.o oVar) {
        n.q qVar;
        n.o oVar2 = this.f16561a;
        if (oVar2 != null && (qVar = this.f16562b) != null) {
            oVar2.e(qVar);
        }
        this.f16561a = oVar;
    }

    @Override // n.a0
    public final boolean j() {
        return false;
    }
}
