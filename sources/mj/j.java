package mj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final float f87254a;

    /* renamed from: b, reason: collision with root package name */
    public final List f87255b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87256c;

    /* renamed from: d, reason: collision with root package name */
    public final int f87257d;

    public j(float f13, ArrayList arrayList, int i13, int i14) {
        this.f87254a = f13;
        this.f87255b = Collections.unmodifiableList(arrayList);
        this.f87256c = i13;
        this.f87257d = i14;
    }

    public final i a() {
        return (i) this.f87255b.get(this.f87256c);
    }

    public final i b() {
        return (i) this.f87255b.get(0);
    }

    public final i c() {
        return (i) this.f87255b.get(this.f87257d);
    }

    public final i d() {
        return (i) ep.b.i(this.f87255b, 1);
    }
}
