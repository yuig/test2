package r81;

import androidx.recyclerview.widget.a0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f106754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f106755c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f106756d;

    public /* synthetic */ b(List list, List list2, Set set, int i13) {
        this.f106753a = i13;
        this.f106754b = list;
        this.f106755c = list2;
        this.f106756d = set;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f106753a;
        Set forceInvalidateNewPositions = this.f106756d;
        List newList = this.f106755c;
        List oldList = this.f106754b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(oldList, "$oldList");
                Intrinsics.checkNotNullParameter(newList, "$newList");
                Intrinsics.checkNotNullParameter(forceInvalidateNewPositions, "$forceInvalidateNewPositions");
                break;
            default:
                Intrinsics.checkNotNullParameter(oldList, "$oldList");
                Intrinsics.checkNotNullParameter(newList, "$newList");
                Intrinsics.checkNotNullParameter(forceInvalidateNewPositions, "$forceInvalidateNewPositions");
                break;
        }
        return b0.j(a0.e(new xk1.a(oldList, newList, forceInvalidateNewPositions)));
    }
}
