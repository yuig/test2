package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 extends androidx.recyclerview.widget.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f138169b;

    public e1(int i13) {
        this.f138169b = i13;
    }

    @Override // androidx.recyclerview.widget.a0
    public final boolean b(Object obj, Object obj2) {
        switch (this.f138169b) {
            case 0:
                m62.e oldItem = (m62.e) obj;
                m62.e newItem = (m62.e) obj2;
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            case 1:
                m62.n oldItem2 = (m62.n) obj;
                m62.n newItem2 = (m62.n) obj2;
                Intrinsics.checkNotNullParameter(oldItem2, "oldItem");
                Intrinsics.checkNotNullParameter(newItem2, "newItem");
                return Intrinsics.d(oldItem2, newItem2);
            case 2:
                m62.i oldItem3 = (m62.i) obj;
                m62.i newItem3 = (m62.i) obj2;
                Intrinsics.checkNotNullParameter(oldItem3, "oldItem");
                Intrinsics.checkNotNullParameter(newItem3, "newItem");
                return Intrinsics.d(oldItem3, newItem3);
            case 3:
                m62.h1 oldItem4 = (m62.h1) obj;
                m62.h1 newItem4 = (m62.h1) obj2;
                Intrinsics.checkNotNullParameter(oldItem4, "oldItem");
                Intrinsics.checkNotNullParameter(newItem4, "newItem");
                return Intrinsics.d(oldItem4, newItem4);
            default:
                m62.k1 oldItem5 = (m62.k1) obj;
                m62.k1 newItem5 = (m62.k1) obj2;
                Intrinsics.checkNotNullParameter(oldItem5, "oldItem");
                Intrinsics.checkNotNullParameter(newItem5, "newItem");
                return Intrinsics.d(oldItem5, newItem5);
        }
    }

    @Override // androidx.recyclerview.widget.a0
    public final boolean d(Object obj, Object obj2) {
        switch (this.f138169b) {
            case 0:
                m62.e oldItem = (m62.e) obj;
                m62.e newItem = (m62.e) obj2;
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.a(), newItem.a());
            case 1:
                m62.n oldItem2 = (m62.n) obj;
                m62.n newItem2 = (m62.n) obj2;
                Intrinsics.checkNotNullParameter(oldItem2, "oldItem");
                Intrinsics.checkNotNullParameter(newItem2, "newItem");
                return Intrinsics.d(oldItem2.a(), newItem2.a());
            case 2:
                m62.i oldItem3 = (m62.i) obj;
                m62.i newItem3 = (m62.i) obj2;
                Intrinsics.checkNotNullParameter(oldItem3, "oldItem");
                Intrinsics.checkNotNullParameter(newItem3, "newItem");
                return Intrinsics.d(oldItem3.f86011a.a(), newItem3.f86011a.a());
            case 3:
                m62.h1 oldItem4 = (m62.h1) obj;
                m62.h1 newItem4 = (m62.h1) obj2;
                Intrinsics.checkNotNullParameter(oldItem4, "oldItem");
                Intrinsics.checkNotNullParameter(newItem4, "newItem");
                return oldItem4.a() == newItem4.a();
            default:
                m62.k1 oldItem5 = (m62.k1) obj;
                m62.k1 newItem5 = (m62.k1) obj2;
                Intrinsics.checkNotNullParameter(oldItem5, "oldItem");
                Intrinsics.checkNotNullParameter(newItem5, "newItem");
                return Intrinsics.d(oldItem5.f86026a.f78436a.f106489a, newItem5.f86026a.f78436a.f106489a);
        }
    }
}
