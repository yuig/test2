package x10;

import com.pinterest.api.model.wy0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.e;
import sq2.o;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JS\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lx10/a;", "", "", "newPasscode", "newPasscodeConfirm", "newParentalEmail", "newParentalEmailConfirm", "", "requireBackupEmailVerification", "fields", "Luj2/b0;", "Lcom/pinterest/api/model/wy0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Luj2/b0;", "passcode", "Luj2/b;", "a", "(Ljava/lang/String;)Luj2/b;", "c", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @o("/v3/users/parental_control_passcode/verify/")
    @NotNull
    @e
    uj2.b a(@sq2.c("passcode") @NotNull String passcode);

    @o("/v3/users/parental_control_passcode/")
    @NotNull
    @e
    b0<wy0> b(@sq2.c("passcode_new") @NotNull String newPasscode, @sq2.c("passcode_new_confirm") @NotNull String newPasscodeConfirm, @sq2.c("parent_email_new") @NotNull String newParentalEmail, @sq2.c("parent_email_new_confirm") @NotNull String newParentalEmailConfirm, @sq2.c("require_backup_email_verification") boolean requireBackupEmailVerification, @t("fields") String fields);

    @o("/v3/users/parental_control_passcode/disable/")
    @NotNull
    @e
    uj2.b c(@sq2.c("passcode") @NotNull String passcode);
}
