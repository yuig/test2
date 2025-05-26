package aj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Laj/i;", "", "", "a", "Z", "cmpPresent", "", "b", "Ljava/lang/String;", "subjectToGdpr", "c", "consentString", "d", "parsedPurposeConsents", "e", "parsedVendorConsents", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("IABConsent_CMPPresent")
    public boolean cmpPresent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("IABConsent_SubjectToGDPR")
    public String subjectToGdpr;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("IABConsent_ConsentString")
    public String consentString;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("IABConsent_ParsedPurposeConsents")
    public String parsedPurposeConsents;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("IABConsent_ParsedVendorConsents")
    public String parsedVendorConsents;

    public i() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.cmpPresent == iVar.cmpPresent && Intrinsics.d(this.subjectToGdpr, iVar.subjectToGdpr) && Intrinsics.d(this.consentString, iVar.consentString) && Intrinsics.d(this.parsedPurposeConsents, iVar.parsedPurposeConsents) && Intrinsics.d(this.parsedVendorConsents, iVar.parsedVendorConsents);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public final int hashCode() {
        boolean z13 = this.cmpPresent;
        ?? r03 = z13;
        if (z13) {
            r03 = 1;
        }
        int i13 = r03 * 31;
        String str = this.subjectToGdpr;
        int hashCode = (i13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.consentString;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.parsedPurposeConsents;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.parsedVendorConsents;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        boolean z13 = this.cmpPresent;
        String str = this.subjectToGdpr;
        String str2 = this.consentString;
        String str3 = this.parsedPurposeConsents;
        String str4 = this.parsedVendorConsents;
        StringBuilder sb3 = new StringBuilder("IabConsentInfo(cmpPresent=");
        sb3.append(z13);
        sb3.append(", subjectToGdpr=");
        sb3.append(str);
        sb3.append(", consentString=");
        a.a.B(sb3, str2, ", parsedPurposeConsents=", str3, ", parsedVendorConsents=");
        return a.a.p(sb3, str4, ")");
    }

    public i(int i13) {
        this.cmpPresent = false;
        this.subjectToGdpr = null;
        this.consentString = null;
        this.parsedPurposeConsents = null;
        this.parsedVendorConsents = null;
    }
}
