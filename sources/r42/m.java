package r42;

import com.google.android.gms.recaptcha.RecaptchaHandle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106199i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ qi.a f106200j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RecaptchaHandle f106201k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f106202l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kl2.l f106203m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(qi.a aVar, RecaptchaHandle recaptchaHandle, String str, kl2.l lVar, int i13) {
        super(1);
        this.f106199i = i13;
        this.f106200j = aVar;
        this.f106201k = recaptchaHandle;
        this.f106202l = str;
        this.f106203m = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f106199i;
        kl2.l lVar = this.f106203m;
        String str = this.f106202l;
        RecaptchaHandle recaptchaHandle = this.f106201k;
        qi.a aVar = this.f106200j;
        switch (i13) {
            case 0:
                com.pinterest.security.h.a(aVar, recaptchaHandle, str, lVar);
                break;
            default:
                com.pinterest.security.h.a(aVar, recaptchaHandle, str, lVar);
                break;
        }
        return Unit.f80348a;
    }
}
