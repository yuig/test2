package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class b1 implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f16807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r4.i f16808b;

    public b1(r4.i iVar, boolean z13) {
        this.f16807a = z13;
        this.f16808b = iVar;
    }

    @Override // g0.c
    public final void onFailure(Throwable th3) {
        boolean z13 = th3 instanceof TimeoutException;
        r4.i iVar = this.f16808b;
        if (z13) {
            iVar.d(th3);
        } else {
            iVar.b(Collections.emptyList());
        }
    }

    @Override // g0.c
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        if (this.f16807a) {
            arrayList.removeAll(Collections.singleton(null));
        }
        this.f16808b.b(arrayList);
    }
}
