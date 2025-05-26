package ads_mobile_sdk;

import android.view.View;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class iq1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l21 f6520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh0 f6522c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq1(l21 l21Var, View view, xh0 xh0Var, String str) {
        super(0);
        this.f6520a = l21Var;
        this.f6521b = view;
        this.f6522c = xh0Var;
        this.f6523d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        l21 l21Var = this.f6520a;
        View view = this.f6521b;
        xh0 xh0Var = this.f6522c;
        String str = this.f6523d;
        Iterator it = l21Var.f7624e.values().iterator();
        while (it.hasNext()) {
            t3 t3Var = (t3) ((a.e9) it.next());
            if (!t3Var.f11331f) {
                t3Var.f11327b.a(view, xh0Var, str);
            }
        }
        l21Var.f7625f.a(view, xh0Var, str);
        return Unit.f80348a;
    }
}
