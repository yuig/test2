package vn2;

import kotlin.collections.k1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends kotlin.collections.d {

    /* renamed from: c, reason: collision with root package name */
    public int f126308c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f126309d;

    public b(c cVar) {
        this.f126309d = cVar;
    }

    @Override // kotlin.collections.d
    public final void b() {
        int i13;
        Object[] objArr;
        do {
            i13 = this.f126308c + 1;
            this.f126308c = i13;
            objArr = this.f126309d.f126311a;
            if (i13 >= objArr.length) {
                break;
            }
        } while (objArr[i13] == null);
        if (i13 >= objArr.length) {
            this.f80357a = k1.Done;
            return;
        }
        Object obj = objArr[i13];
        Intrinsics.g(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.f80358b = obj;
        this.f80357a = k1.Ready;
    }
}
