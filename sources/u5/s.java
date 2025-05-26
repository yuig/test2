package u5;

import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120527i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f120528j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(m mVar, int i13) {
        super(0);
        this.f120527i = i13;
        this.f120528j = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        m mVar = this.f120528j;
        int i13 = this.f120527i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        mVar.a(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
                        break;
                    default:
                        mVar.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        mVar.a(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
                        break;
                    default:
                        mVar.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
