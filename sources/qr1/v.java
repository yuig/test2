package qr1;

import a.cb;
import com.pinterest.api.model.dx;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0003\u0010\u001cR\u001a\u0010 \u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001cR \u0010&\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\b\u0010%¨\u0006'"}, d2 = {"Lqr1/v;", "", "", "a", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "phoneNumber", "b", "getPhoneCountryCode", "phoneCountryCode", "c", "getPhoneNumberWithoutCountry", "phoneNumberWithoutCountry", "d", "phoneNumberEnd", "e", "getUnverifiedPhoneNumber", "unverifiedPhoneNumber", "f", "getUnverifiedPhoneCountryCode", "unverifiedPhoneCountryCode", "g", "getUnverifiedPhoneNumberWithoutCountry", "unverifiedPhoneNumberWithoutCountry", "", "h", "Z", "()Z", "hasMfaEnabled", "i", "getCanEnableMfa", "canEnableMfa", "", "Lcom/pinterest/api/model/dx;", "j", "Ljava/util/List;", "()Ljava/util/List;", "mfaBackupCodes", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("phone_number")
    @NotNull
    private final String phoneNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("phone_country")
    @NotNull
    private final String phoneCountryCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("phone_number_without_country")
    @NotNull
    private final String phoneNumberWithoutCountry;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("phone_number_end")
    @NotNull
    private final String phoneNumberEnd;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("unverified_phone_number")
    @NotNull
    private final String unverifiedPhoneNumber;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("unverified_phone_country")
    @NotNull
    private final String unverifiedPhoneCountryCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("unverified_phone_number_without_country")
    @NotNull
    private final String unverifiedPhoneNumberWithoutCountry;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("has_mfa_enabled")
    private final boolean hasMfaEnabled;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("can_enable_mfa")
    private final boolean canEnableMfa;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @om.b("mfa_backup_codes")
    @NotNull
    private final List<dx> mfaBackupCodes;

    /* renamed from: a, reason: from getter */
    public final boolean getHasMfaEnabled() {
        return this.hasMfaEnabled;
    }

    /* renamed from: b, reason: from getter */
    public final List getMfaBackupCodes() {
        return this.mfaBackupCodes;
    }

    /* renamed from: c, reason: from getter */
    public final String getPhoneNumberEnd() {
        return this.phoneNumberEnd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.phoneNumber, vVar.phoneNumber) && Intrinsics.d(this.phoneCountryCode, vVar.phoneCountryCode) && Intrinsics.d(this.phoneNumberWithoutCountry, vVar.phoneNumberWithoutCountry) && Intrinsics.d(this.phoneNumberEnd, vVar.phoneNumberEnd) && Intrinsics.d(this.unverifiedPhoneNumber, vVar.unverifiedPhoneNumber) && Intrinsics.d(this.unverifiedPhoneCountryCode, vVar.unverifiedPhoneCountryCode) && Intrinsics.d(this.unverifiedPhoneNumberWithoutCountry, vVar.unverifiedPhoneNumberWithoutCountry) && this.hasMfaEnabled == vVar.hasMfaEnabled && this.canEnableMfa == vVar.canEnableMfa && Intrinsics.d(this.mfaBackupCodes, vVar.mfaBackupCodes);
    }

    public final int hashCode() {
        return this.mfaBackupCodes.hashCode() + ep.b.e(this.canEnableMfa, ep.b.e(this.hasMfaEnabled, cb.d(this.unverifiedPhoneNumberWithoutCountry, cb.d(this.unverifiedPhoneCountryCode, cb.d(this.unverifiedPhoneNumber, cb.d(this.phoneNumberEnd, cb.d(this.phoneNumberWithoutCountry, cb.d(this.phoneCountryCode, this.phoneNumber.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String str = this.phoneNumber;
        String str2 = this.phoneCountryCode;
        String str3 = this.phoneNumberWithoutCountry;
        String str4 = this.phoneNumberEnd;
        String str5 = this.unverifiedPhoneNumber;
        String str6 = this.unverifiedPhoneCountryCode;
        String str7 = this.unverifiedPhoneNumberWithoutCountry;
        boolean z13 = this.hasMfaEnabled;
        boolean z14 = this.canEnableMfa;
        List<dx> list = this.mfaBackupCodes;
        StringBuilder w13 = a.a.w("MultiFactorData(phoneNumber=", str, ", phoneCountryCode=", str2, ", phoneNumberWithoutCountry=");
        a.a.B(w13, str3, ", phoneNumberEnd=", str4, ", unverifiedPhoneNumber=");
        a.a.B(w13, str5, ", unverifiedPhoneCountryCode=", str6, ", unverifiedPhoneNumberWithoutCountry=");
        w13.append(str7);
        w13.append(", hasMfaEnabled=");
        w13.append(z13);
        w13.append(", canEnableMfa=");
        w13.append(z14);
        w13.append(", mfaBackupCodes=");
        w13.append(list);
        w13.append(")");
        return w13.toString();
    }
}
