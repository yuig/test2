package c02;

import a.cb;
import androidx.recyclerview.widget.y2;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final y2 f24455a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24456b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24457c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24458d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24459e;

    public s(y2 y2Var, int i13, int i14, int i15, int i16) {
        this.f24455a = y2Var;
        this.f24456b = i13;
        this.f24457c = i14;
        this.f24458d = i15;
        this.f24459e = i16;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MoveInfo{holder=");
        sb3.append(this.f24455a);
        sb3.append(", fromX=");
        sb3.append(this.f24456b);
        sb3.append(", fromY=");
        sb3.append(this.f24457c);
        sb3.append(", toX=");
        sb3.append(this.f24458d);
        sb3.append(", toY=");
        return cb.l(sb3, this.f24459e, '}');
    }
}
