package r11;

import android.text.Editable;
import aq.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import q11.c;
import t11.f;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106024i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f106025j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s11.a f106026k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, s11.a aVar, int i13) {
        super(1);
        this.f106024i = i13;
        this.f106025j = cVar;
        this.f106026k = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String value;
        s11.a aVar = this.f106026k;
        c cVar = this.f106025j;
        int i13 = this.f106024i;
        switch (i13) {
            case 0:
                Editable editable = (Editable) obj;
                d field = aVar.f110575a;
                if (editable == null || (value = editable.toString()) == null) {
                    value = "";
                }
                f fVar = (f) cVar;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(field, "field");
                Intrinsics.checkNotNullParameter(value, "value");
                fVar.f115812l.put(field, value);
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 1:
                        if (!booleanValue) {
                            ((f) cVar).D3(aVar.f110575a);
                            break;
                        }
                        break;
                    default:
                        if (booleanValue) {
                            ((f) cVar).D3(aVar.f110575a);
                            break;
                        }
                        break;
                }
                break;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 1:
                        if (!booleanValue2) {
                            ((f) cVar).D3(aVar.f110575a);
                            break;
                        }
                        break;
                    default:
                        if (booleanValue2) {
                            ((f) cVar).D3(aVar.f110575a);
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
