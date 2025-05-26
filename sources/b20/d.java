package b20;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.p;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lb20/d;", "", "", "recaptchaToken", "signing_key_fingerprint", "integrity_token_response", "Luj2/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "Luj2/b0;", "Lb20/a;", "b", "()Luj2/b0;", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface d {
    @p("sessions/verify/")
    @NotNull
    uj2.b a(@t("recaptcha_token") String recaptchaToken, @t("signing_key_fingerprint") String signing_key_fingerprint, @t("integrity_token_response") String integrity_token_response);

    @f("sessions/verify/play_integrity_nonce/")
    @NotNull
    b0<a> b();
}
