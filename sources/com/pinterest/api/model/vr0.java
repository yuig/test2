package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010 \u0012\b\u0010&\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$¨\u0006)"}, d2 = {"Lcom/pinterest/api/model/vr0;", "", "", "a", "Ljava/lang/String;", "getAlgorithmVersion", "()Ljava/lang/String;", "algorithmVersion", "", "b", "Ljava/lang/Long;", "getCreationTimestamp", "()Ljava/lang/Long;", "creationTimestamp", "c", "getExperiment", "experiment", "d", "getExperimentGroup", "experimentGroup", "e", "getExperimentCell", "experimentCell", "f", "getExpirationTimestamp", "expirationTimestamp", "g", "getSurveyId", "surveyId", "h", "getSegmentId", "segmentId", "", "i", "Ljava/lang/Boolean;", "isHoldout", "()Ljava/lang/Boolean;", "j", "isTestRequest", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class vr0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("algorithmVersion")
    private final String algorithmVersion;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("creationTimestamp")
    private final Long creationTimestamp;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("experiment")
    private final String experiment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("experimentGroup")
    private final String experimentGroup;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("experimentCell")
    private final String experimentCell;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("expirationTimestamp")
    private final Long expirationTimestamp;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("surveyId")
    private final Long surveyId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("surveySegmentId")
    private final String segmentId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("isHoldout")
    private final Boolean isHoldout;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @om.b("isTestRequest")
    private final Boolean isTestRequest;

    public vr0(String str, Long l13, String str2, String str3, String str4, Long l14, Long l15, String str5, Boolean bool, Boolean bool2) {
        this.algorithmVersion = str;
        this.creationTimestamp = l13;
        this.experiment = str2;
        this.experimentGroup = str3;
        this.experimentCell = str4;
        this.expirationTimestamp = l14;
        this.surveyId = l15;
        this.segmentId = str5;
        this.isHoldout = bool;
        this.isTestRequest = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr0)) {
            return false;
        }
        vr0 vr0Var = (vr0) obj;
        return Intrinsics.d(this.algorithmVersion, vr0Var.algorithmVersion) && Intrinsics.d(this.creationTimestamp, vr0Var.creationTimestamp) && Intrinsics.d(this.experiment, vr0Var.experiment) && Intrinsics.d(this.experimentGroup, vr0Var.experimentGroup) && Intrinsics.d(this.experimentCell, vr0Var.experimentCell) && Intrinsics.d(this.expirationTimestamp, vr0Var.expirationTimestamp) && Intrinsics.d(this.surveyId, vr0Var.surveyId) && Intrinsics.d(this.segmentId, vr0Var.segmentId) && Intrinsics.d(this.isHoldout, vr0Var.isHoldout) && Intrinsics.d(this.isTestRequest, vr0Var.isTestRequest);
    }

    public final int hashCode() {
        String str = this.algorithmVersion;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l13 = this.creationTimestamp;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str2 = this.experiment;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.experimentGroup;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.experimentCell;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l14 = this.expirationTimestamp;
        int hashCode6 = (hashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.surveyId;
        int hashCode7 = (hashCode6 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str5 = this.segmentId;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isHoldout;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isTestRequest;
        return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.algorithmVersion;
        Long l13 = this.creationTimestamp;
        String str2 = this.experiment;
        String str3 = this.experimentGroup;
        String str4 = this.experimentCell;
        Long l14 = this.expirationTimestamp;
        Long l15 = this.surveyId;
        String str5 = this.segmentId;
        Boolean bool = this.isHoldout;
        Boolean bool2 = this.isTestRequest;
        StringBuilder sb3 = new StringBuilder("SurveyInviteRequestBody(algorithmVersion=");
        sb3.append(str);
        sb3.append(", creationTimestamp=");
        sb3.append(l13);
        sb3.append(", experiment=");
        a.a.B(sb3, str2, ", experimentGroup=", str3, ", experimentCell=");
        sb3.append(str4);
        sb3.append(", expirationTimestamp=");
        sb3.append(l14);
        sb3.append(", surveyId=");
        sb3.append(l15);
        sb3.append(", segmentId=");
        sb3.append(str5);
        sb3.append(", isHoldout=");
        sb3.append(bool);
        sb3.append(", isTestRequest=");
        sb3.append(bool2);
        sb3.append(")");
        return sb3.toString();
    }
}
