package r42;

import com.google.android.play.core.integrity.IntegrityTokenResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final f f106189i = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IntegrityTokenResponse tokenResponse = (IntegrityTokenResponse) obj;
        Intrinsics.checkNotNullParameter(tokenResponse, "tokenResponse");
        return tokenResponse.token();
    }
}
