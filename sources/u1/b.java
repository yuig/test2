package u1;

import i2.n;
import i2.o;
import k1.k1;
import k1.q1;
import kl2.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import u2.q;
import z3.g;

/* loaded from: classes2.dex */
public final class b extends s implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f119979i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f119980j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f119981k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function0 f119982l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z13, boolean z14, g gVar, Function0 function0) {
        super(3);
        this.f119979i = z13;
        this.f119980j = z14;
        this.f119981k = gVar;
        this.f119982l = function0;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o1.l lVar;
        ((Number) obj3).intValue();
        i2.s sVar = (i2.s) ((o) obj2);
        sVar.W(-2124609672);
        k1 k1Var = (k1) sVar.m(androidx.compose.foundation.d.f17120a);
        if (k1Var instanceof q1) {
            sVar.W(-1412264498);
            sVar.r(false);
            lVar = null;
        } else {
            sVar.W(-1412156525);
            Object J2 = sVar.J();
            if (J2 == n.f71185a) {
                J2 = d7.g.o(sVar);
            }
            lVar = (o1.l) J2;
            sVar.r(false);
        }
        o1.l lVar2 = lVar;
        q a13 = androidx.compose.foundation.selection.b.a(u2.n.f120041b, this.f119979i, lVar2, k1Var, this.f119980j, this.f119981k, this.f119982l);
        sVar.r(false);
        return a13;
    }
}
