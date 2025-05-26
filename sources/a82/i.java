package a82;

import android.graphics.Bitmap;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import yq1.d1;

/* loaded from: classes4.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f1546r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f1547s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f1547s = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f1547s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f1546r;
        j jVar = this.f1547s;
        if (i13 == 0) {
            ue.c.H(obj);
            x72.j jVar2 = jVar.f1548a;
            this.f1546r = 1;
            obj = bs1.c.y2(600L, new z72.a(jVar2, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            jVar.f1549b.setImageBitmap(bitmap);
            ge.d dVar = jVar.f1556i;
            if (dVar != null) {
                jVar.f1557j.g(dVar, new d1(bitmap, 6));
            }
        }
        return Unit.f80348a;
    }
}
