package oe2;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes4.dex */
public abstract class y implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    public int f94397a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f94398b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f94399c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f94400d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f94401e;

    /* renamed from: f, reason: collision with root package name */
    public int f94402f;

    public abstract x a();

    public abstract x c();

    public abstract x d();

    public final String e() {
        return kg.t.J(this.f94397a, this.f94398b, this.f94399c, this.f94400d);
    }

    public abstract x f(String str);

    public abstract x g();

    public final int h() {
        int i13 = this.f94397a;
        if (i13 != 0) {
            return this.f94398b[i13 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract x k(long j13);

    public abstract x m(String str);
}
