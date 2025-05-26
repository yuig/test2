package lb1;

import com.pinterest.api.model.wy0;
import com.pinterest.error.NetworkResponseError;
import da1.c;
import i92.k;
import kb1.e;
import kb1.f;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import m60.x0;
import qz.d;
import rq.y;
import u50.r;
import v.f1;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82736i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f82737j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r f82738k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, r rVar, int i13) {
        super(1);
        this.f82736i = i13;
        this.f82737j = cVar;
        this.f82738k = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f1 f1Var;
        d M;
        String e13;
        int i13 = this.f82736i;
        r rVar = this.f82738k;
        c cVar = this.f82737j;
        switch (i13) {
            case 0:
                ((b60.b) cVar.f54232e).a(new y(10, (wy0) obj));
                rVar.a(f.f79071a);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                cVar.getClass();
                NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                Object obj2 = cVar.f54233f;
                if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null && (M = k3.M(f1Var)) != null && (e13 = M.e()) != null) {
                    String str = z.j(e13) ^ true ? e13 : null;
                    if (str != null) {
                        ((k) obj2).i(str);
                        rVar.a(e.f79070a);
                        break;
                    }
                }
                ((k) obj2).h(x0.generic_error);
                rVar.a(e.f79070a);
                break;
        }
        return Unit.f80348a;
    }
}
