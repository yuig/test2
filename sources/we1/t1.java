package we1;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ re1.e f129614i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(re1.e eVar) {
        super(1);
        this.f129614i = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yl1.b it = (yl1.b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        int generateViewId = View.generateViewId();
        String str = this.f129614i.f107573a;
        if (str == null) {
            str = "";
        }
        return yl1.b.f(it, bs1.c.h2(str), false, null, null, null, null, null, null, generateViewId, null, 766);
    }
}
