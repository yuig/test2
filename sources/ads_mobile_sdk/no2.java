package ads_mobile_sdk;

import a.w0;
import ao2.j0;
import com.google.android.gms.ads.AdError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import wi.s;

/* loaded from: classes2.dex */
public final class no2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f8897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qo2 f8898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ao2.m f8899c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no2(w0 w0Var, qo2 qo2Var, ao2.m mVar, bl2.c cVar) {
        super(2, cVar);
        this.f8897a = w0Var;
        this.f8898b = qo2Var;
        this.f8899c = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new no2(this.f8897a, this.f8898b, this.f8899c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((no2) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        try {
            w0 w0Var = this.f8897a;
            if (w0Var instanceof u91) {
                qo2 qo2Var = this.f8898b;
                qo2Var.f10203j.a(qo2Var.f12270h, qo2Var.f12268f, w0Var, new mo2(qo2Var, this.f8899c));
            } else if (w0Var instanceof ic2) {
                qo2 qo2Var2 = this.f8898b;
                qo2Var2.f10204k.a(qo2Var2.f12270h, qo2Var2.f12268f, w0Var, new mo2(qo2Var2, this.f8899c));
            } else if (w0Var instanceof gq1) {
                a.w6 w6Var = (a.w6) this.f8898b.f10205l.get();
                qo2 qo2Var3 = this.f8898b;
                w6Var.a(qo2Var3.f12270h, qo2Var3.f12268f, this.f8897a, new mo2(qo2Var3, this.f8899c));
            }
        } catch (Throwable th3) {
            ao2.m mVar = this.f8899c;
            int value = yx0.f14443a.a().getValue();
            String message = th3.getMessage();
            if (message == null) {
                message = th3.toString();
            }
            mk0 mk0Var = new mk0(new s(value, message, AdError.GOOGLE_MOBILE_ADS_DOMAIN));
            xk2.q qVar = xk2.s.f135225b;
            mVar.resumeWith(mk0Var);
        }
        return Unit.f80348a;
    }
}
