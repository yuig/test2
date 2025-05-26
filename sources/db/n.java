package db;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import xk2.v;

/* loaded from: classes3.dex */
public final class n implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final n f54285f;

    /* renamed from: a, reason: collision with root package name */
    public final int f54286a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54287b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54288c;

    /* renamed from: d, reason: collision with root package name */
    public final String f54289d;

    /* renamed from: e, reason: collision with root package name */
    public final v f54290e = xk2.m.b(new m(this, 0));

    static {
        new n("", 0, 0, 0);
        f54285f = new n("", 0, 1, 0);
        new n("", 1, 0, 0);
    }

    public n(String str, int i13, int i14, int i15) {
        this.f54286a = i13;
        this.f54287b = i14;
        this.f54288c = i15;
        this.f54289d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n other = (n) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        Object value = this.f54290e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        Object value2 = other.f54290e.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f54286a == nVar.f54286a && this.f54287b == nVar.f54287b && this.f54288c == nVar.f54288c;
    }

    public final int hashCode() {
        return ((((527 + this.f54286a) * 31) + this.f54287b) * 31) + this.f54288c;
    }

    public final String toString() {
        String str = this.f54289d;
        String j13 = z.j(str) ^ true ? a.a.j("-", str) : "";
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f54286a);
        sb3.append('.');
        sb3.append(this.f54287b);
        sb3.append('.');
        return a.a.n(sb3, this.f54288c, j13);
    }
}
