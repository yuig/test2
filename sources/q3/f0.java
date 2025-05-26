package q3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f0 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public n4.k f102204a = n4.k.Rtl;

    /* renamed from: b, reason: collision with root package name */
    public float f102205b;

    /* renamed from: c, reason: collision with root package name */
    public float f102206c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f102207d;

    public f0(l0 l0Var) {
        this.f102207d = l0Var;
    }

    @Override // q3.s
    public final boolean K() {
        s3.g0 g0Var = this.f102207d.f102230a.f110838z.f110969c;
        return g0Var == s3.g0.LookaheadLayingOut || g0Var == s3.g0.LookaheadMeasuring;
    }

    @Override // q3.r0
    public final q0 Y(int i13, int i14, Map map, Function1 function1) {
        if ((i13 & (-16777216)) == 0 && ((-16777216) & i14) == 0) {
            return new e0(i13, i14, map, this, this.f102207d, function1);
        }
        jk.r.y("Size(" + i13 + " x " + i14 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // n4.b
    public final float b() {
        return this.f102205b;
    }

    @Override // q3.s
    public final n4.k getLayoutDirection() {
        return this.f102204a;
    }

    @Override // n4.b
    public final float j0() {
        return this.f102206c;
    }

    @Override // q3.o1
    public final List m(Object obj, Function2 function2) {
        s3.k0 k0Var;
        l0 l0Var = this.f102207d;
        l0Var.h();
        s3.k0 k0Var2 = l0Var.f102230a;
        s3.g0 g0Var = k0Var2.f110838z.f110969c;
        s3.g0 g0Var2 = s3.g0.Measuring;
        if (!(g0Var == g0Var2 || g0Var == s3.g0.LayingOut || g0Var == s3.g0.LookaheadMeasuring || g0Var == s3.g0.LookaheadLayingOut)) {
            jk.r.y("subcompose can only be used inside the measure or layout blocks");
            throw null;
        }
        HashMap hashMap = l0Var.f102236g;
        Object obj2 = hashMap.get(obj);
        Object obj3 = obj2;
        if (obj2 == null) {
            s3.k0 k0Var3 = (s3.k0) l0Var.f102239j.remove(obj);
            if (k0Var3 != null) {
                int i13 = l0Var.f102244o;
                if (i13 <= 0) {
                    jk.r.y("Check failed.");
                    throw null;
                }
                l0Var.f102244o = i13 - 1;
                k0Var = k0Var3;
            } else {
                s3.k0 n13 = l0Var.n(obj);
                if (n13 == null) {
                    int i14 = l0Var.f102233d;
                    s3.k0 k0Var4 = new s3.k0(true, 2, 0);
                    k0Var2.f110824l = true;
                    k0Var2.A(i14, k0Var4);
                    k0Var2.f110824l = false;
                    k0Var = k0Var4;
                } else {
                    k0Var = n13;
                }
            }
            hashMap.put(obj, k0Var);
            obj3 = k0Var;
        }
        s3.k0 k0Var5 = (s3.k0) obj3;
        if (CollectionsKt.U(l0Var.f102233d, k0Var2.q()) != k0Var5) {
            int indexOf = k0Var2.q().indexOf(k0Var5);
            int i15 = l0Var.f102233d;
            if (indexOf < i15) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i15 != indexOf) {
                l0Var.j(indexOf, i15, 1);
            }
        }
        l0Var.f102233d++;
        l0Var.m(k0Var5, obj, function2);
        return (g0Var == g0Var2 || g0Var == s3.g0.LayingOut) ? k0Var5.n() : k0Var5.m();
    }
}
