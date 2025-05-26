package w21;

import i2.v3;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127799i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j3.a f127800j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f127801k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127802l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127803m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y1 f127804n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127805o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v3 f127806p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(j3.a aVar, ao2.j0 j0Var, i2.q1 q1Var, i2.q1 q1Var2, y1 y1Var, i2.q1 q1Var3, v3 v3Var, int i13) {
        super(1);
        this.f127799i = i13;
        this.f127800j = aVar;
        this.f127801k = j0Var;
        this.f127802l = q1Var;
        this.f127803m = q1Var2;
        this.f127804n = y1Var;
        this.f127805o = q1Var3;
        this.f127806p = v3Var;
    }

    public final void b(long j13) {
        ao2.j0 j0Var = this.f127801k;
        int i13 = this.f127799i;
        j3.a aVar = this.f127800j;
        i2.q1 q1Var = this.f127803m;
        i2.q1 q1Var2 = this.f127802l;
        switch (i13) {
            case 0:
                TreeMap treeMap = e1.f127681a;
                if (((Integer) q1Var2.getValue()) == null) {
                    e eVar = ((z1) q1Var.getValue()).f127888a;
                    e eVar2 = e.Initial;
                    if (eVar == eVar2 || ((z1) q1Var.getValue()).f127889b == eVar2) {
                        ((j3.b) aVar).a(0);
                        if (((z1) q1Var.getValue()).f127888a == eVar2) {
                            q1Var.setValue(z1.a((z1) q1Var.getValue(), e.Expanded, null, 2));
                            q1Var2.setValue(0);
                            kotlin.jvm.internal.j.z(j0Var, null, null, new r0(this.f127804n, this.f127803m, this.f127802l, this.f127805o, this.f127806p, null), 3);
                            break;
                        }
                    }
                }
                break;
            default:
                TreeMap treeMap2 = e1.f127681a;
                if (((Integer) q1Var2.getValue()) == null) {
                    e eVar3 = ((z1) q1Var.getValue()).f127888a;
                    e eVar4 = e.Initial;
                    if (eVar3 == eVar4 || ((z1) q1Var.getValue()).f127889b == eVar4) {
                        ((j3.b) aVar).a(0);
                        if (((z1) q1Var.getValue()).f127889b == eVar4) {
                            q1Var.setValue(z1.a((z1) q1Var.getValue(), null, e.Expanded, 1));
                            q1Var2.setValue(1);
                            kotlin.jvm.internal.j.z(j0Var, null, null, new v0(this.f127804n, this.f127803m, this.f127802l, this.f127805o, this.f127806p, null), 3);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f127799i) {
            case 0:
                b(((a3.c) obj).f482a);
                break;
            default:
                b(((a3.c) obj).f482a);
                break;
        }
        return Unit.f80348a;
    }
}
