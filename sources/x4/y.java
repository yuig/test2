package x4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f131856a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f131857b;

    /* renamed from: c, reason: collision with root package name */
    public int f131858c;

    /* renamed from: d, reason: collision with root package name */
    public int f131859d;

    /* renamed from: e, reason: collision with root package name */
    public int f131860e;

    /* renamed from: f, reason: collision with root package name */
    public String f131861f;

    /* renamed from: g, reason: collision with root package name */
    public int f131862g;

    /* renamed from: h, reason: collision with root package name */
    public int f131863h;

    /* renamed from: i, reason: collision with root package name */
    public final float f131864i;

    /* renamed from: j, reason: collision with root package name */
    public final z f131865j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f131866k;

    /* renamed from: l, reason: collision with root package name */
    public b0 f131867l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f131868m;

    /* renamed from: n, reason: collision with root package name */
    public final int f131869n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f131870o;

    /* renamed from: p, reason: collision with root package name */
    public int f131871p;

    /* renamed from: q, reason: collision with root package name */
    public final int f131872q;

    /* renamed from: r, reason: collision with root package name */
    public final int f131873r;

    public y(z zVar, y yVar) {
        this.f131856a = -1;
        this.f131857b = false;
        this.f131858c = -1;
        this.f131859d = -1;
        this.f131860e = 0;
        this.f131861f = null;
        this.f131862g = -1;
        this.f131863h = 400;
        this.f131864i = 0.0f;
        this.f131866k = new ArrayList();
        this.f131867l = null;
        this.f131868m = new ArrayList();
        this.f131869n = 0;
        this.f131870o = false;
        this.f131871p = -1;
        this.f131872q = 0;
        this.f131873r = 0;
        this.f131865j = zVar;
        this.f131863h = zVar.f131883j;
        if (yVar != null) {
            this.f131871p = yVar.f131871p;
            this.f131860e = yVar.f131860e;
            this.f131861f = yVar.f131861f;
            this.f131862g = yVar.f131862g;
            this.f131863h = yVar.f131863h;
            this.f131866k = yVar.f131866k;
            this.f131864i = yVar.f131864i;
            this.f131872q = yVar.f131872q;
        }
    }

    public y(z zVar, int i13, int i14) {
        this.f131856a = -1;
        this.f131857b = false;
        this.f131858c = -1;
        this.f131859d = -1;
        this.f131860e = 0;
        this.f131861f = null;
        this.f131862g = -1;
        this.f131863h = 400;
        this.f131864i = 0.0f;
        this.f131866k = new ArrayList();
        this.f131867l = null;
        this.f131868m = new ArrayList();
        this.f131869n = 0;
        this.f131870o = false;
        this.f131871p = -1;
        this.f131872q = 0;
        this.f131873r = 0;
        this.f131856a = -1;
        this.f131865j = zVar;
        this.f131859d = i13;
        this.f131858c = i14;
        this.f131863h = zVar.f131883j;
        this.f131872q = zVar.f131884k;
    }

    public y(z zVar, Context context, XmlResourceParser xmlResourceParser) {
        this.f131856a = -1;
        this.f131857b = false;
        this.f131858c = -1;
        this.f131859d = -1;
        this.f131860e = 0;
        this.f131861f = null;
        this.f131862g = -1;
        this.f131863h = 400;
        this.f131864i = 0.0f;
        this.f131866k = new ArrayList();
        this.f131867l = null;
        this.f131868m = new ArrayList();
        this.f131869n = 0;
        this.f131870o = false;
        this.f131871p = -1;
        this.f131872q = 0;
        this.f131873r = 0;
        this.f131863h = zVar.f131883j;
        this.f131872q = zVar.f131884k;
        this.f131865j = zVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.s.Transition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            int i14 = androidx.constraintlayout.widget.s.Transition_constraintSetEnd;
            SparseArray sparseArray = zVar.f131880g;
            if (index == i14) {
                this.f131858c = obtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f131858c);
                if ("layout".equals(resourceTypeName)) {
                    androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
                    pVar.y(context, this.f131858c);
                    sparseArray.append(this.f131858c, pVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.f131858c = zVar.h(context, this.f131858c);
                }
            } else if (index == androidx.constraintlayout.widget.s.Transition_constraintSetStart) {
                this.f131859d = obtainStyledAttributes.getResourceId(index, this.f131859d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.f131859d);
                if ("layout".equals(resourceTypeName2)) {
                    androidx.constraintlayout.widget.p pVar2 = new androidx.constraintlayout.widget.p();
                    pVar2.y(context, this.f131859d);
                    sparseArray.append(this.f131859d, pVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.f131859d = zVar.h(context, this.f131859d);
                }
            } else if (index == androidx.constraintlayout.widget.s.Transition_motionInterpolator) {
                int i15 = obtainStyledAttributes.peekValue(index).type;
                if (i15 == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    this.f131862g = resourceId;
                    if (resourceId != -1) {
                        this.f131860e = -2;
                    }
                } else if (i15 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f131861f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.f131862g = obtainStyledAttributes.getResourceId(index, -1);
                            this.f131860e = -2;
                        } else {
                            this.f131860e = -1;
                        }
                    }
                } else {
                    this.f131860e = obtainStyledAttributes.getInteger(index, this.f131860e);
                }
            } else if (index == androidx.constraintlayout.widget.s.Transition_duration) {
                int i16 = obtainStyledAttributes.getInt(index, this.f131863h);
                this.f131863h = i16;
                if (i16 < 8) {
                    this.f131863h = 8;
                }
            } else if (index == androidx.constraintlayout.widget.s.Transition_staggered) {
                this.f131864i = obtainStyledAttributes.getFloat(index, this.f131864i);
            } else if (index == androidx.constraintlayout.widget.s.Transition_autoTransition) {
                this.f131869n = obtainStyledAttributes.getInteger(index, this.f131869n);
            } else if (index == androidx.constraintlayout.widget.s.Transition_android_id) {
                this.f131856a = obtainStyledAttributes.getResourceId(index, this.f131856a);
            } else if (index == androidx.constraintlayout.widget.s.Transition_transitionDisable) {
                this.f131870o = obtainStyledAttributes.getBoolean(index, this.f131870o);
            } else if (index == androidx.constraintlayout.widget.s.Transition_pathMotionArc) {
                this.f131871p = obtainStyledAttributes.getInteger(index, -1);
            } else if (index == androidx.constraintlayout.widget.s.Transition_layoutDuringTransition) {
                this.f131872q = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == androidx.constraintlayout.widget.s.Transition_transitionFlags) {
                this.f131873r = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f131859d == -1) {
            this.f131857b = true;
        }
        obtainStyledAttributes.recycle();
    }
}
