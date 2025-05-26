package l61;

import com.pinterest.api.model.yy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yk1.i;
import yq0.t;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81600i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f81601j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(1);
        this.f81600i = i13;
        this.f81601j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f81600i;
        f fVar = this.f81601j;
        switch (i13) {
            case 0:
                yy safetyRoot = (yy) obj;
                fVar.f81603b = safetyRoot;
                h hVar = (h) fVar.getView();
                Intrinsics.f(safetyRoot);
                d dVar = (d) hVar;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(safetyRoot, "safetyRoot");
                dVar.f81598y0 = safetyRoot;
                fVar.u3();
                ((t) ((h) fVar.getView())).setLoadState(i.LOADED);
                break;
            default:
                ((t) ((h) fVar.getView())).setLoadState(i.ERROR);
                break;
        }
        return Unit.f80348a;
    }
}
