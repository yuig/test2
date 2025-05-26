package tq;

import android.text.TextUtils;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118940i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f118941j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, int i13) {
        super(1);
        this.f118940i = i13;
        this.f118941j = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f118940i;
        y yVar = this.f118941j;
        switch (i13) {
            case 0:
                f30 updatedPin = (f30) obj;
                Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                String id3 = updatedPin.getId();
                String str = yVar.f118984x;
                if (str != null) {
                    return Boolean.valueOf(TextUtils.equals(id3, str));
                }
                Intrinsics.r("pinUid");
                throw null;
            default:
                f30 f30Var = (f30) obj;
                if (f30Var != null) {
                    yVar.x(f30Var);
                }
                return Unit.f80348a;
        }
    }
}
