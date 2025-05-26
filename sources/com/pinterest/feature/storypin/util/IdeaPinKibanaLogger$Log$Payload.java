package com.pinterest.feature.storypin.util;

import a.a;
import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bG\u0010HJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0004J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0004J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0004J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0004J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0004J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0004J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0004J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0004J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0004JÚ\u0001\u0010+\u001a\u00020*2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0004J\u0010\u0010.\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00105\u001a\u0004\b6\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00105\u001a\u0004\b7\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00108\u001a\u0004\b:\u0010\bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010;\u001a\u0004\b<\u0010\fR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010;\u001a\u0004\b=\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00105\u001a\u0004\b>\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00105\u001a\u0004\b?\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b@\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00105\u001a\u0004\bA\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00105\u001a\u0004\bB\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\bC\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b%\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\bD\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u00105\u001a\u0004\bE\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u00105\u001a\u0004\b(\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u00105\u001a\u0004\bF\u0010\u0004¨\u0006I"}, d2 = {"com/pinterest/feature/storypin/util/IdeaPinKibanaLogger$Log$Payload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "", "component5", "()Ljava/lang/Long;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "eventType", "pinId", "numImagePages", "numVideoPages", "uploadTime", "processingTime", "failureMessage", "failureReason", "failureUploadIds", "failureResponseCode", "failureMediaStatus", "templateType", "isDraft", "entryType", "creationSessionId", "isScheduled", "mediaExportSkipped", "Lcom/pinterest/feature/storypin/util/IdeaPinKibanaLogger$Log$Payload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pinterest/feature/storypin/util/IdeaPinKibanaLogger$Log$Payload;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventType", "getPinId", "Ljava/lang/Integer;", "getNumImagePages", "getNumVideoPages", "Ljava/lang/Long;", "getUploadTime", "getProcessingTime", "getFailureMessage", "getFailureReason", "getFailureUploadIds", "getFailureResponseCode", "getFailureMediaStatus", "getTemplateType", "getEntryType", "getCreationSessionId", "getMediaExportSkipped", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class IdeaPinKibanaLogger$Log$Payload implements e {

    @b("idea_pin_creation_session_id")
    private final String creationSessionId;

    @b("entry_type")
    private final String entryType;

    @b("eventType")
    @NotNull
    private final String eventType;

    @b("media_status_failure_reason")
    private final String failureMediaStatus;

    @b("story_pin_create_failure_message")
    private final String failureMessage;

    @b("media_upload_failure_reason")
    private final String failureReason;

    @b("status_code")
    private final String failureResponseCode;

    @b("media_status_failure_upload_ids")
    private final String failureUploadIds;

    @b("is_draft")
    private final String isDraft;

    @b("is_scheduled")
    private final String isScheduled;

    @b("media_export_skipped")
    private final String mediaExportSkipped;

    @b("num_image_pages")
    private final Integer numImagePages;

    @b("num_video_pages")
    private final Integer numVideoPages;

    @b("pin_id")
    private final String pinId;

    @b("processing_time")
    private final Long processingTime;

    @b("story_pin_template_type")
    private final String templateType;

    @b("upload_time")
    private final Long uploadTime;

    public IdeaPinKibanaLogger$Log$Payload(@NotNull String eventType, String str, Integer num, Integer num2, Long l13, Long l14, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.eventType = eventType;
        this.pinId = str;
        this.numImagePages = num;
        this.numVideoPages = num2;
        this.uploadTime = l13;
        this.processingTime = l14;
        this.failureMessage = str2;
        this.failureReason = str3;
        this.failureUploadIds = str4;
        this.failureResponseCode = str5;
        this.failureMediaStatus = str6;
        this.templateType = str7;
        this.isDraft = str8;
        this.entryType = str9;
        this.creationSessionId = str10;
        this.isScheduled = str11;
        this.mediaExportSkipped = str12;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getFailureResponseCode() {
        return this.failureResponseCode;
    }

    /* renamed from: component11, reason: from getter */
    public final String getFailureMediaStatus() {
        return this.failureMediaStatus;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTemplateType() {
        return this.templateType;
    }

    /* renamed from: component13, reason: from getter */
    public final String getIsDraft() {
        return this.isDraft;
    }

    /* renamed from: component14, reason: from getter */
    public final String getEntryType() {
        return this.entryType;
    }

    /* renamed from: component15, reason: from getter */
    public final String getCreationSessionId() {
        return this.creationSessionId;
    }

    /* renamed from: component16, reason: from getter */
    public final String getIsScheduled() {
        return this.isScheduled;
    }

    /* renamed from: component17, reason: from getter */
    public final String getMediaExportSkipped() {
        return this.mediaExportSkipped;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPinId() {
        return this.pinId;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getNumImagePages() {
        return this.numImagePages;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getNumVideoPages() {
        return this.numVideoPages;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getUploadTime() {
        return this.uploadTime;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getProcessingTime() {
        return this.processingTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFailureMessage() {
        return this.failureMessage;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    /* renamed from: component9, reason: from getter */
    public final String getFailureUploadIds() {
        return this.failureUploadIds;
    }

    @NotNull
    public final IdeaPinKibanaLogger$Log$Payload copy(@NotNull String eventType, String pinId, Integer numImagePages, Integer numVideoPages, Long uploadTime, Long processingTime, String failureMessage, String failureReason, String failureUploadIds, String failureResponseCode, String failureMediaStatus, String templateType, String isDraft, String entryType, String creationSessionId, String isScheduled, String mediaExportSkipped) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return new IdeaPinKibanaLogger$Log$Payload(eventType, pinId, numImagePages, numVideoPages, uploadTime, processingTime, failureMessage, failureReason, failureUploadIds, failureResponseCode, failureMediaStatus, templateType, isDraft, entryType, creationSessionId, isScheduled, mediaExportSkipped);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdeaPinKibanaLogger$Log$Payload)) {
            return false;
        }
        IdeaPinKibanaLogger$Log$Payload ideaPinKibanaLogger$Log$Payload = (IdeaPinKibanaLogger$Log$Payload) other;
        return Intrinsics.d(this.eventType, ideaPinKibanaLogger$Log$Payload.eventType) && Intrinsics.d(this.pinId, ideaPinKibanaLogger$Log$Payload.pinId) && Intrinsics.d(this.numImagePages, ideaPinKibanaLogger$Log$Payload.numImagePages) && Intrinsics.d(this.numVideoPages, ideaPinKibanaLogger$Log$Payload.numVideoPages) && Intrinsics.d(this.uploadTime, ideaPinKibanaLogger$Log$Payload.uploadTime) && Intrinsics.d(this.processingTime, ideaPinKibanaLogger$Log$Payload.processingTime) && Intrinsics.d(this.failureMessage, ideaPinKibanaLogger$Log$Payload.failureMessage) && Intrinsics.d(this.failureReason, ideaPinKibanaLogger$Log$Payload.failureReason) && Intrinsics.d(this.failureUploadIds, ideaPinKibanaLogger$Log$Payload.failureUploadIds) && Intrinsics.d(this.failureResponseCode, ideaPinKibanaLogger$Log$Payload.failureResponseCode) && Intrinsics.d(this.failureMediaStatus, ideaPinKibanaLogger$Log$Payload.failureMediaStatus) && Intrinsics.d(this.templateType, ideaPinKibanaLogger$Log$Payload.templateType) && Intrinsics.d(this.isDraft, ideaPinKibanaLogger$Log$Payload.isDraft) && Intrinsics.d(this.entryType, ideaPinKibanaLogger$Log$Payload.entryType) && Intrinsics.d(this.creationSessionId, ideaPinKibanaLogger$Log$Payload.creationSessionId) && Intrinsics.d(this.isScheduled, ideaPinKibanaLogger$Log$Payload.isScheduled) && Intrinsics.d(this.mediaExportSkipped, ideaPinKibanaLogger$Log$Payload.mediaExportSkipped);
    }

    public final String getCreationSessionId() {
        return this.creationSessionId;
    }

    public final String getEntryType() {
        return this.entryType;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    public final String getFailureMediaStatus() {
        return this.failureMediaStatus;
    }

    public final String getFailureMessage() {
        return this.failureMessage;
    }

    public final String getFailureReason() {
        return this.failureReason;
    }

    public final String getFailureResponseCode() {
        return this.failureResponseCode;
    }

    public final String getFailureUploadIds() {
        return this.failureUploadIds;
    }

    public final String getMediaExportSkipped() {
        return this.mediaExportSkipped;
    }

    public final Integer getNumImagePages() {
        return this.numImagePages;
    }

    public final Integer getNumVideoPages() {
        return this.numVideoPages;
    }

    public final String getPinId() {
        return this.pinId;
    }

    public final Long getProcessingTime() {
        return this.processingTime;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public final Long getUploadTime() {
        return this.uploadTime;
    }

    public int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        String str = this.pinId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.numImagePages;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.numVideoPages;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l13 = this.uploadTime;
        int hashCode5 = (hashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.processingTime;
        int hashCode6 = (hashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.failureMessage;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.failureReason;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.failureUploadIds;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.failureResponseCode;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.failureMediaStatus;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.templateType;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.isDraft;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.entryType;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.creationSessionId;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.isScheduled;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.mediaExportSkipped;
        return hashCode16 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String isDraft() {
        return this.isDraft;
    }

    public final String isScheduled() {
        return this.isScheduled;
    }

    @NotNull
    public String toString() {
        String str = this.eventType;
        String str2 = this.pinId;
        Integer num = this.numImagePages;
        Integer num2 = this.numVideoPages;
        Long l13 = this.uploadTime;
        Long l14 = this.processingTime;
        String str3 = this.failureMessage;
        String str4 = this.failureReason;
        String str5 = this.failureUploadIds;
        String str6 = this.failureResponseCode;
        String str7 = this.failureMediaStatus;
        String str8 = this.templateType;
        String str9 = this.isDraft;
        String str10 = this.entryType;
        String str11 = this.creationSessionId;
        String str12 = this.isScheduled;
        String str13 = this.mediaExportSkipped;
        StringBuilder w13 = a.w("Payload(eventType=", str, ", pinId=", str2, ", numImagePages=");
        w13.append(num);
        w13.append(", numVideoPages=");
        w13.append(num2);
        w13.append(", uploadTime=");
        w13.append(l13);
        w13.append(", processingTime=");
        w13.append(l14);
        w13.append(", failureMessage=");
        a.B(w13, str3, ", failureReason=", str4, ", failureUploadIds=");
        a.B(w13, str5, ", failureResponseCode=", str6, ", failureMediaStatus=");
        a.B(w13, str7, ", templateType=", str8, ", isDraft=");
        a.B(w13, str9, ", entryType=", str10, ", creationSessionId=");
        a.B(w13, str11, ", isScheduled=", str12, ", mediaExportSkipped=");
        return a.p(w13, str13, ")");
    }
}
