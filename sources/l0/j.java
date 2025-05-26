package l0;

import g1.o0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements p5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81232a;

    /* renamed from: b, reason: collision with root package name */
    public Object f81233b;

    public j() {
        this.f81232a = 0;
    }

    public final void a(m5.e eVar) {
        switch (this.f81232a) {
            case 1:
                if (eVar == null) {
                    eVar = new m5.e(-3);
                }
                ((sp2.i) this.f81233b).W(eVar);
                return;
            default:
                synchronized (m5.f.f85853c) {
                    try {
                        o0 o0Var = m5.f.f85854d;
                        ArrayList arrayList = (ArrayList) o0Var.get((String) this.f81233b);
                        if (arrayList == null) {
                            return;
                        }
                        o0Var.remove((String) this.f81233b);
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            ((p5.a) arrayList.get(i13)).accept(eVar);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // p5.a
    public final void accept(Object obj) {
        switch (this.f81232a) {
            case 0:
                Intrinsics.g((p5.a) this.f81233b, "Listener is not set.");
                ((p5.a) this.f81233b).accept(obj);
                break;
            case 1:
                a((m5.e) obj);
                break;
            default:
                a((m5.e) obj);
                break;
        }
    }

    public /* synthetic */ j(Object obj, int i13) {
        this.f81232a = i13;
        this.f81233b = obj;
    }
}
