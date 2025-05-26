package i2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w2 implements Iterable, ll2.a {

    /* renamed from: b, reason: collision with root package name */
    public int f71341b;

    /* renamed from: d, reason: collision with root package name */
    public int f71343d;

    /* renamed from: e, reason: collision with root package name */
    public int f71344e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f71345f;

    /* renamed from: g, reason: collision with root package name */
    public int f71346g;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f71348i;

    /* renamed from: j, reason: collision with root package name */
    public g1.u f71349j;

    /* renamed from: a, reason: collision with root package name */
    public int[] f71340a = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public Object[] f71342c = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f71347h = new ArrayList();

    public final int b(d dVar) {
        if (!(!this.f71345f)) {
            u.i("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (dVar.a()) {
            return dVar.f71087a;
        }
        ao2.m0.o0("Anchor refers to a group that was removed");
        throw null;
    }

    public final void c() {
        this.f71349j = new g1.u();
    }

    public final void d() {
        this.f71348i = new HashMap();
    }

    public final boolean e(int i13, d dVar) {
        if (!(!this.f71345f)) {
            u.i("Writer is active");
            throw null;
        }
        if (i13 < 0 || i13 >= this.f71341b) {
            u.i("Invalid group index");
            throw null;
        }
        if (j(dVar)) {
            int i14 = lb.l0.i(this.f71340a, i13) + i13;
            int i15 = dVar.f71087a;
            if (i13 <= i15 && i15 < i14) {
                return true;
            }
        }
        return false;
    }

    public final v2 f() {
        if (this.f71345f) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.f71344e++;
        return new v2(this);
    }

    public final y2 i() {
        if (!(!this.f71345f)) {
            u.i("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (!(this.f71344e <= 0)) {
            u.i("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f71345f = true;
        this.f71346g++;
        return new y2(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new x0(0, this.f71341b, this);
    }

    public final boolean j(d dVar) {
        int h13;
        return dVar.a() && (h13 = lb.l0.h1(this.f71347h, dVar.f71087a, this.f71341b)) >= 0 && Intrinsics.d(this.f71347h.get(h13), dVar);
    }
}
