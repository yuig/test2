package l71;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f81925j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f81926k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81927i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f81927i = i13;
    }

    public final List b(List it) {
        switch (this.f81927i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(!it.isEmpty())) {
                    return q0.f80391a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : it) {
                    if (obj instanceof br.d) {
                        arrayList.add(obj);
                    }
                }
                return e0.b(new n71.b(arrayList));
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return CollectionsKt.F0(it);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f81927i) {
        }
        return b((List) obj);
    }
}
