package up0;

import android.text.Editable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122969i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Editable f122970j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ me0.a[] f122971k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Editable editable, me0.a[] aVarArr, int i13) {
        super(1);
        this.f122969i = i13;
        this.f122970j = editable;
        this.f122971k = aVarArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f122969i;
        Editable editable = this.f122970j;
        me0.a[] aVarArr = this.f122971k;
        switch (i13) {
            case 0:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, null, null, null, false, 0, 0, 0, false, false, false, null, false, Integer.valueOf(editable.getSpanEnd(aVarArr[0])), null, null, null, null, 0, 4161535);
            default:
                wn1.d it2 = (wn1.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return wn1.d.e(it2, null, null, null, null, false, Integer.valueOf(editable.getSpanEnd(aVarArr[0])), null, null, null, 8355839);
        }
    }
}
