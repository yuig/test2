package k61;

import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import z32.m0;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78399i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f78400j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(h hVar, int i13) {
        super(0);
        this.f78399i = i13;
        this.f78400j = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f78399i;
        h hVar = this.f78400j;
        switch (i13) {
            case 1:
                List d2 = hVar.d();
                boolean z13 = false;
                if (!(d2 instanceof Collection) || !d2.isEmpty()) {
                    Iterator it = d2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            dl1.s sVar = (dl1.s) it.next();
                            if (sVar instanceof vh) {
                                vh vhVar = (vh) sVar;
                                if (vhVar.f42868z == m0.STRUCTURED_FEED_HEADER) {
                                    kj kjVar = vhVar.f42855m;
                                    if (Intrinsics.d(kjVar != null ? kjVar.b() : null, hVar.f78409b0.P)) {
                                        kj kjVar2 = vhVar.R;
                                        if (Intrinsics.d(kjVar2 != null ? kjVar2.b() : null, hVar.f78409b0.Q)) {
                                            z13 = true;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z13);
            default:
                return Boolean.valueOf(hVar.S.A0);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f78399i) {
        }
        return invoke();
    }
}
