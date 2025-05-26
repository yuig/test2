package r2;

import androidx.activity.a0;
import i2.p2;
import i2.q2;
import i2.r1;
import i2.y3;

/* loaded from: classes.dex */
public final class c implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public p f106035a;

    /* renamed from: b, reason: collision with root package name */
    public k f106036b;

    /* renamed from: c, reason: collision with root package name */
    public String f106037c;

    /* renamed from: d, reason: collision with root package name */
    public Object f106038d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f106039e;

    /* renamed from: f, reason: collision with root package name */
    public l f106040f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f106041g = new a0(this, 5);

    public c(p pVar, k kVar, String str, Object obj, Object[] objArr) {
        this.f106035a = pVar;
        this.f106036b = kVar;
        this.f106037c = str;
        this.f106038d = obj;
        this.f106039e = objArr;
    }

    @Override // i2.q2
    public final void a() {
        d();
    }

    @Override // i2.q2
    public final void b() {
        l lVar = this.f106040f;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // i2.q2
    public final void c() {
        l lVar = this.f106040f;
        if (lVar != null) {
            lVar.a();
        }
    }

    public final void d() {
        String c13;
        k kVar = this.f106036b;
        if (this.f106040f != null) {
            throw new IllegalArgumentException(("entry(" + this.f106040f + ") is not null").toString());
        }
        if (kVar != null) {
            a0 a0Var = this.f106041g;
            Object invoke = a0Var.invoke();
            if (invoke == null || kVar.b(invoke)) {
                this.f106040f = kVar.f(a0Var, this.f106037c);
                return;
            }
            if (invoke instanceof s2.q) {
                s2.q qVar = (s2.q) invoke;
                if (qVar.a() == r1.f71258a || qVar.a() == y3.f71400a || qVar.a() == p2.f71234a) {
                    c13 = "MutableState containing " + qVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    c13 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                c13 = so.a.c(invoke);
            }
            throw new IllegalArgumentException(c13);
        }
    }
}
