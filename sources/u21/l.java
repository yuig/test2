package u21;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.appcompat.widget.c2;
import ao2.j0;
import com.pinterest.api.model.y40;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f120099r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f120100s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, a0 a0Var, bl2.c cVar) {
        super(2, cVar);
        this.f120099r = oVar;
        this.f120100s = a0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f120099r, this.f120100s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        y yVar = (y) this.f120100s;
        Context context = yVar.f120129a;
        Bitmap bitmap = yVar.f120130b;
        o oVar = this.f120099r;
        rw0.f fVar = oVar.f120105b;
        if (bitmap != null) {
            String str = "pin_or_spin_reward_" + System.currentTimeMillis();
            fVar.getClass();
            uri = rw0.f.a(context, bitmap, str);
        } else {
            uri = null;
        }
        Uri uri2 = uri;
        if (uri2 != null) {
            y40 pinOrSpin = oVar.f120108e.f127651i;
            int value = y32.f.UNKNOWN.getValue();
            c2 c2Var = oVar.f120106c;
            c2Var.getClass();
            Intrinsics.checkNotNullParameter(pinOrSpin, "pinOrSpin");
            e0.t.f56747e = value;
            ((m60.w) c2Var.f16532c).d(new jc0.v(c2.h(c2Var, pinOrSpin, value, null, null, null, uri2, 28), false, 0L, 30));
        }
        return Unit.f80348a;
    }
}
