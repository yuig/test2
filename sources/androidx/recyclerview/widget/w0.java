package androidx.recyclerview.widget;

import a.cb;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: b, reason: collision with root package name */
    public int f19667b;

    /* renamed from: c, reason: collision with root package name */
    public int f19668c;

    /* renamed from: d, reason: collision with root package name */
    public int f19669d;

    /* renamed from: e, reason: collision with root package name */
    public int f19670e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19673h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19674i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f19666a = true;

    /* renamed from: f, reason: collision with root package name */
    public int f19671f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f19672g = 0;

    public final boolean a(w2 w2Var) {
        int i13 = this.f19668c;
        return i13 >= 0 && i13 < w2Var.b();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LayoutState{mAvailable=");
        sb3.append(this.f19667b);
        sb3.append(", mCurrentPosition=");
        sb3.append(this.f19668c);
        sb3.append(", mItemDirection=");
        sb3.append(this.f19669d);
        sb3.append(", mLayoutDirection=");
        sb3.append(this.f19670e);
        sb3.append(", mStartLine=");
        sb3.append(this.f19671f);
        sb3.append(", mEndLine=");
        return cb.l(sb3, this.f19672g, '}');
    }
}
