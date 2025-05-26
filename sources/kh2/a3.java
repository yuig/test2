package kh2;

import java.io.OutputStream;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class a3 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79430i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f79431j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f79432k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f79433l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f79434m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        super(0);
        this.f79430i = i13;
        this.f79433l = obj;
        this.f79431j = obj2;
        this.f79432k = obj3;
        this.f79434m = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79430i;
        Object obj = this.f79432k;
        Object obj2 = this.f79434m;
        Object obj3 = this.f79431j;
        Object obj4 = this.f79433l;
        switch (i13) {
            case 0:
                b3 b3Var = (b3) obj3;
                try {
                    c0.d.M2("payloadMessageCollator");
                    ci2.e eVar = (ci2.e) b3Var.f79443c.a(b3Var, b3.f79440h[2]);
                    c0.d.N();
                    v2 v2Var = (v2) obj;
                    try {
                        c0.d.M2("logEnvelopeSource");
                        y2 y2Var = (y2) v2Var;
                        y2Var.getClass();
                        eh2.a aVar = (eh2.a) y2Var.f79755e.a(y2Var, y2.f79750l[4]);
                        c0.d.N();
                        k kVar = (k) obj2;
                        try {
                            c0.d.M2("configService");
                            sg2.a b13 = ((m) kVar).b();
                            c0.d.N();
                            return new ci2.d(eVar, aVar, b13, ((d1) ((b1) obj4)).f79456b);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 1:
                b3 b3Var2 = (b3) obj3;
                try {
                    c0.d.M2("gatingService");
                    ih2.a aVar2 = (ih2.a) b3Var2.f79441a.a(b3Var2, b3.f79440h[0]);
                    c0.d.N();
                    v2 v2Var2 = (v2) obj;
                    try {
                        c0.d.M2("sessionEnvelopeSource");
                        y2 y2Var2 = (y2) v2Var2;
                        hh2.a aVar3 = (hh2.a) y2Var2.f79754d.a(y2Var2, y2.f79750l[3]);
                        c0.d.N();
                        return new ci2.e(aVar2, aVar3, ((c) ((a) obj4)).a(), ((s2) ((q2) obj2)).a());
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 2:
                mh2.m a13 = ((i1) ((h1) obj2)).a();
                y2 y2Var3 = (y2) ((v2) obj);
                y2Var3.getClass();
                return new di2.l(((s2) ((q2) obj4)).a(), (jg2.d) obj3, a13, (gg2.e) y2Var3.f79760j.a(y2Var3, y2.f79750l[9]));
            case 3:
                m172invoke();
                return Unit.f80348a;
            default:
                m172invoke();
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(a aVar, q2 q2Var, b3 b3Var, v2 v2Var) {
        super(0);
        this.f79430i = 1;
        this.f79433l = aVar;
        this.f79434m = q2Var;
        this.f79431j = b3Var;
        this.f79432k = v2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(q2 q2Var, jg2.d dVar, h1 h1Var, v2 v2Var) {
        super(0);
        this.f79430i = 2;
        this.f79433l = q2Var;
        this.f79431j = dVar;
        this.f79434m = h1Var;
        this.f79432k = v2Var;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m172invoke() {
        int i13 = this.f79430i;
        Object obj = this.f79431j;
        Object obj2 = this.f79434m;
        Object obj3 = this.f79432k;
        Object obj4 = this.f79433l;
        switch (i13) {
            case 3:
                ((xh2.b) obj4).f134988a.h(obj, (Class) obj3, (OutputStream) obj2);
                break;
            default:
                ((xh2.b) obj4).f134988a.e(obj, (Type) obj3, (OutputStream) obj2);
                break;
        }
    }
}
