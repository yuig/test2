package tj0;

import android.content.Context;
import com.pinterest.feature.board.common.newideas.view.OneTapSaveCarouselPinView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117868i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f117869j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ yq0.z f117870k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f117871l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, yq0.z zVar, h hVar) {
        super(0);
        this.f117869j = context;
        this.f117870k = zVar;
        this.f117871l = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f117868i;
        Context context = this.f117869j;
        h hVar = this.f117871l;
        yq0.z zVar = this.f117870k;
        switch (i13) {
            case 0:
                b0 b0Var = hVar.R0;
                if (b0Var == null) {
                    Intrinsics.r("oneTapSavePinVideoGridCellFactory");
                    throw null;
                }
                return b0Var.a(context, hVar.s7(), m60.f0.i0(hVar.W8().f103320a), zVar.f139760f);
            default:
                return new OneTapSaveCarouselPinView(context, zVar.f139760f, hVar.s7(), hVar.p7());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Context context, yq0.z zVar) {
        super(0);
        this.f117871l = hVar;
        this.f117869j = context;
        this.f117870k = zVar;
    }
}
