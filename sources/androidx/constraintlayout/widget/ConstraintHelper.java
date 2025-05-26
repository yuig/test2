package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f17646a;

    /* renamed from: b, reason: collision with root package name */
    public int f17647b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f17648c;

    /* renamed from: d, reason: collision with root package name */
    public u4.o f17649d;

    /* renamed from: e, reason: collision with root package name */
    public String f17650e;

    /* renamed from: f, reason: collision with root package name */
    public String f17651f;

    /* renamed from: g, reason: collision with root package name */
    public View[] f17652g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f17653h;

    public ConstraintHelper(Context context) {
        super(context);
        this.f17646a = new int[32];
        this.f17652g = null;
        this.f17653h = new HashMap();
        this.f17648c = context;
        m(null);
    }

    public final void b(String str) {
        if (str == null || str.length() == 0 || this.f17648c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int j13 = j(trim);
        if (j13 != 0) {
            this.f17653h.put(Integer.valueOf(j13), trim);
            c(j13);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void c(int i13) {
        if (i13 == getId()) {
            return;
        }
        int i14 = this.f17647b + 1;
        int[] iArr = this.f17646a;
        if (i14 > iArr.length) {
            this.f17646a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f17646a;
        int i15 = this.f17647b;
        iArr2[i15] = i13;
        this.f17647b = i15 + 1;
    }

    public final void d(String str) {
        if (str == null || str.length() == 0 || this.f17648c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = constraintLayout.getChildAt(i13);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    c(childAt.getId());
                }
            }
        }
    }

    public final void e(h01.h hVar) {
        if (hVar == this) {
            return;
        }
        if (hVar.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (hVar.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.f17650e = null;
            c(hVar.getId());
            requestLayout();
        }
    }

    public final void f() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        g((ConstraintLayout) parent);
    }

    public final void g(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i13 = 0; i13 < this.f17647b; i13++) {
            View viewById = constraintLayout.getViewById(this.f17646a[i13]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void h(ConstraintLayout constraintLayout) {
    }

    public final int i(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f17648c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = constraintLayout.getChildAt(i13);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int j(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i13 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i13 = ((Integer) designInformation).intValue();
            }
        }
        if (i13 == 0 && constraintLayout != null) {
            i13 = i(constraintLayout, str);
        }
        if (i13 == 0) {
            try {
                i13 = r.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i13 != 0) {
            return i13;
        }
        Context context = this.f17648c;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public final int[] k() {
        return Arrays.copyOf(this.f17646a, this.f17647b);
    }

    public final View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f17652g;
        if (viewArr == null || viewArr.length != this.f17647b) {
            this.f17652g = new View[this.f17647b];
        }
        for (int i13 = 0; i13 < this.f17647b; i13++) {
            this.f17652g[i13] = constraintLayout.getViewById(this.f17646a[i13]);
        }
        return this.f17652g;
    }

    public void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == s.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f17650e = string;
                    q(string);
                } else if (index == s.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f17651f = string2;
                    r(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void n(k kVar, u4.o oVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        l lVar = kVar.f17767e;
        int[] iArr = lVar.f17792j0;
        int i13 = 0;
        if (iArr != null) {
            s(iArr);
        } else {
            String str = lVar.f17794k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] split = lVar.f17794k0.split(",");
                    getContext();
                    int[] iArr2 = new int[split.length];
                    int i14 = 0;
                    for (String str2 : split) {
                        int j13 = j(str2.trim());
                        if (j13 != 0) {
                            iArr2[i14] = j13;
                            i14++;
                        }
                    }
                    if (i14 != split.length) {
                        iArr2 = Arrays.copyOf(iArr2, i14);
                    }
                    lVar.f17792j0 = iArr2;
                } else {
                    lVar.f17792j0 = null;
                }
            }
        }
        oVar.f120279w0 = 0;
        Arrays.fill(oVar.f120278v0, (Object) null);
        if (lVar.f17792j0 == null) {
            return;
        }
        while (true) {
            int[] iArr3 = lVar.f17792j0;
            if (i13 >= iArr3.length) {
                return;
            }
            u4.h hVar = (u4.h) sparseArray.get(iArr3[i13]);
            if (hVar != null) {
                oVar.f0(hVar);
            }
            i13++;
        }
    }

    public final void o(View view) {
        int i13;
        int id3 = view.getId();
        if (id3 == -1) {
            return;
        }
        this.f17650e = null;
        int i14 = 0;
        while (true) {
            if (i14 >= this.f17647b) {
                break;
            }
            if (this.f17646a[i14] == id3) {
                while (true) {
                    i13 = this.f17647b - 1;
                    if (i14 >= i13) {
                        break;
                    }
                    int[] iArr = this.f17646a;
                    int i15 = i14 + 1;
                    iArr[i14] = iArr[i15];
                    i14 = i15;
                }
                this.f17646a[i13] = 0;
                this.f17647b = i13;
            } else {
                i14++;
            }
        }
        requestLayout();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f17650e;
        if (str != null) {
            q(str);
        }
        String str2 = this.f17651f;
        if (str2 != null) {
            r(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    public void p(u4.h hVar, boolean z13) {
    }

    public final void q(String str) {
        this.f17650e = str;
        if (str == null) {
            return;
        }
        int i13 = 0;
        this.f17647b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i13);
            if (indexOf == -1) {
                b(str.substring(i13));
                return;
            } else {
                b(str.substring(i13, indexOf));
                i13 = indexOf + 1;
            }
        }
    }

    public final void r(String str) {
        this.f17651f = str;
        if (str == null) {
            return;
        }
        int i13 = 0;
        this.f17647b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i13);
            if (indexOf == -1) {
                d(str.substring(i13));
                return;
            } else {
                d(str.substring(i13, indexOf));
                i13 = indexOf + 1;
            }
        }
    }

    public final void s(int[] iArr) {
        this.f17650e = null;
        this.f17647b = 0;
        for (int i13 : iArr) {
            c(i13);
        }
    }

    @Override // android.view.View
    public final void setTag(int i13, Object obj) {
        super.setTag(i13, obj);
        if (obj == null && this.f17650e == null) {
            c(i13);
        }
    }

    public void t() {
    }

    public void u(ConstraintLayout constraintLayout) {
    }

    public final void v(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            q(this.f17650e);
        }
        u4.o oVar = this.f17649d;
        if (oVar == null) {
            return;
        }
        oVar.f120279w0 = 0;
        Arrays.fill(oVar.f120278v0, (Object) null);
        for (int i13 = 0; i13 < this.f17647b; i13++) {
            int i14 = this.f17646a[i13];
            View viewById = constraintLayout.getViewById(i14);
            if (viewById == null) {
                Integer valueOf = Integer.valueOf(i14);
                HashMap hashMap = this.f17653h;
                String str = (String) hashMap.get(valueOf);
                int i15 = i(constraintLayout, str);
                if (i15 != 0) {
                    this.f17646a[i13] = i15;
                    hashMap.put(Integer.valueOf(i15), str);
                    viewById = constraintLayout.getViewById(i15);
                }
            }
            if (viewById != null) {
                this.f17649d.f0(constraintLayout.getViewWidget(viewById));
            }
        }
        u4.o oVar2 = this.f17649d;
        u4.i iVar = constraintLayout.mLayoutWidget;
        oVar2.a();
    }

    public void w(u4.n nVar, SparseArray sparseArray) {
        u4.o oVar = (u4.o) nVar;
        oVar.f120279w0 = 0;
        Arrays.fill(oVar.f120278v0, (Object) null);
        for (int i13 = 0; i13 < this.f17647b; i13++) {
            oVar.f0((u4.h) sparseArray.get(this.f17646a[i13]));
        }
    }

    public final void x() {
        if (this.f17649d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f17688q0 = this.f17649d;
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17646a = new int[32];
        this.f17652g = null;
        this.f17653h = new HashMap();
        this.f17648c = context;
        m(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17646a = new int[32];
        this.f17652g = null;
        this.f17653h = new HashMap();
        this.f17648c = context;
        m(attributeSet);
    }
}
