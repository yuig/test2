package eh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements mf0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f58929b;

    public /* synthetic */ h(Object obj, int i13) {
        this.f58928a = i13;
        this.f58929b = obj;
    }

    @Override // mf0.b
    public final void onDismiss() {
        int i13 = this.f58928a;
        Object obj = this.f58929b;
        switch (i13) {
            case 0:
                jf2.c cVar = ((i) obj).f58931f0;
                if (cVar != null) {
                    ((Function0) cVar.f75876e).invoke();
                    return;
                } else {
                    Intrinsics.r("rendering");
                    throw null;
                }
            default:
                ((Function0) obj).invoke();
                return;
        }
    }
}
