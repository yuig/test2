package w1;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f127215a;

    /* renamed from: b, reason: collision with root package name */
    public final b2.t0 f127216b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.f0 f127217c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f127218d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f127219e;

    /* renamed from: f, reason: collision with root package name */
    public final b2.z0 f127220f;

    /* renamed from: g, reason: collision with root package name */
    public final h4.y f127221g;

    /* renamed from: h, reason: collision with root package name */
    public final z2 f127222h;

    /* renamed from: i, reason: collision with root package name */
    public final t0 f127223i;

    /* renamed from: j, reason: collision with root package name */
    public final c1 f127224j;

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f127225k;

    /* renamed from: l, reason: collision with root package name */
    public final int f127226l;

    public d2(l1 l1Var, b2.t0 t0Var, h4.f0 f0Var, boolean z13, boolean z14, b2.z0 z0Var, h4.y yVar, z2 z2Var, t0 t0Var2, Function1 function1, int i13) {
        f1 f1Var = g1.f127264a;
        this.f127215a = l1Var;
        this.f127216b = t0Var;
        this.f127217c = f0Var;
        this.f127218d = z13;
        this.f127219e = z14;
        this.f127220f = z0Var;
        this.f127221g = yVar;
        this.f127222h = z2Var;
        this.f127223i = t0Var2;
        this.f127224j = f1Var;
        this.f127225k = function1;
        this.f127226l = i13;
    }

    public final void a(List list) {
        h4.k kVar = this.f127215a.f127358d;
        ArrayList H0 = CollectionsKt.H0(list);
        H0.add(0, new h4.m());
        this.f127225k.invoke(kVar.a(H0));
    }
}
