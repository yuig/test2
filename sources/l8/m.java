package l8;

import d7.n0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public final boolean f82046a;

    /* renamed from: c */
    public int f82048c;

    /* renamed from: d */
    public int f82049d;

    /* renamed from: b */
    public final int f82047b = 65536;

    /* renamed from: e */
    public int f82050e = 0;

    /* renamed from: f */
    public a[] f82051f = new a[100];

    public m(boolean z13) {
        this.f82046a = z13;
    }

    public final synchronized void a() {
        int max = Math.max(0, n0.f(this.f82048c, this.f82047b) - this.f82049d);
        int i13 = this.f82050e;
        if (max >= i13) {
            return;
        }
        Arrays.fill(this.f82051f, max, i13, (Object) null);
        this.f82050e = max;
    }
}
