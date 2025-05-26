package p4;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98838i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f98839j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(t tVar, int i13) {
        super(0);
        this.f98838i = i13;
        this.f98839j = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t tVar = this.f98839j;
        int i13 = this.f98838i;
        switch (i13) {
            case 0:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                tVar.f98840x.saveHierarchyState(sparseArray);
                break;
            case 1:
                switch (i13) {
                    case 1:
                        tVar.B.invoke(tVar.f98840x);
                        r2.l lVar = tVar.f98841y;
                        if (lVar != null) {
                            lVar.a();
                        }
                        tVar.f98841y = null;
                        break;
                    default:
                        tVar.f98842z.invoke(tVar.f98840x);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 1:
                        tVar.B.invoke(tVar.f98840x);
                        r2.l lVar2 = tVar.f98841y;
                        if (lVar2 != null) {
                            lVar2.a();
                        }
                        tVar.f98841y = null;
                        break;
                    default:
                        tVar.f98842z.invoke(tVar.f98840x);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
