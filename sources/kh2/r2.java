package kh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79682i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s2 f79683j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(s2 s2Var, int i13) {
        super(0);
        this.f79682i = i13;
        this.f79683j = s2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79682i;
        s2 s2Var = this.f79683j;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        rl2.u[] uVarArr = s2.f79686r;
                        return s2Var.b();
                    default:
                        rl2.u[] uVarArr2 = s2.f79686r;
                        return s2Var.b();
                }
            case 1:
                zi2.b bVar = s2Var.f79688b;
                d1 d1Var = (d1) s2Var.f79687a;
                d1Var.getClass();
                return new ei2.a(bVar, (gi2.a) d1Var.f79459e.a(d1Var, d1.f79454h[0]), s2Var.d(), (ei2.x) s2Var.f79690d.getValue(), new r2(s2Var, 0));
            case 2:
                return new ei2.i((ui2.p) s2Var.f79693g.getValue(), s2Var.f79688b, s2Var.d(), s2Var.f79694h);
            case 3:
                return new ei2.n(s2Var.e());
            case 4:
                return (sh2.g) s2Var.f79703q.getValue();
            case 5:
                return new sh2.a(new r2(s2Var, 4));
            case 6:
                Object value = ((sh2.l) s2Var.f79692f.getValue()).f112988a.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-sdkTracerProvider>(...)");
                return new sh2.g((nj2.m) value, s2Var.e(), s2Var.f79688b);
            case 7:
                return new ei2.p(s2Var.d(), (ei2.n) s2Var.f79698l.a(s2Var, s2.f79686r[2]), ((d1) s2Var.f79687a).f79455a);
            case 8:
                Object value2 = ((sh2.l) s2Var.f79692f.getValue()).f112991d.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "<get-logger>(...)");
                return (si2.d) value2;
            case 9:
                ei2.x xVar = (ei2.x) s2Var.f79690d.getValue();
                mh2.n nVar = (mh2.n) s2Var.f79701o.getValue();
                d1 d1Var2 = (d1) s2Var.f79687a;
                return new sh2.j(xVar, nVar, d1Var2.f79457c, d1Var2.f79458d);
            case 10:
                try {
                    c0.d.M2("otel-sdk-wrapper-init");
                    try {
                        return new sh2.l(s2Var.f79688b, s2Var.c());
                    } catch (NoClassDefFoundError e13) {
                        throw new LinkageError("Please enable library desugaring in your project to use the Embrace SDK. This is required if you target API levels below 24. For instructions, please see https://developer.android.com/studio/write/java8-support#library-desugaring", e13);
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } finally {
                        c0.d.N();
                    }
                }
            case 11:
                Object value3 = ((sh2.l) s2Var.f79692f.getValue()).f112989b.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "<get-sdkTracer>(...)");
                return (ui2.p) value3;
            case 12:
                switch (i13) {
                    case 0:
                        rl2.u[] uVarArr3 = s2.f79686r;
                        return s2Var.b();
                    default:
                        rl2.u[] uVarArr4 = s2.f79686r;
                        return s2Var.b();
                }
            default:
                return new ei2.m(s2Var.d(), s2Var.a(), new r2(s2Var, 12));
        }
    }
}
