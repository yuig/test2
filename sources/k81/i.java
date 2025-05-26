package k81;

import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import m60.x0;
import wt1.c0;
import wt1.p;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78601i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i81.d f78602j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(i81.d dVar, int i13) {
        super(1);
        this.f78601i = i13;
        this.f78602j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tl1.i iVar;
        CharSequence text;
        String msg;
        int i13 = this.f78601i;
        i81.d dVar = this.f78602j;
        switch (i13) {
            case 0:
                c0 c0Var = (c0) obj;
                if (c0Var instanceof wt1.i) {
                    String message = ((wt1.i) c0Var).f131121c.getMessage();
                    msg = message != null ? message : "";
                    l81.l lVar = (l81.l) dVar;
                    lVar.getClass();
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    i92.k kVar = lVar.f82152c1;
                    if (kVar == null) {
                        Intrinsics.r("toastUtils");
                        throw null;
                    }
                    kVar.h(x0.generic_error);
                    dx.a aVar = lVar.K2;
                    if (aVar != null) {
                        aVar.e(msg);
                    }
                } else if ((c0Var instanceof p) && (iVar = c0Var.f131096b) != null) {
                    boolean z13 = iVar.f118095a <= 1;
                    GestaltText gestaltText = ((l81.l) dVar).V1;
                    if (gestaltText != null) {
                        gestaltText.setVisibility((z13 && (text = gestaltText.getText()) != null && (z.j(text) ^ true)) ? 0 : 8);
                    }
                }
                return Unit.f80348a;
            default:
                String message2 = ((Throwable) obj).getMessage();
                msg = message2 != null ? message2 : "";
                l81.l lVar2 = (l81.l) dVar;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(msg, "msg");
                i92.k kVar2 = lVar2.f82152c1;
                if (kVar2 == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar2.h(x0.generic_error);
                dx.a aVar2 = lVar2.K2;
                if (aVar2 != null) {
                    aVar2.e(msg);
                }
                return Unit.f80348a;
        }
    }
}
