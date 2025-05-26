package androidx.recyclerview.widget;

import a.cb;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public y2 f19563a;

    /* renamed from: b, reason: collision with root package name */
    public y2 f19564b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19565c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19566d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19567e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19568f;

    public q(y2 y2Var, y2 y2Var2, int i13, int i14, int i15, int i16) {
        this.f19563a = y2Var;
        this.f19564b = y2Var2;
        this.f19565c = i13;
        this.f19566d = i14;
        this.f19567e = i15;
        this.f19568f = i16;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChangeInfo{oldHolder=");
        sb3.append(this.f19563a);
        sb3.append(", newHolder=");
        sb3.append(this.f19564b);
        sb3.append(", fromX=");
        sb3.append(this.f19565c);
        sb3.append(", fromY=");
        sb3.append(this.f19566d);
        sb3.append(", toX=");
        sb3.append(this.f19567e);
        sb3.append(", toY=");
        return cb.l(sb3, this.f19568f, '}');
    }
}
