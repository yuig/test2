package com.pinterest.api.model;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0018\u00010\u0010\u0012\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010%\u001a\u0004\u0018\u00010 \u0012\b\u0010(\u001a\u0004\u0018\u00010 \u0012\b\u0010,\u001a\u0004\u0018\u00010)\u0012\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\b\u00106\u001a\u0004\u0018\u000101¢\u0006\u0004\b7\u00108R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR.\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R.\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u001c\u0010,\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R(\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0013\u001a\u0004\b/\u0010\u0015R\u001c\u00106\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/pinterest/api/model/fs0;", "", "", "a", "J", "getTimestamp", "()J", "timestamp", "b", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "userId", "c", "getSurveyId", "surveyId", "", "", "d", "Ljava/util/Map;", "getAnswers", "()Ljava/util/Map;", "answers", "e", "getChosenAnswers", "chosenAnswers", "", "f", "Ljava/lang/Integer;", "getAppType", "()Ljava/lang/Integer;", "appType", "", "g", "Ljava/lang/String;", "getAppVersion", "()Ljava/lang/String;", "appVersion", "h", "getSurveyMethod", "surveyMethod", "", "i", "Ljava/lang/Boolean;", "isPartial", "()Ljava/lang/Boolean;", "j", "getElapsedTimingMs", "elapsedTimingMs", "Lcom/pinterest/api/model/vr0;", "k", "Lcom/pinterest/api/model/vr0;", "getSurveyInvite", "()Lcom/pinterest/api/model/vr0;", "surveyInvite", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Lcom/pinterest/api/model/vr0;)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class fs0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("timestamp")
    private final long timestamp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("user_id")
    private final Long userId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("survey_id")
    private final Long surveyId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("question_and_answers")
    private final Map<Long, List<Long>> answers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("question_and_chosen_answers")
    private final Map<Long, List<Long>> chosenAnswers;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("app_type")
    private final Integer appType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("app_version")
    private final String appVersion;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("survey_method")
    private final String surveyMethod;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("is_partial")
    private final Boolean isPartial;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @om.b("question_and_elapsed_timings_ms")
    private final Map<Long, Long> elapsedTimingMs;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @om.b("survey_invite")
    private final vr0 surveyInvite;

    /* JADX WARN: Multi-variable type inference failed */
    public fs0(long j13, Long l13, Long l14, Map<Long, ? extends List<Long>> map, Map<Long, ? extends List<Long>> map2, Integer num, String str, String str2, Boolean bool, Map<Long, Long> map3, vr0 vr0Var) {
        this.timestamp = j13;
        this.userId = l13;
        this.surveyId = l14;
        this.answers = map;
        this.chosenAnswers = map2;
        this.appType = num;
        this.appVersion = str;
        this.surveyMethod = str2;
        this.isPartial = bool;
        this.elapsedTimingMs = map3;
        this.surveyInvite = vr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs0)) {
            return false;
        }
        fs0 fs0Var = (fs0) obj;
        return this.timestamp == fs0Var.timestamp && Intrinsics.d(this.userId, fs0Var.userId) && Intrinsics.d(this.surveyId, fs0Var.surveyId) && Intrinsics.d(this.answers, fs0Var.answers) && Intrinsics.d(this.chosenAnswers, fs0Var.chosenAnswers) && Intrinsics.d(this.appType, fs0Var.appType) && Intrinsics.d(this.appVersion, fs0Var.appVersion) && Intrinsics.d(this.surveyMethod, fs0Var.surveyMethod) && Intrinsics.d(this.isPartial, fs0Var.isPartial) && Intrinsics.d(this.elapsedTimingMs, fs0Var.elapsedTimingMs) && Intrinsics.d(this.surveyInvite, fs0Var.surveyInvite);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.timestamp) * 31;
        Long l13 = this.userId;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.surveyId;
        int hashCode3 = (hashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Map<Long, List<Long>> map = this.answers;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<Long, List<Long>> map2 = this.chosenAnswers;
        int hashCode5 = (hashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Integer num = this.appType;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.appVersion;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.surveyMethod;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isPartial;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<Long, Long> map3 = this.elapsedTimingMs;
        int hashCode10 = (hashCode9 + (map3 == null ? 0 : map3.hashCode())) * 31;
        vr0 vr0Var = this.surveyInvite;
        return hashCode10 + (vr0Var != null ? vr0Var.hashCode() : 0);
    }

    public final String toString() {
        long j13 = this.timestamp;
        Long l13 = this.userId;
        Long l14 = this.surveyId;
        Map<Long, List<Long>> map = this.answers;
        Map<Long, List<Long>> map2 = this.chosenAnswers;
        Integer num = this.appType;
        String str = this.appVersion;
        String str2 = this.surveyMethod;
        Boolean bool = this.isPartial;
        Map<Long, Long> map3 = this.elapsedTimingMs;
        vr0 vr0Var = this.surveyInvite;
        StringBuilder sb3 = new StringBuilder("SurveyResultRequestBody(timestamp=");
        sb3.append(j13);
        sb3.append(", userId=");
        sb3.append(l13);
        sb3.append(", surveyId=");
        sb3.append(l14);
        sb3.append(", answers=");
        sb3.append(map);
        sb3.append(", chosenAnswers=");
        sb3.append(map2);
        sb3.append(", appType=");
        sb3.append(num);
        a.a.B(sb3, ", appVersion=", str, ", surveyMethod=", str2);
        sb3.append(", isPartial=");
        sb3.append(bool);
        sb3.append(", elapsedTimingMs=");
        sb3.append(map3);
        sb3.append(", surveyInvite=");
        sb3.append(vr0Var);
        sb3.append(")");
        return sb3.toString();
    }
}
