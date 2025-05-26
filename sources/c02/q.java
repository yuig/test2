package c02;

import a.cb;
import androidx.recyclerview.widget.y2;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public y2 f24449a;

    /* renamed from: b, reason: collision with root package name */
    public y2 f24450b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24451c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24452d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24453e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24454f;

    public q(y2 y2Var, y2 y2Var2, int i13, int i14, int i15, int i16) {
        this.f24449a = y2Var;
        this.f24450b = y2Var2;
        this.f24451c = i13;
        this.f24452d = i14;
        this.f24453e = i15;
        this.f24454f = i16;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChangeInfo{oldHolder=");
        sb3.append(this.f24449a);
        sb3.append(", newHolder=");
        sb3.append(this.f24450b);
        sb3.append(", fromX=");
        sb3.append(this.f24451c);
        sb3.append(", fromY=");
        sb3.append(this.f24452d);
        sb3.append(", toX=");
        sb3.append(this.f24453e);
        sb3.append(", toY=");
        return cb.l(sb3, this.f24454f, '}');
    }
}
