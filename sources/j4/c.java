package j4;

import android.graphics.Typeface;
import com.pinterest.api.model.f30;
import g4.y;
import g4.z;
import k11.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import x02.c2;

/* loaded from: classes3.dex */
public final class c extends s implements kl2.m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74557i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f74558j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i13) {
        super(4);
        this.f74557i = i13;
        this.f74558j = obj;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13 = this.f74557i;
        Object obj5 = this.f74558j;
        switch (i13) {
            case 0:
                int i14 = ((g4.j) obj3).f63465a;
                int i15 = ((g4.k) obj4).f63466a;
                d dVar = (d) obj5;
                z b13 = ((g4.f) dVar.f74563e).b((g4.e) obj, (g4.l) obj2, i14, i15);
                if (b13 instanceof y) {
                    Object obj6 = ((y) b13).f63486a;
                    Intrinsics.g(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj6;
                }
                androidx.appcompat.app.d dVar2 = new androidx.appcompat.app.d(b13, dVar.f74568j);
                dVar.f74568j = dVar2;
                Object obj7 = dVar2.f15968d;
                Intrinsics.g(obj7, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj7;
            default:
                f30 pin = (f30) obj;
                c2 params = (c2) obj2;
                ak2.e onSuccess = (ak2.e) obj3;
                ak2.e onFail = (ak2.e) obj4;
                Intrinsics.checkNotNullParameter(pin, "pin");
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
                Intrinsics.checkNotNullParameter(onFail, "onFail");
                ((p) obj5).f78165d.a(pin, params, onSuccess, onFail);
                return Unit.f80348a;
        }
    }
}
