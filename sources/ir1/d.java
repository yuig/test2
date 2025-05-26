package ir1;

import android.app.Activity;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.pinterest.identity.core.error.UnauthException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f73513i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f73514j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ uj2.c f73515k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, boolean z13, fk2.f fVar) {
        super(1);
        this.f73513i = eVar;
        this.f73514j = z13;
        this.f73515k = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Activity activity = (Activity) obj;
        Intrinsics.checkNotNullParameter(activity, "activity");
        lr1.i iVar = this.f73513i.f84607g;
        if (iVar == null) {
            Intrinsics.r("thirdPartyServices");
            throw null;
        }
        boolean c13 = iVar.f84608a.c(activity, this.f73514j, CredentialProviderPlayServicesImpl.MIN_GMS_APK_VERSION);
        uj2.c cVar = this.f73515k;
        if (c13) {
            ((fk2.f) cVar).b();
        } else {
            ((fk2.f) cVar).a(new UnauthException.ThirdParty.Google.PlayServicesNotAvailableError());
        }
        return Unit.f80348a;
    }
}
