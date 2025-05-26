package rc0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107272i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CharSequence f107273j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ vn1.g f107274k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ vn1.c f107275l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f107276m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ rn1.b f107277n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f107278o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(CharSequence charSequence, vn1.g gVar, vn1.c cVar, List list, rn1.b bVar, int i13, int i14) {
        super(1);
        this.f107272i = i14;
        this.f107273j = charSequence;
        this.f107274k = gVar;
        this.f107275l = cVar;
        this.f107276m = list;
        this.f107277n = bVar;
        this.f107278o = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f107272i) {
            case 0:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f(this.f107273j);
                bind.h(this.f107274k);
                bind.b(this.f107275l);
                bind.d(this.f107276m);
                bind.c(this.f107277n);
                bind.f108891f = this.f107278o;
                return Unit.f80348a;
            default:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                pp2.a.k(gestaltText, new b1(this.f107273j, this.f107274k, this.f107275l, this.f107276m, this.f107277n, this.f107278o, 0));
                return gestaltText;
        }
    }
}
