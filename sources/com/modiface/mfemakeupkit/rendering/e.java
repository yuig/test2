package com.modiface.mfemakeupkit.rendering;

import com.modiface.mfemakeupkit.rendering.a;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f34577a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.o f34578b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.modiface.mfemakeupkit.utils.d f34579c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f34580d;

    public e(a aVar, ArrayList arrayList, a.o oVar, com.modiface.mfemakeupkit.utils.d dVar) {
        this.f34580d = aVar;
        this.f34577a = arrayList;
        this.f34578b = oVar;
        this.f34579c = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f34577a.add(new Throwable("render thread is not setup for applying makeup"));
        this.f34578b.a(false, this.f34577a, this.f34579c, null);
    }
}
