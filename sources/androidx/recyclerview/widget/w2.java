package androidx.recyclerview.widget;

import a.cb;

/* loaded from: classes.dex */
public final class w2 {

    /* renamed from: a */
    public int f19677a;

    /* renamed from: b */
    public int f19678b;

    /* renamed from: c */
    public int f19679c;

    /* renamed from: d */
    public int f19680d;

    /* renamed from: e */
    public int f19681e;

    /* renamed from: f */
    public boolean f19682f;

    /* renamed from: g */
    public boolean f19683g;

    /* renamed from: h */
    public boolean f19684h;

    /* renamed from: i */
    public boolean f19685i;

    /* renamed from: j */
    public boolean f19686j;

    /* renamed from: k */
    public boolean f19687k;

    /* renamed from: l */
    public int f19688l;

    /* renamed from: m */
    public long f19689m;

    /* renamed from: n */
    public int f19690n;

    public final void a(int i13) {
        if ((this.f19680d & i13) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i13) + " but it is " + Integer.toBinaryString(this.f19680d));
    }

    public final int b() {
        return this.f19683g ? this.f19678b - this.f19679c : this.f19681e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("State{mTargetPosition=");
        sb3.append(this.f19677a);
        sb3.append(", mData=null, mItemCount=");
        sb3.append(this.f19681e);
        sb3.append(", mIsMeasuring=");
        sb3.append(this.f19685i);
        sb3.append(", mPreviousLayoutItemCount=");
        sb3.append(this.f19678b);
        sb3.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb3.append(this.f19679c);
        sb3.append(", mStructureChanged=");
        sb3.append(this.f19682f);
        sb3.append(", mInPreLayout=");
        sb3.append(this.f19683g);
        sb3.append(", mRunSimpleAnimations=");
        sb3.append(this.f19686j);
        sb3.append(", mRunPredictiveAnimations=");
        return cb.m(sb3, this.f19687k, '}');
    }
}
