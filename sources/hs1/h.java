package hs1;

import android.os.Looper;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f70046r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, bl2.c cVar) {
        super(2, cVar);
        this.f70046r = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f70046r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        com.bumptech.glide.b bVar = this.f70046r.f70060j;
        if (bVar != null) {
            char[] cArr = he.n.f68959a;
            if (!(!(Looper.myLooper() == Looper.getMainLooper()))) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
            bVar.f29740a.f99760f.a().clear();
        }
        return Unit.f80348a;
    }
}
