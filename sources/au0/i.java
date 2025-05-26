package au0;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import tb0.p;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20496i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f20497j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f20498k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str) {
        super(1);
        this.f20497j = jVar;
        this.f20498k = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f20496i;
        String str = this.f20498k;
        j jVar = this.f20497j;
        switch (i13) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d(((cw0.a) it.next()).f53326a, str)) {
                        jVar.p3(str, true);
                    }
                }
                break;
            default:
                ((tb0.h) jVar.f20500b.get()).q((Throwable) obj, a.a.j("Exception when loading font ", str), p.IDEA_PINS_CREATION);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, j jVar) {
        super(1);
        this.f20498k = str;
        this.f20497j = jVar;
    }
}
