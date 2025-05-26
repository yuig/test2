package eh0;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58926i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f58927j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i13) {
        super(0);
        this.f58926i = i13;
        this.f58927j = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f58926i) {
            case 0:
                m134invoke();
                break;
            default:
                m134invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m134invoke() {
        int i13 = this.f58926i;
        i iVar = this.f58927j;
        switch (i13) {
            case 0:
                h onDismissListener = iVar.f58932g0;
                Intrinsics.checkNotNullParameter(onDismissListener, "onDismissListener");
                HashSet hashSet = iVar.f87106y;
                if (hashSet != null) {
                    hashSet.remove(onDismissListener);
                }
                iVar.M6();
                jf2.c cVar = iVar.f58931f0;
                if (cVar == null) {
                    Intrinsics.r("rendering");
                    throw null;
                }
                ((b) cVar.f75877f).f58916b.invoke();
                return;
            default:
                h onDismissListener2 = iVar.f58932g0;
                Intrinsics.checkNotNullParameter(onDismissListener2, "onDismissListener");
                HashSet hashSet2 = iVar.f87106y;
                if (hashSet2 != null) {
                    hashSet2.remove(onDismissListener2);
                }
                iVar.M6();
                jf2.c cVar2 = iVar.f58931f0;
                if (cVar2 == null) {
                    Intrinsics.r("rendering");
                    throw null;
                }
                b bVar = (b) cVar2.f75878g;
                if (bVar != null) {
                    bVar.f58916b.invoke();
                    return;
                }
                return;
        }
    }
}
