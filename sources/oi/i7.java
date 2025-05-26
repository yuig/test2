package oi;

import java.util.HashSet;

/* loaded from: classes3.dex */
public final class i7 extends y6 {

    /* renamed from: d, reason: collision with root package name */
    public String f94861d;

    /* renamed from: e, reason: collision with root package name */
    public HashSet f94862e;

    /* renamed from: f, reason: collision with root package name */
    public g1.g f94863f;

    /* renamed from: g, reason: collision with root package name */
    public Long f94864g;

    /* renamed from: h, reason: collision with root package name */
    public Long f94865h;

    @Override // oi.y6
    public final boolean v() {
        return false;
    }

    public final j7 w(Integer num) {
        if (this.f94863f.containsKey(num)) {
            return (j7) this.f94863f.get(num);
        }
        j7 j7Var = new j7(this, this.f94861d);
        this.f94863f.put(num, j7Var);
        return j7Var;
    }
}
