package e10;

import android.util.SparseArray;
import com.pinterest.shuffles.scene.composer.y;
import java.util.Map;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;
import nt.c2;
import r72.z1;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements UnaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56774c;

    public /* synthetic */ e(int i13, Object obj, Object obj2) {
        this.f56772a = i13;
        this.f56773b = obj;
        this.f56774c = obj2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i13 = this.f56772a;
        Object obj2 = this.f56774c;
        Object obj3 = this.f56773b;
        switch (i13) {
            case 0:
                g this$0 = (g) obj3;
                f this$1 = (f) obj2;
                xj2.c cVar = (xj2.c) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                if (cVar != null && !cVar.isDisposed()) {
                    cVar.dispose();
                }
                return this$0.f56786d.c(new c2(this$1, 4), this$0.f56783a, this$0.f56784b);
            default:
                Map sceneItemToShuffleItem = (Map) obj3;
                y this$02 = (y) obj2;
                ke2.d dVar = (ke2.d) obj;
                Intrinsics.checkNotNullParameter(sceneItemToShuffleItem, "$sceneItemToShuffleItem");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                z1 z1Var = (z1) sceneItemToShuffleItem.get(dVar);
                if (z1Var == null) {
                    return dVar;
                }
                ke2.d k13 = this$02.k(z1Var);
                Intrinsics.f(dVar);
                SparseArray sparseArray = dVar.f79321c;
                int size = sparseArray.size();
                int[] iArr = new int[size];
                for (int i14 = 0; i14 < size; i14++) {
                    iArr[i14] = sparseArray.keyAt(i14);
                }
                for (int i15 = 0; i15 < size; i15++) {
                    int i16 = iArr[i15];
                    SparseArray sparseArray2 = k13.f79321c;
                    Object obj4 = sparseArray2.get(i16);
                    if (obj4 == null) {
                        obj4 = null;
                    }
                    if (obj4 == null) {
                        Object obj5 = sparseArray.get(i16);
                        sparseArray2.put(i16, obj5 != null ? obj5 : null);
                    }
                }
                return k13;
        }
    }
}
