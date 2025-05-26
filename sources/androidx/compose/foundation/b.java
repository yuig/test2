package androidx.compose.foundation;

import i2.n;
import i2.o;
import k1.k1;
import kl2.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import u2.q;
import z3.g;

/* loaded from: classes2.dex */
public final class b extends s implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k1 f17115i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f17116j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f17117k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f17118l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function0 f17119m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k1 k1Var, boolean z13, String str, g gVar, Function0 function0) {
        super(3);
        this.f17115i = k1Var;
        this.f17116j = z13;
        this.f17117k = str;
        this.f17118l = gVar;
        this.f17119m = function0;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        i2.s sVar = (i2.s) ((o) obj2);
        sVar.W(-1525724089);
        Object J2 = sVar.J();
        if (J2 == n.f71185a) {
            J2 = d7.g.o(sVar);
        }
        o1.l lVar = (o1.l) J2;
        q j13 = d.a(u2.n.f120041b, lVar, this.f17115i).j(new ClickableElement(lVar, null, this.f17116j, this.f17117k, this.f17118l, this.f17119m));
        sVar.r(false);
        return j13;
    }
}
