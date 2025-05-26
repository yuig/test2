package l7;

import a7.j1;
import a7.k1;
import a7.m1;
import a7.n1;
import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f81856a;

    /* renamed from: b, reason: collision with root package name */
    public final k1 f81857b;

    /* renamed from: c, reason: collision with root package name */
    public final a7.j f81858c;

    /* renamed from: d, reason: collision with root package name */
    public final n1 f81859d;

    /* renamed from: e, reason: collision with root package name */
    public final a7.l f81860e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f81861f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f81862g;

    /* renamed from: h, reason: collision with root package name */
    public m1 f81863h;

    /* renamed from: i, reason: collision with root package name */
    public a7.x0 f81864i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f81865j;

    /* renamed from: k, reason: collision with root package name */
    public int f81866k;

    public s0(Context context, k1 k1Var, a7.j jVar, n8.s sVar, n8.k kVar) {
        a.e eVar = a7.l.Rm;
        Object obj = j1.Sm;
        bf.b.s("SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings", obj.equals(obj));
        this.f81856a = context;
        this.f81857b = k1Var;
        this.f81858c = jVar;
        this.f81859d = sVar;
        this.f81860e = eVar;
        this.f81861f = kVar;
        this.f81862g = false;
        this.f81866k = -1;
    }

    public final void a(int i13) {
        if (this.f81863h == null) {
            boolean z13 = this.f81865j;
        }
        bf.b.s("This VideoGraph supports only one input.", this.f81866k == -1);
        this.f81866k = i13;
        m1 a13 = this.f81857b.a(this.f81856a, this.f81860e, this.f81858c, this.f81862g, com.google.common.util.concurrent.r.INSTANCE, new c0.x0(this));
        this.f81863h = a13;
        a7.x0 x0Var = this.f81864i;
        if (x0Var != null) {
            ((w) a13).b(x0Var);
        }
    }
}
