package ky0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import ek2.j;
import j40.c0;
import j40.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ly0.d;
import pc.h;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81120i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f81121j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(1);
        this.f81120i = i13;
        this.f81121j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool;
        c cVar = this.f81121j;
        int i13 = this.f81120i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        ((d) ((jy0.b) cVar.getView())).b8("", RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD, 354);
                        break;
                    default:
                        th3.getMessage();
                        cVar.p3();
                        break;
                }
                break;
            case 1:
                d0 d0Var = (d0) ((h) obj).f99563c;
                Object obj2 = d0Var != null ? d0Var.f74599a : null;
                if (obj2 != null) {
                    Intrinsics.checkNotNullParameter(obj2, "<this>");
                    c0 c0Var = obj2 instanceof c0 ? (c0) obj2 : null;
                    if (c0Var != null && (bool = c0Var.f74598e) != null && bool.booleanValue()) {
                        if (cVar.f81132h) {
                            cVar.p3();
                        } else {
                            cVar.f81131g = true;
                            j jVar = cVar.f81134j;
                            if (jVar != null && !jVar.isDisposed()) {
                                bk2.c.dispose(jVar);
                            }
                        }
                    }
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        ((d) ((jy0.b) cVar.getView())).b8("", RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD, 354);
                        break;
                    default:
                        th4.getMessage();
                        cVar.p3();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
