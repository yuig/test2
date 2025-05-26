package tj0;

import android.content.Context;
import com.pinterest.feature.board.common.newideas.view.OneTapSaveCarouselPinView;
import com.pinterest.feature.board.common.newideas.view.OneTapSavePinGridFlipContainer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117862i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f117863j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ yq0.z f117864k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f117865l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Context context, yq0.z zVar, d dVar, int i13) {
        super(0);
        this.f117862i = i13;
        this.f117863j = context;
        this.f117864k = zVar;
        this.f117865l = dVar;
    }

    public final OneTapSavePinGridFlipContainer b() {
        int i13 = this.f117862i;
        d dVar = this.f117865l;
        yq0.z zVar = this.f117864k;
        switch (i13) {
            case 2:
                return new OneTapSavePinGridFlipContainer(this.f117863j, false, zVar.f139760f, dVar.s7(), m60.f0.i0(dVar.W8().f103320a));
            default:
                return new OneTapSavePinGridFlipContainer(this.f117863j, true, zVar.f139760f, dVar.s7(), m60.f0.i0(dVar.W8().f103320a));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f117862i;
        Context context = this.f117863j;
        d dVar = this.f117865l;
        yq0.z zVar = this.f117864k;
        switch (i13) {
            case 0:
                b0 b0Var = dVar.R0;
                if (b0Var == null) {
                    Intrinsics.r("oneTapSavePinVideoGridCellFactory");
                    throw null;
                }
                return b0Var.a(context, dVar.s7(), m60.f0.i0(dVar.W8().f103320a), zVar.f139760f);
            case 1:
                return new OneTapSaveCarouselPinView(context, zVar.f139760f, dVar.s7(), dVar.p7());
            case 2:
                return b();
            default:
                return b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Context context, yq0.z zVar) {
        super(0);
        this.f117862i = 0;
        this.f117865l = dVar;
        this.f117863j = context;
        this.f117864k = zVar;
    }
}
