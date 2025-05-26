package je;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class i0 extends o1 implements k0, l1 {

    /* renamed from: i, reason: collision with root package name */
    public Set f75633i = null;

    /* renamed from: j, reason: collision with root package name */
    public String f75634j = null;

    /* renamed from: k, reason: collision with root package name */
    public Set f75635k = null;

    /* renamed from: l, reason: collision with root package name */
    public Set f75636l = null;

    /* renamed from: m, reason: collision with root package name */
    public Set f75637m = null;

    /* renamed from: n, reason: collision with root package name */
    public Matrix f75638n;

    @Override // je.l1
    public final Set a() {
        return this.f75635k;
    }

    @Override // je.l1
    public final String b() {
        return this.f75634j;
    }

    @Override // je.l1
    public final void d(HashSet hashSet) {
        this.f75633i = hashSet;
    }

    @Override // je.l1
    public final Set e() {
        return this.f75633i;
    }

    @Override // je.l1
    public final void f(HashSet hashSet) {
        this.f75635k = hashSet;
    }

    @Override // je.l1
    public final void h(HashSet hashSet) {
        this.f75637m = hashSet;
    }

    @Override // je.l1
    public final void i(String str) {
        this.f75634j = str;
    }

    @Override // je.l1
    public final void j(HashSet hashSet) {
        this.f75636l = hashSet;
    }

    @Override // je.k0
    public final void k(Matrix matrix) {
        this.f75638n = matrix;
    }

    @Override // je.l1
    public final Set l() {
        return this.f75636l;
    }

    @Override // je.l1
    public final Set m() {
        return this.f75637m;
    }
}
