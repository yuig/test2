package h3;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g0 extends i0 implements Iterable, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f66667a;

    /* renamed from: b, reason: collision with root package name */
    public final float f66668b;

    /* renamed from: c, reason: collision with root package name */
    public final float f66669c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66670d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66671e;

    /* renamed from: f, reason: collision with root package name */
    public final float f66672f;

    /* renamed from: g, reason: collision with root package name */
    public final float f66673g;

    /* renamed from: h, reason: collision with root package name */
    public final float f66674h;

    /* renamed from: i, reason: collision with root package name */
    public final List f66675i;

    /* renamed from: j, reason: collision with root package name */
    public final List f66676j;

    public g0(String str, float f13, float f14, float f15, float f16, float f17, float f18, float f19, List list, List list2) {
        this.f66667a = str;
        this.f66668b = f13;
        this.f66669c = f14;
        this.f66670d = f15;
        this.f66671e = f16;
        this.f66672f = f17;
        this.f66673g = f18;
        this.f66674h = f19;
        this.f66675i = list;
        this.f66676j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g0)) {
            g0 g0Var = (g0) obj;
            return Intrinsics.d(this.f66667a, g0Var.f66667a) && this.f66668b == g0Var.f66668b && this.f66669c == g0Var.f66669c && this.f66670d == g0Var.f66670d && this.f66671e == g0Var.f66671e && this.f66672f == g0Var.f66672f && this.f66673g == g0Var.f66673g && this.f66674h == g0Var.f66674h && Intrinsics.d(this.f66675i, g0Var.f66675i) && Intrinsics.d(this.f66676j, g0Var.f66676j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f66676j.hashCode() + ep.b.c(this.f66675i, a.a.a(this.f66674h, a.a.a(this.f66673g, a.a.a(this.f66672f, a.a.a(this.f66671e, a.a.a(this.f66670d, a.a.a(this.f66669c, a.a.a(this.f66668b, this.f66667a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f0(this);
    }
}
