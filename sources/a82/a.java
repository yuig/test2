package a82;

import android.graphics.Color;
import android.util.Size;
import ao2.j0;
import c72.b0;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.no;
import com.pinterest.shuffles.scene.composer.n0;
import dv0.q;
import java.util.ArrayList;
import java.util.List;
import kh2.k3;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function2;
import r72.b2;
import r72.k0;
import xk2.r;
import xk2.s;

/* loaded from: classes4.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f1520r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f1521s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1522t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f1523u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ fi0 f1524v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i13, b bVar, fi0 fi0Var, bl2.c cVar) {
        super(2, cVar);
        this.f1522t = i13;
        this.f1523u = bVar;
        this.f1524v = fi0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a aVar = new a(this.f1522t, this.f1523u, this.f1524v, cVar);
        aVar.f1521s = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object m13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f1520r;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f1521s;
            int i14 = this.f1522t;
            Size size = new Size(i14, (int) (no.f40447e.d() * i14));
            b bVar = this.f1523u;
            q qVar = bVar.f1527c;
            fi0 fi0Var = this.f1524v;
            int i15 = 0;
            k0 j13 = qVar.j(fi0Var.G(), false);
            n0 n0Var = new n0(bVar.f1525a, j0Var, bVar.f1528d, new jq1.b(bVar, 11));
            List M = fi0Var.M();
            if (M == null) {
                M = q0.f80391a;
            }
            ArrayList h10 = b0.h(bVar.f1526b, M, null, k3.o1(fi0Var), 2);
            String str = j13.f106522j;
            if (str == null) {
                str = "#E5E5E5";
            }
            if ((str.length() > 0 ? str : null) != null) {
                try {
                    xk2.q qVar2 = s.f135225b;
                    m13 = Integer.valueOf(Color.parseColor(str));
                } catch (Throwable th3) {
                    xk2.q qVar3 = s.f135225b;
                    m13 = ue.c.m(th3);
                }
                Integer num = (Integer) (m13 instanceof r ? null : m13);
                if (num != null) {
                    i15 = num.intValue();
                }
            }
            b2 b2Var = b2.f106444a;
            this.f1520r = 1;
            obj = n0Var.a(h10, size, i15, b2Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
