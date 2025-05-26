package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f124044a = new e();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.e value = (u40.e) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof u40.b) {
            List list = b.f124034a;
            u40.b value2 = (u40.b) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f120293d);
            writer.M0("error");
            pc.c.c(a.f124028a).d(writer, customScalarAdapters, value2.f120294e);
            return;
        }
        if (value instanceof u40.c) {
            List list2 = c.f124037a;
            u40.c value3 = (u40.c) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f120311d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01aa, code lost:
    
        if (r1 == 1) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x01b8, code lost:
    
        r0 = (u40.a) pc.c.c(v40.a.f124028a).f(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01ac, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r2);
        kotlin.jvm.internal.Intrinsics.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01b7, code lost:
    
        return new u40.b(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0023, code lost:
    
        if (r2.equals("PasswordScoreBelowThreshold") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002d, code lost:
    
        if (r2.equals("AuthorizationFailed") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        if (r2.equals("InvalidParameters") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        if (r2.equals("PartnerCanNotSwitchToSanctionedCountry") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        if (r2.equals("InvalidUsername") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r2.equals("AccessDenied") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r2.equals("FacebookConnectionFailure") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        if (r2.equals("ClientError") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        if (r2.equals("EUMissingAgeRegisterAttempt") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
    
        if (r2.equals("UserInSanctionedCountry") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (r2.equals("UpgradeRequired") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
    
        if (r2.equals("UserNotFound") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        if (r2.equals("GplusConnectionFailure") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        if (r2.equals("NameContainReservedWord") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r2.equals("InvalidVerificationAttempt") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
    
        if (r2.equals("SocialNetworkAccountAlreadyLinked") != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
    
        if (r2.equals("BusinessInSanctionedCountry") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c3, code lost:
    
        if (r2.equals("InvalidEmail") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cd, code lost:
    
        if (r2.equals("VerificationAttemptsExceeded") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        if (r2.equals("EmailAlreadyTaken") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0195, code lost:
    
        r3 = v40.b.f124034a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "customScalarAdapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "typename");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e1, code lost:
    
        if (r2.equals("AccountCreationDisabled") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
    
        if (r2.equals("InvalidPhoneNumber") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f5, code lost:
    
        if (r2.equals("NameContainsEmailError") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
    
        if (r2.equals("UnderageUserRegisterBusinessAttempt") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0109, code lost:
    
        if (r2.equals("UsernameAlreadyTaken") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x01a1, code lost:
    
        r1 = r6.V1(v40.b.f124034a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0113, code lost:
    
        if (r2.equals("UserAlreadyExists") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011c, code lost:
    
        if (r2.equals("OverageUserRegisterAttempt") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0125, code lost:
    
        if (r2.equals("InvalidAgeInput") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012e, code lost:
    
        if (r2.equals("UnderageUserRegisterAttempt") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0137, code lost:
    
        if (r2.equals("SocialNetworkInvalidAccessToken") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x01a7, code lost:
    
        if (r1 == 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0140, code lost:
    
        if (r2.equals("EmailOTPVerificationRequired") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0149, code lost:
    
        if (r2.equals("UsernameSuggestionLogicFailed") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
    
        if (r2.equals("PasswordLengthLessThanEightChars") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015b, code lost:
    
        if (r2.equals("UserHasLinkedBusinessAccountError") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0164, code lost:
    
        if (r2.equals("IsSSOFailure") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016d, code lost:
    
        if (r2.equals("VerificationNotFoundOrExpired") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x01c5, code lost:
    
        r2 = (java.lang.String) pc.c.f99520a.f(r6, r7);
     */
    @Override // pc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tc.f r6, pc.v r7) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v40.e.f(tc.f, pc.v):java.lang.Object");
    }
}
