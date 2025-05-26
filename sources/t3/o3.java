package t3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class o3 implements s3.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f116110a;

    /* renamed from: b, reason: collision with root package name */
    public final List f116111b;

    /* renamed from: c, reason: collision with root package name */
    public Float f116112c = null;

    /* renamed from: d, reason: collision with root package name */
    public Float f116113d = null;

    /* renamed from: e, reason: collision with root package name */
    public z3.h f116114e = null;

    /* renamed from: f, reason: collision with root package name */
    public z3.h f116115f = null;

    public o3(int i13, ArrayList arrayList) {
        this.f116110a = i13;
        this.f116111b = arrayList;
    }

    @Override // s3.b2
    public final boolean X() {
        return this.f116111b.contains(this);
    }
}
