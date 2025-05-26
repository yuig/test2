package hz;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import com.pinterest.api.model.es0;
import com.pinterest.api.model.ur0;
import gz.p;
import gz.q;
import gz.s;
import gz.u;
import h32.d4;
import h32.u0;
import java.util.Iterator;
import java.util.List;
import kh2.a1;
import kh2.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lh0.n;
import mq.e0;
import mq.f0;
import mq.g0;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhz/d;", "Lyk1/k;", "Lez/a;", "<init>", "()V", "anket_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class d extends j implements ez.a {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f70601r0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public cz.e f70602j0;

    /* renamed from: k0, reason: collision with root package name */
    public n f70603k0;

    /* renamed from: l0, reason: collision with root package name */
    public fz.a f70604l0;

    /* renamed from: m0, reason: collision with root package name */
    public final d4 f70605m0 = d4.IN_APP_SURVEY;

    /* renamed from: n0, reason: collision with root package name */
    public final v f70606n0 = m.b(new a(this, 2));

    /* renamed from: o0, reason: collision with root package name */
    public final v f70607o0 = m.b(new a(this, 1));

    /* renamed from: p0, reason: collision with root package name */
    public final v f70608p0 = m.b(new a(this, 0));

    /* renamed from: q0, reason: collision with root package name */
    public final m1 f70609q0;

    public d() {
        a aVar = new a(this, 3);
        xk2.k q13 = jq.b.q(11, new q1(this, 11), xk2.n.NONE);
        int i13 = 10;
        this.f70609q0 = a1.s(this, k0.f80436a.b(p.class), new e0(q13, i13), new f0(aVar, q13, i13), new g0(this, q13, i13));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        return new fz.a(b8());
    }

    public final cz.e b8() {
        cz.e eVar = this.f70602j0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("anketManager");
        throw null;
    }

    public final boolean c8() {
        return ((Boolean) this.f70606n0.getValue()).booleanValue();
    }

    public final boolean d8() {
        return ((Boolean) this.f70608p0.getValue()).booleanValue();
    }

    public final void e8(u uVar) {
        String str = (String) this.f70607o0.getValue();
        if (str == null) {
            return;
        }
        ((l82.c) ((p) this.f70609q0.getValue()).c()).a(new gz.e(str, uVar));
    }

    public final void f8(Integer num) {
        if (c8()) {
            if (num == null) {
                e8(q.f66354a);
                return;
            } else {
                e8(new s(num.intValue()));
                return;
            }
        }
        fz.a aVar = this.f70604l0;
        if (aVar != null) {
            aVar.p3(num);
        }
    }

    public abstract void g8(jz.d dVar, cz.b bVar, om1.e eVar, h32.g0 g0Var, List list);

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG0() {
        return this.f70605m0;
    }

    public final void h8(u0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!c8()) {
            b8().b(type);
            return;
        }
        ((l82.c) ((p) this.f70609q0.getValue()).c()).a(new gz.f(type));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        fz.a aVar = this.f70604l0;
        if (aVar != null) {
            aVar.s3();
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        List a13;
        v vVar;
        Object obj;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        if (c8()) {
            z viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new c(this, null), 3);
            return;
        }
        ur0 ur0Var = b8().f53460h;
        if (ur0Var == null || (a13 = ur0Var.a()) == null) {
            return;
        }
        Iterator it = a13.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vVar = this.f70607o0;
            if (!hasNext) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((es0) obj).d(), (String) vVar.getValue())) {
                    break;
                }
            }
        }
        es0 es0Var = (es0) obj;
        if (es0Var != null) {
            fz.a aVar = this.f70604l0;
            if (aVar != null) {
                aVar.t3(es0Var);
            }
            jz.d J1 = j1.J1(es0Var);
            cz.b bVar = (cz.b) b8().f53461i.get(es0Var.d());
            Object obj2 = b8().f53464l.get((String) vVar.getValue());
            om1.e eVar = obj2 instanceof om1.e ? (om1.e) obj2 : null;
            ur0 ur0Var2 = b8().f53460h;
            g8(J1, bVar, eVar, ur0Var2 != null ? ur0Var2.b() : null, (List) b8().f53463k.get((String) vVar.getValue()));
        }
    }
}
