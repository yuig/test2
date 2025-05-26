package mu0;

import androidx.recyclerview.widget.b2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88294i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f88295j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f88296k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j jVar, int i13, int i14) {
        super(1);
        this.f88294i = i14;
        this.f88295j = jVar;
        this.f88296k = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f88294i;
        int i14 = this.f88296k;
        j jVar = this.f88295j;
        switch (i13) {
            case 0:
                String imagePath = (String) obj;
                Intrinsics.checkNotNullParameter(imagePath, "imagePath");
                ku0.a aVar = (ku0.a) jVar.f88314k.getItem(i14);
                if (aVar != null) {
                    String draftDescription = aVar.f80893f;
                    Intrinsics.checkNotNullParameter(draftDescription, "draftDescription");
                    Function0 onClickCallback = aVar.f80894g;
                    Intrinsics.checkNotNullParameter(onClickCallback, "onClickCallback");
                    Function1 onDeleteCallback = aVar.f80895h;
                    Intrinsics.checkNotNullParameter(onDeleteCallback, "onDeleteCallback");
                    Function1 onDraftCoverMissing = aVar.f80896i;
                    Intrinsics.checkNotNullParameter(onDraftCoverMissing, "onDraftCoverMissing");
                    jVar.f88314k.u1(i14, new ku0.a(aVar.f80888a, aVar.f80889b, imagePath, aVar.f80891d, aVar.f80892e, draftDescription, onClickCallback, onDeleteCallback, onDraftCoverMissing));
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                Intrinsics.f(bool);
                if (bool.booleanValue()) {
                    gd0.g gVar = jVar.f88314k;
                    gVar.removeItem(i14);
                    ((nu0.i) ((iu0.a) jVar.getView())).X8(gVar.a(), gVar.z());
                    Object adapter = jVar.getAdapter();
                    if (adapter != null) {
                        ((b2) adapter).l(i14, gVar.a());
                    }
                }
                break;
        }
        return Unit.f80348a;
    }
}
