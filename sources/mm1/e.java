package mm1;

import android.view.ViewGroup;
import kh2.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87598i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f87599j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(k kVar, int i13) {
        super(1);
        this.f87598i = i13;
        this.f87599j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f87598i;
        k kVar = this.f87599j;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int height = kVar.g().getHeight();
                ViewGroup viewGroup = kVar.f87617g;
                if (viewGroup == null) {
                    Intrinsics.r("draggableSheet");
                    throw null;
                }
                boolean z13 = height > viewGroup.getHeight();
                d dVar = kVar.f87612b;
                if (intValue != 3 || z13) {
                    w.t(kVar.i(), new i(intValue != 3 && dVar.f87590c > 0 && dVar.f87595h, 0));
                } else {
                    w.t(kVar.i(), h.f87604j);
                }
                if (intValue != 4) {
                    if (intValue == 5) {
                        Function0 function0 = kVar.f87622l;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        dVar.f87596i.invoke();
                    }
                } else if (!dVar.f87593f) {
                    Function0 function02 = kVar.f87622l;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    dVar.f87596i.invoke();
                }
                return Unit.f80348a;
            default:
                float floatValue = ((Number) obj).floatValue();
                Function1 function1 = kVar.f87626p;
                if (function1 != null) {
                    function1.invoke(Float.valueOf(floatValue));
                }
                return Unit.f80348a;
        }
    }
}
