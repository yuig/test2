package xa0;

import android.graphics.Bitmap;
import ao2.j0;
import ao2.v0;
import com.pinterest.api.model.fi0;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f134418r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f134419s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fi0 f134420t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ WebImageView f134421u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, fi0 fi0Var, WebImageView webImageView, bl2.c cVar) {
        super(2, cVar);
        this.f134419s = pVar;
        this.f134420t = fi0Var;
        this.f134421u = webImageView;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f134419s, this.f134420t, this.f134421u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f134418r;
        if (i13 == 0) {
            ue.c.H(obj);
            a82.b bVar = this.f134419s.f134423a;
            this.f134418r = 1;
            bVar.getClass();
            ko2.f fVar = v0.f20219a;
            obj = kotlin.jvm.internal.j.M(this, ko2.e.f80326c, new a82.a(345, bVar, this.f134420t, null));
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f134421u.setImageBitmap((Bitmap) obj);
        return Unit.f80348a;
    }
}
