package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r1 implements l82.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128074a;

    public /* synthetic */ r1(int i13) {
        this.f128074a = i13;
    }

    @Override // l82.f
    public final l82.h D(l82.h engineRequest) {
        switch (this.f128074a) {
            case 0:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                n1 n1Var = (n1) engineRequest;
                l1 l1Var = n1Var instanceof l1 ? (l1) n1Var : null;
                if (l1Var != null) {
                    return l1Var.f128040a;
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                n1 n1Var2 = (n1) engineRequest;
                m1 m1Var = n1Var2 instanceof m1 ? (m1) n1Var2 : null;
                if (m1Var != null) {
                    return m1Var.f128043a;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                n1 n1Var3 = (n1) engineRequest;
                j1 j1Var = n1Var3 instanceof j1 ? (j1) n1Var3 : null;
                if (j1Var != null) {
                    return j1Var.f128022a;
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                n1 n1Var4 = (n1) engineRequest;
                if (n1Var4 instanceof c1) {
                    return (c1) n1Var4;
                }
                return null;
            case 4:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                n1 n1Var5 = (n1) engineRequest;
                if (n1Var5 instanceof i1) {
                    return (i1) n1Var5;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                n1 n1Var6 = (n1) engineRequest;
                if (n1Var6 instanceof f1) {
                    return (f1) n1Var6;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
                n1 n1Var7 = (n1) engineRequest;
                k1 k1Var = n1Var7 instanceof k1 ? (k1) n1Var7 : null;
                if (k1Var != null) {
                    return k1Var.f128033a;
                }
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l82.f
    public final u50.s E(u50.s anotherEvent) {
        switch (this.f128074a) {
            case 0:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return new u((f31.y) anotherEvent);
            case 1:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return new w((k51.s) anotherEvent);
            case 2:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return new s((o82.g0) anotherEvent);
            case 3:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return anotherEvent;
            case 4:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return anotherEvent;
            case 5:
                Intrinsics.checkNotNullParameter(anotherEvent, "anotherEvent");
                return anotherEvent;
            default:
                Object anotherEvent2 = (Void) anotherEvent;
                Intrinsics.checkNotNullParameter(anotherEvent2, "anotherEvent");
                return (u50.s) anotherEvent2;
        }
    }
}
