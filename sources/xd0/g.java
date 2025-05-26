package xd0;

import android.graphics.Matrix;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.pu;
import com.pinterest.api.model.so;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.y6;
import java.text.SimpleDateFormat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nm.o;
import nm.p;

/* loaded from: classes.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134617i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f134618j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(0);
        this.f134617i = i13;
        this.f134618j = hVar;
    }

    public final o b() {
        int i13 = this.f134617i;
        h hVar = this.f134618j;
        switch (i13) {
            case 0:
                hVar.f134619a.getClass();
                p pVar = new p();
                pVar.b(new i22.a(), tp.class);
                pVar.b(new eg1.b(), so.class);
                try {
                    new SimpleDateFormat("MMM dd, yyyy, hh:mm:ss");
                    pVar.f91351h = "MMM dd, yyyy, hh:mm:ss";
                    o a13 = pVar.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "create(...)");
                    return a13;
                } catch (IllegalArgumentException e13) {
                    throw new IllegalArgumentException("The date pattern 'MMM dd, yyyy, hh:mm:ss' is not valid", e13);
                }
            default:
                hVar.f134619a.getClass();
                p pVar2 = new p();
                pVar2.b(new eg1.e(), pu.class);
                pVar2.b(new eg1.g(), k01.class);
                pVar2.b(new eg1.f(), d30.class);
                pVar2.b(new eg1.a(), y6.class);
                pVar2.b(new eg1.d(), Matrix.class);
                pVar2.b(new eg1.c(), so.class);
                o a14 = pVar2.a();
                Intrinsics.checkNotNullExpressionValue(a14, "create(...)");
                return a14;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f134617i) {
        }
        return b();
    }
}
