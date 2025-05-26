package v71;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nm.o;
import nm.p;
import z71.i;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124390i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f124391j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(0);
        this.f124390i = i13;
        this.f124391j = cVar;
    }

    public final o b() {
        int i13 = this.f124390i;
        c cVar = this.f124391j;
        switch (i13) {
            case 0:
                cVar.f124392a.getClass();
                p pVar = new p();
                pVar.b(new b81.b(), i.class);
                o a13 = pVar.a();
                Intrinsics.checkNotNullExpressionValue(a13, "create(...)");
                return a13;
            default:
                cVar.f124392a.getClass();
                p pVar2 = new p();
                pVar2.b(new b81.a(), Bitmap.class);
                pVar2.b(new c81.a(), Matrix.class);
                o a14 = pVar2.a();
                Intrinsics.checkNotNullExpressionValue(a14, "create(...)");
                return a14;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f124390i) {
        }
        return b();
    }
}
