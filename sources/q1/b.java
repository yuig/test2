package q1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m1.c1;
import p1.x0;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101865i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f101866j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h0 f101867k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f101868l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f101869m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c1 f101870n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f101871o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function1 f101872p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f101873q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f101874r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f101875s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f101876t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(u2.q qVar, h0 h0Var, x0 x0Var, boolean z13, Object obj, Object obj2, c1 c1Var, boolean z14, Function1 function1, int i13, int i14, int i15) {
        super(2);
        this.f101865i = i15;
        this.f101866j = qVar;
        this.f101867k = h0Var;
        this.f101868l = x0Var;
        this.f101869m = z13;
        this.f101875s = obj;
        this.f101876t = obj2;
        this.f101870n = c1Var;
        this.f101871o = z14;
        this.f101872p = function1;
        this.f101873q = i13;
        this.f101874r = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f101865i;
        int i15 = this.f101873q;
        Object obj = this.f101876t;
        Object obj2 = this.f101875s;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                rl2.g0.e(this.f101866j, this.f101867k, this.f101868l, this.f101869m, (p1.j) obj2, (u2.c) obj, this.f101870n, this.f101871o, this.f101872p, oVar, p13, this.f101874r);
                break;
            default:
                int p14 = i2.u.p(i15 | 1);
                c1 c1Var = this.f101870n;
                int i16 = this.f101874r;
                rl2.g0.g(this.f101866j, this.f101867k, this.f101868l, this.f101869m, (p1.h) obj2, (u2.d) obj, c1Var, this.f101871o, this.f101872p, oVar, p14, i16);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f101865i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
