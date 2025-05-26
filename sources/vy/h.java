package vy;

import android.util.Pair;
import com.pinterest.error.NetworkResponseError;
import df.j1;
import java.util.Collections;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import v.f1;

/* loaded from: classes.dex */
public final class h extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f126856j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f126857k = new h(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h f126858l = new h(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h f126859m = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public static final h f126860n = new h(4);

    /* renamed from: o, reason: collision with root package name */
    public static final h f126861o = new h(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126862i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f126862i = i13;
    }

    public final void b(Throwable throwable) {
        switch (this.f126862i) {
            case 0:
                String localizedMessage = throwable.getLocalizedMessage();
                NetworkResponseError networkResponseError = throwable instanceof NetworkResponseError ? (NetworkResponseError) throwable : null;
                f1 f1Var = networkResponseError != null ? networkResponseError.f45043a : null;
                if (f1Var == null) {
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.h hVar = tb0.g.f117075a;
                    tb0.k kVar = new tb0.k();
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    kVar.a(null, null, throwable);
                    hVar.k("SENDING_LOG_FAILED", kVar.f117102a);
                    break;
                } else {
                    HashSet hashSet2 = tb0.h.f117076w;
                    tb0.g.f117075a.k("SENDING_LOG_FAILED", Collections.singletonList(new Pair("error sending logs", j1.W("%d %s", Integer.valueOf(f1Var.f123449b), localizedMessage))));
                    break;
                }
            case 1:
                throwable.getLocalizedMessage();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f126862i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                break;
            case 3:
                b((Throwable) obj);
                break;
            case 4:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
