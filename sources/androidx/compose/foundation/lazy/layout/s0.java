package androidx.compose.foundation.lazy.layout;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class s0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17288i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r2.k f17289j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(r2.k kVar, int i13) {
        super(1);
        this.f17288i = i13;
        this.f17289j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f17288i;
        r2.k kVar = this.f17289j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(kVar != null ? kVar.b(obj) : true);
            default:
                return new v0(kVar, (Map) obj);
        }
    }
}
