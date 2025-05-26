package ac;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import ao2.j0;
import i2.q1;
import k1.v1;
import k1.x1;
import k1.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class a extends dl2.j implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ q1 B;

    /* renamed from: r, reason: collision with root package name */
    public int f1785r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f1786s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f1787t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f1788u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.h f1789v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1790w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f1791x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f1792y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n f1793z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z13, boolean z14, b bVar, com.airbnb.lottie.h hVar, int i13, boolean z15, float f13, n nVar, boolean z16, q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f1786s = z13;
        this.f1787t = z14;
        this.f1788u = bVar;
        this.f1789v = hVar;
        this.f1790w = i13;
        this.f1791x = z15;
        this.f1792y = f13;
        this.f1793z = nVar;
        this.A = z16;
        this.B = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f1786s, this.f1787t, this.f1788u, this.f1789v, this.f1790w, this.f1791x, this.f1792y, this.f1793z, this.A, this.B, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f1785r;
        b bVar = this.f1788u;
        q1 q1Var = this.B;
        boolean z13 = this.f1786s;
        if (i13 == 0) {
            ue.c.H(obj);
            if (z13 && !((Boolean) q1Var.getValue()).booleanValue() && this.f1787t) {
                this.f1785r = 1;
                j jVar = (j) bVar;
                com.airbnb.lottie.h hVar = (com.airbnb.lottie.h) jVar.f1829i.getValue();
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(jVar.f1825e.getValue());
                float floatValue = ((Number) jVar.f1826f.getValue()).floatValue();
                float f13 = 1.0f;
                if ((floatValue >= 0.0f || hVar != null) && (hVar == null || floatValue >= 0.0f)) {
                    f13 = 0.0f;
                }
                i iVar = new i(jVar, (com.airbnb.lottie.h) jVar.f1829i.getValue(), f13, 1, !(f13 == ((Number) jVar.f1831k.getValue()).floatValue()), null);
                v1 v1Var = v1.Default;
                z1 z1Var = jVar.f1834n;
                z1Var.getClass();
                Object O = dl2.b.O(new x1(v1Var, z1Var, iVar, null), this);
                if (O != obj2) {
                    O = Unit.f80348a;
                }
                if (O != obj2) {
                    O = Unit.f80348a;
                }
                if (O == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        q1Var.setValue(Boolean.valueOf(z13));
        if (!z13) {
            return Unit.f80348a;
        }
        j jVar2 = (j) bVar;
        float floatValue2 = ((Number) jVar2.f1831k.getValue()).floatValue();
        this.f1785r = 2;
        int e13 = jVar2.e();
        jVar2.getClass();
        f fVar = new f(jVar2, e13, this.f1790w, this.f1791x, this.f1792y, this.f1789v, floatValue2, this.A, false, this.f1793z, null);
        v1 v1Var2 = v1.Default;
        z1 z1Var2 = jVar2.f1834n;
        z1Var2.getClass();
        Object O2 = dl2.b.O(new x1(v1Var2, z1Var2, fVar, null), this);
        if (O2 != obj2) {
            O2 = Unit.f80348a;
        }
        if (O2 == obj2) {
            return obj2;
        }
        return Unit.f80348a;
    }
}
