package c71;

import com.pinterest.api.model.f30;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26829i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f26830j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(z zVar, int i13) {
        super(0);
        this.f26829i = i13;
        this.f26830j = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f26829i;
        z zVar = this.f26830j;
        switch (i13) {
            case 0:
                List d2 = zVar.z3().d();
                boolean z13 = false;
                if (!(d2 instanceof Collection) || !d2.isEmpty()) {
                    Iterator it = d2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((dl1.s) it.next()) instanceof f30) {
                                z13 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z13);
            case 1:
            default:
                return Boolean.valueOf(ph.a.w0(zVar.f26882x));
            case 2:
                return Boolean.valueOf(zVar.f26874t.h());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f26829i;
        z zVar = this.f26830j;
        switch (i13) {
            case 0:
                return invoke();
            case 1:
                return zVar.W;
            case 2:
                return invoke();
            case 3:
                return invoke();
            default:
                return b0.a(zVar.Q, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1572859);
        }
    }
}
