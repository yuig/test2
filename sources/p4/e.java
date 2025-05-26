package p4;

import android.view.View;
import java.util.List;
import kotlin.collections.z0;
import q3.p0;
import q3.q0;
import q3.r0;
import s3.k0;
import s3.q1;

/* loaded from: classes.dex */
public final class e implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f98778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f98779b;

    public e(j jVar, k0 k0Var) {
        this.f98778a = jVar;
        this.f98779b = k0Var;
    }

    @Override // q3.p0
    public final q0 a(r0 r0Var, List list, long j13) {
        q0 s03;
        q0 s04;
        j jVar = this.f98778a;
        if (jVar.getChildCount() == 0) {
            s04 = r0Var.s0(n4.a.j(j13), n4.a.i(j13), z0.d(), d.f98777i);
            return s04;
        }
        if (n4.a.j(j13) != 0) {
            jVar.getChildAt(0).setMinimumWidth(n4.a.j(j13));
        }
        if (n4.a.i(j13) != 0) {
            jVar.getChildAt(0).setMinimumHeight(n4.a.i(j13));
        }
        jVar.measure(j.d(jVar, n4.a.j(j13), n4.a.h(j13), jVar.getLayoutParams().width), j.d(jVar, n4.a.i(j13), n4.a.g(j13), jVar.getLayoutParams().height));
        s03 = r0Var.s0(jVar.getMeasuredWidth(), jVar.getMeasuredHeight(), z0.d(), new c(jVar, this.f98779b, 1));
        return s03;
    }

    @Override // q3.p0
    public final int b(q1 q1Var, List list, int i13) {
        j jVar = this.f98778a;
        jVar.measure(j.d(jVar, 0, i13, jVar.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return jVar.getMeasuredHeight();
    }

    @Override // q3.p0
    public final int d(q1 q1Var, List list, int i13) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        j jVar = this.f98778a;
        jVar.measure(makeMeasureSpec, j.d(jVar, 0, i13, jVar.getLayoutParams().height));
        return jVar.getMeasuredWidth();
    }

    @Override // q3.p0
    public final int e(q1 q1Var, List list, int i13) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        j jVar = this.f98778a;
        jVar.measure(makeMeasureSpec, j.d(jVar, 0, i13, jVar.getLayoutParams().height));
        return jVar.getMeasuredWidth();
    }

    @Override // q3.p0
    public final int h(q1 q1Var, List list, int i13) {
        j jVar = this.f98778a;
        jVar.measure(j.d(jVar, 0, i13, jVar.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return jVar.getMeasuredHeight();
    }
}
