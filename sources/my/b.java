package my;

import ey.a3;
import ey.q1;
import ey.u1;

/* loaded from: classes.dex */
public abstract class b extends u1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f88473c;

    /* renamed from: d, reason: collision with root package name */
    public final Enum f88474d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(q1 q1Var) {
        this(q1Var, 2);
        this.f88473c = 2;
    }

    @Override // ey.u1
    public final String e() {
        int i13 = this.f88473c;
        Enum r13 = this.f88474d;
        switch (i13) {
            case 0:
                return "api_round_trip";
            case 1:
                return a3.a((s92.i) r13);
            default:
                return ((q1) r13).getSpanName();
        }
    }

    @Override // ey.u1
    public final String g() {
        switch (this.f88473c) {
            case 0:
                String[] strArr = a3.f60429a;
                return a3.a((s92.i) this.f88474d);
            default:
                return null;
        }
    }

    public /* synthetic */ b(Enum r13, int i13) {
        this.f88473c = i13;
        this.f88474d = r13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(s92.i iVar, int i13) {
        this((Enum) iVar, 0);
        this.f88473c = i13;
        int i14 = 1;
        if (i13 != 1) {
        } else {
            this((Enum) iVar, i14);
        }
    }
}
