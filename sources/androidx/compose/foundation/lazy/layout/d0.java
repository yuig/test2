package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import q3.o1;

/* loaded from: classes2.dex */
public final class d0 implements c0, q3.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final x f17230a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f17231b;

    /* renamed from: c, reason: collision with root package name */
    public final y f17232c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f17233d = new HashMap();

    public d0(x xVar, o1 o1Var) {
        this.f17230a = xVar;
        this.f17231b = o1Var;
        this.f17232c = (y) xVar.f17322b.invoke();
    }

    @Override // n4.b
    public final long A(float f13) {
        return this.f17231b.A(f13);
    }

    @Override // q3.s
    public final boolean K() {
        return this.f17231b.K();
    }

    @Override // n4.b
    public final int R(float f13) {
        return this.f17231b.R(f13);
    }

    @Override // n4.b
    public final float T(long j13) {
        return this.f17231b.T(j13);
    }

    @Override // q3.r0
    public final q3.q0 Y(int i13, int i14, Map map, Function1 function1) {
        return this.f17231b.Y(i13, i14, map, function1);
    }

    public final List a(int i13, long j13) {
        HashMap hashMap = this.f17233d;
        List list = (List) hashMap.get(Integer.valueOf(i13));
        if (list != null) {
            return list;
        }
        y yVar = this.f17232c;
        Object c13 = yVar.c(i13);
        List m13 = this.f17231b.m(c13, this.f17230a.a(i13, c13, yVar.d(i13)));
        int size = m13.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(((q3.o0) m13.get(i14)).Q(j13));
        }
        hashMap.put(Integer.valueOf(i13), arrayList);
        return arrayList;
    }

    @Override // n4.b
    public final float b() {
        return this.f17231b.b();
    }

    @Override // n4.b
    public final float f0(int i13) {
        return this.f17231b.f0(i13);
    }

    @Override // n4.b
    public final float g0(float f13) {
        return this.f17231b.g0(f13);
    }

    @Override // q3.s
    public final n4.k getLayoutDirection() {
        return this.f17231b.getLayoutDirection();
    }

    @Override // n4.b
    public final float j0() {
        return this.f17231b.j0();
    }

    @Override // n4.b
    public final float l0(float f13) {
        return this.f17231b.l0(f13);
    }

    @Override // n4.b
    public final long o(float f13) {
        return this.f17231b.o(f13);
    }

    @Override // n4.b
    public final long p(long j13) {
        return this.f17231b.p(j13);
    }

    @Override // q3.r0
    public final q3.q0 s0(int i13, int i14, Map map, Function1 function1) {
        return this.f17231b.s0(i13, i14, map, function1);
    }

    @Override // n4.b
    public final float t(long j13) {
        return this.f17231b.t(j13);
    }

    @Override // n4.b
    public final long v0(long j13) {
        return this.f17231b.v0(j13);
    }
}
