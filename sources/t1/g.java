package t1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.r;
import q3.x;

/* loaded from: classes2.dex */
public final /* synthetic */ class g extends p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f115745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f115746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f115747c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, x xVar, Function0 function0) {
        super(0, r.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f115745a = kVar;
        this.f115746b = xVar;
        this.f115747c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return k.M0(this.f115745a, this.f115746b, this.f115747c);
    }
}
