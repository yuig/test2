package i2;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class x2 implements Iterable, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final w2 f71357a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71358b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71359c;

    public x2(int i13, int i14, w2 w2Var) {
        this.f71357a = w2Var;
        this.f71358b = i13;
        this.f71359c = i14;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i13;
        ArrayList arrayList;
        int h13;
        w2 w2Var = this.f71357a;
        if (w2Var.f71346g != this.f71359c) {
            throw new ConcurrentModificationException();
        }
        HashMap hashMap = w2Var.f71348i;
        d dVar = null;
        int i14 = this.f71358b;
        if (hashMap != null) {
            if (!(!w2Var.f71345f)) {
                u.i("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i14 >= 0 && i14 < (i13 = w2Var.f71341b) && (h13 = lb.l0.h1((arrayList = w2Var.f71347h), i14, i13)) >= 0) {
                dVar = (d) arrayList.get(h13);
            }
            if (dVar != null) {
            }
        }
        return new x0(i14 + 1, lb.l0.i(w2Var.f71340a, i14) + i14, w2Var);
    }
}
