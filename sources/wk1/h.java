package wk1;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130153i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f130154j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f130155k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i13, int i14, i iVar) {
        super(1);
        this.f130153i = i13;
        this.f130154j = iVar;
        this.f130155k = i14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i iVar = this.f130154j;
        int i13 = this.f130153i;
        if (i13 != 0) {
            Iterator it = iVar.f130156a.subList(0, i13).iterator();
            while (it.hasNext()) {
                ((e) it.next()).J1();
            }
        }
        int i14 = i13 + 1;
        int i15 = this.f130155k;
        if (i14 < i15) {
            Iterator it2 = iVar.f130156a.subList(i14, i15).iterator();
            while (it2.hasNext()) {
                ((e) it2.next()).J1();
            }
        }
        if (iVar.a() == 0) {
            iVar.c();
        } else {
            p pVar = iVar.f130159d;
            if (pVar != null) {
                pVar.f130173a.triggerLoadMoreCheck();
            }
        }
        return Unit.f80348a;
    }
}
