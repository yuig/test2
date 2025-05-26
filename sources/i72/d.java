package i72;

import android.graphics.Bitmap;
import android.graphics.Rect;
import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bitmap f71683r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Rect f71684s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Bitmap bitmap, Rect rect, bl2.c cVar) {
        super(2, cVar);
        this.f71683r = bitmap;
        this.f71684s = rect;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f71683r, this.f71684s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        Rect rect = this.f71684s;
        return Bitmap.createBitmap(this.f71683r, rect.left, rect.top, rect.width(), rect.height());
    }
}
