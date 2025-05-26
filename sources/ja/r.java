package ja;

import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75258b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f75259c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f75260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s tracker, t delegate) {
        super(delegate.f75253a);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f75259c = tracker;
        this.f75260d = new WeakReference(delegate);
    }

    @Override // ja.p
    public final void b(Set tables) {
        int i13 = this.f75258b;
        Object obj = this.f75259c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(tables, "tables");
                p pVar = (p) ((WeakReference) this.f75260d).get();
                if (pVar != null) {
                    pVar.b(tables);
                    break;
                } else {
                    ((s) obj).d(this);
                    break;
                }
            default:
                uj2.i iVar = (uj2.i) obj;
                if (!((gk2.l) iVar).f65491b.isDisposed()) {
                    iVar.c(j0.f75246a);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(sp2.i iVar, String[] strArr, gk2.l lVar) {
        super(strArr);
        this.f75260d = iVar;
        this.f75259c = lVar;
    }
}
