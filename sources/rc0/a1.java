package rc0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107260i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f107261j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f107262k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f107263l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f107264m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f107265n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f107266o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(i11.q qVar, f30 f30Var, String str, int i13, List list, wy0 wy0Var) {
        super(1);
        this.f107260i = 2;
        this.f107261j = qVar;
        this.f107262k = f30Var;
        this.f107263l = str;
        this.f107265n = i13;
        this.f107264m = list;
        this.f107266o = wy0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String uid;
        int i13 = this.f107260i;
        Object obj2 = this.f107266o;
        Object obj3 = this.f107263l;
        Object obj4 = this.f107262k;
        Object obj5 = this.f107261j;
        switch (i13) {
            case 0:
                an1.l it = (an1.l) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return an1.l.e(it, (u50.i0) obj5, (u50.i0) obj4, (u50.i0) obj3, this.f107264m, this.f107265n, null, (u50.i0) obj2, 160);
            case 1:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltRadioGroup t13 = new GestaltRadioGroup(6, context, (AttributeSet) null).t(new a1((u50.i0) obj5, (u50.i0) obj4, (u50.i0) obj3, this.f107264m, this.f107265n, (u50.i0) obj2, 0));
                kh2.r.p(t13, an1.c.E);
                return t13;
            default:
                f30 f30Var = (f30) obj;
                i11.q qVar = (i11.q) obj5;
                f30 f30Var2 = (f30) obj4;
                String str = (String) obj3;
                String str2 = "";
                String str3 = str == null ? "" : str;
                boolean z13 = str == null;
                uk1.d presenterPinalytics = qVar.getPresenterPinalytics();
                Intrinsics.g(presenterPinalytics, "null cannot be cast to non-null type com.pinterest.feature.pin.create.analytics.BoardPickerPinalytics");
                ((g11.a) presenterPinalytics).b(f30Var2, f30Var, str3, this.f107265n, z13, this.f107264m, qVar.f71023x, qVar.f71024y);
                if (str == null) {
                    wy0 wy0Var = (wy0) obj2;
                    if (wy0Var != null && (uid = wy0Var.getUid()) != null) {
                        str2 = uid;
                    }
                    m22.d.a(new m22.c(str2));
                }
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(u50.i0 i0Var, u50.i0 i0Var2, u50.i0 i0Var3, List list, int i13, u50.i0 i0Var4, int i14) {
        super(1);
        this.f107260i = i14;
        this.f107261j = i0Var;
        this.f107262k = i0Var2;
        this.f107263l = i0Var3;
        this.f107264m = list;
        this.f107265n = i13;
        this.f107266o = i0Var4;
    }
}
